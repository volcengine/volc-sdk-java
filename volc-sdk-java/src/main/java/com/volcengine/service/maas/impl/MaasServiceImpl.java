package com.volcengine.service.maas.impl;

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

    private MaasServiceImpl(String host, String region) {
        super(MaasConfig.getServiceInfo(host, region), MaasConfig.apiInfoList);
    }

    // 单例
    private volatile static MaasServiceImpl maasServiceImplInstance = null;

    public static MaasService getInstance(String host, String region) {
        if (maasServiceImplInstance == null) {
            synchronized (MaasServiceImpl.class) {
                if (maasServiceImplInstance == null) {
                    maasServiceImplInstance = new MaasServiceImpl(host, region);
                }
            }
        }
        return maasServiceImplInstance;
    }

    @Override
    public Api.ChatResp chat(Api.ChatReq req) throws MaasException {
        req = req.toBuilder().setStream(false).build();

        String body = convertChatReqToJsonStr(req);

        RawResponse response = this.json(Const.MaasApiChat, null, body);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            Api.ChatResp resp;
            try {
                resp = convertJsonBytesToChatResp(response.getException().getMessage().getBytes());
            } catch (MaasException ignored) {
                throw new MaasException(response.getException());
            }
            throw new MaasException(resp.getError());
        }

        return convertJsonBytesToChatResp(response.getData());
    }

    @Override
    public Stream<Api.ChatResp> streamChat(Api.ChatReq req) throws MaasException {
        req = req.toBuilder().setStream(true).build();

        String body = convertChatReqToJsonStr(req);

        SignableRequest request = prepareRequest(Const.MaasApiChat, null);
        request.setHeader("Content-Type", "application/json");
        request.setEntity(new StringEntity(body, "utf-8"));

        try {
            ISigner.sign(request, this.credentials);
        } catch (Exception e) {
            e.printStackTrace();
            throw new MaasException(e);
        }

        HttpResponse response;
        try {
            response = this.getHttpClient().execute(request);
        } catch (IOException e) {
            throw new MaasException(e);
        }

        InputStream is;
        try {
            is = response.getEntity().getContent();
        } catch (IOException e) {
            throw new MaasException(e);
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
                        throw new RuntimeException(e);
                    }
                    if (resp.getError().getCodeN() != 0) {
                        throw new RuntimeException(new MaasException(resp.getError()));
                    }

                    return resp;
                }).filter(Objects::nonNull);
    }

    private static String convertChatReqToJsonStr(Api.ChatReq req) throws MaasException {
        try {
            return JsonFormat.printer().omittingInsignificantWhitespace().print(req);
        } catch (InvalidProtocolBufferException e) {
            throw new MaasException(e);
        }
    }

    private static Api.ChatResp convertJsonBytesToChatResp(byte[] data) throws MaasException {
        try {
            Api.ChatResp.Builder builder = Api.ChatResp.newBuilder();
            JsonFormat.parser().ignoringUnknownFields().merge(new String(data, StandardCharsets.UTF_8), builder);
            return builder.build();
        } catch (InvalidProtocolBufferException e) {
            throw new MaasException(e);
        }
    }
}