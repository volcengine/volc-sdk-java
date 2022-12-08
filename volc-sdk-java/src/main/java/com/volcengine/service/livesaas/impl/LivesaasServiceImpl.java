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
            throw response.getException();
        }
        AnalysisUserBehaviorPeopleResponse res = JSON.parseObject(response.getData(), AnalysisUserBehaviorPeopleResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("livesaas");
        return res;
    }
}
