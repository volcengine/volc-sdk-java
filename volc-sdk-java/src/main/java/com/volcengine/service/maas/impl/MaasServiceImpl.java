package com.volcengine.service.maas.impl;

import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.model.maas.api.Api;
import com.volcengine.model.response.RawResponse;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.SignableRequest;
import com.volcengine.service.maas.MaasConfig;
import com.volcengine.service.maas.MaasException;
import com.volcengine.service.maas.MaasService;
import org.apache.http.HttpResponse;
import org.apache.http.entity.StringEntity;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
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
    public Api.ChatResp chat(Api.ChatReq req) throws MaasException {
        req = req.toBuilder().setStream(false).build();

        RawResponse response = this.json(Const.MaasApiChat, null, json_dumps(req));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            Api.ChatResp resp;
            try {
                resp = convertJsonBytesToChatResp(response.getException().getMessage().getBytes());
            } catch (MaasException ignored) {
                throw new MaasException(response.getException(), response.getHttpCode(), req.getReqId());
            }
            throw new MaasException(resp.getError(), resp.getReqId());
        }

        return convertJsonBytesToChatResp(response.getData());
    }

    @Override
    public Stream<Api.ChatResp> streamChat(Api.ChatReq req) throws MaasException {
        req = req.toBuilder().setStream(true).build();

        SignableRequest request = prepareRequest(Const.MaasApiChat, null);
        request.setHeader("Content-Type", "application/json");
        request.setEntity(new StringEntity(json_dumps(req), "utf-8"));
        try {
            ISigner.sign(request, this.credentials);
        } catch (Exception e) {
            throw new MaasException(e, req.getReqId());
        }

        HttpResponse response;
        try {
            response = this.getHttpClient().execute(request);
        } catch (IOException e) {
            throw new MaasException(e, req.getReqId());
        }

        InputStream is;
        try {
            is = response.getEntity().getContent();
        } catch (IOException e) {
            throw new MaasException(e, req.getReqId());
        }

        return SseEvent.fromInputStream(is, StandardCharsets.UTF_8)
                .map(event -> {
                    if (event.getData().trim().equals(CHAT_TERMINATOR)) {
                        return null;
                    }

                    Api.ChatResp resp;
                    try {
                        resp = convertJsonBytesToChatResp(event.getData().getBytes());
                    } catch (MaasException e) {
                        closeInputStream(is);
                        throw new RuntimeException(e);
                    }
                    if (resp.getError().getCodeN() != 0) {
                        closeInputStream(is);
                        throw new RuntimeException(new MaasException(resp.getError(), resp.getReqId()));
                    }

                    return resp;
                }).filter(Objects::nonNull);
    }

    @Override
    public Api.TokenizeResp tokenization(Api.TokenizeReq req) throws MaasException {
        RawResponse response = this.json(Const.MaasApiTokenization, null, json_dumps(req));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            Api.TokenizeResp resp;
            try {
                resp = convertJsonBytesToTokenizeResp(response.getException().getMessage().getBytes());
            } catch (MaasException ignored) {
                throw new MaasException(response.getException(), response.getHttpCode(), req.getReqId());
            }
            throw new MaasException(resp.getError(), resp.getReqId());
        }

        return convertJsonBytesToTokenizeResp(response.getData());
    }

    @Override
    public Api.ClassificationResp classification(Api.ClassificationReq req) throws MaasException {
        RawResponse response = this.json(Const.MaasApiClassification, null, json_dumps(req));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            Api.ClassificationResp resp;
            try {
                resp = convertJsonBytesToClassificationResp(response.getException().getMessage().getBytes());
            } catch (MaasException ignored) {
                throw new MaasException(response.getException(), response.getHttpCode(), req.getReqId());
            }
            throw new MaasException(resp.getError(), resp.getReqId());
        }

        return convertJsonBytesToClassificationResp(response.getData());
    }

    @Override
    public Api.EmbeddingsResp embeddings(Api.EmbeddingsReq req) throws MaasException {
        RawResponse response = this.json(Const.MaasApiEmbeddings, null, json_dumps(req));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            Api.EmbeddingsResp resp;
            try {
                resp = convertJsonBytesToEmbeddingsResp(response.getException().getMessage().getBytes());
            } catch (MaasException ignored) {
                throw new MaasException(response.getException(), response.getHttpCode(), req.getReqId());
            }
            throw new MaasException(resp.getError(), resp.getReqId());
        }

        return convertJsonBytesToEmbeddingsResp(response.getData());
    }

    private static Api.ChatResp convertJsonBytesToChatResp(byte[] data) throws MaasException {
        try {
            Api.ChatResp.Builder builder = Api.ChatResp.newBuilder();
            JsonFormat.parser().ignoringUnknownFields().merge(new String(data, StandardCharsets.UTF_8), builder);
            return builder.build();
        } catch (InvalidProtocolBufferException e) {
            throw new MaasException(e, "");
        }
    }

    private static Api.TokenizeResp convertJsonBytesToTokenizeResp(byte[] data) throws MaasException {
        try {
            Api.TokenizeResp.Builder builder = Api.TokenizeResp.newBuilder();
            JsonFormat.parser().ignoringUnknownFields().merge(new String(data, StandardCharsets.UTF_8), builder);
            return builder.build();
        } catch (InvalidProtocolBufferException e) {
            throw new MaasException(e, "");
        }
    }

    private static Api.ClassificationResp convertJsonBytesToClassificationResp(byte[] data) throws MaasException {
        try {
            Api.ClassificationResp.Builder builder = Api.ClassificationResp.newBuilder();
            JsonFormat.parser().ignoringUnknownFields().merge(new String(data, StandardCharsets.UTF_8), builder);
            return builder.build();
        } catch (InvalidProtocolBufferException e) {
            throw new MaasException(e, "");
        }
    }

    private static Api.EmbeddingsResp convertJsonBytesToEmbeddingsResp(byte[] data) throws MaasException {
        try {
            Api.EmbeddingsResp.Builder builder = Api.EmbeddingsResp.newBuilder();
            JsonFormat.parser().ignoringUnknownFields().merge(new String(data, StandardCharsets.UTF_8), builder);
            return builder.build();
        } catch (InvalidProtocolBufferException e) {
            throw new MaasException(e, "");
        }
    }

    private static <T extends GeneratedMessageV3> String json_dumps(T req) throws MaasException {
        try {
            return JsonFormat.printer().preservingProtoFieldNames().print(req);
        } catch (InvalidProtocolBufferException e) {
            throw new MaasException(e, "");
        }
    }

    private void closeInputStream(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException ignored) {
            }
        }
    }
}