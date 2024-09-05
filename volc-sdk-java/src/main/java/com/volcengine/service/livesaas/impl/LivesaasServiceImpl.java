package com.volcengine.service.livesaas.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.helper.Utils;
import com.volcengine.model.ServiceInfo;
import com.volcengine.model.livesaas.request.*;
import com.volcengine.model.livesaas.response.*;
import com.volcengine.model.response.RawResponse;
import com.volcengine.model.response.ResponseMetadata;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.livesaas.LivesaasConfig;
import com.volcengine.service.livesaas.LivesaasService;
import org.apache.http.HttpHost;

import java.util.ArrayList;

public class LivesaasServiceImpl extends BaseServiceImpl implements LivesaasService {
    private static LivesaasService INSTANCE = new LivesaasServiceImpl();

    private LivesaasServiceImpl() {
        super(LivesaasConfig.serviceInfoMap.get(Const.REGION_CN_NORTH_1), LivesaasConfig.apiInfoList);
    }

    private LivesaasServiceImpl(HttpHost proxy) {
        super(LivesaasConfig.serviceInfoMap.get(Const.REGION_CN_NORTH_1), proxy, LivesaasConfig.apiInfoList);
    }

    private LivesaasServiceImpl(ServiceInfo serviceInfo) {
        super(serviceInfo, LivesaasConfig.apiInfoList);
    }

    public static LivesaasService getInstance() {
        return INSTANCE;
    }

    public static LivesaasService getInstance(HttpHost proxy) {
        return new LivesaasServiceImpl(proxy);
    }

    public static LivesaasService getInstance(String region) throws Exception {
        ServiceInfo serviceInfo = LivesaasConfig.serviceInfoMap.get(region);
        if (serviceInfo == null) {
            throw new Exception("Livesaas not support region " + region);
        }
        if (Const.REGION_CN_NORTH_1.equals(region)) {
            return INSTANCE;
        }
        throw new Exception("Livesaas not support region " + region);
    }

    @Override
    public ListSiteTagAPIV2Response listSiteTagAPIV2(DefaultRequest defaultRequest) throws Exception {
        RawResponse response = query(Const.ListSiteTagAPIV2, Utils.paramsToPair(defaultRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListSiteTagAPIV2Response res = JSON.parseObject(response.getData(), ListSiteTagAPIV2Response.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public CommonStatusResponse updateSiteTagAPIV2(UpdateSiteTagAPIV2Request updateSiteTagAPIV2Request) throws Exception {
        RawResponse response = json(Const.UpdateSiteTagAPIV2, new ArrayList<>(), JSON.toJSONString(updateSiteTagAPIV2Request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        CommonStatusResponse res = JSON.parseObject(response.getData(), CommonStatusResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetPageWatchDataAPIResponse getPageWatchDataAPI(GetPageWatchDataAPIRequest getPageWatchDataAPIRequest) throws Exception {
        RawResponse response = query(Const.GetPageWatchDataAPI, Utils.paramsToPair(getPageWatchDataAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetPageWatchDataAPIResponse res = JSON.parseObject(response.getData(), GetPageWatchDataAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetUserBehaviorListResponse listUserBehaviorDataAPI(GetUserBehaviorListRequest getUserBehaviorListRequest) throws Exception {
        RawResponse response = query(Const.ListUserBehaviorDataAPI, Utils.paramsToPair(getUserBehaviorListRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetUserBehaviorListResponse res = JSON.parseObject(response.getData(), GetUserBehaviorListResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public CommonResponse createActivityAPIV2(CreateActivityAPIRequest createActivityAPIRequest) throws Exception {
        RawResponse response = json(Const.CreateActivityAPIV2, new ArrayList<>(), JSON.toJSONString(createActivityAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        CommonResponse res = JSON.parseObject(response.getData(), CommonResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public CommonResponse deleteActivityAPI(CommonRequest commonRequest) throws Exception {
        RawResponse response = json(Const.DeleteActivityAPI, new ArrayList<>(), JSON.toJSONString(commonRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        CommonResponse res = JSON.parseObject(response.getData(), CommonResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public ListActivityAPIResponse listActivityAPI(ListActivityAPIRequest listActivityAPIRequest) throws Exception {
        RawResponse response = json(Const.ListActivityAPI, new ArrayList<>(), JSON.toJSONString(listActivityAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListActivityAPIResponse res = JSON.parseObject(response.getData(), ListActivityAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetDownloadLiveClientAPIResponse getDownloadLiveClientAPI(CommonRequest commonRequest) throws Exception {
        RawResponse response = query(Const.GetDownloadLiveClientAPI, Utils.paramsToPair(commonRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetDownloadLiveClientAPIResponse res = JSON.parseObject(response.getData(), GetDownloadLiveClientAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetDownloadLiveClientResponse getDownloadLiveClient(GetDownloadLiveClientRequest getDownloadLiveClientRequest) throws Exception {
        RawResponse response = json(Const.GetDownloadLiveClient, new ArrayList<>(), JSON.toJSONString(getDownloadLiveClientRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetDownloadLiveClientResponse res = JSON.parseObject(response.getData(), GetDownloadLiveClientResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetWebPushLiveClientAPIResponse getWebPushLiveClientAPI(CommonRequest commonRequest) throws Exception {
        RawResponse response = query(Const.GetWebPushLiveClientAPI, Utils.paramsToPair(commonRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetWebPushLiveClientAPIResponse res = JSON.parseObject(response.getData(), GetWebPushLiveClientAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public ListActivityAPIResponse listActivityByCacheAPI(ListActivityAPIRequest listActivityAPIRequest) throws Exception {
        RawResponse response = json(Const.ListActivityByCacheAPI, new ArrayList<>(), JSON.toJSONString(listActivityAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListActivityAPIResponse res = JSON.parseObject(response.getData(), ListActivityAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public DefaultResponse updateActivityStatusAPI(UpdateActivityStatusAPIRequest updateActivityStatusAPIRequest) throws Exception {
        RawResponse response = json(Const.UpdateActivityStatusAPI, new ArrayList<>(), JSON.toJSONString(updateActivityStatusAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DefaultResponse res = JSON.parseObject(response.getData(), DefaultResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public DefaultResponse updatePullToPushAPI(UpdatePullToPushAPIRequest updatePullToPushAPIRequest) throws Exception {
        RawResponse response = json(Const.UpdatePullToPushAPI, new ArrayList<>(), JSON.toJSONString(updatePullToPushAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DefaultResponse res = JSON.parseObject(response.getData(), DefaultResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetActivityAPIResponse getActivityAPI(CommonRequest commonRequest) throws Exception {
        RawResponse response = query(Const.GetActivityAPI, Utils.paramsToPair(commonRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetActivityAPIResponse res = JSON.parseObject(response.getData(), GetActivityAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetStreamsAPIResponse getStreamsAPI(CommonRequest commonRequest) throws Exception {
        RawResponse response = query(Const.GetStreamsAPI, Utils.paramsToPair(commonRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetStreamsAPIResponse res = JSON.parseObject(response.getData(), GetStreamsAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public CommonResponse updateActivityBasicConfigAPI(UpdateBasicConfigAPIRequest updateBasicConfigAPIRequest) throws Exception {
        RawResponse response = json(Const.UpdateActivityBasicConfigAPI, new ArrayList<>(), JSON.toJSONString(updateBasicConfigAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        CommonResponse res = JSON.parseObject(response.getData(), CommonResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetBasicConfigAPIResponse getActivityBasicConfigAPI(CommonRequest commonRequest) throws Exception {
        RawResponse response = query(Const.GetActivityBasicConfigAPI, Utils.paramsToPair(commonRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetBasicConfigAPIResponse res = JSON.parseObject(response.getData(), GetBasicConfigAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public UpdateLoopVideoResponse updateLoopVideoAPI(UpdateLoopVideoRequest updateLoopVideoRequest) throws Exception {
        RawResponse response = json(Const.UpdateLoopVideoAPI, new ArrayList<>(), JSON.toJSONString(updateLoopVideoRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateLoopVideoResponse res = JSON.parseObject(response.getData(), UpdateLoopVideoResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public CommonStatusResponse updateLoopVideoStatusAPI(UpdateLoopVideoStatusAPIRequest updateLoopVideoStatusAPIRequest) throws Exception {
        RawResponse response = json(Const.UpdateLoopVideoStatusAPI, new ArrayList<>(), JSON.toJSONString(updateLoopVideoStatusAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        CommonStatusResponse res = JSON.parseObject(response.getData(), CommonStatusResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetTemporaryLoginTokenResponse getTemporaryLoginTokenAPI(CommonRequest commonRequest) throws Exception {
        RawResponse response = query(Const.GetTemporaryLoginTokenAPI, Utils.paramsToPair(commonRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetTemporaryLoginTokenResponse res = JSON.parseObject(response.getData(), GetTemporaryLoginTokenResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetCustomActMsgAPIResponse getCustomActMsgAPI(GetCustomActMsgAPIRequest getCustomActMsgAPIRequest) throws Exception {
        RawResponse response = query(Const.GetCustomActMsgAPI, Utils.paramsToPair(getCustomActMsgAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetCustomActMsgAPIResponse res = JSON.parseObject(response.getData(), GetCustomActMsgAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public DefaultResponse uploadReplayAPI(UploadMediaRequest uploadMediaRequest) throws Exception {
        RawResponse response = json(Const.UploadReplayAPI, new ArrayList<>(), JSON.toJSONString(uploadMediaRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DefaultResponse res = JSON.parseObject(response.getData(), DefaultResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public ListMediasAPIResponse listMediasAPI(ListMediasAPIRequest listMediasAPIRequest) throws Exception {
        RawResponse response = query(Const.ListMediasAPI, Utils.paramsToPair(listMediasAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListMediasAPIResponse res = JSON.parseObject(response.getData(), ListMediasAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public DefaultResponse updateMediaOnlineStatusAPI(UpdateMediaOnlineStatusAPIRequest updateMediaOnlineStatusAPIRequest) throws Exception {
        RawResponse response = json(Const.UpdateMediaOnlineStatusAPI, new ArrayList<>(), JSON.toJSONString(updateMediaOnlineStatusAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DefaultResponse res = JSON.parseObject(response.getData(), DefaultResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetAdvertisementDataAPIResponse getAdvertisementDataAPI(GetAdvertisementDataAPIRequest getAdvertisementDataAPIRequest) throws Exception {
        RawResponse response = query(Const.GetAdvertisementDataAPI, Utils.paramsToPair(getAdvertisementDataAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetAdvertisementDataAPIResponse res = JSON.parseObject(response.getData(), GetAdvertisementDataAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public ListUserQuestionnaireResponse listQuestionnaireAnswerDataAPI(ListUserQuestionnaireRequest listUserQuestionnaireRequest) throws Exception {
        RawResponse response = query(Const.ListQuestionnaireAnswerDataAPI, Utils.paramsToPair(listUserQuestionnaireRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListUserQuestionnaireResponse res = JSON.parseObject(response.getData(), ListUserQuestionnaireResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public ListStatisticsQuestionnaireResponse listQuestionnaireDataAPI(ListStatisticsQuestionnaireRequest listStatisticsQuestionnaireRequest) throws Exception {
        RawResponse response = query(Const.ListQuestionnaireDataAPI, Utils.paramsToPair(listStatisticsQuestionnaireRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListStatisticsQuestionnaireResponse res = JSON.parseObject(response.getData(), ListStatisticsQuestionnaireResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetRealTimeOnlineNumberAPIResponse getRealTimeOnlineNumberAPI(CommonRequest commonRequest) throws Exception {
        RawResponse response = query(Const.GetRealTimeOnlineNumberAPI, Utils.paramsToPair(commonRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetRealTimeOnlineNumberAPIResponse res = JSON.parseObject(response.getData(), GetRealTimeOnlineNumberAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public ListAnActivityStartAndEndTimeAPIResponse listAnActivityStartAndEndTimeAPI(CommonRequest commonRequest) throws Exception {
        RawResponse response = query(Const.ListAnActivityStartAndEndTimeAPI, Utils.paramsToPair(commonRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListAnActivityStartAndEndTimeAPIResponse res = JSON.parseObject(response.getData(), ListAnActivityStartAndEndTimeAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetActivityReservationResponse getActivityReservationAPI(GetActivityReservationRequest getActivityReservationRequest) throws Exception {
        RawResponse response = query(Const.GetActivityReservationAPI, Utils.paramsToPair(getActivityReservationRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetActivityReservationResponse res = JSON.parseObject(response.getData(), GetActivityReservationResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public ListPosterInviteResponse listPosterInviteAPI(ListPosterInviteRequest listPosterInviteRequest) throws Exception {
        RawResponse response = query(Const.ListPosterInviteAPI, Utils.paramsToPair(listPosterInviteRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListPosterInviteResponse res = JSON.parseObject(response.getData(), ListPosterInviteResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public CommonStatusResponse presenterChatAPI(PresenterChatRequest presenterChatRequest) throws Exception {
        RawResponse response = json(Const.PresenterChatAPI, new ArrayList<>(), JSON.toJSONString(presenterChatRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        CommonStatusResponse res = JSON.parseObject(response.getData(), CommonStatusResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public CommonStatusResponse presenterChatAPIV2(PresenterChatRequest presenterChatRequest) throws Exception {
        RawResponse response = json(Const.PresenterChatAPIV2, new ArrayList<>(), JSON.toJSONString(presenterChatRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        CommonStatusResponse res = JSON.parseObject(response.getData(), CommonStatusResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public PollingChatAPIResponse pollingChatAPI(PollingChatAPIRequest pollingChatAPIRequest) throws Exception {
        RawResponse response = query(Const.PollingChatAPI, Utils.paramsToPair(pollingChatAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        PollingChatAPIResponse res = JSON.parseObject(response.getData(), PollingChatAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetHotChatAPIResponse getHotChatAPI(CommonRequest commonRequest) throws Exception {
        RawResponse response = query(Const.GetHotChatAPI, Utils.paramsToPair(commonRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetHotChatAPIResponse res = JSON.parseObject(response.getData(), GetHotChatAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetTopChatAPIResponse getTopChatAPI(CommonRequest commonRequest) throws Exception {
        RawResponse response = query(Const.GetTopChatAPI, Utils.paramsToPair(commonRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetTopChatAPIResponse res = JSON.parseObject(response.getData(), GetTopChatAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetHotChatAPIResponse getHotChatAPI(GetHotChatAPIRequest getHotChatAPIRequest) throws Exception {
        RawResponse response = query(Const.GetHotChatAPI, Utils.paramsToPair(getHotChatAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetHotChatAPIResponse res = JSON.parseObject(response.getData(), GetHotChatAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetTopChatAPIResponse getTopChatAPI(GetTopChatAPIRequest getTopChatAPIRequest) throws Exception {
        RawResponse response = query(Const.GetTopChatAPI, Utils.paramsToPair(getTopChatAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetTopChatAPIResponse res = JSON.parseObject(response.getData(), GetTopChatAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public CommonStatusResponse deleteChatAPI(DeleteChatAPIRequest deleteChatAPIRequest) throws Exception {
        RawResponse response = json(Const.DeleteChatAPI, new ArrayList<>(), JSON.toJSONString(deleteChatAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        CommonStatusResponse res = JSON.parseObject(response.getData(), CommonStatusResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public LikeChatAPIResponse likeChatAPI(LikeChatAPIRequest likeChatAPIRequest) throws Exception {
        RawResponse response = json(Const.LikeChatAPI, new ArrayList<>(), JSON.toJSONString(likeChatAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        LikeChatAPIResponse res = JSON.parseObject(response.getData(), LikeChatAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public CommonStatusResponse topChatAPI(TopChatAPIRequest topChatAPIRequest) throws Exception {
        RawResponse response = json(Const.TopChatAPI, new ArrayList<>(), JSON.toJSONString(topChatAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        CommonStatusResponse res = JSON.parseObject(response.getData(), CommonStatusResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public EmptyMessageResponse emptyChatAPI(CommonRequest commonRequest) throws Exception {
        RawResponse response = query(Const.EmptyChatAPI, Utils.paramsToPair(commonRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        EmptyMessageResponse res = JSON.parseObject(response.getData(), EmptyMessageResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public CommonStatusResponse updateChatReviewStatusAPI(UpdateActivityChatReviewRequest updateActivityChatReviewRequest) throws Exception {
        RawResponse response = json(Const.UpdateChatReviewStatusAPI, new ArrayList<>(), JSON.toJSONString(updateActivityChatReviewRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        CommonStatusResponse res = JSON.parseObject(response.getData(), CommonStatusResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public CommonStatusResponse confirmReviewChatAPI(ConfirmReviewChatAPIRequest confirmReviewChatAPIRequest) throws Exception {
        RawResponse response = json(Const.ConfirmReviewChatAPI, new ArrayList<>(), JSON.toJSONString(confirmReviewChatAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        CommonStatusResponse res = JSON.parseObject(response.getData(), CommonStatusResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public CommonStatusResponse silenceUserAPI(SilenceUserAPIRequest silenceUserAPIRequest) throws Exception {
        RawResponse response = json(Const.SilenceUserAPI, new ArrayList<>(), JSON.toJSONString(silenceUserAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        CommonStatusResponse res = JSON.parseObject(response.getData(), CommonStatusResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetSilenceUserListAPIResponse getSilenceUserListAPI(CommonRequest commonRequest) throws Exception {
        RawResponse response = query(Const.GetSilenceUserListAPI, Utils.paramsToPair(commonRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetSilenceUserListAPIResponse res = JSON.parseObject(response.getData(), GetSilenceUserListAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetActivityMenuAPIResponse getActivityMenuAPI(CommonRequest commonRequest) throws Exception {
        RawResponse response = query(Const.GetActivityMenuAPI, Utils.paramsToPair(commonRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetActivityMenuAPIResponse res = JSON.parseObject(response.getData(), GetActivityMenuAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public CommonStatusResponse updateActivityMenuAPI(UpdateActivityMenuAPIRequest updateActivityMenuAPIRequest) throws Exception {
        RawResponse response = json(Const.UpdateActivityMenuAPI, new ArrayList<>(), JSON.toJSONString(updateActivityMenuAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        CommonStatusResponse res = JSON.parseObject(response.getData(), CommonStatusResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetActivityProductAPIResponse getActivityProductAPI(CommonRequest commonRequest) throws Exception {
        RawResponse response = query(Const.GetActivityProductAPI, Utils.paramsToPair(commonRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetActivityProductAPIResponse res = JSON.parseObject(response.getData(), GetActivityProductAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public CommonStatusResponse updateActivityProductAPI(UpdateActivityProductV2Request updateActivityProductV2Request) throws Exception {
        RawResponse response = json(Const.UpdateActivityProductAPI, new ArrayList<>(), JSON.toJSONString(updateActivityProductV2Request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        CommonStatusResponse res = JSON.parseObject(response.getData(), CommonStatusResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }


    @Override
    public CommonStatusResponse deleteGraphicMessageAPI(DeleteGraphicMessageAPIRequest deleteGraphicMessageAPIRequest) throws Exception {
        RawResponse response = json(Const.DeleteGraphicMessageAPI, new ArrayList<>(), JSON.toJSONString(deleteGraphicMessageAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        CommonStatusResponse res = JSON.parseObject(response.getData(), CommonStatusResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public CommonStatusResponse updatePresenterNameAPI(UpdatePresenterNameAPIRequest updatePresenterNameAPIRequest) throws Exception {
        RawResponse response = json(Const.UpdatePresenterNameAPI, new ArrayList<>(), JSON.toJSONString(updatePresenterNameAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        CommonStatusResponse res = JSON.parseObject(response.getData(), CommonStatusResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public CommonStatusResponse updateBulletScreensSwitchAPI(UpdateBulletScreensSwitchAPIRequest updateBulletScreensSwitchAPIRequest) throws Exception {
        RawResponse response = json(Const.UpdateBulletScreensSwitchAPI, new ArrayList<>(), JSON.toJSONString(updateBulletScreensSwitchAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        CommonStatusResponse res = JSON.parseObject(response.getData(), CommonStatusResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public CommonStatusResponse enableProductAPI(EnableProductRequest enableProductRequest) throws Exception {
        RawResponse response = json(Const.EnableProductAPI, new ArrayList<>(), JSON.toJSONString(enableProductRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        CommonStatusResponse res = JSON.parseObject(response.getData(), CommonStatusResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public CommonStatusResponse explainProductAPI(ExplainProductRequest explainProductRequest) throws Exception {
        RawResponse response = json(Const.ExplainProductAPI, new ArrayList<>(), JSON.toJSONString(explainProductRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        CommonStatusResponse res = JSON.parseObject(response.getData(), CommonStatusResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public UpdateActivityEmbeddedUrlAPIResponse updateActivityEmbeddedUrlAPI(UpdateActivityEmbeddedUrlAPIRequest updateActivityEmbeddedUrlAPIRequest) throws Exception {
        RawResponse response = json(Const.UpdateActivityEmbeddedUrlAPI, new ArrayList<>(), JSON.toJSONString(updateActivityEmbeddedUrlAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateActivityEmbeddedUrlAPIResponse res = JSON.parseObject(response.getData(), UpdateActivityEmbeddedUrlAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetActivityEmbeddedUrlAPIResponse getActivityEmbeddedUrlAPI(CommonRequest commonRequest) throws Exception {
        RawResponse response = query(Const.GetActivityEmbeddedUrlAPI, Utils.paramsToPair(commonRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetActivityEmbeddedUrlAPIResponse res = JSON.parseObject(response.getData(), GetActivityEmbeddedUrlAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public UpdateCustomizationViewPermissionAPIResponse updateCustomizationViewPermissionAPI(UpdateCustomizationViewPermissionAPIRequest updateCustomizationViewPermissionAPIRequest) throws Exception {
        RawResponse response = json(Const.UpdateCustomizationViewPermissionAPI, new ArrayList<>(), JSON.toJSONString(updateCustomizationViewPermissionAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateCustomizationViewPermissionAPIResponse res = JSON.parseObject(response.getData(), UpdateCustomizationViewPermissionAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public ListLivePromotionsAPIResponse listLivePromotionsAPI(CommonRequest commonRequest) throws Exception {
        RawResponse response = query(Const.ListLivePromotionsAPI, Utils.paramsToPair(commonRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListLivePromotionsAPIResponse res = JSON.parseObject(response.getData(), ListLivePromotionsAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public AddLivePromotionsAPIResponse addLivePromotionsAPI(AddLivePromotionsAPIRequest addLivePromotionsAPIRequest) throws Exception {
        RawResponse response = json(Const.AddLivePromotionsAPI, new ArrayList<>(), JSON.toJSONString(addLivePromotionsAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        AddLivePromotionsAPIResponse res = JSON.parseObject(response.getData(), AddLivePromotionsAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public CommonResponse updateLivePromotionsStatusAPI(UpdateLivePromotionsStatusAPIRequest updateLivePromotionsStatusAPIRequest) throws Exception {
        RawResponse response = json(Const.UpdateLivePromotionsStatusAPI, new ArrayList<>(), JSON.toJSONString(updateLivePromotionsStatusAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        CommonResponse res = JSON.parseObject(response.getData(), CommonResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public CommonResponse deleteLivePromotionsAPI(DeleteLivePromotionsAPIRequest deleteLivePromotionsAPIRequest) throws Exception {
        RawResponse response = json(Const.DeleteLivePromotionsAPI, new ArrayList<>(), JSON.toJSONString(deleteLivePromotionsAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        CommonResponse res = JSON.parseObject(response.getData(), CommonResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public ListHostAccountAPIResponse listHostAccountAPI(ListHostAccountAPIRequest listHostAccountAPIRequest) throws Exception {
        RawResponse response = query(Const.ListHostAccountAPI, Utils.paramsToPair(listHostAccountAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListHostAccountAPIResponse res = JSON.parseObject(response.getData(), ListHostAccountAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetBusinessAccountInfoAPIResponse getBusinessAccountInfoAPI(CommonRequest commonRequest) throws Exception {
        RawResponse response = query(Const.GetBusinessAccountInfoAPI, Utils.paramsToPair(commonRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetBusinessAccountInfoAPIResponse res = JSON.parseObject(response.getData(), GetBusinessAccountInfoAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public UploadMediaByURLResponse uploadMediaByURL(UploadMediaByURLRequest uploadMediaByURLRequest) throws Exception {
        RawResponse response = json(Const.UploadMediaByURL, new ArrayList<>(), JSON.toJSONString(uploadMediaByURLRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UploadMediaByURLResponse res = JSON.parseObject(response.getData(), UploadMediaByURLResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public QueryUploadMediaByURLResponse queryUploadMediaByURL(QueryUploadMediaByURLRequest queryUploadMediaByURLRequest) throws Exception {
        RawResponse response = json(Const.QueryUploadMediaByURL, new ArrayList<>(), JSON.toJSONString(queryUploadMediaByURLRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        QueryUploadMediaByURLResponse res = JSON.parseObject(response.getData(), QueryUploadMediaByURLResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public Temp2MediaAPIResponse tempToMediaActivityMediaAPI(Temp2MediaAPIRequest temp2MediaAPIRequest) throws Exception {
        RawResponse response = json(Const.TempToMediaActivityMediaAPI, new ArrayList<>(), JSON.toJSONString(temp2MediaAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        Temp2MediaAPIResponse res = JSON.parseObject(response.getData(), Temp2MediaAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public ListActivityLibAPIResponse listActivityMediaAPI(ListActivityLibAPIRequest listActivityLibAPIRequest) throws Exception {
        RawResponse response = query(Const.ListActivityMediaAPI, Utils.paramsToPair(listActivityLibAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListActivityLibAPIResponse res = JSON.parseObject(response.getData(), ListActivityLibAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }



    @Override
    public ListUserSubmitEnterReviewResponse listUserSubmitEnterReviewAPI(ListUserSubmitEnterReviewRequest listUserSubmitEnterReviewRequest) throws Exception {
        RawResponse response = query(Const.ListUserSubmitEnterReviewAPI, Utils.paramsToPair(listUserSubmitEnterReviewRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListUserSubmitEnterReviewResponse res = JSON.parseObject(response.getData(), ListUserSubmitEnterReviewResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public CommonStatusResponse reviewUserEnterFormAPI(ReviewUserEnterFormRequest reviewUserEnterFormRequest) throws Exception {
        RawResponse response = json(Const.ReviewUserEnterFormAPI, new ArrayList<>(), JSON.toJSONString(reviewUserEnterFormRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        CommonStatusResponse res = JSON.parseObject(response.getData(), CommonStatusResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetActivityAntidirtResponse getActivityAntidirtAPI(GetActivityAntidirtRequest getActivityAntidirtRequest) throws Exception {
        RawResponse response = query(Const.GetActivityAntidirtAPI, Utils.paramsToPair(getActivityAntidirtRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetActivityAntidirtResponse res = JSON.parseObject(response.getData(), GetActivityAntidirtResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public CommonStatusResponse addActivityAntidirtAPI(AddActivityAntidirtRequest addActivityAntidirtRequest) throws Exception {
        RawResponse response = json(Const.AddActivityAntidirtAPI, new ArrayList<>(), JSON.toJSONString(addActivityAntidirtRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        CommonStatusResponse res = JSON.parseObject(response.getData(), CommonStatusResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public CommonStatusResponse delActivityAntidirtAPI(DelActivityAntidirtRequest delActivityAntidirtRequest) throws Exception {
        RawResponse response = json(Const.DelActivityAntidirtAPI, new ArrayList<>(), JSON.toJSONString(delActivityAntidirtRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        CommonStatusResponse res = JSON.parseObject(response.getData(), CommonStatusResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public CommonStatusResponse sendCustomSystemMessageAPI(SendCustomSystemMessageRequest sendCustomSystemMessageRequest) throws Exception {
        RawResponse response = json(Const.SendCustomSystemMessageAPI, new ArrayList<>(), JSON.toJSONString(sendCustomSystemMessageRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        CommonStatusResponse res = JSON.parseObject(response.getData(), CommonStatusResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetSDKTokenResponse getSDKTokenAPI(GetSDKTokenRequest getSDKTokenRequest) throws Exception {
        RawResponse response = json(Const.GetSDKTokenAPI, new ArrayList<>(), JSON.toJSONString(getSDKTokenRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetSDKTokenResponse res = JSON.parseObject(response.getData(), GetSDKTokenResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetAllStreamPullInfoAPIResponse getAllStreamPullInfoAPI(CommonRequest commonRequest) throws Exception {
        RawResponse response = query(Const.GetAllStreamPullInfoAPI, Utils.paramsToPair(commonRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetAllStreamPullInfoAPIResponse res = JSON.parseObject(response.getData(), GetAllStreamPullInfoAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetUserTaskAwardResultAPIResponse getUserTaskAwardResultAPI(GetUserTaskAwardResultAPIRequest getUserTaskAwardResultAPIRequest) throws Exception {
        RawResponse response = query(Const.GetUserTaskAwardResultAPI, Utils.paramsToPair(getUserTaskAwardResultAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetUserTaskAwardResultAPIResponse res = JSON.parseObject(response.getData(), GetUserTaskAwardResultAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public AnalysisUserBehaviorPeopleResponse analysisUserBehaviorPeople(AnalysisUserBehaviorPeopleRequest analysisUserBehaviorPeopleRequest) throws Exception {
        RawResponse response = query(Const.AnalysisUserBehaviorPeople, Utils.paramsToPair(analysisUserBehaviorPeopleRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            // throw response.getException();
            String message = GetErrorMessage(response);
            throw new Exception(message);
        }
        AnalysisUserBehaviorPeopleResponse res = JSON.parseObject(response.getData(), AnalysisUserBehaviorPeopleResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetAwardRecordStatisticsAPIResponse getAwardRecordStatisticsAPI(GetAwardRecordStatisticsAPIRequest getAwardRecordStatisticsAPIRequest) throws Exception {
        RawResponse response = query(Const.GetAwardRecordStatisticsAPI, Utils.paramsToPair(getAwardRecordStatisticsAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetAwardRecordStatisticsAPIResponse res = JSON.parseObject(response.getData(), GetAwardRecordStatisticsAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public ListQuizRecordAPIResponse listQuizRecordAPI(ListQuizRecordAPIRequest listQuizRecordAPIRequest) throws Exception {
        RawResponse response = query(Const.ListQuizRecordAPI, Utils.paramsToPair(listQuizRecordAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListQuizRecordAPIResponse res = JSON.parseObject(response.getData(), ListQuizRecordAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public ListQuizStatisticsAPIResponse listQuizStatisticsAPI(ListQuizStatisticsAPIRequest listQuizStatisticsAPIRequest) throws Exception {
        RawResponse response = query(Const.ListQuizStatisticsAPI, Utils.paramsToPair(listQuizStatisticsAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListQuizStatisticsAPIResponse res = JSON.parseObject(response.getData(), ListQuizStatisticsAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetQuizDataAPIResponse getQuizDataAPI(GetQuizDataAPIRequest getQuizDataAPIRequest) throws Exception {
        RawResponse response = query(Const.GetQuizDataAPI, Utils.paramsToPair(getQuizDataAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetQuizDataAPIResponse res = JSON.parseObject(response.getData(), GetQuizDataAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetTaskAwardItemListAPIResponse getTaskAwardItemListAPI(GetTaskAwardItemListAPIRequest getTaskAwardItemListAPIRequest) throws Exception {
        RawResponse response = query(Const.GetTaskAwardItemListAPI, Utils.paramsToPair(getTaskAwardItemListAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetTaskAwardItemListAPIResponse res = JSON.parseObject(response.getData(), GetTaskAwardItemListAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetTaskAwardRecordStatisticsAPIResponse getTaskAwardRecordStatisticsAPI(GetTaskAwardRecordStatisticsAPIRequest getTaskAwardRecordStatisticsAPIRequest) throws Exception {
        RawResponse response = query(Const.GetTaskAwardRecordStatisticsAPI, Utils.paramsToPair(getTaskAwardRecordStatisticsAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetTaskAwardRecordStatisticsAPIResponse res = JSON.parseObject(response.getData(), GetTaskAwardRecordStatisticsAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetCheckInListAPIResponse getCheckInListAPI(GetCheckInListAPIRequest getCheckInListAPIRequest) throws Exception {
        RawResponse response = query(Const.GetCheckInListAPI, Utils.paramsToPair(getCheckInListAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetCheckInListAPIResponse res = JSON.parseObject(response.getData(), GetCheckInListAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetCheckInRecordStatisticsAPIResponse getCheckInRecordStatisticsAPI(GetCheckInRecordStatisticsAPIRequest getCheckInRecordStatisticsAPIRequest) throws Exception {
        RawResponse response = query(Const.GetCheckInRecordStatisticsAPI, Utils.paramsToPair(getCheckInRecordStatisticsAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetCheckInRecordStatisticsAPIResponse res = JSON.parseObject(response.getData(), GetCheckInRecordStatisticsAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public ListRedPacketDataAPIResponse listRedPacketDataAPI(ListRedPacketDataAPIRequest listRedPacketDataAPIRequest) throws Exception {
        RawResponse response = query(Const.ListRedPacketDataAPI, Utils.paramsToPair(listRedPacketDataAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListRedPacketDataAPIResponse res = JSON.parseObject(response.getData(), ListRedPacketDataAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public ListRedPacketRecordAPIResponse listRedPacketRecordAPI(ListRedPacketRecordAPIRequest listRedPacketRecordAPIRequest) throws Exception {
        RawResponse response = query(Const.ListRedPacketRecordAPI, Utils.paramsToPair(listRedPacketRecordAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListRedPacketRecordAPIResponse res = JSON.parseObject(response.getData(), ListRedPacketRecordAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetAwardConfigListAPIResponse getAwardConfigListAPI(GetAwardConfigListAPIRequest getAwardConfigListAPIRequest) throws Exception {
        RawResponse response = query(Const.GetAwardConfigListAPI, Utils.paramsToPair(getAwardConfigListAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetAwardConfigListAPIResponse res = JSON.parseObject(response.getData(), GetAwardConfigListAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetVoteListAPIResponse getVoteListAPI(GetVoteListAPIRequest getVoteListAPIRequest) throws Exception {
        RawResponse response = query(Const.GetVoteListAPI, Utils.paramsToPair(getVoteListAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetVoteListAPIResponse res = JSON.parseObject(response.getData(), GetVoteListAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetVoteStatisticsAPIResponse getVoteStatisticsAPI(GetVoteStatisticsAPIRequest getVoteStatisticsAPIRequest) throws Exception {
        RawResponse response = query(Const.GetVoteStatisticsAPI, Utils.paramsToPair(getVoteStatisticsAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetVoteStatisticsAPIResponse res = JSON.parseObject(response.getData(), GetVoteStatisticsAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetAccountTemplateAPIResponse getAccountTemplateAPI(GetAccountTemplateAPIRequest getAccountTemplateAPIRequest) throws Exception {
        RawResponse response = query(Const.GetAccountTemplateAPI, Utils.paramsToPair(getAccountTemplateAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetAccountTemplateAPIResponse res = JSON.parseObject(response.getData(), GetAccountTemplateAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public UpdateAccountTemplateStatusAPIResponse updateAccountTemplateStatusAPI(UpdateAccountTemplateStatusAPIRequest updateAccountTemplateStatusAPIRequest) throws Exception {
        RawResponse response = json(Const.UpdateAccountTemplateStatusAPI, new ArrayList<>(), JSON.toJSONString(updateAccountTemplateStatusAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateAccountTemplateStatusAPIResponse res = JSON.parseObject(response.getData(), UpdateAccountTemplateStatusAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public UpdateDefaultTemplateStatusAPIResponse updateDefaultTemplateStatusAPI(UpdateDefaultTemplateStatusAPIRequest updateDefaultTemplateStatusAPIRequest) throws Exception {
        RawResponse response = json(Const.UpdateDefaultTemplateStatusAPI, new ArrayList<>(), JSON.toJSONString(updateDefaultTemplateStatusAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateDefaultTemplateStatusAPIResponse res = JSON.parseObject(response.getData(), UpdateDefaultTemplateStatusAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetPageWatchDataAPIV2Response getPageWatchDataAPIV2(GetPageWatchDataAPIV2Request getPageWatchDataAPIV2Request) throws Exception {
        RawResponse response = query(Const.GetPageWatchDataAPIV2, Utils.paramsToPair(getPageWatchDataAPIV2Request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetPageWatchDataAPIV2Response res = JSON.parseObject(response.getData(), GetPageWatchDataAPIV2Response.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetActivityReservationAPIV2Response getActivityReservationAPIV2(GetActivityReservationAPIV2Request getActivityReservationAPIV2Request) throws Exception {
        RawResponse response = query(Const.GetActivityReservationAPIV2, Utils.paramsToPair(getActivityReservationAPIV2Request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetActivityReservationAPIV2Response res = JSON.parseObject(response.getData(), GetActivityReservationAPIV2Response.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public ListStatisticsQuestionnaireAPIV2Response ListQuestionnaireDataAPIV2(ListStatisticsQuestionnaireAPIV2Request listStatisticsQuestionnaireAPIV2Request) throws Exception {
        RawResponse response = query(Const.ListQuestionnaireDataAPIV2, Utils.paramsToPair(listStatisticsQuestionnaireAPIV2Request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListStatisticsQuestionnaireAPIV2Response res = JSON.parseObject(response.getData(), ListStatisticsQuestionnaireAPIV2Response.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public ListUserQuestionnaireAPIV2Response ListQuestionnaireAnswerDataAPIV2(ListUserQuestionnaireAPIV2Request listUserQuestionnaireAPIV2Request) throws Exception {
        RawResponse response = query(Const.ListQuestionnaireAnswerDataAPIV2, Utils.paramsToPair(listUserQuestionnaireAPIV2Request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListUserQuestionnaireAPIV2Response res = JSON.parseObject(response.getData(), ListUserQuestionnaireAPIV2Response.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public AnalysisUserBehaviorPeopleV2Response analysisUserBehaviorPeopleV2(AnalysisUserBehaviorPeopleV2Request analysisUserBehaviorPeopleV2Request) throws Exception {
        RawResponse response = query(Const.AnalysisUserBehaviorPeopleV2, Utils.paramsToPair(analysisUserBehaviorPeopleV2Request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        AnalysisUserBehaviorPeopleV2Response res = JSON.parseObject(response.getData(), AnalysisUserBehaviorPeopleV2Response.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetAdvertisementDataAPIV2Response getAdvertisementDataAPIV2(GetAdvertisementDataAPIV2Request getAdvertisementDataAPIV2Request) throws Exception {
        RawResponse response = query(Const.GetAdvertisementDataAPIV2, Utils.paramsToPair(getAdvertisementDataAPIV2Request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetAdvertisementDataAPIV2Response res = JSON.parseObject(response.getData(), GetAdvertisementDataAPIV2Response.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetAdvertisementDataDetailAPIResponse getAdvertisementDataDetailAPI(GetAdvertisementDataDetailAPIRequest getAdvertisementDataDetailAPIRequest) throws Exception {
        RawResponse response = query(Const.GetAdvertisementDataDetailAPI, Utils.paramsToPair(getAdvertisementDataDetailAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetAdvertisementDataDetailAPIResponse res = JSON.parseObject(response.getData(), GetAdvertisementDataDetailAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }


    @Override
    public GetUserBehaviorListResponseAPIV2 ListUserBehaviorDataAPIV2(GetUserBehaviorListRequestAPIV2 getUserBehaviorListAPIV2Request) throws Exception {
        RawResponse response = query(Const.ListUserBehaviorDataAPIV2, Utils.paramsToPair(getUserBehaviorListAPIV2Request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetUserBehaviorListResponseAPIV2 res = JSON.parseObject(response.getData(), GetUserBehaviorListResponseAPIV2.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public ListChannelAPIResponse listChannelAPI(ListChannelAPIRequest listChannelAPIRequest) throws Exception {
        RawResponse response = query(Const.ListChannelAPI, Utils.paramsToPair(listChannelAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListChannelAPIResponse res = JSON.parseObject(response.getData(), ListChannelAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetCustomViewingRestrictionInfoAPIResponse getCustomViewingRestrictionInfoAPI(GetCustomViewingRestrictionInfoAPIRequest getCustomViewingRestrictionInfoAPIRequest) throws Exception {
        RawResponse response = query(Const.GetCustomViewingRestrictionInfoAPI, Utils.paramsToPair(getCustomViewingRestrictionInfoAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetCustomViewingRestrictionInfoAPIResponse res = JSON.parseObject(response.getData(), GetCustomViewingRestrictionInfoAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    private String GetErrorMessage(RawResponse response) {
        String message = "Error:";
        if (response.getException() != null) {
            message += response.getException().getMessage();
        }
        if (response.getHttpCode() != 0) {
            message += ", httpCode:" + response.getHttpCode();
        }
        if (response.getHeaders() != null) {
            message += ", logid:" + response.getFirstHeader("X-Tt-Logid");
        } else {
            message += " without logid";
        }
        return message;
    }

    @Override
    public UpdateActivityViewPermissionAPIResponse updateActivityViewPermissionAPI(UpdateActivityViewPermissionAPIRequest updateActivityViewPermissionAPIRequest) throws Exception {
        RawResponse response = json(Const.UpdateActivityViewPermissionAPI, new ArrayList<>(), JSON.toJSONString(updateActivityViewPermissionAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateActivityViewPermissionAPIResponse res = JSON.parseObject(response.getData(), UpdateActivityViewPermissionAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public DeleteMediaLibraryVideoAPIResponse deleteMediaLibraryVideoAPI(DeleteMediaLibraryVideoAPIRequest deleteMediaLibraryVideoAPIRequest) throws Exception {
        RawResponse response = json(Const.DeleteMediaLibraryVideoAPI, new ArrayList<>(), JSON.toJSONString(deleteMediaLibraryVideoAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DeleteMediaLibraryVideoAPIResponse res = JSON.parseObject(response.getData(), DeleteMediaLibraryVideoAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }


    @Override
    public MediasMergeResponse mediasMerge(MediasMergeRequest mediasMergeRequest) throws Exception {
        RawResponse response = json(Const.MediasMergeAPI, new ArrayList<>(), JSON.toJSONString(mediasMergeRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        MediasMergeResponse res = JSON.parseObject(response.getData(), MediasMergeResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetPopularitySettingsResponse getPopularitySettings(GetPopularitySettingsRequest getPopularitySettingsRequest) throws Exception {
        RawResponse response = query(Const.GetPopularitySettingsAPI, Utils.paramsToPair(getPopularitySettingsRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetPopularitySettingsResponse res = JSON.parseObject(response.getData(), GetPopularitySettingsResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public UpdatePopularitySettingsResponse updatePopularitySettings(UpdatePopularitySettingsRequest updatePopularitySettingsRequest) throws Exception {
        RawResponse response = json(Const.UpdatePopularitySettingsAPI, new ArrayList<>(), JSON.toJSONString(updatePopularitySettingsRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdatePopularitySettingsResponse res = JSON.parseObject(response.getData(), UpdatePopularitySettingsResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetActivityMenusResponse getActivityMenus(GetActivityMenusRequest getActivityMenusRequest) throws Exception {
        RawResponse response = query(Const.GetActivityMenus, Utils.paramsToPair(getActivityMenusRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetActivityMenusResponse res = JSON.parseObject(response.getData(), GetActivityMenusResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public ModifyActivityMenusResponse modifyActivityMenus(ModifyActivityMenusRequest modifyActivityMenusRequest) throws Exception {
        RawResponse response = json(Const.ModifyActivityMenus, new ArrayList<>(), JSON.toJSONString(modifyActivityMenusRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ModifyActivityMenusResponse res = JSON.parseObject(response.getData(), ModifyActivityMenusResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetActivityEmbeddedUrlsResponse getActivityEmbeddedUrls(GetActivityEmbeddedUrlsRequest getActivityEmbeddedUrlsRequest) throws Exception {
        RawResponse response = query(Const.GetActivityEmbeddedUrls, Utils.paramsToPair(getActivityEmbeddedUrlsRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetActivityEmbeddedUrlsResponse res = JSON.parseObject(response.getData(), GetActivityEmbeddedUrlsResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public ListProductCardsResponse getActivityProducts(ListProductCardsRequest listProductCardsRequest) throws Exception {
        RawResponse response = query(Const.GetActivityProducts, Utils.paramsToPair(listProductCardsRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListProductCardsResponse res = JSON.parseObject(response.getData(), ListProductCardsResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public UpdateProductCardResponse updateActivityProduct(UpdateProductCardRequest updateProductCardRequest) throws Exception {
        RawResponse response = json(Const.UpdateActivityProduct, new ArrayList<>(), JSON.toJSONString(updateProductCardRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateProductCardResponse res = JSON.parseObject(response.getData(), UpdateProductCardResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public DeleteActivityProductResponse deleteActivityProduct(DeleteActivityProductRequest deleteActivityProductRequest) throws Exception {
        RawResponse response = json(Const.DeleteActivityProduct, new ArrayList<>(), JSON.toJSONString(deleteActivityProductRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DeleteActivityProductResponse res = JSON.parseObject(response.getData(), DeleteActivityProductResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public UpdateActivityEmbeddedUrlConfigResponse updateActivityEmbeddedUrl(UpdateActivityEmbeddedUrlConfigRequest updateActivityEmbeddedUrlConfigRequest) throws Exception {
        RawResponse response = json(Const.UpdateActivityEmbeddedUrl, new ArrayList<>(), JSON.toJSONString(updateActivityEmbeddedUrlConfigRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateActivityEmbeddedUrlConfigResponse res = JSON.parseObject(response.getData(), UpdateActivityEmbeddedUrlConfigResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public DeleteActivityEmbeddedUrlConfigResponse deleteActivityEmbeddedUrl(DeleteActivityEmbeddedUrlConfigRequest deleteActivityEmbeddedUrlConfigRequest) throws Exception {
        RawResponse response = json(Const.DeleteActivityEmbeddedUrl, new ArrayList<>(), JSON.toJSONString(deleteActivityEmbeddedUrlConfigRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DeleteActivityEmbeddedUrlConfigResponse res = JSON.parseObject(response.getData(), DeleteActivityEmbeddedUrlConfigResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public UpdateGraphicIntroductionResponse updateActivityBand(UpdateGraphicIntroductionRequest updateGraphicIntroductionRequest) throws Exception {
        RawResponse response = json(Const.UpdateActivityBand, new ArrayList<>(), JSON.toJSONString(updateGraphicIntroductionRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateGraphicIntroductionResponse res = JSON.parseObject(response.getData(), UpdateGraphicIntroductionResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public DeleteGraphicIntroductionResponse deleteActivityBand(DeleteGraphicIntroductionRequest deleteGraphicIntroductionRequest) throws Exception {
        RawResponse response = json(Const.DeleteActivityBand, new ArrayList<>(), JSON.toJSONString(deleteGraphicIntroductionRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DeleteGraphicIntroductionResponse res = JSON.parseObject(response.getData(), DeleteGraphicIntroductionResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetGraphicIntroductionsResponse getActivityBands(GetGraphicIntroductionsRequest getGraphicIntroductionsRequest) throws Exception {
        RawResponse response = query(Const.GetActivityBands, Utils.paramsToPair(getGraphicIntroductionsRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetGraphicIntroductionsResponse res = JSON.parseObject(response.getData(), GetGraphicIntroductionsResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetAccountAggregatedStatisticsResponse getAccountAggregatedStatistics(GetAccountAggregatedStatisticsRequest getAccountAggregatedStatisticsRequest) throws Exception {
        RawResponse response = query(Const.GetAccountAggregatedStatistics, Utils.paramsToPair(getAccountAggregatedStatisticsRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetAccountAggregatedStatisticsResponse res = JSON.parseObject(response.getData(), GetAccountAggregatedStatisticsResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public ListAccountActivityDataResponse listAccountActivityData(ListAccountActivityDataRequest listAccountActivityDataRequest) throws Exception {
        RawResponse response = json(Const.ListAccountActivityData, new ArrayList<>(), JSON.toJSONString(listAccountActivityDataRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListAccountActivityDataResponse res = JSON.parseObject(response.getData(), ListAccountActivityDataResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public ListAccountUserDataResponse listAccountUserData(ListAccountUserDataRequest listAccountUserDataRequest) throws Exception {
        RawResponse response = json(Const.ListAccountUserData, new ArrayList<>(), JSON.toJSONString(listAccountUserDataRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListAccountUserDataResponse res = JSON.parseObject(response.getData(), ListAccountUserDataResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetAccountUserTrackDataResponse getAccountUserTrackData(GetAccountUserTrackDataRequest getAccountUserTrackDataRequest) throws Exception {
        RawResponse response = json(Const.GetAccountUserTrackData, new ArrayList<>(), JSON.toJSONString(getAccountUserTrackDataRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetAccountUserTrackDataResponse res = JSON.parseObject(response.getData(), GetAccountUserTrackDataResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetVQUserDataAPIResponse getVQUserDataAPI(GetVQUserDataAPIRequest getVQUserDataAPIRequest) throws Exception {
        RawResponse response = json(Const.GetVQUserDataAPI, new ArrayList<>(), JSON.toJSONString(getVQUserDataAPIRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetVQUserDataAPIResponse res = JSON.parseObject(response.getData(), GetVQUserDataAPIResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public CreateHostAcceleratePackOrderResponse createHostAcceleratePackOrder(CreateHostAcceleratePackOrderRequest createHostAcceleratePackOrderRequest) throws Exception {
        RawResponse response = json(Const.CreateHostAcceleratePackOrder, new ArrayList<>(), JSON.toJSONString(createHostAcceleratePackOrderRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        CreateHostAcceleratePackOrderResponse res = JSON.parseObject(response.getData(), CreateHostAcceleratePackOrderResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public UpdateHostAcceleratePackOrderResponse updateHostAcceleratePackOrder(UpdateHostAcceleratePackOrderRequest updateHostAcceleratePackOrderRequest) throws Exception {
        RawResponse response = json(Const.UpdateHostAcceleratePackOrder, new ArrayList<>(), JSON.toJSONString(updateHostAcceleratePackOrderRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateHostAcceleratePackOrderResponse res = JSON.parseObject(response.getData(), UpdateHostAcceleratePackOrderResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }


    @Override
    public DeleteHostAcceleratePackOrderResponse deleteHostAcceleratePackOrder(DeleteHostAcceleratePackOrderRequest deleteHostAcceleratePackOrderRequest) throws Exception {
        RawResponse response = json(Const.DeleteHostAcceleratePackOrder, new ArrayList<>(), JSON.toJSONString(deleteHostAcceleratePackOrderRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DeleteHostAcceleratePackOrderResponse res = JSON.parseObject(response.getData(), DeleteHostAcceleratePackOrderResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

     @Override
    public UnsubscribeHostAcceleratePackOrderResponse unsubscribeHostAcceleratePackOrder(UnsubscribeHostAcceleratePackOrderRequest unsubscribeHostAcceleratePackOrderRequest) throws Exception {
        RawResponse response = json(Const.UnsubscribeHostAcceleratePackOrder, new ArrayList<>(), JSON.toJSONString(unsubscribeHostAcceleratePackOrderRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UnsubscribeHostAcceleratePackOrderResponse res = JSON.parseObject(response.getData(), UnsubscribeHostAcceleratePackOrderResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public ModifyHostAcceleratePackOrderResponse modifyHostAcceleratePackOrder(ModifyHostAcceleratePackOrderRequest modifyHostAcceleratePackOrderRequest) throws Exception {
        RawResponse response = json(Const.ModifyHostAcceleratePackOrder, new ArrayList<>(), JSON.toJSONString(modifyHostAcceleratePackOrderRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ModifyHostAcceleratePackOrderResponse res = JSON.parseObject(response.getData(), ModifyHostAcceleratePackOrderResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public ListHostAcceleratePackOrderResponse listHostAcceleratePackOrder(ListHostAcceleratePackOrderRequest listHostAcceleratePackOrderRequest) throws Exception {
        RawResponse response = query(Const.ListHostAcceleratePackOrder, Utils.paramsToPair(listHostAcceleratePackOrderRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListHostAcceleratePackOrderResponse res = JSON.parseObject(response.getData(), ListHostAcceleratePackOrderResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetAttentionDetectionConfigResponse getAttentionDetectionConfig(GetAttentionDetectionConfigRequest getAttentionDetectionConfigRequest) throws Exception {
        RawResponse response = query(Const.GetAttentionDetectionConfig, Utils.paramsToPair(getAttentionDetectionConfigRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetAttentionDetectionConfigResponse res = JSON.parseObject(response.getData(), GetAttentionDetectionConfigResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public UpdateAttentionDetectionConfigResponse updateAttentionDetectionConfig(UpdateAttentionDetectionConfigRequest updateAttentionDetectionConfigRequest) throws Exception {
        RawResponse response = json(Const.UpdateAttentionDetectionConfig, new ArrayList<>(), JSON.toJSONString(updateAttentionDetectionConfigRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateAttentionDetectionConfigResponse res = JSON.parseObject(response.getData(), UpdateAttentionDetectionConfigResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

     @Override
     public CheckUidMatchResponse checkUidMatch(CheckUidMatchRequest checkUidMatchRequest) throws Exception {
        RawResponse response = json(Const.CheckUidMatch, new ArrayList<>(), JSON.toJSONString(checkUidMatchRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        CheckUidMatchResponse res = JSON.parseObject(response.getData(), CheckUidMatchResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetTeachAssistantConfigResponse getTeachAssistantConfig(GetTeachAssistantConfigRequest getTeachAssistantConfigRequest) throws Exception {
        RawResponse response = query(Const.GetTeachAssistantConfig, Utils.paramsToPair(getTeachAssistantConfigRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetTeachAssistantConfigResponse res = JSON.parseObject(response.getData(), GetTeachAssistantConfigResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public UpdateTeachAssistantConfigResponse updateTeachAssistantConfig(UpdateTeachAssistantConfigRequest updateTeachAssistantConfigRequest) throws Exception {
        RawResponse response = json(Const.UpdateTeachAssistantConfig, new ArrayList<>(), JSON.toJSONString(updateTeachAssistantConfigRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateTeachAssistantConfigResponse res = JSON.parseObject(response.getData(), UpdateTeachAssistantConfigResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public ListTeachAssistantAccountsResponse listTeachAssistantAccounts(ListTeachAssistantAccountsRequest listTeachAssistantAccountsRequest) throws Exception {
        RawResponse response = query(Const.ListTeachAssistantAccounts, Utils.paramsToPair(listTeachAssistantAccountsRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListTeachAssistantAccountsResponse res = JSON.parseObject(response.getData(), ListTeachAssistantAccountsResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public UpdateTeachAssistantAccountResponse updateTeachAssistantAccount(UpdateTeachAssistantAccountRequest updateTeachAssistantAccountRequest) throws Exception {
        RawResponse response = json(Const.UpdateTeachAssistantAccount, new ArrayList<>(), JSON.toJSONString(updateTeachAssistantAccountRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateTeachAssistantAccountResponse res = JSON.parseObject(response.getData(), UpdateTeachAssistantAccountResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public DeleteTeachAssistantAccountResponse deleteTeachAssistantAccount(DeleteTeachAssistantAccountRequest deleteTeachAssistantAccountRequest) throws Exception {
        RawResponse response = json(Const.DeleteTeachAssistantAccount, new ArrayList<>(), JSON.toJSONString(deleteTeachAssistantAccountRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DeleteTeachAssistantAccountResponse res = JSON.parseObject(response.getData(), DeleteTeachAssistantAccountResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetActivityCommentConfigResponse getActivityCommentConfig(CommonRequest commonRequest) throws Exception {
        RawResponse response = query(Const.GetActivityCommentConfig, Utils.paramsToPair(commonRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetActivityCommentConfigResponse res = JSON.parseObject(response.getData(), GetActivityCommentConfigResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public UpdateActivityCommentConfigResponse updateActivityCommentConfig(UpdateActivityCommentConfigRequest updateActivityCommentConfigRequest) throws Exception {
        RawResponse response = json(Const.UpdateActivityCommentConfig, new ArrayList<>(), JSON.toJSONString(updateActivityCommentConfigRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateActivityCommentConfigResponse res = JSON.parseObject(response.getData(), UpdateActivityCommentConfigResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public ListActivityCustomEmojiSetsResponse listActivityCustomEmojiSets(CommonRequest commonRequest) throws Exception {
        RawResponse response = query(Const.ListActivityCustomEmojiSets, Utils.paramsToPair(commonRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListActivityCustomEmojiSetsResponse res = JSON.parseObject(response.getData(), ListActivityCustomEmojiSetsResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetActivityCustomEmojiSetDetailResponse getActivityCustomEmojiSetDetail(GetActivityCustomEmojiSetDetailRequest getActivityCustomEmojiSetDetailRequest) throws Exception {
        RawResponse response = query(Const.GetActivityCustomEmojiSetDetail, Utils.paramsToPair(getActivityCustomEmojiSetDetailRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetActivityCustomEmojiSetDetailResponse res = JSON.parseObject(response.getData(), GetActivityCustomEmojiSetDetailResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public ModifyActivityCustomEmojiSetsResponse modifyActivityCustomEmojiSets(ModifyActivityCustomEmojiSetsRequest modifyActivityCustomEmojiSetsRequest) throws Exception {
        RawResponse response = json(Const.ModifyActivityCustomEmojiSets, new ArrayList<>(), JSON.toJSONString(modifyActivityCustomEmojiSetsRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ModifyActivityCustomEmojiSetsResponse res = JSON.parseObject(response.getData(), ModifyActivityCustomEmojiSetsResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public DeleteActivityCustomEmojiSetResponse deleteActivityCustomEmojiSet(DeleteActivityCustomEmojiSetRequest deleteActivityCustomEmojiSetRequest) throws Exception {
        RawResponse response = json(Const.DeleteActivityCustomEmojiSet, new ArrayList<>(), JSON.toJSONString(deleteActivityCustomEmojiSetRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DeleteActivityCustomEmojiSetResponse res = JSON.parseObject(response.getData(), DeleteActivityCustomEmojiSetResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public CreateOrUpdateActivityCustomEmojiSetResponse createOrUpdateActivityCustomEmojiSet(CreateOrUpdateActivityCustomEmojiSetRequest createOrUpdateActivityCustomEmojiSetRequest) throws Exception {
        RawResponse response = json(Const.CreateOrUpdateActivityCustomEmojiSet, new ArrayList<>(), JSON.toJSONString(createOrUpdateActivityCustomEmojiSetRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        CreateOrUpdateActivityCustomEmojiSetResponse res = JSON.parseObject(response.getData(), CreateOrUpdateActivityCustomEmojiSetResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public UpdateActivityCustomEmojiSetStatusResponse updateActivityCustomEmojiSetStatus(UpdateActivityCustomEmojiSetStatusRequest updateActivityCustomEmojiSetStatusRequest) throws Exception {
        RawResponse response = json(Const.UpdateActivityCustomEmojiSetStatus, new ArrayList<>(), JSON.toJSONString(updateActivityCustomEmojiSetStatusRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateActivityCustomEmojiSetStatusResponse res = JSON.parseObject(response.getData(), UpdateActivityCustomEmojiSetStatusResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public UpdateSecurityControlConfigResponse updateSecurityControlConfig(UpdateSecurityControlConfigRequest updateSecurityControlConfigRequest) throws Exception {
        RawResponse response = json(Const.UpdateSecurityControlConfig, new ArrayList<>(), JSON.toJSONString(updateSecurityControlConfigRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateSecurityControlConfigResponse res = JSON.parseObject(response.getData(), UpdateSecurityControlConfigResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetSecurityControlConfigResponse getSecurityControlConfig(GetSecurityControlConfigRequest getSecurityControlConfigRequest) throws Exception {
        RawResponse response = query(Const.GetSecurityControlConfig, Utils.paramsToPair(getSecurityControlConfigRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetSecurityControlConfigResponse res = JSON.parseObject(response.getData(), GetSecurityControlConfigResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetActivityLinksResponse getActivityLinks(GetActivityLinksRequest getActivityLinksRequest) throws Exception {
        RawResponse response = query(Const.GetActivityLinks, Utils.paramsToPair(getActivityLinksRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetActivityLinksResponse res = JSON.parseObject(response.getData(), GetActivityLinksResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetLiveTrafficPostPayDataResponse getLiveTrafficPostPayData(GetLiveTrafficPostPayDataRequest getLiveTrafficPostPayDataRequest) throws Exception {
        RawResponse response = json(Const.GetLiveTrafficPostPayData, new ArrayList<>(), JSON.toJSONString(getLiveTrafficPostPayDataRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetLiveTrafficPostPayDataResponse res = JSON.parseObject(response.getData(), GetLiveTrafficPostPayDataResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public ListAwardConfigsResponse listAwardConfigs(ListAwardConfigsRequest listAwardConfigsRequest) throws Exception {
        RawResponse response = query(Const.ListAwardConfigs, Utils.paramsToPair(listAwardConfigsRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListAwardConfigsResponse res = JSON.parseObject(response.getData(), ListAwardConfigsResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public ListAwardRecordStatisticsResponse listAwardRecordStatistics(ListAwardRecordStatisticsRequest listAwardRecordStatisticsRequest) throws Exception {
        RawResponse response = query(Const.ListAwardRecordStatistics, Utils.paramsToPair(listAwardRecordStatisticsRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListAwardRecordStatisticsResponse res = JSON.parseObject(response.getData(), ListAwardRecordStatisticsResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetActivityLivePromotionDataResponse getActivityLivePromotionData(GetActivityLivePromotionDataRequest getActivityLivePromotionDataRequest) throws Exception {
        RawResponse response = query(Const.GetActivityLivePromotionData, Utils.paramsToPair(getActivityLivePromotionDataRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetActivityLivePromotionDataResponse res = JSON.parseObject(response.getData(), GetActivityLivePromotionDataResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetActivityLivePromotionDetailResponse getActivityLivePromotionDetail(GetActivityLivePromotionDetailRequest getActivityLivePromotionDetailRequest) throws Exception {
        RawResponse response = query(Const.GetActivityLivePromotionDetail, Utils.paramsToPair(getActivityLivePromotionDetailRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetActivityLivePromotionDetailResponse res = JSON.parseObject(response.getData(), GetActivityLivePromotionDetailResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public ListAccountActivityHistoryDataResponse listAccountActivityHistoryData(ListAccountActivityHistoryDataRequest listAccountActivityHistoryDataRequest) throws Exception {
        RawResponse response = json(Const.ListAccountActivityHistoryData, new ArrayList<>(), JSON.toJSONString(listAccountActivityHistoryDataRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListAccountActivityHistoryDataResponse res = JSON.parseObject(response.getData(), ListAccountActivityHistoryDataResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public UpdateVodPlayerConfigResponse updateVodPlayerConfig(UpdateVodPlayerConfigRequest updateVodPlayerConfigRequest) throws Exception {
        RawResponse response = json(Const.UpdateVodPlayerConfig, new ArrayList<>(), JSON.toJSONString(updateVodPlayerConfigRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateVodPlayerConfigResponse res = JSON.parseObject(response.getData(), UpdateVodPlayerConfigResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public DeleteVodPlayerConfigResponse deleteVodPlayerConfig(DeleteVodPlayerConfigRequest deleteVodPlayerConfigRequest) throws Exception {
        RawResponse response = json(Const.DeleteVodPlayerConfig, new ArrayList<>(), JSON.toJSONString(deleteVodPlayerConfigRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DeleteVodPlayerConfigResponse res = JSON.parseObject(response.getData(), DeleteVodPlayerConfigResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetVodPlayerConfigResponse getVodPlayerConfig(GetVodPlayerConfigRequest getVodPlayerConfigRequest) throws Exception {
        RawResponse response = query(Const.GetVodPlayerConfig, Utils.paramsToPair(getVodPlayerConfigRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetVodPlayerConfigResponse res = JSON.parseObject(response.getData(), GetVodPlayerConfigResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public ListVodPlayerConfigResponse listVodPlayerConfig(ListVodPlayerConfigRequest listVodPlayerConfigRequest) throws Exception {
        RawResponse response = query(Const.ListVodPlayerConfig, Utils.paramsToPair(listVodPlayerConfigRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListVodPlayerConfigResponse res = JSON.parseObject(response.getData(), ListVodPlayerConfigResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public UpdateDefaultVodPlayerConfigResponse updateDefaultVodPlayerConfig(UpdateDefaultVodPlayerConfigRequest updateDefaultVodPlayerConfigRequest) throws Exception {
        RawResponse response = json(Const.UpdateDefaultVodPlayerConfig, new ArrayList<>(), JSON.toJSONString(updateDefaultVodPlayerConfigRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateDefaultVodPlayerConfigResponse res = JSON.parseObject(response.getData(), UpdateDefaultVodPlayerConfigResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetVodPlayerTokenResponse getVodPlayerToken(GetVodPlayerTokenRequest getVodPlayerTokenRequest) throws Exception {
        RawResponse response = query(Const.GetVodPlayerToken, Utils.paramsToPair(getVodPlayerTokenRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetVodPlayerTokenResponse res = JSON.parseObject(response.getData(), GetVodPlayerTokenResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetVideoLibraryFolderTreeResponse getVideoLibraryFolderTree(GetVideoLibraryFolderTreeRequest getVideoLibraryFolderTreeRequest) throws Exception {
        RawResponse response = query(Const.GetVideoLibraryFolderTree, Utils.paramsToPair(getVideoLibraryFolderTreeRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetVideoLibraryFolderTreeResponse res = JSON.parseObject(response.getData(), GetVideoLibraryFolderTreeResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public SearchVideoLibraryFolderTreeResponse searchVideoLibraryFolderTree(SearchVideoLibraryFolderTreeRequest searchVideoLibraryFolderTreeRequest) throws Exception {
        RawResponse response = query(Const.SearchVideoLibraryFolderTree, Utils.paramsToPair(searchVideoLibraryFolderTreeRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        SearchVideoLibraryFolderTreeResponse res = JSON.parseObject(response.getData(), SearchVideoLibraryFolderTreeResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public ListLoopVideosResponse listLoopVideos(ListLoopVideosRequest listLoopVideosRequest) throws Exception {
        RawResponse response = query(Const.ListLoopVideos, Utils.paramsToPair(listLoopVideosRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListLoopVideosResponse res = JSON.parseObject(response.getData(), ListLoopVideosResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public ListProgramsResponse listPrograms(ListProgramsRequest listProgramsRequest) throws Exception {
        RawResponse response = query(Const.ListPrograms, Utils.paramsToPair(listProgramsRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListProgramsResponse res = JSON.parseObject(response.getData(), ListProgramsResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public UpdateLoopVideoStatusResponse updateLoopVideoStatus(UpdateLoopVideoStatusRequest updateLoopVideoStatusRequest) throws Exception {
        RawResponse response = json(Const.UpdateLoopVideoStatus, new ArrayList<>(), JSON.toJSONString(updateLoopVideoStatusRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateLoopVideoStatusResponse res = JSON.parseObject(response.getData(), UpdateLoopVideoStatusResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public UpdateLoopVideosResponse updateLoopVideos(UpdateLoopVideosRequest updateLoopVideosRequest) throws Exception {
        RawResponse response = json(Const.UpdateLoopVideos, new ArrayList<>(), JSON.toJSONString(updateLoopVideosRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateLoopVideosResponse res = JSON.parseObject(response.getData(), UpdateLoopVideosResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public UpdateProgramResponse updateProgram(UpdateProgramRequest updateProgramRequest) throws Exception {
        RawResponse response = json(Const.UpdateProgram, new ArrayList<>(), JSON.toJSONString(updateProgramRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateProgramResponse res = JSON.parseObject(response.getData(), UpdateProgramResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public DeleteProgramResponse deleteProgram(DeleteProgramRequest deleteProgramRequest) throws Exception {
        RawResponse response = json(Const.DeleteProgram, new ArrayList<>(), JSON.toJSONString(deleteProgramRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DeleteProgramResponse res = JSON.parseObject(response.getData(), DeleteProgramResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public MediaCutResponse mediaCut(MediaCutRequest mediaCutRequest) throws Exception {
        RawResponse response = json(Const.MediaCut, new ArrayList<>(), JSON.toJSONString(mediaCutRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        MediaCutResponse res = JSON.parseObject(response.getData(), MediaCutResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public UpdateHostAccountResponse updateHostAccount(UpdateHostAccountRequest updateHostAccountRequest) throws Exception {
        RawResponse response = json(Const.UpdateHostAccount, new ArrayList<>(), JSON.toJSONString(updateHostAccountRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateHostAccountResponse res = JSON.parseObject(response.getData(), UpdateHostAccountResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public DeleteHostAccountResponse deleteHostAccount(DeleteHostAccountRequest deleteHostAccountRequest) throws Exception {
        RawResponse response = json(Const.DeleteHostAccount, new ArrayList<>(), JSON.toJSONString(deleteHostAccountRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DeleteHostAccountResponse res = JSON.parseObject(response.getData(), DeleteHostAccountResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public UpdateActivityHostAccountResponse updateActivityHostAccount(UpdateActivityHostAccountRequest updateActivityHostAccountRequest) throws Exception {
        RawResponse response = json(Const.UpdateActivityHostAccount, new ArrayList<>(), JSON.toJSONString(updateActivityHostAccountRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateActivityHostAccountResponse res = JSON.parseObject(response.getData(), UpdateActivityHostAccountResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public UpdateFloatingAdvertisementResponse updateFloatingAdvertisement(UpdateFloatingAdvertisementRequest updateFloatingAdvertisementRequest) throws Exception {
        RawResponse response = json(Const.UpdateFloatingAdvertisement, new ArrayList<>(), JSON.toJSONString(updateFloatingAdvertisementRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateFloatingAdvertisementResponse res = JSON.parseObject(response.getData(), UpdateFloatingAdvertisementResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public ListHostAccountsResponse listHostAccounts(ListHostAccountsRequest listHostAccountsRequest) throws Exception {
        RawResponse response = query(Const.ListHostAccounts, Utils.paramsToPair(listHostAccountsRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListHostAccountsResponse res = JSON.parseObject(response.getData(), ListHostAccountsResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetBusinessAccountInfoResponse getBusinessAccountInfo(GetBusinessAccountInfoRequest getBusinessAccountInfoRequest) throws Exception {
        RawResponse response = query(Const.GetBusinessAccountInfo, Utils.paramsToPair(getBusinessAccountInfoRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetBusinessAccountInfoResponse res = JSON.parseObject(response.getData(), GetBusinessAccountInfoResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetAudienceGroupConfigResponse getAudienceGroupConfig(GetAudienceGroupConfigRequest getAudienceGroupConfigRequest) throws Exception {
        RawResponse response = query(Const.GetAudienceGroupConfig, Utils.paramsToPair(getAudienceGroupConfigRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetAudienceGroupConfigResponse res = JSON.parseObject(response.getData(), GetAudienceGroupConfigResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public UpdateAudienceGroupConfigResponse updateAudienceGroupConfig(UpdateAudienceGroupConfigRequest updateAudienceGroupConfigRequest) throws Exception {
        RawResponse response = json(Const.UpdateAudienceGroupConfig, new ArrayList<>(), JSON.toJSONString(updateAudienceGroupConfigRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateAudienceGroupConfigResponse res = JSON.parseObject(response.getData(), UpdateAudienceGroupConfigResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public ListAudienceGroupUserResponse listAudienceGroupUser(ListAudienceGroupUserRequest listAudienceGroupUserRequest) throws Exception {
        RawResponse response = query(Const.ListAudienceGroupUser, Utils.paramsToPair(listAudienceGroupUserRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListAudienceGroupUserResponse res = JSON.parseObject(response.getData(), ListAudienceGroupUserResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public AddAudienceGroupResponse addAudienceGroup(AddAudienceGroupRequest addAudienceGroupRequest) throws Exception {
        RawResponse response = json(Const.AddAudienceGroup, new ArrayList<>(), JSON.toJSONString(addAudienceGroupRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        AddAudienceGroupResponse res = JSON.parseObject(response.getData(), AddAudienceGroupResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public UpdateAudienceGroupUserConfigResponse updateAudienceGroupUserConfig(UpdateAudienceGroupUserConfigRequest updateAudienceGroupUserConfig) throws Exception {
        RawResponse response = json(Const.UpdateAudienceGroupUserConfig, new ArrayList<>(), JSON.toJSONString(updateAudienceGroupUserConfig));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateAudienceGroupUserConfigResponse res = JSON.parseObject(response.getData(), UpdateAudienceGroupUserConfigResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public DeleteAudienceGroupResponse deleteAudienceGroup(DeleteAudienceGroupRequest deleteAudienceGroupRequest) throws Exception {
        RawResponse response = json(Const.DeleteAudienceGroup, new ArrayList<>(), JSON.toJSONString(deleteAudienceGroupRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DeleteAudienceGroupResponse res = JSON.parseObject(response.getData(), DeleteAudienceGroupResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public ModifyAudienceGroupResponse modifyAudienceGroup(ModifyAudienceGroupRequest modifyAudienceGroupRequest) throws Exception {
        RawResponse response = json(Const.ModifyAudienceGroup, new ArrayList<>(), JSON.toJSONString(modifyAudienceGroupRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ModifyAudienceGroupResponse res = JSON.parseObject(response.getData(), ModifyAudienceGroupResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public AddActivityPartnerRebroadcastResponse addActivityPartnerRebroadcast(AddActivityPartnerRebroadcastRequest addActivityPartnerRebroadcastRequest) throws Exception {
        RawResponse response = json(Const.AddActivityPartnerRebroadcast, new ArrayList<>(), JSON.toJSONString(addActivityPartnerRebroadcastRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        AddActivityPartnerRebroadcastResponse res = JSON.parseObject(response.getData(), AddActivityPartnerRebroadcastResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public DeleteActivityPartnerRebroadcastResponse deleteActivityPartnerRebroadcast(DeleteActivityPartnerRebroadcastRequest deleteActivityPartnerRebroadcastRequest) throws Exception {
        RawResponse response = json(Const.DeleteActivityPartnerRebroadcast, new ArrayList<>(), JSON.toJSONString(deleteActivityPartnerRebroadcastRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DeleteActivityPartnerRebroadcastResponse res = JSON.parseObject(response.getData(), DeleteActivityPartnerRebroadcastResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetActivityPartnerRebroadcastResponse getActivityPartnerRebroadcast(GetActivityPartnerRebroadcastRequest getActivityPartnerRebroadcastRequest) throws Exception {
        RawResponse response = query(Const.GetActivityPartnerRebroadcast, Utils.paramsToPair(getActivityPartnerRebroadcastRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetActivityPartnerRebroadcastResponse res = JSON.parseObject(response.getData(), GetActivityPartnerRebroadcastResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public UpdateLiveChannelConfigResponse updateLiveChannelConfig(UpdateLiveChannelConfigRequest updateLiveChannelConfigRequest) throws Exception {
        RawResponse response = json(Const.UpdateLiveChannelConfig, new ArrayList<>(), JSON.toJSONString(updateLiveChannelConfigRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateLiveChannelConfigResponse res = JSON.parseObject(response.getData(), UpdateLiveChannelConfigResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public CreateLiveChannelConfigResponse createLiveChannelConfig(CreateLiveChannelConfigRequest createLiveChannelConfigRequest) throws Exception {
        RawResponse response = json(Const.CreateLiveChannelConfig, new ArrayList<>(), JSON.toJSONString(createLiveChannelConfigRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        CreateLiveChannelConfigResponse res = JSON.parseObject(response.getData(), CreateLiveChannelConfigResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public DefaultResponse deleteLiveChannelConfig(DeleteLiveChannelConfigRequest deleteLiveChannelConfigRequest) throws Exception {
        RawResponse response = json(Const.DeleteLiveChannelConfig, new ArrayList<>(), JSON.toJSONString(deleteLiveChannelConfigRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DefaultResponse res = JSON.parseObject(response.getData(), DefaultResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public ListLiveChannelConfigResponse listLiveChannelConfig(CommonRequest listLiveChannelConfigRequest) throws Exception {
        RawResponse response = query(Const.ListLiveChannelConfig, Utils.paramsToPair(listLiveChannelConfigRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListLiveChannelConfigResponse res = JSON.parseObject(response.getData(), ListLiveChannelConfigResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    public GetLoginLivesaasStsResponse getLoginLivesaasSts(GetLoginLivesaasStsRequest getLoginLivesaasStsRequest) throws Exception {
        RawResponse response = query(Const.GetLoginLivesaasSts, Utils.paramsToPair(getLoginLivesaasStsRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetLoginLivesaasStsResponse res = JSON.parseObject(response.getData(), GetLoginLivesaasStsResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GenerateActivityStreamSliceResponse generateActivityStreamSlice(GenerateActivityStreamSliceRequest generateActivityStreamSliceRequest) throws Exception {
        RawResponse response = json(Const.GenerateActivityStreamSlice, new ArrayList<>(), JSON.toJSONString(generateActivityStreamSliceRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GenerateActivityStreamSliceResponse res = JSON.parseObject(response.getData(), GenerateActivityStreamSliceResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public ListActivityUsersResponse listActivityUsers(ListActivityUsersRequest listActivityUsersRequest) throws Exception {
        RawResponse response = query(Const.ListActivityUsers, Utils.paramsToPair(listActivityUsersRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListActivityUsersResponse res = JSON.parseObject(response.getData(), ListActivityUsersResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    public GetVideoTrafficPayDataResponse getVideoTrafficPayData(GetVideoTrafficPayDataRequest getVideoTrafficPayDataRequest) throws Exception {
        RawResponse response = json(Const.GetVideoTrafficPayData, new ArrayList<>(), JSON.toJSONString(getVideoTrafficPayDataRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetVideoTrafficPayDataResponse res = JSON.parseObject(response.getData(), GetVideoTrafficPayDataResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    public GetMediaStoragePayDataResponse getMediaStoragePayData(GetMediaStoragePayDataRequest getMediaStoragePayDataRequest) throws Exception {
        RawResponse response = json(Const.GetMediaStoragePayData, new ArrayList<>(), JSON.toJSONString(getMediaStoragePayDataRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetMediaStoragePayDataResponse res = JSON.parseObject(response.getData(), GetMediaStoragePayDataResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public ListRobotNickNamesResponse listRobotNickNames(ListRobotNickNamesRequest listRobotNickNamesRequest) throws Exception {
        RawResponse response = query(Const.ListRobotNickNames, Utils.paramsToPair(listRobotNickNamesRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListRobotNickNamesResponse res = JSON.parseObject(response.getData(), ListRobotNickNamesResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public DeleteRobotCommentsResponse DeleteRobotComments(DeleteRobotCommentsRequest DeleteRobotCommentsRequest) throws Exception {
        RawResponse response = json(Const.DeleteRobotComments, new ArrayList<>(), JSON.toJSONString(DeleteRobotCommentsRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DeleteRobotCommentsResponse res = JSON.parseObject(response.getData(), DeleteRobotCommentsResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    public AddRobotCommentsResponse AddRobotComments(AddRobotCommentsRequest AddRobotCommentsRequest) throws Exception {
        RawResponse response = json(Const.AddRobotComments, new ArrayList<>(), JSON.toJSONString(AddRobotCommentsRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        AddRobotCommentsResponse res = JSON.parseObject(response.getData(), AddRobotCommentsResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public ListRobotCommentsResponse ListRobotComments(ListRobotCommentsRequest ListRobotCommentsRequest) throws Exception {
        RawResponse response = query(Const.ListRobotComments, Utils.paramsToPair(ListRobotCommentsRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ListRobotCommentsResponse res = JSON.parseObject(response.getData(), ListRobotCommentsResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public DeleteRobotNickNamesResponse DeleteRobotNickNames(DeleteRobotNickNamesRequest DeleteRobotNickNamesRequest) throws Exception {
        RawResponse response = json(Const.DeleteRobotNickNames, new ArrayList<>(), JSON.toJSONString(DeleteRobotNickNamesRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DeleteRobotNickNamesResponse res = JSON.parseObject(response.getData(), DeleteRobotNickNamesResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public AddRobotNickNamesResponse AddRobotNickNames(AddRobotNickNamesRequest AddRobotNickNamesRequest) throws Exception {
        RawResponse response = json(Const.AddRobotNickNames, new ArrayList<>(), JSON.toJSONString(AddRobotNickNamesRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        AddRobotNickNamesResponse res = JSON.parseObject(response.getData(), AddRobotNickNamesResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetActivityRobotCommentConfigResponse GetActivityRobotCommentConfig(GetActivityRobotCommentConfigRequest GetActivityRobotCommentConfigRequest) throws Exception {
        RawResponse response = query(Const.GetActivityRobotCommentConfig, Utils.paramsToPair(GetActivityRobotCommentConfigRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetActivityRobotCommentConfigResponse res = JSON.parseObject(response.getData(), GetActivityRobotCommentConfigResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public UpdateActivityRobotCommentConfigResponse UpdateActivityRobotCommentConfig(UpdateActivityRobotCommentConfigRequest UpdateActivityRobotCommentConfigRequest) throws Exception {
        RawResponse response = json(Const.UpdateActivityRobotCommentConfig, new ArrayList<>(), JSON.toJSONString(UpdateActivityRobotCommentConfigRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateActivityRobotCommentConfigResponse res = JSON.parseObject(response.getData(), UpdateActivityRobotCommentConfigResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetViewingRestrictionInfoResponse getViewingRestrictionInfo(GetViewingRestrictionInfoRequest getViewingRestrictionInfoRequest) throws Exception {
        RawResponse response = query(Const.GetViewingRestrictionInfo, Utils.paramsToPair(getViewingRestrictionInfoRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetViewingRestrictionInfoResponse res = JSON.parseObject(response.getData(), GetViewingRestrictionInfoResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public UpdateViewingRestrictionResponse updateViewingRestriction(UpdateViewingRestrictionRequest updateViewingRestrictionRequest) throws Exception {
        RawResponse response = json(Const.UpdateViewingRestriction, new ArrayList<>(),JSON.toJSONString(updateViewingRestrictionRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateViewingRestrictionResponse res = JSON.parseObject(response.getData(), UpdateViewingRestrictionResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public InsertWhiteListResponse insertWhiteList(InsertWhiteListRequest insertWhitelistRequest) throws Exception {
        RawResponse response = json(Const.InsertWhiteList, new ArrayList<>(),JSON.toJSONString(insertWhitelistRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        InsertWhiteListResponse res = JSON.parseObject(response.getData(), InsertWhiteListResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetWhiteListResponse getWhiteList(GetWhiteListRequest getWhitelistRequest) throws Exception {
        RawResponse response = query(Const.GetWhiteList, Utils.paramsToPair(getWhitelistRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetWhiteListResponse res = JSON.parseObject(response.getData(), GetWhiteListResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public DeleteWhiteListResponse deleteWhiteList(DeleteWhiteListRequest deleteWhitelistRequest) throws Exception {
        RawResponse response = json(Const.DeleteWhiteList, new ArrayList<>(),JSON.toJSONString(deleteWhitelistRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DeleteWhiteListResponse res = JSON.parseObject(response.getData(), DeleteWhiteListResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public InsertPhoneListResponse insertPhoneList(InsertPhoneListRequest insertPhonelistRequest) throws Exception {
        RawResponse response = json(Const.InsertPhoneList, new ArrayList<>(),JSON.toJSONString(insertPhonelistRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        InsertPhoneListResponse res = JSON.parseObject(response.getData(), InsertPhoneListResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public GetPhoneListResponse getPhoneList(GetPhoneListRequest getPhonelistRequest) throws Exception {
        RawResponse response = query(Const.GetPhoneList,  Utils.paramsToPair(getPhonelistRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetPhoneListResponse res = JSON.parseObject(response.getData(), GetPhoneListResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }

    @Override
    public DeletePhoneListResponse deletePhoneList(DeletePhoneListRequest deletePhonelistRequest) throws Exception {
        RawResponse response = json(Const.DeletePhoneList, new ArrayList<>(),JSON.toJSONString(deletePhonelistRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DeletePhoneListResponse res = JSON.parseObject(response.getData(), DeletePhoneListResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }
}
