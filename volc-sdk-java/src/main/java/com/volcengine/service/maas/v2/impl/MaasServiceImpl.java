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
import com.volcengine.service.maas.v2.MaasConfig;
import com.volcengine.service.maas.MaasException;
import com.volcengine.service.maas.v2.MaasService;
import com.volcengine.service.maas.impl.SseEvent;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class MaasServiceImpl extends BaseServiceImpl implements MaasService {
    private static final String CHAT_TERMINATOR = "[DONE]";

    public MaasServiceImpl(String host, String region) {
        this(host, region, 60_000, 60_000);
    }

    public MaasServiceImpl(String host, String region, int connectionTimeout, int socketTimeout) {
        super(MaasConfig.getServiceInfo(host, region, connectionTimeout, socketTimeout), MaasConfig.getApiInfoList());
    }


    @Override
    public ChatResp chat(String endpointId, ChatReq req) throws MaasException {
        req = req.withStream(false);

        RawResponse response = null;
        try {
            response = json(endpointId, Const.MaasApiChat, null, new ObjectMapper().writeValueAsString(req));
        } catch (JsonProcessingException e) {
            throw new MaasException(e, null);
        }
        String logId = response.getFirstHeader("x-tt-logid");

        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            ChatResp resp;
            try {
                resp = convertJsonBytesToChatResp(response.getException().getMessage().getBytes());
            } catch (MaasException ignored) {
                throw new MaasException(response.getException(), logId);
            }
            throw new MaasException(resp.getError(), logId);
        }

        return convertJsonBytesToChatResp(response.getData());
    }

    @Override
    public Stream<ChatResp> streamChat(String endpointId, ChatReq req) throws MaasException {
        req.setStream(true);

        SignableRequest request = prepareRequest(Const.MaasApiChat, null);
        try {
            request.setEntity(new StringEntity(new ObjectMapper().writeValueAsString(req), "utf-8"));
            request.setHeader("Content-Type", "application/json");
        } catch (JsonProcessingException e) {
            throw new MaasException(e, null);
        }

        try {
            URIBuilder builder = request.getUriBuilder();
            builder.setPath(String.format(builder.getPath(), endpointId));
            request.setURI(builder.build());

            ISigner.sign(request, this.credentials);
        } catch (Exception e) {
            e.printStackTrace();
            throw new MaasException(e, null);
        }

        HttpResponse response;
        String logId = null;
        try {
            response = this.getHttpClient().execute(request);
            logId = response.getFirstHeader("x-tt-logid").getValue();
        } catch (IOException e) {
            throw new MaasException(e, logId);
        }

        InputStream is;
        try {
            is = response.getEntity().getContent();
        } catch (IOException e) {
            throw new MaasException(e, logId);
        }

        final String finalLogId = logId;
        return SseEvent.fromInputStream(is, StandardCharsets.UTF_8)
                .map(event -> {
                    if (event.getData().trim().equals(CHAT_TERMINATOR)) {
                        return null;
                    }

                    ChatResp resp;
                    try {
                        resp = convertJsonBytesToChatResp(event.getData().getBytes());
                    } catch (MaasException e) {
                        closeInputStream(is);
                        throw new RuntimeException(e);
                    }
                    if (resp.getError() != null && resp.getError().getCodeN() != 0) {
                        closeInputStream(is);
                        throw new RuntimeException(new MaasException(resp.getError(), finalLogId));
                    }

                    return resp;
                }).filter(Objects::nonNull);
    }

    @Override
    public TokenizeResp tokenization(String endpointId, TokenizeReq req) throws MaasException {
        RawResponse response = null;
        try {
            response = json(endpointId, Const.MaasApiTokenization, null, new ObjectMapper().writeValueAsString(req));
        } catch (JsonProcessingException e) {
            throw new MaasException(e, null);
        }

        String logId = response.getFirstHeader("x-tt-logid");
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            TokenizeResp resp;
            try {
                resp = convertJsonBytesToTokenizeResp(response.getException().getMessage().getBytes());
            } catch (MaasException ignored) {
                throw new MaasException(response.getException(), logId);
            }
            throw new MaasException(resp.getError(), logId);
        }

        return convertJsonBytesToTokenizeResp(response.getData());
    }

    @Override
    public ClassificationResp classification(String endpointId, ClassificationReq req) throws MaasException {
        RawResponse response = null;
        try {
            response = json(endpointId, Const.MaasApiClassification, null, new ObjectMapper().writeValueAsString(req));
        } catch (JsonProcessingException e) {
            throw new MaasException(e, null);
        }

        String logId = response.getFirstHeader("x-tt-logid");
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            ClassificationResp resp;
            try {
                resp = convertJsonBytesToClassificationResp(response.getException().getMessage().getBytes());
            } catch (MaasException ignored) {
                throw new MaasException(response.getException(), logId);
            }
            throw new MaasException(resp.getError(), logId);
        }

        return convertJsonBytesToClassificationResp(response.getData());
    }

    @Override
    public EmbeddingsResp embeddings(String endpointId, EmbeddingsReq req) throws MaasException {
        RawResponse response = null;
        try {
            response = json(endpointId, Const.MaasApiEmbeddings, null, new ObjectMapper().writeValueAsString(req));
        } catch (JsonProcessingException e) {
            throw new MaasException(e, null);
        }

        String logId = response.getFirstHeader("x-tt-logid");
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            EmbeddingsResp resp;
            try {
                resp = convertJsonBytesToEmbeddingsResp(response.getException().getMessage().getBytes());
            } catch (MaasException ignored) {
                throw new MaasException(response.getException(), logId);
            }
            throw new MaasException(resp.getError(), logId);
        }

        return convertJsonBytesToEmbeddingsResp(response.getData());
    }

    private static ChatResp convertJsonBytesToChatResp(byte[] data) throws MaasException {
        try {
            return new ObjectMapper().readValue(new String(data, StandardCharsets.UTF_8), ChatResp.class);
        } catch (Exception e) {
            throw new MaasException(e, "");
        }
    }

    private static TokenizeResp convertJsonBytesToTokenizeResp(byte[] data) throws MaasException {
        try {
            return new ObjectMapper().readValue(new String(data, StandardCharsets.UTF_8), TokenizeResp.class);
        } catch (Exception e) {
            throw new MaasException(e, "");
        }
    }

    private static ClassificationResp convertJsonBytesToClassificationResp(byte[] data) throws MaasException {
        try {
            return new ObjectMapper().readValue(new String(data, StandardCharsets.UTF_8), ClassificationResp.class);
        } catch (Exception e) {
            throw new MaasException(e, "");
        }
    }

    private static EmbeddingsResp convertJsonBytesToEmbeddingsResp(byte[] data) throws MaasException {
        try {
            return new ObjectMapper().readValue(new String(data, StandardCharsets.UTF_8), EmbeddingsResp.class);
        } catch (Exception e) {
            throw new MaasException(e, "");
        }
    }

    private void closeInputStream(InputStream inputStream) {
        if(inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
            }
        }
    }

    private RawResponse json(String endpointId, String api, List<NameValuePair> params, String body) throws MaasException {
        ApiInfo apiInfo = apiInfoList.get(api);
        if (apiInfo == null) {
            return new RawResponse(null, SdkError.ENOAPI.getNumber(), new Exception(SdkError.getErrorDesc(SdkError.ENOAPI)));
        }

        SignableRequest request = prepareRequest(api, params);
        request.setHeader("Content-Type", "application/json");
        request.setEntity(new StringEntity(body, "utf-8"));

        try {
            URIBuilder builder = request.getUriBuilder();
            builder.setPath(String.format(builder.getPath(), endpointId));
            request.setURI(builder.build());
        } catch (URISyntaxException e) {
            throw new MaasException(e, null);
        }

        return makeRequest(api, request);
    }
}