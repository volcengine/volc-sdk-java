package com.volcengine.service.contentSecurity.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.model.request.RcLlmRequest;
import com.volcengine.model.request.RcLlmResultRequest;
import com.volcengine.model.request.SecuritySourceRequest;
import com.volcengine.model.response.*;
import com.volcengine.service.SignableRequest;
import com.volcengine.service.contentSecurity.SecuritySourceConfig;
import com.volcengine.service.contentSecurity.SecuritySourceException;
import com.volcengine.service.contentSecurity.SecuritySourceService;
import com.volcengine.service.BaseServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpResponse;
import org.apache.http.entity.StringEntity;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.stream.Stream;

public class SecuritySourceServiceImpl extends BaseServiceImpl implements SecuritySourceService  {

    private SecuritySourceServiceImpl() {
        super(SecuritySourceConfig.serviceInfo, SecuritySourceConfig.apiInfoList);
    }

    private static final SecuritySourceServiceImpl securitySourceInstance = new SecuritySourceServiceImpl();

    public static SecuritySourceService getInstance() {
        return securitySourceInstance;
    }

    @Override
    public SecuritySourceResponse getSecuritySource(SecuritySourceRequest securitySourceRequest) throws Exception {
        if (StringUtils.isBlank(this.getAccessKey()) || StringUtils.isBlank(this.getSecretKey()))
            throw new Exception(" AccessKey or SecretKey Can not be empty");

        RawResponse response = json(Const.SecuritySource, new ArrayList<>(), JSON.toJSONString(securitySourceRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), SecuritySourceResponse.class);
    }

    @Override
    public Stream<SecuritySourceResponse> getSecuritySourceStream(SecuritySourceRequest securitySourceRequest) throws SecuritySourceException {
        if (StringUtils.isBlank(this.getAccessKey()) || StringUtils.isBlank(this.getSecretKey()))
            throw new SecuritySourceException(" AccessKey or SecretKey Can not be empty");

        SignableRequest request = prepareRequest(Const.SecuritySourceStream, new ArrayList<>());
        request.setHeader(Const.CONTENT_TYPE, "application/json");
        request.setEntity(new StringEntity( JSON.toJSONString(securitySourceRequest), "utf-8"));

        try {
            ISigner.sign(request, this.credentials);
        } catch (Exception e) {
            e.printStackTrace();
            throw new SecuritySourceException("ISigner.sign has error :" + e.getMessage());
        }

        HttpResponse response;
        try {
            response = this.getHttpClient().execute(request);
        } catch (IOException e) {
            throw new SecuritySourceException("Http Request execute has error : " + e.getMessage());
        }

        InputStream is;
        try {
            is = response.getEntity().getContent();
        } catch (IOException e) {
            throw new SecuritySourceException(" open response stream has error : " + e.getMessage());
        }

        return SecuritySourceSseEvent.fromInputStream(is, StandardCharsets.UTF_8)
                .map(event -> {

                    SecuritySourceResponse resp;
                    try {
                        resp = JSON.parseObject(event.getData(), SecuritySourceResponse.class);
                    } catch (Exception e) {
                        closeInputStream(is);
                        throw new RuntimeException(e);
                    }

                    return resp;
                });

    }

    private void closeInputStream(InputStream inputStream) {
        if(inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
            }
        }
    }

    @Override
    public RcTextModerationSyncResponse textModeration(RcLlmRequest rcLlmRequest) throws Exception {
        RawResponse response = json(Const.TextModeration, new ArrayList<>(), JSON.toJSONString(rcLlmRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), RcTextModerationSyncResponse.class);
    }

    @Override
    public AsyncRiskDetectionResponse asyncTextModeration(RcLlmRequest rcLlmRequest) throws Exception {
        RawResponse response = json(Const.AsyncTextModeration, new ArrayList<>(), JSON.toJSONString(rcLlmRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), AsyncRiskDetectionResponse.class);
    }

    @Override
    public RcTextModerationAsyncResponse textModerationResult(RcLlmResultRequest rcLlmResultRequest) throws Exception{
        RawResponse response = json(Const.TextModerationResult, new ArrayList<>(), JSON.toJSONString(rcLlmResultRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), RcTextModerationAsyncResponse.class);
    }

    @Override
    public RcMultiModerationSyncResponse multiModeration(RcLlmRequest rcLlmRequest) throws Exception {
        RawResponse response = json(Const.MultiModeration, new ArrayList<>(), JSON.toJSONString(rcLlmRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), RcMultiModerationSyncResponse.class);
    }

    @Override
    public AsyncRiskDetectionResponse asyncMultiModeration(RcLlmRequest rcLlmRequest) throws Exception {
        RawResponse response = json(Const.AsyncMultiModeration, new ArrayList<>(), JSON.toJSONString(rcLlmRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), AsyncRiskDetectionResponse.class);
    }

    @Override
    public RcMultiModerationAsyncResponse multiModerationResult(RcLlmResultRequest rcLlmResultRequest) throws Exception{
        RawResponse response = json(Const.MultiModerationResult, new ArrayList<>(), JSON.toJSONString(rcLlmResultRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), RcMultiModerationAsyncResponse.class);
    }

    @Override
    public RcCustomRiskSyncResponse customRisk(RcLlmRequest rcLlmRequest) throws Exception {
        RawResponse response = json(Const.CustomRisk, new ArrayList<>(), JSON.toJSONString(rcLlmRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), RcCustomRiskSyncResponse.class);
    }

    @Override
    public AsyncRiskDetectionResponse asyncCustomRisk(RcLlmRequest rcLlmRequest) throws Exception {
        RawResponse response = json(Const.AsyncCustomRisk, new ArrayList<>(), JSON.toJSONString(rcLlmRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), AsyncRiskDetectionResponse.class);
    }

    @Override
    public RcCustomRiskAsyncResponse customRiskResult(RcLlmResultRequest rcLlmResultRequest) throws Exception{
        RawResponse response = json(Const.CustomRiskResult, new ArrayList<>(), JSON.toJSONString(rcLlmResultRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), RcCustomRiskAsyncResponse.class);
    }

}
