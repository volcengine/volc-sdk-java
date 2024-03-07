package com.volcengine.service.maas.v2.impl;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.model.ApiInfo;
import com.volcengine.model.maas.api.v2.*;
import com.volcengine.model.response.RawResponse;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.SignableRequest;
import com.volcengine.service.maas.MaasException;
import com.volcengine.service.maas.impl.SseEvent;
import com.volcengine.service.maas.v2.MaasConfig;
import com.volcengine.service.maas.v2.MaasService;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Stream;
import java.time.Instant;

public class MaasServiceImpl extends BaseServiceImpl implements MaasService {
    private static final String CHAT_TERMINATOR = "[DONE]";

    private static final ObjectMapper mapper = new ObjectMapper();

    // 定义属性
    private String apikey = "";
    private Integer apikeyTtl = 0;

    @Override
    public String getAPIKey() {
        return this.apikey;
    }

    @Override
    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    @Override
    public Integer getAPIKeyTtl() {
        return this.apikeyTtl;
    }

    @Override
    public void setAPIKeyTtl(Integer apikeyTtl) {
        this.apikeyTtl = apikeyTtl;
    }

    public MaasServiceImpl(String host, String region) {
        this(host, region, 60_000, 60_000);
    }

    public MaasServiceImpl(String host, String region, int connectionTimeout, int socketTimeout) {
        super(MaasConfig.getServiceInfo(host, region, connectionTimeout, socketTimeout), MaasConfig.getApiInfoList());
    }

    @Override
    public ChatResp chat(String endpointId, ChatReq req) throws MaasException {
        return request(endpointId, Const.MaasApiChat, req.withStream(false), ChatResp.class);
    }

    @Override
    public TokenizeResp tokenization(String endpointId, TokenizeReq req) throws MaasException {
        return request(endpointId, Const.MaasApiTokenization, req, TokenizeResp.class);
    }

    @Override
    public ClassificationResp classification(String endpointId, ClassificationReq req) throws MaasException {
        return request(endpointId, Const.MaasApiClassification, req, ClassificationResp.class);
    }

    @Override
    public EmbeddingsResp embeddings(String endpointId, EmbeddingsReq req) throws MaasException {
        return request(endpointId, Const.MaasApiEmbeddings, req, EmbeddingsResp.class);
    }

    @Override
    public CreateOrRefreshAPIKeyResp createOrRefreshAPIKey(CreateOrRefreshAPIKeyReq req) throws Exception {
        RawResponse response =  super.json(Const.MaasApiTop, new ArrayList<>(), JSON.toJSONString(req));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), CreateOrRefreshAPIKeyResp.class);
    }

    @Override
    public Stream<ChatResp> streamChat(String endpointId, ChatReq req) throws MaasException {
        req.setStream(true);
        String reqId = genReqId();

        Integer apikeyTtl = this.getAPIKeyTtl();
        if (!endpointId.isEmpty() && apikeyTtl == 0) {
            getKey(endpointId);
        }

        SignableRequest request = prepareRequest(Const.MaasApiChat, null);
        try {
            request.setEntity(new StringEntity(mapper.writeValueAsString(req), "utf-8"));
            request.setHeader("x-tt-logid", reqId);
            request.setHeader("Content-Type", "application/json");
        } catch (JsonProcessingException e) {
            throw new MaasException(e, reqId);
        }

        try {
            URIBuilder builder = request.getUriBuilder();
            builder.setPath(String.format(builder.getPath(), endpointId));
            request.setURI(builder.build());

            ISigner.sign(request, this.credentials);
            request.setHeader(Const.Authorization, "Bearer " + this.apikey);
        } catch (Exception e) {
            throw new MaasException(e, reqId);
        }

        HttpResponse response;
        try {
            response = this.getHttpClient().execute(request);
        } catch (IOException e) {
            throw new MaasException(e, reqId);
        }

        InputStream is;
        try {
            is = response.getEntity().getContent();
        } catch (IOException e) {
            throw new MaasException(e, reqId);
        }

        return SseEvent.fromInputStream(is, StandardCharsets.UTF_8)
                .map(event -> {
                    if (event.getData().trim().equals(CHAT_TERMINATOR)) {
                        return null;
                    }

                    ChatResp resp;
                    try {
                        resp = json_parse(event.getData().getBytes(), ChatResp.class);
                    } catch (JsonProcessingException e) {
                        closeInputStream(is);
                        throw new RuntimeException(new MaasException(e, reqId));
                    }
                    if (resp.getError() != null && resp.getError().getCodeN() != 0) {
                        closeInputStream(is);
                        throw new RuntimeException(new MaasException(resp.getError(), reqId));
                    }

                    return resp;
                }).filter(Objects::nonNull);
    }

    private void closeInputStream(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException ignored) {
            }
        }
    }

    private static <T> T json_parse(byte[] data, Class<T> valueType) throws JsonProcessingException {
        return mapper.readValue(new String(data, StandardCharsets.UTF_8), valueType);
    }

    private <T> T request(String endpointId, String api, Object req, Class<T> responseType) throws MaasException {
        String reqId = genReqId();

        Integer apikeyTtl = this.getAPIKeyTtl();
        if (!endpointId.isEmpty() && apikeyTtl == 0 && this.apikey.isEmpty()) {
            this.getKey(endpointId);
        }

        try {
            RawResponse response = json(endpointId, api, reqId, mapper.writeValueAsString(req), this.apikey);
            if (response.getCode() != SdkError.SUCCESS.getNumber()) {
                try {
                    ErrorResp resp = json_parse(response.getException().getMessage().getBytes(), ErrorResp.class);
                    throw new MaasException(resp.getError(), reqId);
                } catch (JsonProcessingException ignored) {
                    throw new MaasException(response.getException(), reqId);
                }
            }

            return json_parse(response.getData(), responseType);
        } catch (JsonProcessingException e) {
            throw new MaasException(e, reqId);
        }
    }

    protected RawResponse makeReq(String api, SignableRequest request, String apikey) {
        if (apikey != null || !apikey.isEmpty()) {
            request.setHeader(Const.Authorization, "Bearer " + apikey);
        } else {
            try {
                ISigner.sign(request, this.credentials);
            } catch (Exception e) {
                e.printStackTrace();
                return new RawResponse(null, SdkError.ESIGN.getNumber(), e);
            }
        }

        HttpClient client;
        HttpResponse response = null;
        try {
            if (getHttpClient() != null) {
                client = getHttpClient();
            } else {
                client = HttpClients.createDefault();
            }
            response = client.execute(request);
            int statusCode = response.getStatusLine().getStatusCode();
            Header[] responseHeaders = response.getAllHeaders();
            if (statusCode >= 300) {
                String msg = SdkError.getErrorDesc(SdkError.EHTTP);
                byte[] bytes = EntityUtils.toByteArray(response.getEntity());
                if (bytes != null && bytes.length > 0) {
                    msg = new String(bytes, StandardCharsets.UTF_8);
                }
                return new RawResponse(null, SdkError.EHTTP.getNumber(), new Exception(msg), responseHeaders, statusCode);
            }
            byte[] bytes = EntityUtils.toByteArray(response.getEntity());
            return new RawResponse(bytes, SdkError.SUCCESS.getNumber(), null, responseHeaders);
        } catch (Exception e) {
            e.printStackTrace();
            if (response != null) {
                EntityUtils.consumeQuietly(response.getEntity());
            }
            return new RawResponse(null, SdkError.EHTTP.getNumber(), new Exception(SdkError.getErrorDesc(SdkError.EHTTP), e));
        }
    }

    private RawResponse json(String endpointId, String api, String reqId, String body, String apikey) throws MaasException {
        ApiInfo apiInfo = apiInfoList.get(api);
        if (apiInfo == null) {
            throw new MaasException(SdkError.getErrorDesc(SdkError.ENOAPI), reqId);
        }

        SignableRequest request = prepareRequest(api, null);
        request.setHeader("x-tt-logid", reqId);
        request.setHeader("Content-Type", "application/json");
        request.setEntity(new StringEntity(body, "utf-8"));
        try {
            URIBuilder builder = request.getUriBuilder();
            builder.setPath(String.format(builder.getPath(), endpointId));
            request.setURI(builder.build());
        } catch (URISyntaxException e) {
            throw new MaasException(e, reqId);
        }

        return makeReq(api, request, apikey);
    }

    private String genReqId() {
        final int length = 34;

        StringBuilder sb = new StringBuilder();
        sb.ensureCapacity(length);
        sb.append(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")));
        sb.append(String.format("%020X", new SecureRandom().nextLong()));
        return sb.toString();
    }

    public String getKey(String endpointId) {
        String apiKey = this.getAPIKey();

        if (apiKey.isEmpty()) {
            this.applyKey(endpointId, 604800, null);
        } else {
            int currentTime = Math.toIntExact(System.currentTimeMillis() / 1000);
            Integer apiKeyTtl = this.getAPIKeyTtl();
            if (currentTime + 300 > apiKeyTtl) {
                applyKey(endpointId, 604800, null); // 假设 applyKey 已经适当实现
                return this.getAPIKey();
            }
        }
        return this.getAPIKey();
    }


    public void applyKey (String endpointId, Integer ttl, List<String>endpointIdList) {
        MaasService inner = new MaasServiceImpl("open.volcengineapi.com", "cn-beijing");
        String ak = this.credentials.getAccessKeyID();
        String sk = this.credentials.getSecretAccessKey();
        inner.setAccessKey(ak);
        inner.setSecretKey(sk);
        if (endpointIdList == null) {
            endpointIdList = new ArrayList<>();
        }
        endpointIdList.add(endpointId);

        CreateOrRefreshAPIKeyReq req = new CreateOrRefreshAPIKeyReq();

        endpointIdList.add(endpointId);
        req.setTtl(ttl);
        req.setEndpointIdList(endpointIdList);
        try {
            // 假设 createOrRefreshAPIKey 方法接受一个 Map 作为参数，并返回一个包含 API key 的响应
            CreateOrRefreshAPIKeyResp resp = inner.createOrRefreshAPIKey(req);

            apikey = resp.getResult().getApiKey();
            long epochSecond = Instant.now().getEpochSecond();
            this.setAPIKeyTtl(ttl + (int)epochSecond);
            this.setApikey(apikey);
        } catch (MaasException e) {
            // 处理异常，MaasException 需要是一个已定义的异常类
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}