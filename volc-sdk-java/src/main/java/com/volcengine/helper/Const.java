package com.volcengine.helper;

public class Const {

    public static final String ACCESS_KEY = "VOLC_ACCESSKEY";
    public static final String SECRET_KEY = "VOLC_SECRETKEY";

    public static final String REGION_CN_NORTH_1 = "cn-north-1";
    public static final String REGION_AP_SINGAPORE_1 = "ap-singapore-1";
    public static final String REGION_US_EASE_1 = "us-east-1";

    public static final String REGION_AP_SOUTHEAST_1 = "ap-southeast-1";

    public static final String TIME_FORMAT_V4 = "yyyyMMdd'T'HHmmss'Z'";

    public static final String CONNECTION_TIMEOUT = "ConnectionTimeout";
    public static final String SOCKET_TIMEOUT = "SocketTimeout";
    public static final String Scheme = "Scheme";
    public static final String Host = "Host";
    public static final String Header = "Header";
    public static final String Credentials = "Credentials";

    public static final String Method = "Method";
    public static final String Path = "Path";
    public static final String Query = "Query";
    public static final String Form = "Form";
    public static final String AES = "AES";

    // iam
    public static final String CreateUser = "CreateUser";
    public static final String DeleteUser = "DeleteUser";
    public static final String ListUsers = "ListUsers";
    public static final String UpdateUser = "UpdateUser";
    public static final String GetUser = "GetUser";
    public static String CreateLoginProfile = "CreateLoginProfile";
    public static String GetLoginProfile = "GetLoginProfile";
    public static String UpdateLoginProfile = "UpdateLoginProfile";
    public static String DeleteLoginProfile = "DeleteLoginProfile";
    public static final String CreateRole = "CreateRole";
    public static final String GetRole = "GetRole";
    public static final String UpdateRole = "UpdateRole";
    public static final String ListRoles = "ListRoles";
    public static final String DeleteRole = "DeleteRole";
    public static final String CreateServiceLinkedRole = "CreateServiceLinkedRole";
    public static final String CreateAccessKey = "CreateAccessKey";
    public static final String DeleteAccessKey = "DeleteAccessKey";
    public static final String ListAccessKeys = "ListAccessKeys";
    public static final String UpdateAccessKey = "UpdateAccessKey";
    public static final String CreatePolicy = "CreatePolicy";
    public static final String GetPolicy = "GetPolicy";
    public static final String UpdatePolicy = "UpdatePolicy";
    public static final String ListPolicies = "ListPolicies";
    public static final String DeletePolicy = "DeletePolicy";
    public static final String AttachUserPolicy = "AttachUserPolicy";
    public static final String DetachUserPolicy = "DetachUserPolicy";
    public static final String ListAttachedUserPolicies = "ListAttachedUserPolicies";
    public static final String AttachRolePolicy = "AttachRolePolicy";
    public static final String DetachRolePolicy = "DetachRolePolicy";
    public static final String ListAttachedRolePolicies = "ListAttachedRolePolicies";
    public static final String ListEntitiesForPolicy = "ListEntitiesForPolicy";
    public static String CreateSAMLProvider = "CreateSAMLProvider";
    public static String DeleteSAMLProvider = "DeleteSAMLProvider";
    public static String GetSAMLProvider = "GetSAMLProvider";
    public static String UpdateSAMLProvider = "UpdateSAMLProvider";
    public static String ListSAMLProviders = "ListSAMLProviders";
    public static final String ImageStyleConversion = "ImageStyleConversion";
    public static final String CertSrcFaceComp = "CertSrcFaceComp";
    public static final String FaceCompare = "FaceCompare";
    public static final String StillLivenessImg = "StillLivenessImg";
    public static final String CertH5Token = "CertH5Token";
    public static final String CertH5ConfigInit = "CertH5ConfigInit";
    public static final String HighAesSmartDrawing = "HighAesSmartDrawing";
    public static final String Img2ImgInpainting = "Img2ImgInpainting";
    public static final String Img2ImgInpaintingEdit = "Img2ImgInpaintingEdit";
    public static final String Img2ImgOutpainting = "Img2ImgOutpainting";
    public static final String Img2ImgAnimeAcceleratedMaintainID = "Img2ImgAnimeAcceleratedMaintainID";
    public static final String EntitySegment = "EntitySegment";
    public static final String Img2ImgAnimeAcceleratedMaintainIDForSmartDrawingAnime = "Img2ImgAnimeAcceleratedMaintainIDForSmartDrawingAnime";
    public static final String Text2ImgXLSft = "Text2ImgXLSft";
    public static final String Img2ImgXLSft = "Img2ImgXLSft";
    public static final String SaliencySeg = "SaliencySeg";
    public static final String CVGetResult = "CVGetResult";
    public static final String CVSubmitTask = "CVSubmitTask";
    public static final String CVSync2AsyncGetResult = "CVSync2AsyncGetResult";
    public static final String CVSync2AsyncSubmitTask = "CVSync2AsyncSubmitTask";
    public static final String CVProcess = "CVProcess";

    public static final String CertLivenessVerifyQuery = "CertLivenessVerifyQuery";

    // billing
    public static final String ListBill = "ListBill";
    public static final String ListBillDetail = "ListBillDetail";
    public static final String ListBillOverviewByProd = "ListBillOverviewByProd";

    public static final String ListAmortizedCostBillDetail = "ListAmortizedCostBillDetail";

    public static final String ListAmortizedCostBillMonthly = "ListAmortizedCostBillMonthly";


    // sts
    public static final String AssumeRole = "AssumeRole";

    // ad blocker
    public static final String AdBlock = "AdBlock";
    // game protect
    public static final String GameProtect = "GameProtect";
    // business security
    public static final String RiskDetection = "RiskDetection";
    public static final String AsyncRiskDetection = "AsyncRiskDetection";
    public static  final  String CreateApp = "CreateApp";
    public static final String ListApps = "ListApps";
    public static final String RiskResult = "RiskResult";
    public static final String DataReport = "DataReport";
    public static final String AccountRisk = "AccountRisk";
    public static final String MobileStatus = "MobileStatus";
    public static final String ElementVerify = "ElementVerify";
    public static final String MobileStatusV2 = "MobileStatusV2";
    public static final String ElementVerifyV2 = "ElementVerifyV2";
    public static final String ElementVerifyEncrypted = "ElementVerifyEncrypted";
    public static final String SimpleRiskStat = "SimpleRiskStat";
    public static final String ContentRiskStat = "ContentRiskStat";

    public static final String GetUploadId = "GetUploadId";

    public static final String UploadFile = "UploadFile";

    public static final String CompleteUploadFile = "CompleteUploadFile";

    public static final String GetUploadedPartList = "GetUploadedPartList";

    public static final String GetDailyMarketingPackage = "GetDailyMarketingPackage";


    public static final String ActivateRiskBasePackage = "ActivateRiskBasePackage";
    public static final String ActivateRiskSampleData = "ActivateRiskSampleData";
    public static final String ActivateRiskResult = "ActivateRiskResult";

    public static final String CancelActivateRiskResult = "CancelActivateRiskResult";


    // content security
    public static final String ImageContentRisk = "ImageContentRisk";
    public static final String ImageContentRiskV2 = "ImageContentRiskV2";
    public static final String AsyncImageRisk = "AsyncImageRisk";
    public static final String AsyncImageRiskV2 = "AsyncImageRiskV2";
    public static final String VideoResult = "VideoResult";
    public static final String GetImageResult = "GetImageResult";
    public static final String GetImageResultV2 = "GetImageResultV2";
    public static final String AsyncVideoRisk = "AsyncVideoRisk";
    public static final String TextRisk = "TextRisk";
    public static final String CreateCustomContents = "CreateCustomContents";
    public static final String UploadCustomContents = "UploadCustomContents";
    public static final String DeleteCustomContents = "DeleteCustomContents";
    public static final String GetAudioResult = "GetAudioResult";
    public static final String AsyncAudioRisk = "AsyncAudioRisk";
    public static final String GetVideoLiveResult = "GetVideoLiveResult";

    public static final String AudioRisk = "AudioRisk";
    public static final String AsyncLiveVideoRisk = "AsyncLiveVideoRisk";
    public static final String GetAudioLiveResult = "GetAudioLiveResult";
    public static final String AsyncLiveAudioRisk = "AsyncLiveAudioRisk";
    public static final String TextSliceRisk = "TextSliceRisk";

    public static final String CloseVideoLiveRisk = "CloseVideoLiveRisk";

    public static final String CloseAudioLiveRisk = "CloseAudioLiveRisk";
    public static final String CreateCustomLib = "CreateCustomLib";
    public static final String DeleteCustomLib = "DeleteCustomLib";
    public static final String UpdateCustomLib = "UpdateCustomLib";
    public static final String ChangeCustomContentsStatus = "ChangeCustomContentsStatus";
    public static final String GetCustomLib = "GetCustomLib";
    public static final String CreateAccessConfig = "CreateAccessConfig";
    public static final String UpdateAccessConfig = "UpdateAccessConfig";
    public static final String UpdateConfigStatus = "UpdateConfigStatus";
    public static final String GetAccessConfig = "GetAccessConfig";
    public static final String GetTextLibContent = "GetTextLibContent";
    public static final String DeleteTextLibContent = "DeleteTextLibContent";
    public static final String UploadTextLibContent = "UploadTextLibContent";
    public static final String GetImageLibContent = "GetImageLibContent";
    public static final String DeleteImageLibContent = "DeleteImageLibContent";
    public static final String UploadImageLibContent = "UploadImageLibContent";

    // livesaas
    public static final String ListSiteTagAPIV2 = "ListSiteTagAPIV2";

    public static final String UpdateSiteTagAPIV2 = "UpdateSiteTagAPIV2";

    public static final String GetPageWatchDataAPI = "GetPageWatchDataAPI";

    public static final String ListUserBehaviorDataAPI = "ListUserBehaviorDataAPI";

    public static final String CreateActivityAPIV2 = "CreateActivityAPIV2";

    public static final String DeleteActivityAPI = "DeleteActivityAPI";

    public static final String ListActivityAPI = "ListActivityAPI";

    public static final String GetDownloadLiveClientAPI = "GetDownloadLiveClientAPI";
    public static final String GetDownloadLiveClient = "GetDownloadLiveClient";

    public static final String GetWebPushLiveClientAPI = "GetWebPushLiveClientAPI";

    public static final String ListActivityByCacheAPI = "ListActivityByCacheAPI";

    public static final String UpdateActivityStatusAPI = "UpdateActivityStatusAPI";

    public static final String UpdatePullToPushAPI = "UpdatePullToPushAPI";

    public static final String GetActivityAPI = "GetActivityAPI";

    public static final String GetStreamsAPI = "GetStreamsAPI";

    public static final String UpdateActivityBasicConfigAPI = "UpdateActivityBasicConfigAPI";

    public static final String GetActivityBasicConfigAPI = "GetActivityBasicConfigAPI";

    public static final String UpdateLoopVideoAPI = "UpdateLoopVideoAPI";

    public static final String UpdateLoopVideoStatusAPI = "UpdateLoopVideoStatusAPI";

    public static final String GetTemporaryLoginTokenAPI = "GetTemporaryLoginTokenAPI";

    public static final String GetCustomActMsgAPI = "GetCustomActMsgAPI";

    public static final String UploadReplayAPI = "UploadReplayAPI";

    public static final String ListMediasAPI = "ListMediasAPI";

    public static final String UpdateMediaOnlineStatusAPI = "UpdateMediaOnlineStatusAPI";

    public static final String GetAdvertisementDataAPI = "GetAdvertisementDataAPI";

    public static final String ListQuestionnaireAnswerDataAPI = "ListQuestionnaireAnswerDataAPI";

    public static final String ListQuestionnaireDataAPI = "ListQuestionnaireDataAPI";

    public static final String GetRealTimeOnlineNumberAPI = "GetRealTimeOnlineNumberAPI";

    public static final String ListAnActivityStartAndEndTimeAPI = "ListAnActivityStartAndEndTimeAPI";

    public static final String GetActivityReservationAPI = "GetActivityReservationAPI";

    public static final String ListPosterInviteAPI = "ListPosterInviteAPI";

    public static final String PresenterChatAPI = "PresenterChatAPI";

    public static final String PresenterChatAPIV2 = "PresenterChatAPIV2";

    public static final String PollingChatAPI = "PollingChatAPI";

    public static final String GetHotChatAPI = "GetHotChatAPI";

    public static final String GetTopChatAPI = "GetTopChatAPI";

    public static final String DeleteChatAPI = "DeleteChatAPI";

    public static final String LikeChatAPI = "LikeChatAPI";

    public static final String TopChatAPI = "TopChatAPI";

    public static final String EmptyChatAPI = "EmptyChatAPI";

    public static final String UpdateChatReviewStatusAPI = "UpdateChatReviewStatusAPI";

    public static final String ConfirmReviewChatAPI = "ConfirmReviewChatAPI";

    public static final String SilenceUserAPI = "SilenceUserAPI";

    public static final String GetSilenceUserListAPI = "GetSilenceUserListAPI";

    public static final String GetActivityMenuAPI = "GetActivityMenuAPI";

    public static final String UpdateActivityMenuAPI = "UpdateActivityMenuAPI";

    public static final String GetActivityProductAPI = "GetActivityProductAPI";

    public static final String UpdateActivityProductAPI = "UpdateActivityProductAPI";

    public static final String DeleteGraphicMessageAPI = "DeleteGraphicMessageAPI";

    public static final String UpdatePresenterNameAPI = "UpdatePresenterNameAPI";

    public static final String UpdateBulletScreensSwitchAPI = "UpdateBulletScreensSwitchAPI";

    public static final String EnableProductAPI = "EnableProductAPI";

    public static final String ExplainProductAPI = "ExplainProductAPI";

    public static final String UpdateActivityEmbeddedUrlAPI = "UpdateActivityEmbeddedUrlAPI";

    public static final String GetActivityEmbeddedUrlAPI = "GetActivityEmbeddedUrlAPI";

    public static final String UpdateCustomizationViewPermissionAPI = "UpdateCustomizationViewPermissionAPI";

    public static final String ListLivePromotionsAPI = "ListLivePromotionsAPI";

    public static final String AddLivePromotionsAPI = "AddLivePromotionsAPI";

    public static final String UpdateLivePromotionsStatusAPI = "UpdateLivePromotionsStatusAPI";

    public static final String DeleteLivePromotionsAPI = "DeleteLivePromotionsAPI";

    public static final String ListHostAccountAPI = "ListHostAccountAPI";

    public static final String GetBusinessAccountInfoAPI = "GetBusinessAccountInfoAPI";

    public static final String UploadMediaByURL = "UploadMediaByURL";

    public static final String QueryUploadMediaByURL = "QueryUploadMediaByURL";

    public static final String TempToMediaActivityMediaAPI = "TempToMediaActivityMediaAPI";

    public static final String ListActivityMediaAPI = "ListActivityMediaAPI";

    public static final String ListUserSubmitEnterReviewAPI = "ListUserSubmitEnterReviewAPI";

    public static final String ReviewUserEnterFormAPI = "ReviewUserEnterFormAPI";

    public static final String GetActivityAntidirtAPI = "GetActivityAntidirtAPI";

    public static final String AddActivityAntidirtAPI = "AddActivityAntidirtAPI";

    public static final String DelActivityAntidirtAPI = "DelActivityAntidirtAPI";

    public static final String SendCustomSystemMessageAPI = "SendCustomSystemMessageAPI";

    public static final String GetSDKTokenAPI = "GetSDKTokenAPI";

    public static final String GetAllStreamPullInfoAPI = "GetAllStreamPullInfoAPI";

    public static final String GetUserTaskAwardResultAPI = "GetUserTaskAwardResultAPI";

    public static final String AnalysisUserBehaviorPeople = "AnalysisUserBehaviorPeople";

    public static final String GetAwardRecordStatisticsAPI = "GetAwardRecordStatisticsAPI";

    public static final String ListQuizRecordAPI = "ListQuizRecordAPI";

    public static final String ListQuizStatisticsAPI = "ListQuizStatisticsAPI";

    public static final String GetQuizDataAPI = "GetQuizDataAPI";

    public static final String ListActivityQuizConfigs = "ListActivityQuizConfigs";

    public static final String UpdateActivityQuizConfig = "UpdateActivityQuizConfig";

    public static final String GetTaskAwardItemListAPI = "GetTaskAwardItemListAPI";

    public static final String GetTaskAwardRecordStatisticsAPI = "GetTaskAwardRecordStatisticsAPI";

    public static final String GetCheckInListAPI = "GetCheckInListAPI";

    public static final String GetCheckInRecordStatisticsAPI = "GetCheckInRecordStatisticsAPI";

    public static final String ListRedPacketDataAPI = "ListRedPacketDataAPI";

    public static final String ListRedPacketRecordAPI = "ListRedPacketRecordAPI";

    public static final String GetAwardConfigListAPI = "GetAwardConfigListAPI";

    public static final String GetVoteListAPI = "GetVoteListAPI";

    public static final String GetVoteStatisticsAPI = "GetVoteStatisticsAPI";

    public static final String GetAccountTemplateAPI = "GetAccountTemplateAPI";

    public static final String UpdateAccountTemplateStatusAPI = "UpdateAccountTemplateStatusAPI";

    public static final String UpdateDefaultTemplateStatusAPI = "UpdateDefaultTemplateStatusAPI";

    public static final String GetPageWatchDataAPIV2 = "GetPageWatchDataAPIV2";

    public static final String GetActivityReservationAPIV2 = "GetActivityReservationAPIV2";

    public static final String ListQuestionnaireDataAPIV2 = "ListQuestionnaireDataAPIV2";

    public static final String ListQuestionnaireAnswerDataAPIV2 = "ListQuestionnaireAnswerDataAPIV2";

    public static final String AnalysisUserBehaviorPeopleV2 = "AnalysisUserBehaviorPeopleV2";

    public static final String GetAdvertisementDataAPIV2 = "GetAdvertisementDataAPIV2";

    public static final String GetAdvertisementDataDetailAPI = "GetAdvertisementDataDetailAPI";

    public static final String ListUserBehaviorDataAPIV2 = "ListUserBehaviorDataAPIV2";

    public static final String ListChannelAPI = "ListChannelAPI";

    public static final String GetCustomViewingRestrictionInfoAPI = "GetCustomViewingRestrictionInfoAPI";

    public static final String UpdateActivityViewPermissionAPI = "UpdateActivityViewPermissionAPI";

    public static final String DeleteMediaLibraryVideoAPI = "DeleteMediaLibraryVideoAPI";

    public static final String MediasMergeAPI = "MediasMergeAPI";

    public static final String GetPopularitySettingsAPI = "GetPopularitySettingsAPI";

    public static final String UpdatePopularitySettingsAPI = "UpdatePopularitySettingsAPI";

    public static final String GetActivityMenus = "GetActivityMenus";

    public static final String ModifyActivityMenus = "ModifyActivityMenus";

    public static final String GetActivityEmbeddedUrls = "GetActivityEmbeddedUrls";

    public static final String GetActivityProducts = "GetActivityProducts";

    public static final String UpdateActivityProduct = "UpdateActivityProduct";

    public static final String DeleteActivityProduct = "DeleteActivityProduct";

    public static final String UpdateActivityEmbeddedUrl = "UpdateActivityEmbeddedUrl";

    public static final String DeleteActivityEmbeddedUrl = "DeleteActivityEmbeddedUrl";

    public static final String UpdateActivityBand = "UpdateActivityBand";

    public static final String DeleteActivityBand = "DeleteActivityBand";

    public static final String GetActivityBands = "GetActivityBands";

    public static final String GetVQUserDataAPI = "GetVQUserDataAPI";

    public static final String CreateHostAcceleratePackOrder = "CreateHostAcceleratePackOrder";

    public static final String UpdateHostAcceleratePackOrder = "UpdateHostAcceleratePackOrder";

    public static final String DeleteHostAcceleratePackOrder = "DeleteHostAcceleratePackOrder";

    public static final String UnsubscribeHostAcceleratePackOrder = "UnsubscribeHostAcceleratePackOrder";

    public static final String ModifyHostAcceleratePackOrder = "ModifyHostAcceleratePackOrder";

    public static final String ListHostAcceleratePackOrder = "ListHostAcceleratePackOrder";

    public static final String GetAccountAggregatedStatistics = "GetAccountAggregatedStatistics";

    public static final String ListAccountActivityData = "ListAccountActivityData";

    public static final String ListAccountUserData = "ListAccountUserData";

    public static final String GetAccountUserTrackData = "GetAccountUserTrackData";

    public static final String GetAttentionDetectionConfig = "GetAttentionDetectionConfig";

    public static final String UpdateAttentionDetectionConfig = "UpdateAttentionDetectionConfig";
    public static final String CheckUidMatch = "CheckUidMatch";
    public static final String GetTeachAssistantConfig = "GetTeachAssistantConfig";
    public static final String UpdateTeachAssistantConfig = "UpdateTeachAssistantConfig";
    public static final String ListTeachAssistantAccounts = "ListTeachAssistantAccounts";
    public static final String UpdateTeachAssistantAccount = "UpdateTeachAssistantAccount";
    public static final String DeleteTeachAssistantAccount = "DeleteTeachAssistantAccount";
    public static final String GetSecurityControlConfig = "GetSecurityControlConfig";
    public static final String UpdateSecurityControlConfig = "UpdateSecurityControlConfig";

    public static final String GetActivityCommentConfig = "GetActivityCommentConfig";

    public static final String UpdateActivityCommentConfig = "UpdateActivityCommentConfig";

    public static final String ListActivityCustomEmojiSets = "ListActivityCustomEmojiSets";

    public static final String GetActivityCustomEmojiSetDetail = "GetActivityCustomEmojiSetDetail";

    public static final String ModifyActivityCustomEmojiSets = "ModifyActivityCustomEmojiSets";

    public static final String DeleteActivityCustomEmojiSet = "DeleteActivityCustomEmojiSet";

    public static final String CreateOrUpdateActivityCustomEmojiSet = "CreateOrUpdateActivityCustomEmojiSet";

    public static final String UpdateActivityCustomEmojiSetStatus = "UpdateActivityCustomEmojiSetStatus";
    public static final String ListAwardConfigs = "ListAwardConfigs";
    public static final String ListAwardRecordStatistics = "ListAwardRecordStatistics";

    public static final String GetLiveTrafficPostPayData = "GetLiveTrafficPostPayData";

    public static final String GetActivityLivePromotionDetail = "GetActivityLivePromotionDetail";

    public static final String GetActivityLivePromotionData = "GetActivityLivePromotionData";

    public static final String ListAccountActivityHistoryData = "ListAccountActivityHistoryData";

    public static final String UpdateVodPlayerConfig = "UpdateVodPlayerConfig";

    public static final String DeleteVodPlayerConfig = "DeleteVodPlayerConfig";

    public static final String GetVodPlayerConfig = "GetVodPlayerConfig";

    public static final String ListVodPlayerConfig = "ListVodPlayerConfig";

    public static final String UpdateDefaultVodPlayerConfig = "UpdateDefaultVodPlayerConfig";

    public static final String GetVodPlayerToken = "GetVodPlayerToken";

    public static final String GetVideoLibraryFolderTree = "GetVideoLibraryFolderTree";

    public static final String SearchVideoLibraryFolderTree = "SearchVideoLibraryFolderTree";
    public static final String DeleteHostAccount = "DeleteHostAccount";
    public static final String UpdateHostAccount = "UpdateHostAccount";
    public static final String UpdateActivityHostAccount = "UpdateActivityHostAccount";
    public static final String UpdateFloatingAdvertisement = "UpdateFloatingAdvertisement";
    public static final String ListHostAccounts = "ListHostAccounts";
    public static final String GetBusinessAccountInfo = "GetBusinessAccountInfo";

    public static final String ListLoopVideos = "ListLoopVideos";
    public static final String UpdateLoopVideoStatus = "UpdateLoopVideoStatus";
    public static final String UpdateLoopVideos = "UpdateLoopVideos";
    public static final String ListPrograms = "ListPrograms";
    public static final String UpdateProgram = "UpdateProgram";
    public static final String DeleteProgram = "DeleteProgram";
    public static final String MediaCut = "MediaCut";
    public static final String AddActivityPartnerRebroadcast = "AddActivityPartnerRebroadcast";
    public static final String DeleteActivityPartnerRebroadcast = "DeleteActivityPartnerRebroadcast";
    public static final String GetActivityPartnerRebroadcast = "GetActivityPartnerRebroadcast";

    public static final String GetActivityLinks = "GetActivityLinks";

    public static final String GetAudienceGroupConfig = "GetAudienceGroupConfig";

    public static final String UpdateAudienceGroupConfig = "UpdateAudienceGroupConfig";

    public static final String ListAudienceGroupUser = "ListAudienceGroupUser";

    public static final String AddAudienceGroup = "AddAudienceGroup";

    public static final String UpdateAudienceGroupUserConfig = "UpdateAudienceGroupUserConfig";

    public static final String DeleteAudienceGroup = "DeleteAudienceGroup";

    public static final String ModifyAudienceGroup = "ModifyAudienceGroup";

    public static final String UpdateLiveChannelConfig = "UpdateLiveChannelConfig";

    public static final String DeleteLiveChannelConfig = "DeleteLiveChannelConfig";

    public static final String CreateLiveChannelConfig = "CreateLiveChannelConfig";

    public static final String ListLiveChannelConfig = "ListLiveChannelConfig";

    public static final String GenerateActivityStreamSlice = "GenerateActivityStreamSlice";
    public static final String DeleteRobotNickNames = "DeleteRobotNickNames";
    public static final String AddRobotNickNames = "AddRobotNickNames";
    public static final String ListRobotNickNames = "ListRobotNickNames";
    public static final String DeleteRobotComments = "DeleteRobotComments";
    public static final String AddRobotComments = "AddRobotComments";
    public static final String ListRobotComments = "ListRobotComments";
    public static final String GetActivityRobotCommentConfig = "GetActivityRobotCommentConfig";
    public static final String UpdateActivityRobotCommentConfig = "UpdateActivityRobotCommentConfig";

    public static final String GetLoginLivesaasSts = "GetLoginLivesaasSts";

    public static final String UpdateViewingRestriction="UpdateViewingRestriction";

    public static final String InsertWhiteList="InsertWhiteList";

    public static final String DeleteWhiteList="DeleteWhiteList";

    public static final String InsertPhoneList="InsertPhoneList";

    public static final String DeletePhoneList="DeletePhoneList";

    public static final String GetMediaStoragePayData = "GetMediaStoragePayData";

    public static final String GetVideoTrafficPayData = "GetVideoTrafficPayData";
    public static final String CreateLLMTask = "CreateLLMTask";
    public static final String GetLLMReport = "GetLLMReport";
    public static final String ListLLMTasks = "ListLLMTasks";

    public static final String UpdateAnswerRepetition = "UpdateAnswerRepetition";

    public static final String UpdateAccountBanStatus = "UpdateAccountBanStatus";

    public static final String GetViewingRestrictionInfo="GetViewingRestrictionInfo";
    
    public static final String GetWhiteList="GetWhiteList";

    public static final String GetPhoneList="GetPhoneList";

    public static final String GetLarkSubAccountInfo = "GetLarkSubAccountInfo";
    public static final String GetAwardItemList = "GetAwardItemList";
    public static final String UpdateAwardItem = "UpdateAwardItem";
    public static final String DeleteAwardItem = "DeleteAwardItem";
    public static final String CreateCoupons = "CreateCoupons";
    public static final String UpdateCoupon = "UpdateCoupon";
    public static final String DeleteCoupons = "DeleteCoupons";
    public static final String ListCoupons = "ListCoupons";
    public static final String GetCoupon = "GetCoupon";
    public static final String CreateActivityCoupons = "CreateActivityCoupons";
    public static final String UpdateActivityCoupon = "UpdateActivityCoupon";
    public static final String DeleteActivityCoupons = "DeleteActivityCoupons";
    public static final String ListActivityCoupons = "ListActivityCoupons";
    public static final String SendActivityCoupon = "SendActivityCoupon";
    public static final String StopActivityCoupon = "StopActivityCoupon";
    public static final String GetActivityCouponPickData = "GetActivityCouponPickData";
    public static final String GetActivityAllCouponsPickData = "GetActivityAllCouponsPickData";
    public static final String CreateSubAccount = "CreateSubAccount";
    public static final String UpdateSubAccount = "UpdateSubAccount";
    public static final String DeleteSubAccount = "DeleteSubAccount";
    public static final String ListSubAccounts = "ListSubAccounts";
    public static final String GetSubAccount = "GetSubAccount";
    public static final String ListSubAccountRoles = "ListSubAccountRoles";
    public static final String ListSubAccountOrganizations = "ListSubAccountOrganizations";
    public static final String ExportActivityData = "ExportActivityData";
    public static final String GetActivityExportFile = "GetActivityExportFile";
    public static final String GetActivityPoster = "GetActivityPoster";
    public static final String UpdateActivityPoster = "UpdateActivityPoster";
    public static final String SendActivityRobotComment = "SendActivityRobotComment";
    public static final String BatchSendActivityRobotComment = "BatchSendActivityRobotComment";

    public static final String ListWaitLinkAudience = "ListWaitLinkAudience";
    public static final String GetLinkUserAmount = "GetLinkUserAmount";
    public static final String GetInviterToken = "GetInviterToken";

    // translate
    public static final String LangDetect = "LangDetect";
    public static final String TranslateText = "TranslateText";
    public static final String TranslateImage = "TranslateImage";
    public static final String TranslateAudioSubmit = "SubmitAudio";
    public static final String TranslateAudioQuery = "QueryAudio";
    public static final String GlossaryPublish = "GlossaryPublish";

    //sign
    public static final String XDate = "X-Date";
    public static final String XNotSignBody = "X-NotSignBody";
    public static final String XCredential = "X-Credential";
    public static final String XAlgorithm = "X-Algorithm";
    public static final String XSignedHeaders = "X-SignedHeaders";
    public static final String XSignedQueries = "X-SignedQueries";
    public static final String XSignature = "X-Signature";

    public static final String ContentType = "Content-Type";
    public static final String ContentTypeValue = "application/x-www-form-urlencoded; charset=utf-8";
    public static final String XContentSha256 = "X-Content-Sha256";
    public static final String Authorization = "Authorization";
    public static final String XSecurityToken = "X-Security-Token";

    public static final String ContentMd5 = "Content-Md5";

    public static final String ListRooms = "ListRooms";
    public static final String ListIndicators = "ListIndicators";

    // cms
    public static final String BatchCreateSourceArticle = "BatchCreateSourceArticle";
    public static final String GetArticleBatchUploadDetail = "GetArticleBatchUploadDetail";
    public static final String DeleteSourceArticle = "DeleteSourceArticle";
    public static final String DeleteSourceArticleByOpenid = "DeleteSourceArticleByOpenid";
    public static final String ArticleEventNotify = "ArticleEventNotify";
    public static final String Feed = "Feed";
    public static final String GetVideoByVid = "GetVideoByVid";
    public static final String MGetVideoByVids = "MGetVideoByVids";
    public static final String GetGoodsRelatedArticles = "GetGoodsRelatedArticles";
    public static final String MGetGoodsRelatedArticles = "MGetGoodsRelatedArticles";
    public static final String CmsSearch = "Search";
    public static final String RelatedFeed = "RelatedFeed";

    // stream
    public static final String WapRegister = "WapRegister";
    public static final String ContentStream = "ContentStream";
    public static final String ContentStreamV2 = "ContentStreamV2";
    public static final String Digg = "Digg";
    public static final String Bury = "Bury";
    public static final String UnDigg = "UnDigg";
    public static final String UnBury = "UnBury";
    public static final String SingleArticleInfo = "SingleArticleInfo";
    public static final String MultiArticleInfo = "MultiArticleInfo";
    public static final String DislikeLog = "DislikeLog";
    public static final String VideoPlayDrawLog = "VideoPlayDrawLog";
    public static final String VideoOverDrawLog = "VideoOverDrawLog";
    public static final String ProductShowLog = "ProductShowLog";
    public static final String PushLog = "PushLog";
    public static final String ProductClickLog = "ProductClickLog";
    public static final String VideoPlayAutoLog = "VideoPlayAutoLog";
    public static final String VideoOverAutoLog = "VideoOverAutoLog";
    public static final String Feedback = "Feedback";
    public static final String Follow = "Follow";
    public static final String Unfollow = "Unfollow";
    public static final String CheckRelation = "CheckRelation";
    public static final String FollowingList = "FollowingList";
    public static final String RefreshTips = "RefreshTips";
    public static final String FollowArticles = "FollowArticles";
    public static final String RecommendRelatedUser = "RecommendRelatedUser";
    public static final String RecommendCategoryUser = "RecommendCategoryUser";
    public static final String RecommendCategoryInfo = "RecommendCategoryInfo";
    public static final String RelatedArticle = "RelatedArticle";
    public static final String RelatedArticleV2 = "RelatedArticleV2";
    public static final String ClickLog = "ClickLog";
    public static final String StayLog = "StayLog";
    public static final String VideoPlayLog = "VideoPlayLog";
    public static final String VideoOverLog = "VideoOverLog";
    public static final String SingleShowLog = "SingleShowLog";
    public static final String MultiShowLog = "MultiShowLog";
    public static final String ShareLog = "ShareLog";
    public static final String FavouriteLog = "FavouriteLog";
    public static final String VerifyLog = "VerifyLog";
    public static final String FollowLog = "FollowLog";
    public static final String UnfollowLog = "UnfollowLog";
    public static final String FollowCardLog = "FollowCardLog";
    public static final String DiggList = "DiggList";
    public static final String VideoUrl = "VideoUrl";
    public static final String UnionProduct = "UnionProduct";
    public static final String HotBoard = "HotBoard";
    public static final String SdkMonitor = "SdkMonitor";
    public static final String ContentSearch = "Search";
    public static final String ContentSearchV2 = "SearchV2";
    //new
    public static final String FollowAction = "FollowAction";
    public static final String UnfollowAction = "UnfollowAction";
    public static final String FollowList = "FollowList";
    public static final String FollowCheck = "FollowCheck";
    public static final String SingleArticle = "SingleArticle";
    public static final String SingleArticleV2 = "SingleArticleV2";
    public static final String MultiArticle = "MultiArticle";
    public static final String MultiArticleV2 = "MultiArticleV2";
    public static final String ContentVersion = "2021-01-01";

    //live
    public static final String LiveSDKVersion2020 = "2020-08-01";
    public static final String LiveSDKVersion2023 = "2023-01-01";
    public static final String ListCommonTransPresetDetail = "ListCommonTransPresetDetail";
    public static final String UpdateCallback = "UpdateCallback";
    public static final String DescribeCallback = "DescribeCallback";
    public static final String DeleteCallback = "DeleteCallback";
    public static final String CreateDomain = "CreateDomain";
    public static final String DeleteDomain = "DeleteDomain";
    public static final String ListDomainDetail = "ListDomainDetail";
    public static final String DescribeDomain = "DescribeDomain";
    public static final String EnableDomain = "EnableDomain";
    public static final String DisableDomain = "DisableDomain";
    public static final String ManagerPullPushDomainBind = "ManagerPullPushDomainBind";
    public static final String UpdateAuthKey = "UpdateAuthKey";
    public static final String EnableAuth = "EnableAuth";
    public static final String DisableAuth = "DisableAuth";
    public static final String DescribeAuth = "DescribeAuth";
    public static final String ForbidStream = "ForbidStream";
    public static final String ResumeStream = "ResumeStream";
    public static final String ListCert = "ListCert";
    public static final String CreateCert = "CreateCert";
    public static final String DescribeCertDetailSecret = "DescribeCertDetailSecret";
    public static final String UpdateCert = "UpdateCert";
    public static final String BindCert = "BindCert";
    public static final String UnbindCert = "UnbindCert";
    public static final String DeleteCert = "DeleteCert";
    public static final String UpdateReferer = "UpdateReferer";
    public static final String DeleteReferer = "DeleteReferer";
    public static final String DescribeReferer = "DescribeReferer";
    public static final String CreateRecordPreset = "CreateRecordPreset";
    public static final String UpdateRecordPreset = "UpdateRecordPreset";
    public static final String DeleteRecordPreset = "DeleteRecordPreset";
    public static final String ListVhostRecordPreset = "ListVhostRecordPreset";
    public static final String CreateTranscodePreset = "CreateTranscodePreset";
    public static final String UpdateTranscodePreset = "UpdateTranscodePreset";
    public static final String DeleteTranscodePreset = "DeleteTranscodePreset";
    public static final String ListVhostTransCodePreset = "ListVhostTransCodePreset";
    public static final String CreateSnapshotPreset = "CreateSnapshotPreset";
    public static final String UpdateSnapshotPreset = "UpdateSnapshotPreset";
    public static final String DeleteSnapshotPreset = "DeleteSnapshotPreset";
    public static final String ListVhostSnapshotPreset = "ListVhostSnapshotPreset";
    public static final String DescribeLiveBandwidthData = "DescribeLiveBandwidthData";
    public static final String DescribeLiveTrafficData = "DescribeLiveTrafficData";
    public static final String DescribeLiveP95PeakBandwidthData = "DescribeLiveP95PeakBandwidthData";
    public static final String DescribeTranscodeData = "DescribeTranscodeData";
    public static final String DescribeSnapshotData = "DescribeSnapshotData";
    public static final String DescribeRecordData = "DescribeRecordData";
    public static final String DescribeLiveTimeShiftData = "DescribeLiveTimeShiftData";
    public static final String DescribePushStreamMetrics = "DescribePushStreamMetrics";
    public static final String DescribeLiveStreamSessions = "DescribeLiveStreamSessions";
    public static final String DescribePlayResponseStatusStat = "DescribePlayResponseStatusStat";
    public static final String DescribeLiveDomainLog = "DescribeLiveDomainLog";
    public static final String DescribeLiveMetricTrafficData = "DescribeLiveMetricTrafficData";
    public static final String DescribeLiveMetricBandwidthData = "DescribeLiveMetricBandwidthData";
    public static final String DescribePlayStreamList = "DescribePlayStreamList";
    public static final String DescribePullToPushBandwidthData = "DescribePullToPushBandwidthData";
    public static final String CreateSnapshotAuditPreset = "CreateSnapshotAuditPreset";
    public static final String UpdateSnapshotAuditPreset = "UpdateSnapshotAuditPreset";
    public static final String DeleteSnapshotAuditPreset = "DeleteSnapshotAuditPreset";
    public static final String ListVhostSnapshotAuditPreset = "ListVhostSnapshotAuditPreset";
    public static final String DescribeLiveAuditData = "DescribeLiveAuditData";
    public static final String DescribeCDNSnapshotHistory = "DescribeCDNSnapshotHistory";
    public static final String DescribeRecordTaskFileHistory = "DescribeRecordTaskFileHistory";
    public static final String DescribeLiveStreamInfoByPage = "DescribeLiveStreamInfoByPage";
    public static final String KillStream = "KillStream";
    public static final String DescribeClosedStreamInfoByPage = "DescribeClosedStreamInfoByPage";
    public static final String DescribeLiveStreamState = "DescribeLiveStreamState";
    public static final String DescribeForbiddenStreamInfoByPage = "DescribeForbiddenStreamInfoByPage";
    public static final String UpdateRelaySourceV2 = "UpdateRelaySourceV2";
    public static final String DeleteRelaySourceV2 = "DeleteRelaySourceV2";
    public static final String DescribeRelaySourceV2 = "DescribeRelaySourceV2";
    public static final String CreateVQScoreTask = "CreateVQScoreTask";
    public static final String DescribeVQScoreTask = "DescribeVQScoreTask";
    public static final String ListVQScoreTask = "ListVQScoreTask";
    public static final String GeneratePlayURL = "GeneratePlayURL";
    public static final String GeneratePushURL = "GeneratePushURL";
    public static final String CreatePullToPushTask = "CreatePullToPushTask";
    public static final String ListPullToPushTask = "ListPullToPushTask";
    public static final String UpdatePullToPushTask = "UpdatePullToPushTask";
    public static final String StopPullToPushTask = "StopPullToPushTask";
    public static final String RestartPullToPushTask = "RestartPullToPushTask";
    public static final String DeletePullToPushTask = "DeletePullToPushTask";
    public static final String UpdateDenyConfig = "UpdateDenyConfig";
    public static final String DescribeDenyConfig = "DescribeDenyConfig";
    public static final String DeleteDenyConfig = "DeleteDenyConfig";

    //kms
    public static final String CreateKeyring = "CreateKeyring";
    public static final String DescribeKeyrings = "DescribeKeyrings";
    public static final String UpdateKeyring = "UpdateKeyring";
    public static final String QueryKeyring = "QueryKeyring";
    public static final String CreateKey = "CreateKey";
    public static final String DescribeKeys = "DescribeKeys";
    public static final String UpdateKey = "UpdateKey";
    public static final String GenerateDataKey = "GenerateDataKey";
    public static final String Encrypt = "Encrypt";
    public static final String Decrypt = "Decrypt";
    public static final String EnableKey = "EnableKey";
    public static final String DisableKey = "DisableKey";
    public static final String ScheduleKeyDeletion = "ScheduleKeyDeletion";
    public static final String CancelKeyDeletion = "CancelKeyDeletion";
    public static final String KmsServiceVersion = "2021-02-18";

    //video_aiot
    public static final String VideoAIoTSDKVersion = "2021-01-01";
    public static final String VideoAIoTSDKVersion20231001 = "2023-10-01";
    public static final String AIoTVideoCreateSpace = "CreateSpace";
    public static final String AIoTVideoDeleteSpace = "DeleteSpace";
    public static final String AIoTVideoGetSpace = "GetSpace";
    public static final String AIoTVideoListSpace = "ListSpaces";
    public static final String AIoTVideoUpdateSpace = "UpdateSpace";
    public static final String AIoTVideoStartSpace = "StartSpace";
    public static final String AIoTVideoStopSpace = "StopSpace";

    //template
    public static final String VideoAIoTCreateRecordTemplate = "CreateRecordTemplate";
    public static final String VideoAIoTDeleteRecordTemplate = "DeleteRecordTemplate";
    public static final String AIoTVideoGetDataProjectWithBindWidthAndFlow = "GetDataProjectWithBindWidthAndFlow";

    public static final String AIoTVideoGetTotalData = "GetTotalData";

    public static final String AIoTVideoSetSpaceTemplate = "SetSpaceTemplate";
    public static final String AIoTVideoGetSpaceTemplate = "GetSpaceTemplate";
    public static final String AIoTVideoCancelBindTemplate = "CancelBindTemplate";

    public static final String AIoTVideoUpdateAuthInSpace = "UpdateAuthInSpace";

    public static final String AIoTVideoDisableAuthInSpace = "DisableAuthInSpace";
    public static final String AIoTVideoCreateDevice = "CreateDevice";
    public static final String AIoTVideoStartDevice = "StartDevice";
    public static final String AIoTVideoStopDevice = "StopDevice";
    public static final String AIoTVideoListDevice = "ListDevices";
    public static final String AIoTVideoUpdateDevice = "UpdateDevice";
    public static final String AIoTVideoFreshDevice = "FreshDevice";
    public static final String AIoTVideoDeleteDevice = "DeleteDevice";
    public static final String AIoTVideoGetDevice = "GetDevice";
    public static final String AIoTVideoGenSipID = "GenSipID";
    public static final String AIoTVideoGetDeviceChannels = "GetDeviceChannels";
    public static final String AIoTVideoGetDeviceChannelsV2 = "GetDeviceChannelsV2";
    public static final String AIoTVideoListDeviceScreenshot = "ListDeviceScreenshots";
    public static final String AIoTVideoListDeviceRecords = "ListDeviceRecords";
    public static final String AIoTVideoCloudRecordPlay = "CloudRecordPlay";

    public static final String AIoTVideoPlayCloudRecord = "PlayCloudRecord";
    public static final String AIoTVideoLocalMediaDownload = "LocalMediaDownload";

    public static final String AIoTVideoGetLocalDownload = "GetLocalDownload";
    public static final String AIoTVideoSetAlarmGuard = "SetAlarmGuard";
    public static final String AIoTVideoResetAlarm = "ResetAlarm";

    public static final String AIoTVideoListAlarmNotify = "ListAlarmNotify";

    public static final String AIoTVideoListStreamRecords = "ListStreamRecords";
    public static final String AIoTVideoDeleteAlarmNotify = "DeleteAlarmNotify";

    public static final String AIoTVideoDeleteAlarmNotifyAll = "DeleteAlarmNotifyAll";

    public static final String AIoTVideoCloudControl = "CloudControl";
    public static final String AIoTVideoQueryPresetInfo = "QueryPresetInfo";
    public static final String AIoTVideoCruiseControl = "CruiseControl";
    public static final String AIoTVideoSetCruiseTrack = "SetCruiseTrack";
    public static final String AIoTVideoGetCruiseTrack = "GetCruiseTrack";
    public static final String AIoTVideoListCruiseTracks = "ListCruiseTracks";
    public static final String AIoTVideoDeleteCruiseTrack = "DeleteCruiseTrack";
    public static final String AIoTVideoStartCruiseTrack = "StartCruiseTrack";
    public static final String AIoTVideoStopCruiseTrack = "StopCruiseTrack";

    public static final String AIoTVideoGetStream = "GetStream";
    public static final String AIoTVideoListStreams = "ListStreams";
    public static final String AIoTVideoStartStream = "StartStream";
    public static final String AIoTVideoStopStream = "StopStream";
    public static final String AIoTVideoUpdateStream = "UpdateStream";

    public static final String AIoTVideoStreamLogs = "StreamLogs";

    public static final String AIoTVideoCreateStream = "CreateStream";
    public static final String AIoTVideoDeleteStream = "DeleteStream";
    public static final String AIoTVideoStatStream = "StatStream";
    public static final String AIoTVideoCreateForward = "CreateForward";
    public static final String AIoTVideoListForward = "ListForward";
    public static final String AIoTVideoGetForward = "GetForward";
    public static final String AIoTVideoStartForward = "StartForward";
    public static final String AIoTVideoStopForward = "StopForward";
    public static final String AIoTVideoDeleteForward = "DeleteForward";
    public static final String AIoTVideoGetStreamData = "GetStreamData";

    public static final String AIoTVideoStreamStartRecord = "StreamStartRecord";
    public static final String AIoTVideoStreamStopRecord = "StreamStopRecord";
    public static final String AIoTVideoGetStreamRecord = "GetStreamRecord";
    public static final String AIoTVideoDeleteStreamRecord = "DeleteStreamRecord";

    public static final String AIoTVideoGetRecordList = "GetRecordList";
    public static final String AIoTVideoGetRecordListV2 = "GetRecordListV2";
    public static final String AIoTVideoGetRecordListV3 = "GetRecordListV3";
    public static final String AIoTVideoPlaybackStart = "PlaybackStart";
    public static final String AIoTVideoPlaybackStartV2 = "PlaybackStartV2";
    public static final String AIoTVideoPlaybackStat = "PlayBackStat";
    public static final String AIoTVideoPlaybackStop = "PlaybackStop";
    public static final String AIoTVideoPlaybackControl = "PlayBackControl";

    public static final String AIoTVideoForbidStream = "ForbidStream";

    public static final String AIoTVideoUnforbidStream = "UnforbidStream";
    public static final String AIoTVideoStartVoiceTalk = "StartVoiceTalk";
    public static final String AIoTVideoStopVoiceTalk = "StopVoiceTalk";

    public static final String AIoTVideoCreateRecordPlan = "CreateRecordPlan";
    public static final String AIoTVideoUpdateRecordPlan = "UpdateRecordPlan";
    public static final String AIoTVideoDeleteRecordPlan = "DeleteRecordPlan";
    public static final String AIoTVideoListRecordPlans = "ListRecordPlans";
    public static final String AIoTVideoGetRecordPlan = "GetRecordPlan";
    public static final String AIoTVideoListRecordPlanChannels = "ListRecordPlanChannels";

    //request method
    public static final String GET = "GET";
    public static final String DELETE = "DELETE";
    public static final String POST = "POST";
    public static final String PUT = "PUT";

    public static final String HTTP = "http";
    public static final String HTTPS = "https";
    public static final String ACCEPT = "Accept";
    public static final String ACCEPT_ALL = "*/*";
    public static final String ACCEPT_ENCODING = "Accept-Encoding";
    public static final String GZIP_DEFLATE_BR = "gzip, deflate, br";
    public static final String SERVICE_NAME = "ServiceName";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String APPLICATION_X_PROTOBUF = "application/x-protobuf";

    // visual
    public static final String SkySegment = "SkySegment";
    public static final String HumanSegment = "HumanSegment";
    public static final String GeneralSegment = "GeneralSegment";
    public static final String CarDetection = "CarDetection";
    public static final String CarSegment = "CarSegment";
    public static final String CarPlateDetection = "CarPlateDetection";
    public static final String PoemMaterial = "PoemMaterial";
    public static final String ImageFlow = "ImageFlow";
    public static final String ImageScore = "ImageScore";
    public static final String FaceSwap = "FaceSwap";
    public static final String FaceSwapV2 = "FaceSwap";
    public static final String FaceswapAI = "FaceswapAI";

    public static final String JPCartoon = "JPCartoon";
    public static final String EyeClose2Open = "EyeClose2Open";
    public static final String EmoticonEdit = "EmoticonEdit";
    public static final String StretchRecovery = "StretchRecovery";
    public static final String DistortionFree = "DistortionFree";
    public static final String EnhancePhoto = "EnhancePhoto";
    public static final String ConvertPhoto = "ConvertPhoto";
    public static final String PotraitEffect = "PotraitEffect";
    public static final String DollyZoom = "DollyZoom";
    public static final String ImageCut = "ImageCut";
    public static final String FacePretty = "FacePretty";
    public static final String HairStyle = "HairStyle";
    public static final String ImageAnimation = "ImageAnimation";
    public static final String CertToken = "CertToken";
    public static final String CertVerifyQuery = "CertVerifyQuery";
    public static final String CertConfigInit = "CertConfigInit";
    public static final String CertConfigGet = "CertConfigGet";
    public static final String CertVerifyPro = "CertVerify";
    public static final String Img2Video3D = "Img2Video3D";
    public static final String T2ILDM = "T2ILDM";
    public static final String Img2ImgStyle = "Img2ImgStyle";
    public static final String Img2ImgAnime = "Img2ImgAnime";
    public static final String FaceFusionMovieSubmitTask = "FaceFusionMovieSubmitTask";
    public static final String FaceFusionMovieGetResult = "FaceFusionMovieGetResult";
    public static final String FaceFusionMovieSync = "FaceFusionMovie";
    public static final String EnhancePhotoV2 = "EnhancePhotoV2";
    public static final String AllAgeGeneration = "AllAgeGeneration";
    public static final String ConvertPhotoV2 = "ConvertPhotoV2";
    public static final String AIGufeng = "AIGufeng";
    public static final String LensVidaVideoSubmitTaskV2 = "LensVidaVideoSubmitTaskV2";
    public static final String LensVidaVideoGetResultV2 = "LensVidaVideoGetResultV2";
    public static final String VideoOverResolutionSubmitTaskV2 = "VideoOverResolutionSubmitTaskV2";
    public static final String VideoOverResolutionQueryTaskV2 = "VideoOverResolutionQueryTaskV2";
    public static final String OverResolutionV2 = "OverResolutionV2";
    public static final String TupoCartoon = "TupoCartoon";
    public static final String MultiPhotoPortraitSubmitTaskCreateAIModel = "MultiPhotoPortraitSubmitTaskCreateAIModel";
    public static final String MultiPhotoPortraitSubmitTaskGenerateImage = "MultiPhotoPortraitSubmitTaskGenerateImage";
    public static final String MultiPhotoPortraitGetTaskResult = "MultiPhotoPortraitGetTaskResult";
    public static final String MultiPhotoPortraitManageTask = "MultiPhotoPortraitManageTask";

    // ipaas
    public static final String IPaasSDKService = "ipaas";
    public static final String IPaasSDKVersion20201025 = "2020-10-25";
    public static final String IPaasSDKVersion20220630 = "2022-06-30";

    // host
    public static final String IPaasListHost = "ListHost";

    // instance
    public static final String IPaasListInstance = "ListInstance";
    public static final String IPaasDetailInstance = "DetailInstance";

    // ocr
    public static final String OCRNormal = "OCRNormal";
    public static final String MultilangOCR = "MultiLanguageOCR";
    public static final String BankCard = "BankCard";
    public static final String IDCard = "IDCard";
    public static final String DrivingLicense = "DrivingLicense";
    public static final String VehicleLicense = "VehicleLicense";
    public static final String OcrTaibao = "OcrTaibao";
    public static final String OcrVatInvoice = "OcrVatInvoice";
    public static final String OcrTaxiInvoice = "OcrTaxiInvoice";
    public static final String OcrQuotaInvoice = "OcrQuotaInvoice";
    public static final String OcrTrainTicket = "OcrTrainTicket";
    public static final String OcrFlightInvoice = "OcrFlightInvoice";
    public static final String OcrFinance = "OcrFinance";
    public static final String OcrRollInvoice = "OcrRollInvoice";
    public static final String OcrPassInvoice = "OcrPassInvoice";
    public static final String OcrFoodProduction = "OcrFoodProduction";
    public static final String OcrFoodBusiness = "OcrFoodBusiness";
    public static final String OcrClueLicense = "OcrClueLicense";
    public static final String OCRTrade = "OCRTrade";
    public static final String OCRRuanzhu = "OCRRuanzhu";
    public static final String OcrSeal = "OcrSeal";
    public static final String OcrTextAlignment = "OcrTextAlignment";
    public static final String OCRPdf = "OCRPdf";
    public static final String OCRPdfSubmitTask = "OCRPdfSubmitTask";
    public static final String OCRPdfQueryTask = "OCRPdfQueryTask";
    public static final String OCRTable = "OCRTable";
    public static final String OCRCosmeticProduct = "OCRCosmeticProduct";

    // maas
    public static final String MaasApiChat = "chat";
    public static final String MaasApiTokenization = "tokenization";
    public static final String MaasApiClassification = "classification";
    public static final String MaasApiEmbeddings = "embeddings";
    public static final String MaasApiAudioSpeech = "audio.speech";
    public static final String MaasApiImagesQuickGen = "images.quick_gen";
    public static final String MaasApiImagesFlexGen = "images.flex_gen";

    public static final String MaasApiTop = "top";

    public static final String MaasChatRoleOfUser = "user";
    public static final String MaasChatRoleOfAssistant = "assistant";
    public static final String MaasChatRoleOfSystem = "system";
    public static final String MaasChatRoleOfFunction = "function";

    public static final String SmsChannelTypeCnOTP = "CN_OTP";
    public static final String SmsChannelTypeCnNTC = "CN_NTC";
    public static final String SmsChannelTypeCnMKT = "CN_MKT";
    public static final String SmsChannelTypeI18nOTP = "I18N_OTP";
    public static final String SmsChannelTypeI18nMKT = "I18N_MKT";

    public static final String EnableStatusNotEnabled = "0";
    public static final String EnableStatusEnabled = "1";

    public static final String AreaCN = "cn";
    public static final String AreaOverseas = "overseas";
    public static final String AreaAll = "all";

    // cloudtrail
    public static final String LookupEvents = "LookupEvents";

    // securitySource
    public static final String SecuritySource = "SecuritySource";
    public static final String SecuritySourceStream = "SecuritySourceStream";

    // report
    public static final String ExportReports = "ExportReports";
    public static final String ReportVersion = "2024-01-01";

    public static final String ListActivityUsers = "ListActivityUsers";
}
