package com.volcengine.service.contentSecurity.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.helper.Utils;
import com.volcengine.model.request.*;
import com.volcengine.model.response.*;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.contentSecurity.ContentSecurityConfig;
import com.volcengine.service.contentSecurity.ContentSecurityService;
import com.volcengine.model.ApiInfo;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.NameValuePair;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class ContentSecurityServiceImpl extends BaseServiceImpl implements ContentSecurityService {
    private ContentSecurityServiceImpl() {
        super(ContentSecurityConfig.serviceInfo, ContentSecurityConfig.apiInfoList);
    }

    private static final ContentSecurityServiceImpl contentSecurityInstance = new ContentSecurityServiceImpl();

    public static ContentSecurityService getInstance() {
        return contentSecurityInstance;
    }

    public void setImgPath() {
        contentSecurityInstance.getApiInfoList().put(Const.ImageContentRiskV2, new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/open/api/v4/image_content_risk");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new BasicNameValuePair("Action", Const.ImageContentRisk));
                                add(new BasicNameValuePair("Version", "2021-11-29"));
                            }
                        });
                    }
                }
        ));
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
    public ImageRiskDetectionResponse ImageRiskDetectionV2(RiskDetectionRequest riskDetectionRequest) throws Exception {
        String aid = Integer.toString(riskDetectionRequest.getAppId());
        Map<String, String> aidMap = new HashMap<String, String>(){{
            put("aid", aid);
        }};
        RawResponse response = json(Const.ImageContentRiskV2, Utils.mapToPairList(aidMap), JSON.toJSONString(riskDetectionRequest));
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
    public GetAudioRiskResponse AudioRisk(RiskDetectionRequest riskDetectionRequest) throws Exception {
        RawResponse response = json(Const.AudioRisk, new ArrayList<>(), JSON.toJSONString(riskDetectionRequest));
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
    public GetVideoLiveRiskResultResponse VideoLiveResult(ImageRiskResultRequest videoRiskResultRequest) throws Exception {
        RawResponse response = query(Const.GetVideoLiveResult, Utils.mapToPairList(Utils.paramsToMap(videoRiskResultRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), GetVideoLiveRiskResultResponse.class);
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
    public GetAudioLiveRiskResponse AudioLiveResult(ImageRiskResultRequest audioRiskResultRequest) throws Exception {
        RawResponse response = query(Const.GetAudioLiveResult, Utils.mapToPairList(Utils.paramsToMap(audioRiskResultRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), GetAudioLiveRiskResponse.class);
    }

    @Override
    public TextSliceRiskResponse TextSliceRisk(RiskDetectionRequest riskDetectionRequest) throws Exception {
        String aid = Integer.toString(riskDetectionRequest.getAppId());
        Map<String, String> aidMap = new HashMap<String, String>(){{
            put("aid", aid);
        }};

        RawResponse response = json(Const.TextSliceRisk, Utils.mapToPairList(aidMap), JSON.toJSONString(riskDetectionRequest));
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

    @Override
    public ContentSecurityCustomLibCreateResponse CreateCustomLib(CreateContentSecurityCustomLibRequest request) throws Exception {
        RawResponse response = json(Const.CreateCustomLib, new ArrayList<>(), JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ContentSecurityCustomLibCreateResponse.class);
    }

    @Override
    public ContentSecurityCommonResponse UpdateCustomLib(UpdateContentSecurityCustomLibRequest request) throws Exception {
        RawResponse response = json(Const.UpdateCustomLib, new ArrayList<>(), JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ContentSecurityCommonResponse.class);
    }

    public ContentSecurityCommonResponse ChangeCustomLibStatus(ChangeContentSecurityCustomLibStatusRequest request) throws Exception {
        RawResponse response = json(Const.ChangeCustomContentsStatus, new ArrayList<>(), JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ContentSecurityCommonResponse.class);
    }


    @Override
    public ContentSecurityCommonResponse DeleteCustomLib(DeleteContentSecurityCustomLibRequest request) throws Exception {
        RawResponse response = json(Const.DeleteCustomLib, new ArrayList<>(), JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ContentSecurityCommonResponse.class);
    }

    @Override
    public ContentSecurityCustomLibListResponse GetCustomLib(GetContentSecurityCustomLibRequest request) throws Exception {
        RawResponse response = json(Const.GetCustomLib, new ArrayList<>(), JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ContentSecurityCustomLibListResponse.class);
    }

    @Override
    public ContentSecurityAccessConfigCreateResponse CreateAccessConfig(CreateContentSecurityAccessConfigRequest request) throws Exception {
        RawResponse response = json(Const.CreateAccessConfig, new ArrayList<>(), JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ContentSecurityAccessConfigCreateResponse.class);
    }

    @Override
    public ContentSecurityCommonResponse UpdateAccessConfig(UpdateContentSecurityAccessConfigRequest request) throws Exception {
        RawResponse response = json(Const.UpdateAccessConfig, new ArrayList<>(), JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ContentSecurityCommonResponse.class);
    }

    @Override
    public ContentSecurityCommonResponse UpdateAccessConfigStatus(UpdateContentSecurityAccessConfigStatusRequest request) throws Exception {
        RawResponse response = json(Const.UpdateConfigStatus, new ArrayList<>(), JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ContentSecurityCommonResponse.class);
    }

    @Override
    public ContentSecurityAccessConfigListResponse GetAccessConfig(GetContentSecurityAccessConfigRequest request) throws Exception {
        RawResponse response = json(Const.GetAccessConfig, new ArrayList<>(), JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ContentSecurityAccessConfigListResponse.class);
    }

    @Override
    public ContentSecurityCustTextLibListResponse GetTextLibContent(GetContentSecurityCustTextLibRequest request) throws Exception {
        RawResponse response = json(Const.GetTextLibContent, new ArrayList<>(), JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ContentSecurityCustTextLibListResponse.class);
    }

    @Override
    public ContentSecurityCommonResponse DeleteTextLibContent(DeleteContentSecurityCustTextLibRequest request) throws Exception {
        RawResponse response = json(Const.DeleteTextLibContent, new ArrayList<>(), JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ContentSecurityCommonResponse.class);
    }

    @Override
    public ContentSecurityCommonResponse UploadCustTextLibContent(UploadContentSecurityCustTextLibRequest request) throws Exception {
        RawResponse response = json(Const.UploadTextLibContent, new ArrayList<>(), JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ContentSecurityCommonResponse.class);
    }

    @Override
    public ContentSecurityCustImgLibListResponse GetCustImgLibContent(GetContentSecurityCustImgLibRequest request) throws Exception {
        RawResponse response = json(Const.GetImageLibContent, new ArrayList<>(), JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ContentSecurityCustImgLibListResponse.class);
    }

    @Override
    public ContentSecurityCommonResponse DeleteCustImgLibContent(DeleteContentSecurityCustImgLibRequest request) throws Exception {
        RawResponse response = json(Const.DeleteImageLibContent, new ArrayList<>(), JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ContentSecurityCommonResponse.class);
    }

    @Override
    public ContentSecurityUploadImgResponse UploadCustImgLibContent(UploadContentSecurityCustImgLibRequest request) throws Exception {
        RawResponse response = json(Const.UploadImageLibContent, new ArrayList<>(), JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ContentSecurityUploadImgResponse.class);
    }

    @Override
    public ContentSecurityTextRiskStatisticsResponse GetTextStatistics(GetContentSecurityStatisticsRequest request) throws Exception {
        RawResponse response = json(Const.GetTextStatisticsOpen, new ArrayList<>(), JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ContentSecurityTextRiskStatisticsResponse.class);
    }

    @Override
    public ContentSecurityImageRiskStatisticsResponse GetImageStatistics(GetContentSecurityStatisticsRequest request) throws Exception {
        RawResponse response = json(Const.GetImageStatisticsOpen, new ArrayList<>(), JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ContentSecurityImageRiskStatisticsResponse.class);
    }

    @Override
    public ContentSecurityAudioRiskStatisticsResponse GetAudioStatistics(GetContentSecurityStatisticsRequest request) throws Exception {
        RawResponse response = json(Const.GetAudioStatisticsOpen, new ArrayList<>(), JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ContentSecurityAudioRiskStatisticsResponse.class);
    }

    @Override
    public ContentSecurityVideoRiskStatisticsResponse GetVideoStatistics(GetContentSecurityStatisticsRequest request) throws Exception {
        RawResponse response = json(Const.GetVideoStatisticsOpen, new ArrayList<>(), JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ContentSecurityVideoRiskStatisticsResponse.class);
    }

    @Override
    public ContentSecurityAudioRiskStatisticsResponse GetAudioLiveStatistics(GetContentSecurityStatisticsRequest request) throws Exception {
        RawResponse response = json(Const.GetAudioLiveStatisticsOpen, new ArrayList<>(), JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ContentSecurityAudioRiskStatisticsResponse.class);
    }

    @Override
    public ContentSecurityVideoRiskStatisticsResponse GetVideoLiveStatistics(GetContentSecurityStatisticsRequest request) throws Exception {
        RawResponse response = json(Const.GetVideoLiveStatisticsOpen, new ArrayList<>(), JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ContentSecurityVideoRiskStatisticsResponse.class);
    }
}