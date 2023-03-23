package com.volcengine.service.contentSecurity.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.helper.Utils;
import com.volcengine.model.request.CreateCustomContentsRequest;
import com.volcengine.model.request.ImageRiskResultRequest;
import com.volcengine.model.request.RiskDetectionRequest;
import com.volcengine.model.request.UploadCustomContentsRequest;
import com.volcengine.model.response.*;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.contentSecurity.ContentSecurityConfig;
import com.volcengine.service.contentSecurity.ContentSecurityService;

import java.util.ArrayList;

public class ContentSecurityServiceImpl extends BaseServiceImpl implements ContentSecurityService {
    private ContentSecurityServiceImpl() {
        super(ContentSecurityConfig.serviceInfo, ContentSecurityConfig.apiInfoList);
    }

    private static final ContentSecurityServiceImpl contentSecurityInstance = new ContentSecurityServiceImpl();

    public static ContentSecurityService getInstance() {
        return contentSecurityInstance;
    }

    @Override
    public ImageRiskDetectionResponse ImageRiskDetection(RiskDetectionRequest riskDetectionRequest) throws Exception {
        RawResponse response = json(Const.ImageContentRisk, new ArrayList<>(), JSON.toJSONString(riskDetectionRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ImageRiskDetectionResponse.class);
    }

    @Override
    public AsyncRiskDetectionResponse AsyncImageRisk(RiskDetectionRequest riskDetectionRequest) throws Exception {
        RawResponse response = json(Const.AsyncImageRisk, new ArrayList<>(), JSON.toJSONString(riskDetectionRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), AsyncRiskDetectionResponse.class);
    }

    @Override
    public AsyncRiskDetectionResponse AsyncImageRiskV2(RiskDetectionRequest riskDetectionRequest) throws Exception {
        RawResponse response = json(Const.AsyncImageRiskV2, new ArrayList<>(), JSON.toJSONString(riskDetectionRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), AsyncRiskDetectionResponse.class);
    }

    @Override
    public ImageRiskDetectionResponse ImageRiskResult(ImageRiskResultRequest riskDetectionRequest) throws Exception {
        RawResponse response = query(Const.GetImageResult, Utils.mapToPairList(Utils.paramsToMap(riskDetectionRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ImageRiskDetectionResponse.class);
    }

    @Override
    public ImageRiskDetectionResponse ImageRiskResultV2(ImageRiskResultRequest imageRiskResultRequest) throws Exception {
        RawResponse response = query(Const.GetImageResultV2, Utils.mapToPairList(Utils.paramsToMap(imageRiskResultRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ImageRiskDetectionResponse.class);
    }

    @Override
    public AsyncRiskDetectionResponse AsyncVideoRisk(RiskDetectionRequest riskDetectionRequest) throws Exception {
        RawResponse response = json(Const.AsyncVideoRisk, new ArrayList<>(), JSON.toJSONString(riskDetectionRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), AsyncRiskDetectionResponse.class);
    }

    @Override
    public VideoRiskResultResponse VideoResult(ImageRiskResultRequest videoRiskResultRequest) throws Exception {
        RawResponse response = query(Const.VideoResult, Utils.mapToPairList(Utils.paramsToMap(videoRiskResultRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), VideoRiskResultResponse.class);
    }

    @Override
    public TextRiskResponse TextRisk(RiskDetectionRequest riskDetectionRequest) throws Exception {
        RawResponse response = json(Const.TextRisk, new ArrayList<>(), JSON.toJSONString(riskDetectionRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        String str = new String(response.getData());
        System.out.println(str);

        return JSON.parseObject(response.getData(), TextRiskResponse.class);
    }

    @Override
    public AsyncRiskDetectionResponse CreateCustomContents(CreateCustomContentsRequest request) throws Exception {
        RawResponse response = json(Const.CreateCustomContents, new ArrayList<>(), JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), AsyncRiskDetectionResponse.class);
    }

    @Override
    public AsyncRiskDetectionResponse UploadCustomContents(UploadCustomContentsRequest request) throws Exception {
        RawResponse response = json(Const.UploadCustomContents, new ArrayList<>(), JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), AsyncRiskDetectionResponse.class);
    }

    @Override
    public AsyncRiskDetectionResponse DeleteCustomContents(UploadCustomContentsRequest request) throws Exception {
        RawResponse response = json(Const.DeleteCustomContents, new ArrayList<>(), JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), AsyncRiskDetectionResponse.class);
    }

    @Override
    public AsyncRiskDetectionResponse AsyncAudioRisk(RiskDetectionRequest riskDetectionRequest) throws Exception {
        RawResponse response = json(Const.AsyncAudioRisk, new ArrayList<>(), JSON.toJSONString(riskDetectionRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), AsyncRiskDetectionResponse.class);
    }

    @Override
    public GetAudioRiskResponse AudioResult(ImageRiskResultRequest audioRiskResultRequest) throws Exception {
        RawResponse response = query(Const.GetAudioResult, Utils.mapToPairList(Utils.paramsToMap(audioRiskResultRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), GetAudioRiskResponse.class);
    }

    @Override
    public AsyncRiskDetectionResponse AsyncLiveVideoRisk(RiskDetectionRequest riskDetectionRequest) throws Exception {
        RawResponse response = json(Const.AsyncLiveVideoRisk, new ArrayList<>(), JSON.toJSONString(riskDetectionRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), AsyncRiskDetectionResponse.class);
    }

    @Override
    public VideoRiskResultResponse VideoLiveResult(ImageRiskResultRequest videoRiskResultRequest) throws Exception {
        RawResponse response = query(Const.GetVideoLiveResult, Utils.mapToPairList(Utils.paramsToMap(videoRiskResultRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), VideoRiskResultResponse.class);
    }

    @Override
    public AsyncRiskDetectionResponse AsyncLiveAudioRisk(RiskDetectionRequest riskDetectionRequest) throws Exception {
        RawResponse response = json(Const.AsyncLiveAudioRisk, new ArrayList<>(), JSON.toJSONString(riskDetectionRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), AsyncRiskDetectionResponse.class);
    }

    @Override
    public GetAudioRiskResponse AudioLiveResult(ImageRiskResultRequest audioRiskResultRequest) throws Exception {
        RawResponse response = query(Const.GetAudioLiveResult, Utils.mapToPairList(Utils.paramsToMap(audioRiskResultRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), GetAudioRiskResponse.class);
    }

    @Override
    public TextSliceRiskResponse TextSliceRisk(RiskDetectionRequest riskDetectionRequest) throws Exception {
        RawResponse response = json(Const.TextSliceRisk, new ArrayList<>(), JSON.toJSONString(riskDetectionRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), TextSliceRiskResponse.class);
    }

    @Override
    public AsyncRiskDetectionResponse CloseAudioLiveRisk(ImageRiskResultRequest closeAudioLiveRequest) throws Exception {
        RawResponse response = json(Const.CloseAudioLiveRisk, new ArrayList<>(), JSON.toJSONString(closeAudioLiveRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), AsyncRiskDetectionResponse.class);
    }

    @Override
    public AsyncRiskDetectionResponse CloseVideoLiveRisk(ImageRiskResultRequest closeVideoLiveRequest) throws Exception {
        RawResponse response = json(Const.CloseVideoLiveRisk, new ArrayList<>(), JSON.toJSONString(closeVideoLiveRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), AsyncRiskDetectionResponse.class);
    }
}