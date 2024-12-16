package com.volcengine.service.livesaas;


import com.volcengine.model.livesaas.request.*;
import com.volcengine.model.livesaas.response.*;
import com.volcengine.model.request.ListActivityQuizConfigsRequest;
import com.volcengine.model.response.ListActivityQuizConfigsResponse;
import com.volcengine.service.IBaseService;
public interface LivesaasService extends IBaseService {

    /**
     * ListSiteTagAPIV2
     *
     * @param defaultRequest DefaultRequest
     * @return ListSiteTagAPIV2Response
     * @throws Exception the exception
     */
    ListSiteTagAPIV2Response listSiteTagAPIV2(DefaultRequest defaultRequest) throws Exception;

    /**
     * UpdateSiteTagAPIV2
     *
     * @param updateSiteTagAPIV2Request UpdateSiteTagAPIV2Request
     * @return CommonStatusResponse
     * @throws Exception the exception
     */
    CommonStatusResponse updateSiteTagAPIV2(UpdateSiteTagAPIV2Request updateSiteTagAPIV2Request) throws Exception;

    /**
     * GetPageWatchDataAPI
     *
     * @param getPageWatchDataAPIRequest GetPageWatchDataAPIRequest
     * @return GetPageWatchDataAPIResponse
     * @throws Exception the exception
     */
    GetPageWatchDataAPIResponse getPageWatchDataAPI(GetPageWatchDataAPIRequest getPageWatchDataAPIRequest) throws Exception;

    /**
     * ListUserBehaviorDataAPI
     *
     * @param getUserBehaviorListRequest GetUserBehaviorListRequest
     * @return GetUserBehaviorListResponse
     * @throws Exception the exception
     */
    GetUserBehaviorListResponse listUserBehaviorDataAPI(GetUserBehaviorListRequest getUserBehaviorListRequest) throws Exception;

    /**
     * CreateActivityAPIV2
     *
     * @param createActivityAPIRequest CreateActivityAPIRequest
     * @return CommonResponse
     * @throws Exception the exception
     */
    CommonResponse createActivityAPIV2(CreateActivityAPIRequest createActivityAPIRequest) throws Exception;

    /**
     * DeleteActivityAPI
     *
     * @param commonRequest CommonRequest
     * @return CommonResponse
     * @throws Exception the exception
     */
    CommonResponse deleteActivityAPI(CommonRequest commonRequest) throws Exception;

    /**
     * ListActivityAPI
     *
     * @param listActivityAPIRequest ListActivityAPIRequest
     * @return ListActivityAPIResponse
     * @throws Exception the exception
     */
    ListActivityAPIResponse listActivityAPI(ListActivityAPIRequest listActivityAPIRequest) throws Exception;

    /**
     * GetDownloadLiveClientAPI
     *
     * @param commonRequest CommonRequest
     * @return GetDownloadLiveClientAPIResponse
     * @throws Exception the exception
     */
    GetDownloadLiveClientAPIResponse getDownloadLiveClientAPI(CommonRequest commonRequest) throws Exception;

    /**
     * getDownloadLiveClient
     *
     * @param getDownloadLiveClientRequest GetDownloadLiveClientRequest
     * @return GetDownloadLiveClientResponse
     * @throws Exception the exception
     */
    GetDownloadLiveClientResponse getDownloadLiveClient(GetDownloadLiveClientRequest getDownloadLiveClientRequest) throws Exception;

    /**
     * GetWebPushLiveClientAPI
     *
     * @param commonRequest CommonRequest
     * @return GetWebPushLiveClientAPIResponse
     * @throws Exception the exception
     */
    GetWebPushLiveClientAPIResponse getWebPushLiveClientAPI(CommonRequest commonRequest) throws Exception;

    /**
     * ListActivityByCacheAPI
     *
     * @param listActivityAPIRequest ListActivityAPIRequest
     * @return ListActivityAPIResponse
     * @throws Exception the exception
     */
    ListActivityAPIResponse listActivityByCacheAPI(ListActivityAPIRequest listActivityAPIRequest) throws Exception;

    /**
     * UpdateActivityStatusAPI
     *
     * @param updateActivityStatusAPIRequest UpdateActivityStatusAPIRequest
     * @return DefaultResponse
     * @throws Exception the exception
     */
    DefaultResponse updateActivityStatusAPI(UpdateActivityStatusAPIRequest updateActivityStatusAPIRequest) throws Exception;

    /**
     * UpdatePullToPushAPI
     *
     * @param updatePullToPushAPIRequest UpdatePullToPushAPIRequest
     * @return DefaultResponse
     * @throws Exception the exception
     */
    DefaultResponse updatePullToPushAPI(UpdatePullToPushAPIRequest updatePullToPushAPIRequest) throws Exception;

    /**
     * GetActivityAPI
     *
     * @param commonRequest CommonRequest
     * @return GetActivityAPIResponse
     * @throws Exception the exception
     */
    GetActivityAPIResponse getActivityAPI(CommonRequest commonRequest) throws Exception;

    /**
     * GetStreamsAPI
     *
     * @param commonRequest CommonRequest
     * @return GetStreamsAPIResponse
     * @throws Exception the exception
     */
    GetStreamsAPIResponse getStreamsAPI(CommonRequest commonRequest) throws Exception;

    /**
     * UpdateActivityBasicConfigAPI
     *
     * @param updateBasicConfigAPIRequest UpdateBasicConfigAPIRequest
     * @return CommonResponse
     * @throws Exception the exception
     */
    CommonResponse updateActivityBasicConfigAPI(UpdateBasicConfigAPIRequest updateBasicConfigAPIRequest) throws Exception;

    /**
     * GetActivityBasicConfigAPI
     *
     * @param commonRequest CommonRequest
     * @return GetBasicConfigAPIResponse
     * @throws Exception the exception
     */
    GetBasicConfigAPIResponse getActivityBasicConfigAPI(CommonRequest commonRequest) throws Exception;

    /**
     * UpdateLoopVideoAPI
     *
     * @param updateLoopVideoRequest UpdateLoopVideoRequest
     * @return UpdateLoopVideoResponse
     * @throws Exception the exception
     */
    UpdateLoopVideoResponse updateLoopVideoAPI(UpdateLoopVideoRequest updateLoopVideoRequest) throws Exception;

    /**
     * UpdateLoopVideoStatusAPI
     *
     * @param updateLoopVideoStatusAPIRequest UpdateLoopVideoStatusAPIRequest
     * @return CommonStatusResponse
     * @throws Exception the exception
     */
    CommonStatusResponse updateLoopVideoStatusAPI(UpdateLoopVideoStatusAPIRequest updateLoopVideoStatusAPIRequest) throws Exception;

    /**
     * GetTemporaryLoginTokenAPI
     *
     * @param commonRequest CommonRequest
     * @return GetTemporaryLoginTokenResponse
     * @throws Exception the exception
     */
    GetTemporaryLoginTokenResponse getTemporaryLoginTokenAPI(CommonRequest commonRequest) throws Exception;

    /**
     * GetCustomActMsgAPI
     *
     * @param getCustomActMsgAPIRequest GetCustomActMsgAPIRequest
     * @return GetCustomActMsgAPIResponse
     * @throws Exception the exception
     */
    GetCustomActMsgAPIResponse getCustomActMsgAPI(GetCustomActMsgAPIRequest getCustomActMsgAPIRequest) throws Exception;

    /**
     * UploadReplayAPI
     *
     * @param uploadMediaRequest UploadMediaRequest
     * @return DefaultResponse
     * @throws Exception the exception
     */
    DefaultResponse uploadReplayAPI(UploadMediaRequest uploadMediaRequest) throws Exception;

    /**
     * ListMediasAPI
     *
     * @param listMediasAPIRequest ListMediasAPIRequest
     * @return ListMediasAPIResponse
     * @throws Exception the exception
     */
    ListMediasAPIResponse listMediasAPI(ListMediasAPIRequest listMediasAPIRequest) throws Exception;

    /**
     * UpdateMediaOnlineStatusAPI
     *
     * @param updateMediaOnlineStatusAPIRequest UpdateMediaOnlineStatusAPIRequest
     * @return DefaultResponse
     * @throws Exception the exception
     */
    DefaultResponse updateMediaOnlineStatusAPI(UpdateMediaOnlineStatusAPIRequest updateMediaOnlineStatusAPIRequest) throws Exception;

    /**
     * GetAdvertisementDataAPI
     *
     * @param getAdvertisementDataAPIRequest GetAdvertisementDataAPIRequest
     * @return GetAdvertisementDataAPIResponse
     * @throws Exception the exception
     */
    GetAdvertisementDataAPIResponse getAdvertisementDataAPI(GetAdvertisementDataAPIRequest getAdvertisementDataAPIRequest) throws Exception;

    /**
     * ListQuestionnaireAnswerDataAPI
     *
     * @param listUserQuestionnaireRequest ListUserQuestionnaireRequest
     * @return ListUserQuestionnaireResponse
     * @throws Exception the exception
     */
    ListUserQuestionnaireResponse listQuestionnaireAnswerDataAPI(ListUserQuestionnaireRequest listUserQuestionnaireRequest) throws Exception;

    /**
     * ListQuestionnaireDataAPI
     *
     * @param listStatisticsQuestionnaireRequest ListStatisticsQuestionnaireRequest
     * @return ListStatisticsQuestionnaireResponse
     * @throws Exception the exception
     */
    ListStatisticsQuestionnaireResponse listQuestionnaireDataAPI(ListStatisticsQuestionnaireRequest listStatisticsQuestionnaireRequest) throws Exception;

    /**
     * GetRealTimeOnlineNumberAPI
     *
     * @param commonRequest CommonRequest
     * @return GetRealTimeOnlineNumberAPIResponse
     * @throws Exception the exception
     */
    GetRealTimeOnlineNumberAPIResponse getRealTimeOnlineNumberAPI(CommonRequest commonRequest) throws Exception;

    /**
     * ListAnActivityStartAndEndTimeAPI
     *
     * @param commonRequest CommonRequest
     * @return ListAnActivityStartAndEndTimeAPIResponse
     * @throws Exception the exception
     */
    ListAnActivityStartAndEndTimeAPIResponse listAnActivityStartAndEndTimeAPI(CommonRequest commonRequest) throws Exception;

    /**
     * GetActivityReservationAPI
     *
     * @param getActivityReservationRequest GetActivityReservationRequest
     * @return GetActivityReservationResponse
     * @throws Exception the exception
     */
    GetActivityReservationResponse getActivityReservationAPI(GetActivityReservationRequest getActivityReservationRequest) throws Exception;

    /**
     * ListPosterInviteAPI
     *
     * @param listPosterInviteRequest ListPosterInviteRequest
     * @return ListPosterInviteResponse
     * @throws Exception the exception
     */
    ListPosterInviteResponse listPosterInviteAPI(ListPosterInviteRequest listPosterInviteRequest) throws Exception;

    /**
     * PresenterChatAPI
     *
     * @param presenterChatRequest PresenterChatRequest
     * @return CommonStatusResponse
     * @throws Exception the exception
     */
    CommonStatusResponse presenterChatAPI(PresenterChatRequest presenterChatRequest) throws Exception;

    /**
     * PresenterChatAPIV2
     *
     * @param presenterChatRequest PresenterChatRequest
     * @return CommonStatusResponse
     * @throws Exception the exception
     */
    CommonStatusResponse presenterChatAPIV2(PresenterChatRequest presenterChatRequest) throws Exception;

    /**
     * PollingChatAPI
     *
     * @param pollingChatAPIRequest PollingChatAPIRequest
     * @return PollingChatAPIResponse
     * @throws Exception the exception
     */
    PollingChatAPIResponse pollingChatAPI(PollingChatAPIRequest pollingChatAPIRequest) throws Exception;

    /**
     * GetHotChatAPI
     *
     * @param commonRequest CommonRequest
     * @return GetHotChatAPIResponse
     * @throws Exception the exception
     */
    GetHotChatAPIResponse getHotChatAPI(CommonRequest commonRequest) throws Exception;

    /**
     * GetTopChatAPI
     *
     * @param commonRequest CommonRequest
     * @return GetTopChatAPIResponse
     * @throws Exception the exception
     */
    GetTopChatAPIResponse getTopChatAPI(CommonRequest commonRequest) throws Exception;

    /**
     * GetHotChatAPI
     *
     * @param getHotChatAPIRequest GetHotChatAPIRequest
     * @return GetHotChatAPIResponse
     * @throws Exception the exception
     */
    GetHotChatAPIResponse getHotChatAPI(GetHotChatAPIRequest getHotChatAPIRequest) throws Exception;

    /**
     * GetTopChatAPI
     *
     * @param getTopChatAPIRequest GetTopChatAPIRequest
     * @return GetTopChatAPIResponse
     * @throws Exception the exception
     */
    GetTopChatAPIResponse getTopChatAPI(GetTopChatAPIRequest getTopChatAPIRequest) throws Exception;

    /**
     * DeleteChatAPI
     *
     * @param deleteChatAPIRequest DeleteChatAPIRequest
     * @return CommonStatusResponse
     * @throws Exception the exception
     */
    CommonStatusResponse deleteChatAPI(DeleteChatAPIRequest deleteChatAPIRequest) throws Exception;

    /**
     * LikeChatAPI
     *
     * @param likeChatAPIRequest LikeChatAPIRequest
     * @return LikeChatAPIResponse
     * @throws Exception the exception
     */
    LikeChatAPIResponse likeChatAPI(LikeChatAPIRequest likeChatAPIRequest) throws Exception;

    /**
     * TopChatAPI
     *
     * @param topChatAPIRequest TopChatAPIRequest
     * @return CommonStatusResponse
     * @throws Exception the exception
     */
    CommonStatusResponse topChatAPI(TopChatAPIRequest topChatAPIRequest) throws Exception;

    /**
     * EmptyChatAPI
     *
     * @param commonRequest CommonRequest
     * @return EmptyMessageResponse
     * @throws Exception the exception
     */
    EmptyMessageResponse emptyChatAPI(CommonRequest commonRequest) throws Exception;

    /**
     * UpdateChatReviewStatusAPI
     *
     * @param updateActivityChatReviewRequest UpdateActivityChatReviewRequest
     * @return CommonStatusResponse
     * @throws Exception the exception
     */
    CommonStatusResponse updateChatReviewStatusAPI(UpdateActivityChatReviewRequest updateActivityChatReviewRequest) throws Exception;

    /**
     * ConfirmReviewChatAPI
     *
     * @param confirmReviewChatAPIRequest ConfirmReviewChatAPIRequest
     * @return CommonStatusResponse
     * @throws Exception the exception
     */
    CommonStatusResponse confirmReviewChatAPI(ConfirmReviewChatAPIRequest confirmReviewChatAPIRequest) throws Exception;

    /**
     * SilenceUserAPI
     *
     * @param silenceUserAPIRequest SilenceUserAPIRequest
     * @return CommonStatusResponse
     * @throws Exception the exception
     */
    CommonStatusResponse silenceUserAPI(SilenceUserAPIRequest silenceUserAPIRequest) throws Exception;

    /**
     * GetSilenceUserListAPI
     *
     * @param commonRequest CommonRequest
     * @return GetSilenceUserListAPIResponse
     * @throws Exception the exception
     */
    GetSilenceUserListAPIResponse getSilenceUserListAPI(CommonRequest commonRequest) throws Exception;

    /**
     * GetActivityMenuAPI
     *
     * @param commonRequest CommonRequest
     * @return GetActivityMenuAPIResponse
     * @throws Exception the exception
     */
    GetActivityMenuAPIResponse getActivityMenuAPI(CommonRequest commonRequest) throws Exception;

    /**
     * UpdateActivityMenuAPI
     *
     * @param updateActivityMenuAPIRequest UpdateActivityMenuAPIRequest
     * @return CommonStatusResponse
     * @throws Exception the exception
     */
    CommonStatusResponse updateActivityMenuAPI(UpdateActivityMenuAPIRequest updateActivityMenuAPIRequest) throws Exception;

    /**
     * GetActivityProductAPI
     *
     * @param commonRequest CommonRequest
     * @return GetActivityProductAPIResponse
     * @throws Exception the exception
     */
    GetActivityProductAPIResponse getActivityProductAPI(CommonRequest commonRequest) throws Exception;

    /**
     * UpdateActivityProductAPI
     *
     * @param updateActivityProductV2Request UpdateActivityProductV2Request
     * @return CommonStatusResponse
     * @throws Exception the exception
     */
    CommonStatusResponse updateActivityProductAPI(UpdateActivityProductV2Request updateActivityProductV2Request) throws Exception;


    /**
     * DeleteGraphicMessageAPI
     *
     * @param deleteGraphicMessageAPIRequest DeleteGraphicMessageAPIRequest
     * @return CommonStatusResponse
     * @throws Exception the exception
     */
    CommonStatusResponse deleteGraphicMessageAPI(DeleteGraphicMessageAPIRequest deleteGraphicMessageAPIRequest) throws Exception;

    /**
     * UpdatePresenterNameAPI
     *
     * @param updatePresenterNameAPIRequest UpdatePresenterNameAPIRequest
     * @return CommonStatusResponse
     * @throws Exception the exception
     */
    CommonStatusResponse updatePresenterNameAPI(UpdatePresenterNameAPIRequest updatePresenterNameAPIRequest) throws Exception;

    /**
     * UpdateBulletScreensSwitchAPI
     *
     * @param updateBulletScreensSwitchAPIRequest UpdateBulletScreensSwitchAPIRequest
     * @return CommonStatusResponse
     * @throws Exception the exception
     */
    CommonStatusResponse updateBulletScreensSwitchAPI(UpdateBulletScreensSwitchAPIRequest updateBulletScreensSwitchAPIRequest) throws Exception;

    /**
     * EnableProductAPI
     *
     * @param enableProductRequest EnableProductRequest
     * @return CommonStatusResponse
     * @throws Exception the exception
     */
    CommonStatusResponse enableProductAPI(EnableProductRequest enableProductRequest) throws Exception;

    /**
     * ExplainProductAPI
     *
     * @param explainProductRequest ExplainProductRequest
     * @return CommonStatusResponse
     * @throws Exception the exception
     */
    CommonStatusResponse explainProductAPI(ExplainProductRequest explainProductRequest) throws Exception;

    /**
     * UpdateActivityEmbeddedUrlAPI
     *
     * @param updateActivityEmbeddedUrlAPIRequest UpdateActivityEmbeddedUrlAPIRequest
     * @return UpdateActivityEmbeddedUrlAPIResponse
     * @throws Exception the exception
     */
    UpdateActivityEmbeddedUrlAPIResponse updateActivityEmbeddedUrlAPI(UpdateActivityEmbeddedUrlAPIRequest updateActivityEmbeddedUrlAPIRequest) throws Exception;

    /**
     * GetActivityEmbeddedUrlAPI
     *
     * @param commonRequest CommonRequest
     * @return GetActivityEmbeddedUrlAPIResponse
     * @throws Exception the exception
     */
    GetActivityEmbeddedUrlAPIResponse getActivityEmbeddedUrlAPI(CommonRequest commonRequest) throws Exception;

    /**
     * UpdateCustomizationViewPermissionAPI
     *
     * @param updateCustomizationViewPermissionAPIRequest UpdateCustomizationViewPermissionAPIRequest
     * @return UpdateCustomizationViewPermissionAPIResponse
     * @throws Exception the exception
     */
    UpdateCustomizationViewPermissionAPIResponse updateCustomizationViewPermissionAPI(UpdateCustomizationViewPermissionAPIRequest updateCustomizationViewPermissionAPIRequest) throws Exception;

    /**
     * ListLivePromotionsAPI
     *
     * @param commonRequest CommonRequest
     * @return ListLivePromotionsAPIResponse
     * @throws Exception the exception
     */
    ListLivePromotionsAPIResponse listLivePromotionsAPI(CommonRequest commonRequest) throws Exception;

    /**
     * AddLivePromotionsAPI
     *
     * @param addLivePromotionsAPIRequest AddLivePromotionsAPIRequest
     * @return AddLivePromotionsAPIResponse
     * @throws Exception the exception
     */
    AddLivePromotionsAPIResponse addLivePromotionsAPI(AddLivePromotionsAPIRequest addLivePromotionsAPIRequest) throws Exception;

    /**
     * UpdateLivePromotionsStatusAPI
     *
     * @param updateLivePromotionsStatusAPIRequest UpdateLivePromotionsStatusAPIRequest
     * @return CommonResponse
     * @throws Exception the exception
     */
    CommonResponse updateLivePromotionsStatusAPI(UpdateLivePromotionsStatusAPIRequest updateLivePromotionsStatusAPIRequest) throws Exception;

    /**
     * DeleteLivePromotionsAPI
     *
     * @param deleteLivePromotionsAPIRequest DeleteLivePromotionsAPIRequest
     * @return CommonResponse
     * @throws Exception the exception
     */
    CommonResponse deleteLivePromotionsAPI(DeleteLivePromotionsAPIRequest deleteLivePromotionsAPIRequest) throws Exception;

    /**
     * ListHostAccountAPI
     *
     * @param listHostAccountAPIRequest ListHostAccountAPIRequest
     * @return ListHostAccountAPIResponse
     * @throws Exception the exception
     */
    ListHostAccountAPIResponse listHostAccountAPI(ListHostAccountAPIRequest listHostAccountAPIRequest) throws Exception;

    /**
     * GetBusinessAccountInfoAPI
     *
     * @param commonRequest CommonRequest
     * @return GetBusinessAccountInfoAPIResponse
     * @throws Exception the exception
     */
    GetBusinessAccountInfoAPIResponse getBusinessAccountInfoAPI(CommonRequest commonRequest) throws Exception;

    /**
     * UploadMediaByURL
     *
     * @param uploadMediaByURLRequest UploadMediaByURLRequest
     * @return UploadMediaByURLResponse
     * @throws Exception the exception
     */
    UploadMediaByURLResponse uploadMediaByURL(UploadMediaByURLRequest uploadMediaByURLRequest) throws Exception;

    /**
     * QueryUploadMediaByURL
     *
     * @param queryUploadMediaByURLRequest QueryUploadMediaByURLRequest
     * @return QueryUploadMediaByURLResponse
     * @throws Exception the exception
     */
    QueryUploadMediaByURLResponse queryUploadMediaByURL(QueryUploadMediaByURLRequest queryUploadMediaByURLRequest) throws Exception;

    /**
     * TempToMediaActivityMediaAPI
     *
     * @param temp2MediaAPIRequest Temp2MediaAPIRequest
     * @return Temp2MediaAPIResponse
     * @throws Exception the exception
     */
    Temp2MediaAPIResponse tempToMediaActivityMediaAPI(Temp2MediaAPIRequest temp2MediaAPIRequest) throws Exception;

    /**
     * ListActivityMediaAPI
     *
     * @param listActivityLibAPIRequest ListActivityLibAPIRequest
     * @return ListActivityLibAPIResponse
     * @throws Exception the exception
     */
    ListActivityLibAPIResponse listActivityMediaAPI(ListActivityLibAPIRequest listActivityLibAPIRequest) throws Exception;

    /**
     * ListUserSubmitEnterReviewAPI
     *
     * @param listUserSubmitEnterReviewRequest ListUserSubmitEnterReviewRequest
     * @return ListUserSubmitEnterReviewResponse
     * @throws Exception the exception
     */
    ListUserSubmitEnterReviewResponse listUserSubmitEnterReviewAPI(ListUserSubmitEnterReviewRequest listUserSubmitEnterReviewRequest) throws Exception;

    /**
     * ReviewUserEnterFormAPI
     *
     * @param reviewUserEnterFormRequest ReviewUserEnterFormRequest
     * @return CommonStatusResponse
     * @throws Exception the exception
     */
    CommonStatusResponse reviewUserEnterFormAPI(ReviewUserEnterFormRequest reviewUserEnterFormRequest) throws Exception;

    /**
     * GetActivityAntidirtAPI
     *
     * @param getActivityAntidirtRequest GetActivityAntidirtRequest
     * @return GetActivityAntidirtResponse
     * @throws Exception the exception
     */
    GetActivityAntidirtResponse getActivityAntidirtAPI(GetActivityAntidirtRequest getActivityAntidirtRequest) throws Exception;

    /**
     * AddActivityAntidirtAPI
     *
     * @param addActivityAntidirtRequest AddActivityAntidirtRequest
     * @return CommonStatusResponse
     * @throws Exception the exception
     */
    CommonStatusResponse addActivityAntidirtAPI(AddActivityAntidirtRequest addActivityAntidirtRequest) throws Exception;

    /**
     * DelActivityAntidirtAPI
     *
     * @param delActivityAntidirtRequest DelActivityAntidirtRequest
     * @return CommonStatusResponse
     * @throws Exception the exception
     */
    CommonStatusResponse delActivityAntidirtAPI(DelActivityAntidirtRequest delActivityAntidirtRequest) throws Exception;

    /**
     * SendCustomSystemMessageAPI
     *
     * @param sendCustomSystemMessageRequest SendCustomSystemMessageRequest
     * @return CommonStatusResponse
     * @throws Exception the exception
     */
    CommonStatusResponse sendCustomSystemMessageAPI(SendCustomSystemMessageRequest sendCustomSystemMessageRequest) throws Exception;

    /**
     * GetSDKTokenAPI
     *
     * @param getSDKTokenRequest GetSDKTokenRequest
     * @return GetSDKTokenResponse
     * @throws Exception the exception
     */
    GetSDKTokenResponse getSDKTokenAPI(GetSDKTokenRequest getSDKTokenRequest) throws Exception;

    /**
     * GetAllStreamPullInfoAPI
     *
     * @param commonRequest CommonRequest
     * @return GetAllStreamPullInfoAPIResponse
     * @throws Exception the exception
     */
    GetAllStreamPullInfoAPIResponse getAllStreamPullInfoAPI(CommonRequest commonRequest) throws Exception;

    /**
     * GetUserTaskAwardResultAPI
     *
     * @param getUserTaskAwardResultAPIRequest GetUserTaskAwardResultAPIRequest
     * @return GetUserTaskAwardResultAPIResponse
     * @throws Exception the exception
     */
    GetUserTaskAwardResultAPIResponse getUserTaskAwardResultAPI(GetUserTaskAwardResultAPIRequest getUserTaskAwardResultAPIRequest) throws Exception;

    /**
     * AnalysisUserBehaviorPeople
     *
     * @param analysisUserBehaviorPeopleRequest AnalysisUserBehaviorPeopleRequest
     * @return AnalysisUserBehaviorPeopleResponse
     * @throws Exception the exception
     */
    AnalysisUserBehaviorPeopleResponse analysisUserBehaviorPeople(AnalysisUserBehaviorPeopleRequest analysisUserBehaviorPeopleRequest) throws Exception;

    /**
     * GetAwardRecordStatisticsAPI
     *
     * @param getAwardRecordStatisticsAPIRequest GetAwardRecordStatisticsAPIRequest
     * @return GetAwardRecordStatisticsAPIResponse
     * @throws Exception the exception
     */
    GetAwardRecordStatisticsAPIResponse getAwardRecordStatisticsAPI(GetAwardRecordStatisticsAPIRequest getAwardRecordStatisticsAPIRequest) throws Exception;

    /**
     * ListQuizRecordAPI
     *
     * @param listQuizRecordAPIRequest ListQuizRecordAPIRequest
     * @return ListQuizRecordAPIResponse
     * @throws Exception the exception
     */
    ListQuizRecordAPIResponse listQuizRecordAPI(ListQuizRecordAPIRequest listQuizRecordAPIRequest) throws Exception;

    /**
     * ListQuizStatisticsAPI
     *
     * @param listQuizStatisticsAPIRequest ListQuizStatisticsAPIRequest
     * @return ListQuizStatisticsAPIResponse
     * @throws Exception the exception
     */
    ListQuizStatisticsAPIResponse listQuizStatisticsAPI(ListQuizStatisticsAPIRequest listQuizStatisticsAPIRequest) throws Exception;

    /**
     * GetQuizDataAPI
     *
     * @param getQuizDataAPIRequest GetQuizDataAPIRequest
     * @return GetQuizDataAPIResponse
     * @throws Exception the exception
     */
    GetQuizDataAPIResponse getQuizDataAPI(GetQuizDataAPIRequest getQuizDataAPIRequest) throws Exception;

    /**
     * UpdateActivityQuizConfig
     *
     * @param updateActivityQuizConfigRequest UpdateActivityQuizConfigRequest
     * @return UpdateActivityQuizConfigResponse
     * @throws Exception the exception
     */
    UpdateActivityQuizConfigResponse updateActivityQuizConfig(UpdateActivityQuizConfigRequest updateActivityQuizConfigRequest) throws Exception;

    /**
     * ListActivityQuizConfigs
     *
     * @param listActivityQuizConfigsRequest ListActivityQuizConfigsRequest
     * @return ListActivityQuizConfigsResponse
     * @throws Exception the exception
     */
    ListActivityQuizConfigsResponse listActivityQuizConfigs(ListActivityQuizConfigsRequest listActivityQuizConfigsRequest) throws Exception;

    /**
     * GetTaskAwardItemListAPI
     *
     * @param getTaskAwardItemListAPIRequest GetTaskAwardItemListAPIRequest
     * @return GetTaskAwardItemListAPIResponse
     * @throws Exception the exception
     */
    GetTaskAwardItemListAPIResponse getTaskAwardItemListAPI(GetTaskAwardItemListAPIRequest getTaskAwardItemListAPIRequest) throws Exception;

    /**
     * GetTaskAwardRecordStatisticsAPI
     *
     * @param getTaskAwardRecordStatisticsAPIRequest GetTaskAwardRecordStatisticsAPIRequest
     * @return GetTaskAwardRecordStatisticsAPIResponse
     * @throws Exception the exception
     */
    GetTaskAwardRecordStatisticsAPIResponse getTaskAwardRecordStatisticsAPI(GetTaskAwardRecordStatisticsAPIRequest getTaskAwardRecordStatisticsAPIRequest) throws Exception;

    /**
     * GetCheckInListAPI
     *
     * @param getCheckInListAPIRequest GetCheckInListAPIRequest
     * @return GetCheckInListAPIResponse
     * @throws Exception the exception
     */
    GetCheckInListAPIResponse getCheckInListAPI(GetCheckInListAPIRequest getCheckInListAPIRequest) throws Exception;

    /**
     * GetCheckInRecordStatisticsAPI
     *
     * @param getCheckInRecordStatisticsAPIRequest GetCheckInRecordStatisticsAPIRequest
     * @return GetCheckInRecordStatisticsAPIResponse
     * @throws Exception the exception
     */
    GetCheckInRecordStatisticsAPIResponse getCheckInRecordStatisticsAPI(GetCheckInRecordStatisticsAPIRequest getCheckInRecordStatisticsAPIRequest) throws Exception;

    /**
     * ListRedPacketDataAPI
     *
     * @param listRedPacketDataAPIRequest ListRedPacketDataAPIRequest
     * @return ListRedPacketDataAPIResponse
     * @throws Exception the exception
     */
    ListRedPacketDataAPIResponse listRedPacketDataAPI(ListRedPacketDataAPIRequest listRedPacketDataAPIRequest) throws Exception;

    /**
     * ListRedPacketRecordAPI
     *
     * @param listRedPacketRecordAPIRequest ListRedPacketRecordAPIRequest
     * @return ListRedPacketRecordAPIResponse
     * @throws Exception the exception
     */
    ListRedPacketRecordAPIResponse listRedPacketRecordAPI(ListRedPacketRecordAPIRequest listRedPacketRecordAPIRequest) throws Exception;

    /**
     * GetAwardConfigListAPI
     *
     * @param getAwardConfigListAPIRequest GetAwardConfigListAPIRequest
     * @return GetAwardConfigListAPIResponse
     * @throws Exception the exception
     */
    GetAwardConfigListAPIResponse getAwardConfigListAPI(GetAwardConfigListAPIRequest getAwardConfigListAPIRequest) throws Exception;

    /**
     * GetVoteListAPI
     *
     * @param getVoteListAPIRequest GetVoteListAPIRequest
     * @return GetVoteListAPIResponse
     * @throws Exception the exception
     */
    GetVoteListAPIResponse getVoteListAPI(GetVoteListAPIRequest getVoteListAPIRequest) throws Exception;

    /**
     * GetVoteStatisticsAPI
     *
     * @param getVoteStatisticsAPIRequest GetVoteStatisticsAPIRequest
     * @return GetVoteStatisticsAPIResponse
     * @throws Exception the exception
     */
    GetVoteStatisticsAPIResponse getVoteStatisticsAPI(GetVoteStatisticsAPIRequest getVoteStatisticsAPIRequest) throws Exception;

    /**
     * GetAccountTemplateAPI
     *
     * @param getAccountTemplateAPIRequest GetAccountTemplateAPIRequest
     * @return GetAccountTemplateAPIResponse
     * @throws Exception the exception
     */
    GetAccountTemplateAPIResponse getAccountTemplateAPI(GetAccountTemplateAPIRequest getAccountTemplateAPIRequest) throws Exception;

    /**
     * UpdateAccountTemplateStatusAPI
     *
     * @param updateAccountTemplateStatusAPIRequest UpdateAccountTemplateStatusAPIRequest
     * @return UpdateAccountTemplateStatusAPIResponse
     * @throws Exception the exception
     */
    UpdateAccountTemplateStatusAPIResponse updateAccountTemplateStatusAPI(UpdateAccountTemplateStatusAPIRequest updateAccountTemplateStatusAPIRequest) throws Exception;

    /**
     * UpdateDefaultTemplateStatusAPI
     *
     * @param updateDefaultTemplateStatusAPIRequest UpdateDefaultTemplateStatusAPIRequest
     * @return UpdateDefaultTemplateStatusAPIResponse
     * @throws Exception the exception
     */
    UpdateDefaultTemplateStatusAPIResponse updateDefaultTemplateStatusAPI(UpdateDefaultTemplateStatusAPIRequest updateDefaultTemplateStatusAPIRequest) throws Exception;

    /**
     * GetPageWatchDataAPIV2
     *
     * @param getPageWatchDataAPIV2Request GetPageWatchDataAPIV2Request
     * @return GetPageWatchDataAPIV2Response
     * @throws Exception the exception
     */
    GetPageWatchDataAPIV2Response getPageWatchDataAPIV2(GetPageWatchDataAPIV2Request getPageWatchDataAPIV2Request) throws Exception;

    /**
     * GetActivityReservationAPIV2
     *
     * @param getActivityReservationAPIV2Request GetActivityReservationAPIV2Request
     * @return GetActivityReservationAPIV2Response
     * @throws Exception the exception
     */
    GetActivityReservationAPIV2Response getActivityReservationAPIV2(GetActivityReservationAPIV2Request getActivityReservationAPIV2Request) throws Exception;

    /**
     * ListStatisticsQuestionnaireAPIV2
     *
     * @param listStatisticsQuestionnaireAPIV2Request ListStatisticsQuestionnaireAPIV2Request
     * @return ListStatisticsQuestionnaireAPIV2Response
     * @throws Exception the exception
     */
    ListStatisticsQuestionnaireAPIV2Response ListQuestionnaireDataAPIV2(ListStatisticsQuestionnaireAPIV2Request listStatisticsQuestionnaireAPIV2Request) throws Exception;

    /**
     * ListUserQuestionnaireAPIV2
     *
     * @param listUserQuestionnaireAPIV2Request ListUserQuestionnaireAPIV2Request
     * @return ListUserQuestionnaireAPIV2Response
     * @throws Exception the exception
     */
    ListUserQuestionnaireAPIV2Response ListQuestionnaireAnswerDataAPIV2(ListUserQuestionnaireAPIV2Request listUserQuestionnaireAPIV2Request) throws Exception;

    /**
     * AnalysisUserBehaviorPeopleV2
     *
     * @param analysisUserBehaviorPeopleV2Request AnalysisUserBehaviorPeopleV2Request
     * @return AnalysisUserBehaviorPeopleV2Response
     * @throws Exception the exception
     */
    AnalysisUserBehaviorPeopleV2Response analysisUserBehaviorPeopleV2(AnalysisUserBehaviorPeopleV2Request analysisUserBehaviorPeopleV2Request) throws Exception;

    /**
     * GetAdvertisementDataAPIV2
     *
     * @param getAdvertisementDataAPIV2Request GetAdvertisementDataAPIV2Request
     * @return GetAdvertisementDataAPIV2Response
     * @throws Exception the exception
     */
    GetAdvertisementDataAPIV2Response getAdvertisementDataAPIV2(GetAdvertisementDataAPIV2Request getAdvertisementDataAPIV2Request) throws Exception;

    /**
     * GetUserBehaviorListAPIV2
     *
     * @param getUserBehaviorListAPIV2Request GetUserBehaviorListRequestAPIV2
     * @return GetUserBehaviorListAPIV2Response
     * @throws Exception the exception
     */
    GetUserBehaviorListResponseAPIV2 ListUserBehaviorDataAPIV2(GetUserBehaviorListRequestAPIV2 getUserBehaviorListAPIV2Request) throws Exception;

    /**
     * ListChannelAPI
     *
     * @param listChannelAPIRequest ListChannelAPIRequest
     * @return ListChannelAPIResponse
     * @throws Exception the exception
     */
    ListChannelAPIResponse listChannelAPI(ListChannelAPIRequest listChannelAPIRequest) throws Exception;

    /**
     * GetCustomViewingRestrictionInfoAPI
     *
     * @param getCustomViewingRestrictionInfoAPIRequest GetCustomViewingRestrictionInfoAPIRequest
     * @return GetCustomViewingRestrictionInfoAPIResponse
     * @throws Exception the exception
     */
    GetCustomViewingRestrictionInfoAPIResponse getCustomViewingRestrictionInfoAPI(GetCustomViewingRestrictionInfoAPIRequest getCustomViewingRestrictionInfoAPIRequest) throws Exception;

    /**
     * UpdateActivityViewPermissionAPI
     *
     * @param updateActivityViewPermissionAPIRequest UpdateActivityViewPermissionAPIRequest
     * @return UpdateActivityViewPermissionAPIResponse
     * @throws Exception the exception
     */
    UpdateActivityViewPermissionAPIResponse updateActivityViewPermissionAPI(UpdateActivityViewPermissionAPIRequest updateActivityViewPermissionAPIRequest) throws Exception;

    /**
     * DeleteMediaLibraryVideoAPI
     *
     * @param deleteMediaLibraryVideoAPIRequest DeleteMediaLibraryVideoAPIRequest
     * @return DeleteMediaLibraryVideoAPIResponse
     * @throws Exception the exception
     */
    DeleteMediaLibraryVideoAPIResponse deleteMediaLibraryVideoAPI(DeleteMediaLibraryVideoAPIRequest deleteMediaLibraryVideoAPIRequest) throws Exception;

    /**
     * MediasMerge
     *
     * @param mediasMergeRequest MediasMergeRequest
     * @return MediasMergeResponse
     * @throws Exception the exception
     */
    MediasMergeResponse mediasMerge(MediasMergeRequest mediasMergeRequest) throws Exception;

    /**
     * GetPopularitySettings
     *
     * @param getPopularitySettingsRequest GetPopularitySettingsRequest
     * @return GetPopularitySettingsResponse
     * @throws Exception the exception
     */
    GetPopularitySettingsResponse getPopularitySettings(GetPopularitySettingsRequest getPopularitySettingsRequest) throws Exception;

    /**
     * UpdatePopularitySettings
     *
     * @param updatePopularitySettingsRequest UpdatePopularitySettingsRequest
     * @return UpdatePopularitySettingsResponse
     * @throws Exception the exception
     */
    UpdatePopularitySettingsResponse updatePopularitySettings(UpdatePopularitySettingsRequest updatePopularitySettingsRequest) throws Exception;

    /**
     * GetActivityMenus
     *
     * @param getActivityMenusRequest GetActivityMenusRequest
     * @return GetActivityMenusResponse
     * @throws Exception the exception
     */
    GetActivityMenusResponse getActivityMenus(GetActivityMenusRequest getActivityMenusRequest) throws Exception;

    /**
     * ModifyActivityMenus
     *
     * @param modifyActivityMenusRequest ModifyActivityMenusRequest
     * @return ModifyActivityMenusResponse
     * @throws Exception the exception
     */
    ModifyActivityMenusResponse modifyActivityMenus(ModifyActivityMenusRequest modifyActivityMenusRequest) throws Exception;

    /**
     * GetActivityEmbeddedUrls
     *
     * @param getActivityEmbeddedUrlsRequest GetActivityEmbeddedUrlsRequest
     * @return GetActivityEmbeddedUrlsResponse
     * @throws Exception the exception
     */
    GetActivityEmbeddedUrlsResponse getActivityEmbeddedUrls(GetActivityEmbeddedUrlsRequest getActivityEmbeddedUrlsRequest) throws Exception;

    /**
     * getActivityProducts
     *
     * @param listProductCardsRequest ListProductCardsRequest
     * @return ListProductCardsResponse
     * @throws Exception the exception
     */
    ListProductCardsResponse getActivityProducts(ListProductCardsRequest listProductCardsRequest) throws Exception;

    /**
     * updateActivityProduct
     *
     * @param updateProductCardRequest UpdateProductCardRequest
     * @return UpdateProductCardResponse
     * @throws Exception the exception
     */
    UpdateProductCardResponse updateActivityProduct(UpdateProductCardRequest updateProductCardRequest) throws Exception;

    /**
     * DeleteActivityProduct
     *
     * @param deleteActivityProductRequest DeleteActivityProductRequest
     * @return DeleteActivityProductResponse
     * @throws Exception the exception
     */
    DeleteActivityProductResponse deleteActivityProduct(DeleteActivityProductRequest deleteActivityProductRequest) throws Exception;

    /**
     * updateActivityEmbeddedUrl
     *
     * @param updateActivityEmbeddedUrlConfigRequest UpdateActivityEmbeddedUrlConfigRequest
     * @return UpdateActivityEmbeddedUrlConfigResponse
     * @throws Exception the exception
     */
    UpdateActivityEmbeddedUrlConfigResponse updateActivityEmbeddedUrl(UpdateActivityEmbeddedUrlConfigRequest updateActivityEmbeddedUrlConfigRequest) throws Exception;

    /**
     * deleteActivityEmbeddedUrl
     *
     * @param deleteActivityEmbeddedUrlConfigRequest DeleteActivityEmbeddedUrlConfigRequest
     * @return DeleteActivityEmbeddedUrlConfigResponse
     * @throws Exception the exception
     */
    DeleteActivityEmbeddedUrlConfigResponse deleteActivityEmbeddedUrl(DeleteActivityEmbeddedUrlConfigRequest deleteActivityEmbeddedUrlConfigRequest) throws Exception;

    /**
     * updateActivityBand
     *
     * @param updateGraphicIntroductionRequest UpdateGraphicIntroductionRequest
     * @return UpdateGraphicIntroductionResponse
     * @throws Exception the exception
     */
    UpdateGraphicIntroductionResponse updateActivityBand(UpdateGraphicIntroductionRequest updateGraphicIntroductionRequest) throws Exception;

    /**
     * deleteActivityBand
     *
     * @param deleteGraphicIntroductionRequest DeleteGraphicIntroductionRequest
     * @return DeleteGraphicIntroductionResponse
     * @throws Exception the exception
     */
    DeleteGraphicIntroductionResponse deleteActivityBand(DeleteGraphicIntroductionRequest deleteGraphicIntroductionRequest) throws Exception;

    /**
     * getActivityBands
     *
     * @param getGraphicIntroductionsRequest GetGraphicIntroductionsRequest
     * @return GetGraphicIntroductionsResponse
     * @throws Exception the exception
     */
    GetGraphicIntroductionsResponse getActivityBands(GetGraphicIntroductionsRequest getGraphicIntroductionsRequest) throws Exception;

     /**
     * GetAccountAggregatedStatistics
     *
     * @param getAccountAggregatedStatisticsRequest GetAccountAggregatedStatisticsRequest
     * @return GetAccountAggregatedStatisticsResponse
     * @throws Exception the exception
     */
    GetAccountAggregatedStatisticsResponse getAccountAggregatedStatistics(GetAccountAggregatedStatisticsRequest getAccountAggregatedStatisticsRequest) throws Exception;

    /**
     * ListAccountActivityData
     *
     * @param listAccountActivityDataRequest ListAccountActivityDataRequest
     * @return ListAccountActivityDataResponse
     * @throws Exception the exception
     */
    ListAccountActivityDataResponse listAccountActivityData(ListAccountActivityDataRequest listAccountActivityDataRequest) throws Exception;

    /**
     * ListAccountUserData
     *
     * @param listAccountUserDataRequest ListAccountUserDataRequest
     * @return ListAccountUserDataResponse
     * @throws Exception the exception
     */
    ListAccountUserDataResponse listAccountUserData(ListAccountUserDataRequest listAccountUserDataRequest) throws Exception;

    /**
     * GetAccountUserTrackData
     *
     * @param getAccountUserTrackDataRequest GetAccountUserTrackDataRequest
     * @return GetAccountUserTrackDataResponse
     * @throws Exception the exception
     */
    GetAccountUserTrackDataResponse getAccountUserTrackData(GetAccountUserTrackDataRequest getAccountUserTrackDataRequest) throws Exception;

     /**
     * getVQUserDataAPI
     *
     * @param getVQUserDataAPIRequest GetVQUserDataAPIRequest
     * @return GetVQUserDataAPIResponse
     * @throws Exception the exception
     */
    GetVQUserDataAPIResponse getVQUserDataAPI(GetVQUserDataAPIRequest getVQUserDataAPIRequest) throws Exception;

     /**
     * getVQUserDataAPI
     *
     * @param createHostAcceleratePackOrderRequest CreateHostAcceleratePackOrderRequest
     * @return CreateHostAcceleratePackOrderResponse
     * @throws Exception the exception
     */
    CreateHostAcceleratePackOrderResponse createHostAcceleratePackOrder(CreateHostAcceleratePackOrderRequest createHostAcceleratePackOrderRequest) throws Exception;

     /**
     * updateHostAcceleratePackOrder
     *
     * @param updateHostAcceleratePackOrderRequest UpdateHostAcceleratePackOrderRequest
     * @return UpdateHostAcceleratePackOrderResponse
     * @throws Exception the exception
     */
    UpdateHostAcceleratePackOrderResponse updateHostAcceleratePackOrder(UpdateHostAcceleratePackOrderRequest updateHostAcceleratePackOrderRequest) throws Exception;

     /**
     * deleteHostAcceleratePackOrder
     *
     * @param deleteHostAcceleratePackOrderRequest DeleteHostAcceleratePackOrderRequest
     * @return DeleteHostAcceleratePackOrderResponse
     * @throws Exception the exception
     */
    DeleteHostAcceleratePackOrderResponse deleteHostAcceleratePackOrder(DeleteHostAcceleratePackOrderRequest deleteHostAcceleratePackOrderRequest) throws Exception;

     /**
     * unsubscribeHostAcceleratePackOrder
     *
     * @param unsubscribeHostAcceleratePackOrderRequest UnsubscribeHostAcceleratePackOrderRequest
     * @return UnsubscribeHostAcceleratePackOrderResponse
     * @throws Exception the exception
     */
    UnsubscribeHostAcceleratePackOrderResponse unsubscribeHostAcceleratePackOrder(UnsubscribeHostAcceleratePackOrderRequest unsubscribeHostAcceleratePackOrderRequest) throws Exception;

    /**
     * modifyHostAcceleratePackOrder
     *
     * @param modifyHostAcceleratePackOrderRequest ModifyHostAcceleratePackOrderRequest
     * @return ModifyHostAcceleratePackOrderResponse
     * @throws Exception the exception
     */
    ModifyHostAcceleratePackOrderResponse modifyHostAcceleratePackOrder(ModifyHostAcceleratePackOrderRequest modifyHostAcceleratePackOrderRequest) throws Exception;

    /**
     * listHostAcceleratePackOrder
     *
     * @param listHostAcceleratePackOrderRequest ListHostAcceleratePackOrderRequest
     * @return ListHostAcceleratePackOrderResponse
     * @throws Exception the exception
     */
    ListHostAcceleratePackOrderResponse listHostAcceleratePackOrder(ListHostAcceleratePackOrderRequest listHostAcceleratePackOrderRequest) throws Exception;

    /**
     * getAttentionDetectionConfig
     *
     * @param getAttentionDetectionConfigRequest GetAttentionDetectionConfigRequest
     * @return GetAttentionDetectionConfigResponse
     * @throws Exception the exception
     */
    GetAttentionDetectionConfigResponse getAttentionDetectionConfig(GetAttentionDetectionConfigRequest getAttentionDetectionConfigRequest) throws Exception;


    /**
     * updateAttentionDetectionConfig
     *
     * @param updateAttentionDetectionConfigRequest UpdateAttentionDetectionConfigRequest
     * @return GetAttentionDetectionConfigResponse
     * @throws Exception the exception
     */
    UpdateAttentionDetectionConfigResponse updateAttentionDetectionConfig(UpdateAttentionDetectionConfigRequest updateAttentionDetectionConfigRequest) throws Exception;
    /**
     * CheckUidMatch
     *
     * @param checkUidMatchRequest CheckUidMatchRequest
     * @return CheckUidMatchResponse
     * @throws Exception the exception
     */
    CheckUidMatchResponse checkUidMatch(CheckUidMatchRequest checkUidMatchRequest) throws Exception;

    GetTeachAssistantConfigResponse getTeachAssistantConfig(GetTeachAssistantConfigRequest getTeachAssistantConfigRequest) throws Exception;

    UpdateTeachAssistantConfigResponse updateTeachAssistantConfig(UpdateTeachAssistantConfigRequest updateTeachAssistantConfigRequest) throws Exception;

    ListTeachAssistantAccountsResponse listTeachAssistantAccounts(ListTeachAssistantAccountsRequest listTeachAssistantAccountsRequest) throws Exception;

    UpdateTeachAssistantAccountResponse updateTeachAssistantAccount(UpdateTeachAssistantAccountRequest updateTeachAssistantAccountRequest) throws Exception;

    DeleteTeachAssistantAccountResponse deleteTeachAssistantAccount(DeleteTeachAssistantAccountRequest deleteTeachAssistantAccountRequest) throws Exception;

    /**
     * GetAdvertisementDataDetailAPI
     *
     * @param getAdvertisementDataDetailAPIRequest
     * @return
     * @throws Exception
     */
    GetAdvertisementDataDetailAPIResponse getAdvertisementDataDetailAPI(GetAdvertisementDataDetailAPIRequest getAdvertisementDataDetailAPIRequest) throws Exception;

    /**
     * getActivityCommentConfig
     *
     * @param commonRequest CommonRequest
     * @return GetActivityCommentConfigResponse
     * @throws Exception the exception
     */
    GetActivityCommentConfigResponse getActivityCommentConfig(CommonRequest commonRequest) throws Exception;

    /**
     * updateActivityCommentConfig
     *
     * @param updateActivityCommentConfigRequest UpdateActivityCommentConfigRequest
     * @return UpdateActivityCommentConfigResponse
     * @throws Exception the exception
     */
    UpdateActivityCommentConfigResponse updateActivityCommentConfig(UpdateActivityCommentConfigRequest updateActivityCommentConfigRequest) throws Exception;

    /**
     * listActivityCustomEmojiSets
     *
     * @param commonRequest CommonRequest
     * @return ListActivityCustomEmojiSetsResponse
     * @throws Exception the exception
     */
    ListActivityCustomEmojiSetsResponse listActivityCustomEmojiSets(CommonRequest commonRequest) throws Exception;

    /**
     * getActivityCustomEmojiSetDetail
     *
     * @param getActivityCustomEmojiSetDetailRequest GetActivityCustomEmojiSetDetailRequest
     * @return GetActivityCustomEmojiSetDetailResponse
     * @throws Exception the exception
     */
    GetActivityCustomEmojiSetDetailResponse getActivityCustomEmojiSetDetail(GetActivityCustomEmojiSetDetailRequest getActivityCustomEmojiSetDetailRequest) throws Exception;

    /**
     * modifyActivityCustomEmojiSets
     *
     * @param modifyActivityCustomEmojiSetsRequest ModifyActivityCustomEmojiSetsRequest
     * @return ModifyActivityCustomEmojiSetsResponse
     * @throws Exception the exception
     */
    ModifyActivityCustomEmojiSetsResponse modifyActivityCustomEmojiSets(ModifyActivityCustomEmojiSetsRequest modifyActivityCustomEmojiSetsRequest) throws Exception;

    /**
     * deleteActivityCustomEmojiSet
     *
     * @param deleteActivityCustomEmojiSetRequest DeleteActivityCustomEmojiSetRequest
     * @return DeleteActivityCustomEmojiSetResponse
     * @throws Exception the exception
     */
    DeleteActivityCustomEmojiSetResponse deleteActivityCustomEmojiSet(DeleteActivityCustomEmojiSetRequest deleteActivityCustomEmojiSetRequest) throws Exception;

    /**
     * createOrUpdateActivityCustomEmojiSet
     *
     * @param createOrUpdateActivityCustomEmojiSetRequest CreateOrUpdateActivityCustomEmojiSetRequest
     * @return CreateOrUpdateActivityCustomEmojiSetResponse
     * @throws Exception the exception
     */
    CreateOrUpdateActivityCustomEmojiSetResponse createOrUpdateActivityCustomEmojiSet(CreateOrUpdateActivityCustomEmojiSetRequest createOrUpdateActivityCustomEmojiSetRequest) throws Exception;

    /**
     * updateActivityCustomEmojiSetStatus
     *
     * @param updateActivityCustomEmojiSetStatusRequest UpdateActivityCustomEmojiSetStatusRequest
     * @return UpdateActivityCustomEmojiSetStatusResponse
     * @throws Exception the exception
     */
    UpdateActivityCustomEmojiSetStatusResponse updateActivityCustomEmojiSetStatus(UpdateActivityCustomEmojiSetStatusRequest updateActivityCustomEmojiSetStatusRequest) throws Exception;

    /**
     * GetSecurityControlConfig
     *
     * @param getSecurityControlConfigRequest
     * @return
     * @throws Exception
     */
    GetSecurityControlConfigResponse getSecurityControlConfig(GetSecurityControlConfigRequest getSecurityControlConfigRequest) throws Exception;

    /**
     * UpdateSecurityControlConfig
     *
     * @param updateSecurityControlConfigRequest
     * @return
     * @throws Exception
     */
    UpdateSecurityControlConfigResponse updateSecurityControlConfig(UpdateSecurityControlConfigRequest updateSecurityControlConfigRequest) throws Exception;

    /**
     * GetActivityLinks
     *
     * @param getActivityLinksRequest
     * @return
     * @throws Exception
     */
    GetActivityLinksResponse getActivityLinks(GetActivityLinksRequest getActivityLinksRequest) throws Exception;


    /**
     * GetLiveTrafficPostPayData
     *
     * @param getLiveTrafficPostPayDataRequest
     * @return
     * @throws Exception
     */
    GetLiveTrafficPostPayDataResponse getLiveTrafficPostPayData(GetLiveTrafficPostPayDataRequest getLiveTrafficPostPayDataRequest) throws Exception;

    /**
     * GetSecurityControlConfig
     *
     * @param listAwardConfigsRequest
     * @return
     * @throws Exception
     */
    ListAwardConfigsResponse listAwardConfigs(ListAwardConfigsRequest listAwardConfigsRequest) throws Exception;

    /**
     * GetSecurityControlConfig
     *
     * @param listAwardRecordStatisticsRequest
     * @return
     * @throws Exception
     */
    ListAwardRecordStatisticsResponse listAwardRecordStatistics(ListAwardRecordStatisticsRequest listAwardRecordStatisticsRequest) throws Exception;

    /**
     * GetActivityLivePromotionData
     *
     * @param getActivityLivePromotionDataRequest GetActivityLivePromotionDataRequest
     * @return GetActivityLivePromotionDataResponse
     * @throws Exception the exception
     */
    GetActivityLivePromotionDataResponse getActivityLivePromotionData(GetActivityLivePromotionDataRequest getActivityLivePromotionDataRequest) throws Exception;

    /**
     * GetActivityLivePromotionDetail
     *
     * @param getActivityLivePromotionDetailRequest GetActivityLivePromotionDetailRequest
     * @return GetActivityLivePromotionDetailResponse
     * @throws Exception the exception
     */
    GetActivityLivePromotionDetailResponse getActivityLivePromotionDetail(GetActivityLivePromotionDetailRequest getActivityLivePromotionDetailRequest) throws Exception;

    /**
     * ListAccountActivityHistoryData
     *
     * @param listAccountActivityHistoryDataRequest ListAccountActivityHistoryDataRequest
     * @return ListAccountActivityHistoryDataResponse
     * @throws Exception the exception
     */
    ListAccountActivityHistoryDataResponse listAccountActivityHistoryData(ListAccountActivityHistoryDataRequest listAccountActivityHistoryDataRequest) throws Exception;

    /**
     * UpdateVodPlayerConfig
     *
     * @param updateVodPlayerConfigRequest UpdateVodPlayerConfigRequest
     * @return UpdateVodPlayerConfigResponse
     * @throws Exception the exception
     */
    UpdateVodPlayerConfigResponse updateVodPlayerConfig(UpdateVodPlayerConfigRequest updateVodPlayerConfigRequest) throws Exception;

    /**
     * DeleteVodPlayerConfig
     *
     * @param deleteVodPlayerConfigRequest DeleteVodPlayerConfigRequest
     * @return DeleteVodPlayerConfigResponse
     * @throws Exception the exception
     */
    DeleteVodPlayerConfigResponse deleteVodPlayerConfig(DeleteVodPlayerConfigRequest deleteVodPlayerConfigRequest) throws Exception;

    /**
     * GetVodPlayerConfig
     *
     * @param getVodPlayerConfigRequest GetVodPlayerConfigRequest
     * @return GetVodPlayerConfigResponse
     * @throws Exception the exception
     */
    GetVodPlayerConfigResponse getVodPlayerConfig(GetVodPlayerConfigRequest getVodPlayerConfigRequest) throws Exception;

    /**
     * ListVodPlayerConfig
     *
     * @param listVodPlayerConfigRequest ListVodPlayerConfigRequest
     * @return ListVodPlayerConfigResponse
     * @throws Exception the exception
     */
    ListVodPlayerConfigResponse listVodPlayerConfig(ListVodPlayerConfigRequest listVodPlayerConfigRequest) throws Exception;

    /**
     * UpdateDefaultVodPlayerConfig
     *
     * @param updateDefaultVodPlayerConfigRequest UpdateDefaultVodPlayerConfigRequest
     * @return UpdateDefaultVodPlayerConfigResponse
     * @throws Exception the exception
     */
    UpdateDefaultVodPlayerConfigResponse updateDefaultVodPlayerConfig(UpdateDefaultVodPlayerConfigRequest updateDefaultVodPlayerConfigRequest) throws Exception;

    /**
     * GetVodPlayerToken
     *
     * @param getVodPlayerTokenRequest GetVodPlayerTokenRequest
     * @return GetVodPlayerTokenResponse
     * @throws Exception the exception
     */
    GetVodPlayerTokenResponse getVodPlayerToken(GetVodPlayerTokenRequest getVodPlayerTokenRequest) throws Exception;

    /**
     * GetVideoLibraryFolderTree
     *
     * @param getVideoLibraryFolderTreeRequest GetVideoLibraryFolderTreeRequest
     * @return GetVideoLibraryFolderTreeResponse
     * @throws Exception the exception
     */
    GetVideoLibraryFolderTreeResponse getVideoLibraryFolderTree(GetVideoLibraryFolderTreeRequest getVideoLibraryFolderTreeRequest) throws Exception;

    /**
     * SearchVideoLibraryFolderTree
     *
     * @param searchVideoLibraryFolderTreeRequest SearchVideoLibraryFolderTreeRequest
     * @return SearchVideoLibraryFolderTreeResponse
     * @throws Exception the exception
     */
    SearchVideoLibraryFolderTreeResponse searchVideoLibraryFolderTree(SearchVideoLibraryFolderTreeRequest searchVideoLibraryFolderTreeRequest) throws Exception;
    /**
     * ListLoopVideos
     *
     * @param listLoopVideosRequest ListLoopVideosRequest
     * @return ListLoopVideosResponse
     * @throws Exception the exception
     */
    ListLoopVideosResponse listLoopVideos(ListLoopVideosRequest listLoopVideosRequest) throws Exception;

    /**
     * UpdateLoopVideoStatus
     *
     * @param updateLoopVideoStatusRequest UpdateLoopVideoStatusRequest
     * @return UpdateLoopVideoStatusResponse
     * @throws Exception the exception
     */
    UpdateLoopVideoStatusResponse updateLoopVideoStatus(UpdateLoopVideoStatusRequest updateLoopVideoStatusRequest) throws Exception;

    /**
     * UpdateLoopVideos
     *
     * @param updateLoopVideosRequest UpdateLoopVideosRequest
     * @return UpdateLoopVideosResponse
     * @throws Exception the exception
     */
    UpdateLoopVideosResponse updateLoopVideos(UpdateLoopVideosRequest updateLoopVideosRequest) throws Exception;

    /**
     * ListPrograms
     *
     * @param listProgramsRequest ListProgramsRequest
     * @return ListProgramsResponse
     * @throws Exception the exception
     */
    ListProgramsResponse listPrograms(ListProgramsRequest listProgramsRequest) throws Exception;

    /**
     * UpdateProgram
     *
     * @param updateProgramRequest UpdateProgramRequest
     * @return UpdateProgramResponse
     * @throws Exception the exception
     */
    UpdateProgramResponse updateProgram(UpdateProgramRequest updateProgramRequest) throws Exception;

    /**
     * DeleteProgram
     *
     * @param deleteProgramRequest DeleteProgramRequest
     * @return DeleteProgramResponse
     * @throws Exception the exception
     */
    DeleteProgramResponse deleteProgram(DeleteProgramRequest deleteProgramRequest) throws Exception;

    /**
     * MediaCut
     *
     * @param mediaCutRequest MediaCutRequest
     * @return MediaCutResponse
     * @throws Exception the exception
     */
    MediaCutResponse mediaCut(MediaCutRequest mediaCutRequest) throws Exception;

    /**
     * DeleteHostAccount
     *
     * @param deleteHostAccountRequest DeleteHostAccountRequest
     * @return DeleteHostAccountResponse
     * @throws Exception the exception
     */
    DeleteHostAccountResponse deleteHostAccount(DeleteHostAccountRequest deleteHostAccountRequest) throws Exception;

    /**
     * UpdateHostAccount
     *
     * @param updateHostAccountRequest UpdateHostAccountRequest
     * @return UpdateHostAccountResponse
     * @throws Exception the exception
     */
    UpdateHostAccountResponse updateHostAccount(UpdateHostAccountRequest updateHostAccountRequest) throws Exception;

    /**
     * UpdateActivityHostAccount
     *
     * @param updateActivityHostAccountRequest UpdateActivityHostAccountRequest
     * @return UpdateActivityHostAccountResponse
     * @throws Exception the exception
     */
    UpdateActivityHostAccountResponse updateActivityHostAccount(UpdateActivityHostAccountRequest updateActivityHostAccountRequest) throws Exception;

    /**
     * UpdateFloatingAdvertisement
     *
     * @param updateFloatingAdvertisementRequest UpdateFloatingAdvertisementRequest
     * @return UpdateFloatingAdvertisementResponse
     * @throws Exception the exception
     */
    UpdateFloatingAdvertisementResponse updateFloatingAdvertisement(UpdateFloatingAdvertisementRequest updateFloatingAdvertisementRequest) throws Exception;

    /**
     * ListHostAccounts
     *
     * @param listHostAccountsRequest ListHostAccountsRequest
     * @return ListHostAccountsResponse
     * @throws Exception the exception
     */
    ListHostAccountsResponse listHostAccounts(ListHostAccountsRequest listHostAccountsRequest) throws Exception;

    /**
     * getBusinessAccountInfo
     *
     * @param getBusinessAccountInfoRequest GetBusinessAccountInfoRequest
     * @return GetBusinessAccountInfoResponse
     * @throws Exception the exception
     */
    GetBusinessAccountInfoResponse getBusinessAccountInfo(GetBusinessAccountInfoRequest getBusinessAccountInfoRequest) throws Exception;

    /**
     * getAudienceGroupConfig
     *
     * @param getAudienceGroupConfigRequest GetAudienceGroupConfigRequest
     * @return GetAudienceGroupConfigResponse
     * @throws Exception the exception
     */
    GetAudienceGroupConfigResponse getAudienceGroupConfig(GetAudienceGroupConfigRequest getAudienceGroupConfigRequest) throws Exception;

    /**
     * updateAudienceGroupConfig
     *
     * @param updateAudienceGroupConfigRequest UpdateAudienceGroupConfigRequest
     * @return UpdateAudienceGroupConfigResponse
     * @throws Exception the exception
     */
    UpdateAudienceGroupConfigResponse updateAudienceGroupConfig(UpdateAudienceGroupConfigRequest updateAudienceGroupConfigRequest) throws Exception;

    /**
     * listAudienceGroupUser
     *
     * @param listAudienceGroupUserRequest ListAudienceGroupUserRequest
     * @return ListAudienceGroupUserResponse
     * @throws Exception the exception
     */
    ListAudienceGroupUserResponse listAudienceGroupUser(ListAudienceGroupUserRequest listAudienceGroupUserRequest) throws Exception;

    /**
     * addAudienceGroup
     *
     * @param addAudienceGroupRequest AddAudienceGroupRequest
     * @return AddAudienceGroupResponse
     * @throws Exception the exception
     */
    AddAudienceGroupResponse addAudienceGroup(AddAudienceGroupRequest addAudienceGroupRequest) throws Exception;

    /**
     * updateAudienceGroupUserConfig
     *
     * @param updateAudienceGroupUserConfig UpdateAudienceGroupUserConfigRequest
     * @return UpdateAudienceGroupUserConfigResponse
     * @throws Exception the exception
     */
    UpdateAudienceGroupUserConfigResponse updateAudienceGroupUserConfig(UpdateAudienceGroupUserConfigRequest updateAudienceGroupUserConfig) throws Exception;

    /**
     * deleteAudienceGroup
     *
     * @param deleteAudienceGroupRequest DeleteAudienceGroupRequest
     * @return DeleteAudienceGroupResponse
     * @throws Exception the exception
     */
    DeleteAudienceGroupResponse deleteAudienceGroup(DeleteAudienceGroupRequest deleteAudienceGroupRequest) throws Exception;

    /**
     * modifyAudienceGroup
     *
     * @param modifyAudienceGroupRequest ModifyAudienceGroupRequest
     * @return ModifyAudienceGroupResponse
     * @throws Exception the exception
     */
    ModifyAudienceGroupResponse modifyAudienceGroup(ModifyAudienceGroupRequest modifyAudienceGroupRequest) throws Exception;


    /**
     * addActivityPartnerRebroadcast
     *
     * @param addActivityPartnerRebroadcastRequest addActivityPartnerRebroadcast
     * @return AddActivityPartnerRebroadcastResponse
     * @throws Exception the exception
     */
    AddActivityPartnerRebroadcastResponse addActivityPartnerRebroadcast(AddActivityPartnerRebroadcastRequest addActivityPartnerRebroadcastRequest) throws Exception;

    /**
     * deleteActivityPartnerRebroadcast
     *
     * @param deleteActivityPartnerRebroadcastRequest DeleteActivityPartnerRebroadcastRequest
     * @return DeleteActivityPartnerRebroadcastResponse
     * @throws Exception the exception
     */
    DeleteActivityPartnerRebroadcastResponse deleteActivityPartnerRebroadcast(DeleteActivityPartnerRebroadcastRequest deleteActivityPartnerRebroadcastRequest) throws Exception;

    /**
     * getActivityPartnerRebroadcast
     *
     * @param getActivityPartnerRebroadcastRequest GetActivityPartnerRebroadcastRequest
     * @return GetActivityPartnerRebroadcastResponse
     * @throws Exception the exception
     */
    GetActivityPartnerRebroadcastResponse getActivityPartnerRebroadcast(GetActivityPartnerRebroadcastRequest getActivityPartnerRebroadcastRequest) throws Exception;

    /**
     * updateLiveChannelConfig
     *
     * @param updateLiveChannelConfigRequest UpdateLiveChannelConfigRequest
     * @return UpdateLiveChannelConfigResponse
     * @throws Exception the exception
     */
    UpdateLiveChannelConfigResponse updateLiveChannelConfig(UpdateLiveChannelConfigRequest updateLiveChannelConfigRequest) throws Exception;

    /**
     * createLiveChannelConfig
     *
     * @param createLiveChannelConfigRequest CreateLiveChannelConfigRequest
     * @return CreateLiveChannelConfigResponse
     * @throws Exception the exception
     */
    CreateLiveChannelConfigResponse createLiveChannelConfig(CreateLiveChannelConfigRequest createLiveChannelConfigRequest) throws Exception;

    /**
     * deleteLiveChannelConfig
     *
     * @param deleteLiveChannelConfigRequest DeleteLiveChannelConfigRequest
     * @return DefaultResponse
     * @throws Exception the exception
     */
    DefaultResponse deleteLiveChannelConfig(DeleteLiveChannelConfigRequest deleteLiveChannelConfigRequest) throws Exception;

    /**
     * listLiveChannelConfig
     *
     * @param listLiveChannelConfigRequest CommonRequest
     * @return ListLiveChannelConfigResponse
     * @throws Exception the exception
     */
    ListLiveChannelConfigResponse listLiveChannelConfig(CommonRequest listLiveChannelConfigRequest) throws Exception;

    /**
     * getLoginLivesaasSts
     *
     * @param getLoginLivesaasStsRequest GetLoginLivesaasStsRequest
     * @return GetLoginLivesaasStsResponse
     * @throws Exception the exception
     */
    GetLoginLivesaasStsResponse getLoginLivesaasSts(GetLoginLivesaasStsRequest getLoginLivesaasStsRequest) throws Exception;

    /**
     * generateActivityStreamSlice
     *
     * @param generateActivityStreamSliceResponse GenerateActivityStreamSliceRequest
     * @return GenerateActivityStreamSliceResponse
     * @throws Exception the exception
     */
    GenerateActivityStreamSliceResponse generateActivityStreamSlice(GenerateActivityStreamSliceRequest generateActivityStreamSliceResponse) throws Exception;

    /**
     * ListActivityUsers
     *
     * @param listActivityUsersRequest ListActivityUsersRequest
     * @return ListActivityUsersResponse
     * @throws Exception the exception
     */
    ListActivityUsersResponse listActivityUsers(ListActivityUsersRequest listActivityUsersRequest) throws Exception;

    /**
     * getVideoTrafficPayData
     *
     * @param getVideoTrafficPayDataRequest GetVideoTrafficPayDataRequest
     * @return GetVideoTrafficPayDataResponse
     * @throws Exception the exception
     */
    GetVideoTrafficPayDataResponse getVideoTrafficPayData(GetVideoTrafficPayDataRequest getVideoTrafficPayDataRequest) throws Exception;

    /**
     * getMediaStoragePayData
     *
     * @param getMediaStoragePayDataRequest GetMediaStoragePayDataRequest
     * @return GetMediaStoragePayDataResponse
     * @throws Exception the exception
     */
    GetMediaStoragePayDataResponse getMediaStoragePayData(GetMediaStoragePayDataRequest getMediaStoragePayDataRequest) throws Exception;

    /**
     * ListRobotNickNamesNames
     *
     * @param listRobotNickNamesRequest ListRobotNickNamesRequest
     * @return ListRobotNickNamesResponse
     * @throws Exception the exception
     */
    ListRobotNickNamesResponse listRobotNickNames(ListRobotNickNamesRequest listRobotNickNamesRequest) throws Exception;

    /**
     * DeleteRobotComments
     *
     * @param deleteRobotCommentsRequest DeleteRobotCommentsRequest
     * @return DeleteRobotCommentsResponse
     * @throws Exception the exception
     */
    DeleteRobotCommentsResponse DeleteRobotComments(DeleteRobotCommentsRequest deleteRobotCommentsRequest) throws Exception;

    /**
     * AddRobotComments
     *
     * @param addRobotCommentsRequest AddRobotCommentsRequest
     * @return AddRobotCommentsResponse
     * @throws Exception the exception
     */
    AddRobotCommentsResponse AddRobotComments(AddRobotCommentsRequest addRobotCommentsRequest) throws Exception;

    /**
     * ListRobotComments
     *
     * @param listRobotCommentsRequest ListRobotCommentsRequest
     * @return ListRobotCommentsResponse
     * @throws Exception the exception
     */
    ListRobotCommentsResponse ListRobotComments(ListRobotCommentsRequest listRobotCommentsRequest) throws Exception;

    /**
     * DeleteRobotNickNames
     *
     * @param deleteRobotNickNamesRequest DeleteRobotNickNamesRequest
     * @return DeleteRobotNickNamesResponse
     * @throws Exception the exception
     */
    DeleteRobotNickNamesResponse DeleteRobotNickNames(DeleteRobotNickNamesRequest deleteRobotNickNamesRequest) throws Exception;

    /**
     * AddRobotNickNames
     *
     * @param addRobotNickNamesRequest AddRobotNickNamesRequest
     * @return AddRobotNickNamesResponse
     * @throws Exception the exception
     */
    AddRobotNickNamesResponse AddRobotNickNames(AddRobotNickNamesRequest addRobotNickNamesRequest) throws Exception;

    /**
     * GetActivityRobotCommentConfig
     *
     * @param getActivityRobotCommentConfigRequest GetActivityRobotCommentConfigRequest
     * @return GetActivityRobotCommentConfigResponse
     * @throws Exception the exception
     */
    GetActivityRobotCommentConfigResponse GetActivityRobotCommentConfig(GetActivityRobotCommentConfigRequest getActivityRobotCommentConfigRequest) throws Exception;

    /**
     * UpdateActivityRobotCommentConfig
     *
     * @param updateActivityRobotCommentConfigRequest UpdateActivityRobotCommentConfigRequest
     * @return UpdateActivityRobotCommentConfigResponse
     * @throws Exception the exception
     */
    UpdateActivityRobotCommentConfigResponse UpdateActivityRobotCommentConfig(UpdateActivityRobotCommentConfigRequest updateActivityRobotCommentConfigRequest) throws Exception;

    /**
     * UpdateAccountBanStatus
     *
     * @param updateAccountBanStatusRequest UpdateAccountBanStatusRequest
     * @return UpdateAccountBanStatusResponse
     * @throws Exception the exception
     */
    UpdateAccountBanStatusResponse UpdateAccountBanStatus(UpdateAccountBanStatusRequest updateAccountBanStatusRequest) throws Exception;
    GetViewingRestrictionInfoResponse getViewingRestrictionInfo(GetViewingRestrictionInfoRequest getViewingRestrictionInfoRequest) throws Exception;
    UpdateViewingRestrictionResponse updateViewingRestriction(UpdateViewingRestrictionRequest updateViewingRestrictionRequest) throws Exception;

    InsertWhiteListResponse insertWhiteList(InsertWhiteListRequest insertWhitelistRequest) throws Exception;
    GetWhiteListResponse getWhiteList(GetWhiteListRequest getWhitelistRequest) throws Exception;
    DeleteWhiteListResponse deleteWhiteList(DeleteWhiteListRequest deleteWhitelistRequest) throws Exception;

    InsertPhoneListResponse insertPhoneList(InsertPhoneListRequest insertPhonelistRequest) throws Exception;
    GetPhoneListResponse getPhoneList(GetPhoneListRequest getPhonelistRequest) throws Exception;
    DeletePhoneListResponse deletePhoneList(DeletePhoneListRequest deletePhonelistRequest) throws Exception;

    /**
     * createLLMTask
     *
     * @param createLLMTaskRequest CreateLLMTaskRequest
     * @return CreateLLMTaskResponse
     * @throws Exception the exception
     */
    CreateLLMTaskResponse createLLMTask(CreateLLMTaskRequest createLLMTaskRequest) throws Exception;

    /**
     * getLLMReport
     *
     * @param getLLMReportRequest GetLLMReportRequest
     * @return GetLLMReportResponse
     * @throws Exception the exception
     */
    GetLLMReportResponse getLLMReport(GetLLMReportRequest getLLMReportRequest) throws Exception;

    /**
     * getLLMReport
     *
     * @param listLLMTasksRequest ListLLMTasksRequest
     * @return GetLLMReportResponse
     * @throws Exception the exception
     */
    ListLLMTasksResponse listLLMTasks(ListLLMTasksRequest listLLMTasksRequest) throws Exception;

    /**
     * getLarkSubAccountInfo
     *
     * @param getLarkSubAccountInfoRequest GetLarkSubAccountInfoRequest
     * @return GetLarkSubAccountInfoResponse
     * @throws Exception the exception
     */
    GetLarkSubAccountInfoResponse getLarkSubAccountInfo(GetLarkSubAccountInfoRequest getLarkSubAccountInfoRequest) throws Exception;

    UpdateAnswerRepetitionResponse updateAnswerRepetition(UpdateAnswerRepetitionRequest updateAnswerRepetitionRequest) throws Exception;

    /**
     * getAwardItemList
     *
     * @param getAwardItemListRequest GetAwardItemListRequest
     * @return GetAwardItemListResponse
     * @throws Exception the exception
     */
    GetAwardItemListResponse getAwardItemList(GetAwardItemListRequest getAwardItemListRequest) throws Exception;

    /**
     * updateAwardItem
     *
     * @param updateAwardItemRequest UpdateAwardItemRequest
     * @return UpdateAwardItemResponse
     * @throws Exception the exception
     */
    UpdateAwardItemResponse updateAwardItem(UpdateAwardItemRequest updateAwardItemRequest) throws Exception;

    /**
     * deleteAwardItem
     *
     * @param deleteAwardItemRequest DeleteAwardItemRequest
     * @return DeleteAwardItemResponse
     * @throws Exception the exception
     */
    DeleteAwardItemResponse deleteAwardItem(DeleteAwardItemRequest deleteAwardItemRequest) throws Exception;

    /**
     * createCoupons
     *
     * @param createCouponsRequest CreateCouponsRequest
     * @return CreateCouponsResponse
     * @throws Exception the exception
     */
    CreateCouponsResponse createCoupons(CreateCouponsRequest createCouponsRequest) throws Exception;

    /**
     * updateCoupon
     *
     * @param updateCouponRequest UpdateCouponRequest
     * @return UpdateCouponResponse
     * @throws Exception the exception
     */
    UpdateCouponResponse updateCoupon(UpdateCouponRequest updateCouponRequest) throws Exception;

    /**
     * deleteCoupons
     *
     * @param deleteCouponsRequest DeleteCouponsRequest
     * @return DeleteCouponsResponse
     * @throws Exception the exception
     */
    DeleteCouponsResponse deleteCoupons(DeleteCouponsRequest deleteCouponsRequest) throws Exception;

    /**
     * listCoupons
     *
     * @param listCouponsRequest ListCouponsRequest
     * @return ListCouponsResponse
     * @throws Exception the exception
     */
    ListCouponsResponse listCoupons(ListCouponsRequest listCouponsRequest) throws Exception;

    /**
     * getCoupon
     *
     * @param getCouponRequest GetCouponRequest
     * @return GetCouponResponse
     * @throws Exception the exception
     */
    GetCouponResponse getCoupon(GetCouponRequest getCouponRequest) throws Exception;

    /**
     * createActivityCoupons
     *
     * @param createActivityCouponsRequest CreateActivityCouponsRequest
     * @return CreateActivityCouponsResponse
     * @throws Exception the exception
     */
    CreateActivityCouponsResponse createActivityCoupons(CreateActivityCouponsRequest createActivityCouponsRequest) throws Exception;

    /**
     * updateActivityCoupon
     *
     * @param updateActivityCouponRequest UpdateActivityCouponRequest
     * @return UpdateActivityCouponResponse
     * @throws Exception the exception
     */
    UpdateActivityCouponResponse updateActivityCoupon(UpdateActivityCouponRequest updateActivityCouponRequest) throws Exception;

    /**
     * deleteActivityCoupons
     *
     * @param deleteActivityCouponsRequest DeleteActivityCouponsRequest
     * @return DeleteActivityCouponsResponse
     * @throws Exception the exception
     */
    DeleteActivityCouponsResponse deleteActivityCoupons(DeleteActivityCouponsRequest deleteActivityCouponsRequest) throws Exception;

    /**
     * listActivityCoupons
     *
     * @param listActivityCouponsRequest ListActivityCouponsRequest
     * @return ListActivityCouponsResponse
     * @throws Exception the exception
     */
    ListActivityCouponsResponse listActivityCoupons(ListActivityCouponsRequest listActivityCouponsRequest) throws Exception;

    /**
     * sendActivityCoupon
     *
     * @param sendActivityCouponRequest SendActivityCouponRequest
     * @return SendActivityCouponResponse
     * @throws Exception the exception
     */
    SendActivityCouponResponse sendActivityCoupon(SendActivityCouponRequest sendActivityCouponRequest) throws Exception;

    /**
     * stopActivityCoupon
     *
     * @param stopActivityCouponRequest StopActivityCouponRequest
     * @return StopActivityCouponResponse
     * @throws Exception the exception
     */
    StopActivityCouponResponse stopActivityCoupon(StopActivityCouponRequest stopActivityCouponRequest) throws Exception;

    /**
     * getActivityCouponPickData
     *
     * @param getActivityCouponPickDataRequest GetActivityCouponPickDataRequest
     * @return GetActivityCouponPickDataResponse
     * @throws Exception the exception
     */
    GetActivityCouponPickDataResponse getActivityCouponPickData(GetActivityCouponPickDataRequest getActivityCouponPickDataRequest) throws Exception;

    /**
     * getActivityAllCouponsPickData
     *
     * @param getActivityAllCouponsPickDataRequest GetActivityAllCouponsPickDataRequest
     * @return GetActivityAllCouponsPickDataResponse
     * @throws Exception the exception
     */
    GetActivityAllCouponsPickDataResponse getActivityAllCouponsPickData(GetActivityAllCouponsPickDataRequest getActivityAllCouponsPickDataRequest) throws Exception;

    /**
     * createSubAccount
     *
     * @param createSubAccountRequest CreateSubAccountRequest
     * @return CreateSubAccountResponse
     * @throws Exception the exception
     */
    CreateSubAccountResponse createSubAccount(CreateSubAccountRequest createSubAccountRequest) throws Exception;

    /**
     * updateSubAccount
     *
     * @param updateSubAccountRequest UpdateSubAccountRequest
     * @return UpdateSubAccountResponse
     * @throws Exception the exception
     */
    UpdateSubAccountResponse updateSubAccount(UpdateSubAccountRequest updateSubAccountRequest) throws Exception;

    /**
     * deleteSubAccount
     *
     * @param deleteSubAccountRequest DeleteSubAccountRequest
     * @return DeleteSubAccountResponse
     * @throws Exception the exception
     */
    DeleteSubAccountResponse deleteSubAccount(DeleteSubAccountRequest deleteSubAccountRequest) throws Exception;

    /**
     * listSubAccounts
     *
     * @param listSubAccountsRequest ListSubAccountsRequest
     * @return ListSubAccountsResponse
     * @throws Exception the exception
     */
    ListSubAccountsResponse listSubAccounts(ListSubAccountsRequest listSubAccountsRequest) throws Exception;

    /**
     * getSubAccount
     *
     * @param getSubAccountRequest GetSubAccountRequest
     * @return GetSubAccountResponse
     * @throws Exception the exception
     */
    GetSubAccountResponse getSubAccount(GetSubAccountRequest getSubAccountRequest) throws Exception;

    /**
     * listSubAccountRoles
     *
     * @param listSubAccountRolesRequest ListSubAccountRolesRequest
     * @return ListSubAccountRolesResponse
     * @throws Exception the exception
     */
    ListSubAccountRolesResponse listSubAccountRoles(ListSubAccountRolesRequest listSubAccountRolesRequest) throws Exception;

    /**
     * listSubAccountOrganizations
     *
     * @param listSubAccountOrganizationsRequest ListSubAccountOrganizationsRequest
     * @return ListSubAccountOrganizationsResponse
     * @throws Exception the exception
     */
    ListSubAccountOrganizationsResponse listSubAccountOrganizations(ListSubAccountOrganizationsRequest listSubAccountOrganizationsRequest) throws Exception;

    /**
     * exportActivityData
     *
     * @param exportActivityDataRequest ExportActivityDataRequest
     * @return ExportActivityDataResponse
     * @throws Exception the exception
     */
    ExportActivityDataResponse exportActivityData(ExportActivityDataRequest exportActivityDataRequest) throws Exception;

    /**
     * getActivityExportFile
     *
     * @param getActivityExportFileRequest GetActivityExportFileRequest
     * @return GetActivityExportFileResponse
     * @throws Exception the exception
     */
    GetActivityExportFileResponse getActivityExportFile(GetActivityExportFileRequest getActivityExportFileRequest) throws Exception;

    /**
     * listWaitLinkAudience
     *
     * @param listWaitLinkAudienceRequest ListWaitLinkAudienceRequest
     * @return ListWaitLinkAudienceResponse
     * @throws Exception the exception
     */
    ListWaitLinkAudienceResponse listWaitLinkAudience(ListWaitLinkAudienceRequest listWaitLinkAudienceRequest) throws Exception;

    /**
     * getLinkUserAmount
     *
     * @param getLinkUserAmountRequest GetLinkUserAmountRequest
     * @return GetLinkUserAmountResponse
     * @throws Exception the exception
     */
    GetLinkUserAmountResponse getLinkUserAmount(GetLinkUserAmountRequest getLinkUserAmountRequest) throws Exception;
}
