package com.volcengine.service.maas.v2.impl;

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
import org.apache.http.HttpResponse;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.stream.Stream;

public class MaasServiceImpl extends BaseServiceImpl implements MaasService {
    private static final String CHAT_TERMINATOR = "[DONE]";

    private static final ObjectMapper mapper = new ObjectMapper();

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
    public Stream<ChatResp> streamChat(String endpointId, ChatReq req) throws MaasException {
        req.setStream(true);
        String reqId = genReqId();

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

        try {
            RawResponse response = json(endpointId, api, reqId, mapper.writeValueAsString(req));
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

    private RawResponse json(String endpointId, String api, String reqId, String body) throws MaasException {
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

        return makeRequest(api, request);
    }

    private String genReqId() {
        final int length = 34;

        StringBuilder sb = new StringBuilder();
        sb.ensureCapacity(length);
        sb.append(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")));
        sb.append(String.format("%020X", new SecureRandom().nextLong()));
        return sb.toString();
    }
}