package com.volcengine.helper;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Const {

    public static final Charset UTF_8 = StandardCharsets.UTF_8;
    public static final String ACCESS_KEY = "VOLC_ACCESSKEY";
    public static final String SECRET_KEY = "VOLC_SECRETKEY";

    public static final String REGION_CN_NORTH_1 = "cn-north-1";
    public static final String REGION_AP_SINGAPORE_1 = "ap-singapore-1";
    public static final String REGION_US_EASE_1 = "us-east-1";

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

    public static final String Action = "Action";

    // iam
    public static final String CreateUser = "CreateUser";
    public static final String ListUsers = "ListUsers";
    public static final String CreateRole = "CreateRole";
    public static final String GetRole = "GetRole";
    public static final String UpdateRole = "UpdateRole";
    public static final String ListRoles = "ListRoles";
    public static final String DeleteRole = "DeleteRole";


    // sts
    public static final String AssumeRole = "AssumeRole";

    // ad blocker
    public static final String AdBlock = "AdBlock";
    // game protect
    public static final String GameProtect = "GameProtect";
    // business security
    public static final String RiskDetection = "RiskDetection";
    public static final String AsyncRiskDetection = "AsyncRiskDetection";
    public static final String RiskResult = "RiskResult";
    public static final String DataReport = "DataReport";
    public static final String AccountRisk = "AccountRisk";
    public static final String MobileStatus = "MobileStatus";
    public static final String ElementVerify = "ElementVerify";
    public static final String MobileStatusV2 = "MobileStatusV2";
    public static final String ElementVerifyV2 = "ElementVerifyV2";

    // content security
    public static final String ImageContentRisk = "ImageContentRisk";
    public static final String AsyncImageRisk = "AsyncImageRisk";
    public static final String VideoResult = "VideoResult";
    public static final String GetImageResult = "GetImageResult";
    public static final String AsyncVideoRisk = "AsyncVideoRisk";
    public static final String TextRisk = "TextRisk";
    public static final String CreateCustomContents = "CreateCustomContents";
    public static final String UploadCustomContents = "UploadCustomContents";
    public static final String GetAudioResult = "GetAudioResult";
    public static final String AsyncAudioRisk = "AsyncAudioRisk";
    public static final String GetVideoLiveResult = "GetVideoLiveResult";
    public static final String AsyncLiveVideoRisk = "AsyncLiveVideoRisk";
    public static final String GetAudioLiveResult = "GetAudioLiveResult";
    public static final String AsyncLiveAudioRisk = "AsyncLiveAudioRisk";

    // livesaas

    //创建直播间
    public static final String CreateActivityAPI = "CreateActivityAPI";
    //查询直播间
    public static final String GetActivityAPI = "GetActivityAPI";
    //获取直播流
    public static final String GetStreamsAPI = "GetStreamsAPI";
    //获取广告数据
    public static final String GetAdvertisementDataAPI = "GetAdvertisementDataAPI";
    //获取真实在线人数
    public static final String GetRealTimeOnlineNumberAPI = "GetRealTimeOnlineNumberAPI";
    //删除直播间
    public static final String DeleteActivityAPI = "DeleteActivityAPI";
    //获取直播间基本信息与配置
    public static final String UpdateActivityBasicConfigAPI = "UpdateActivityBasicConfigAPI";
    //更新直播间基本信息与配置
    public static final String GetActivityBasicConfigAPI = "GetActivityBasicConfigAPI";
    //图片视频上传
    public static final String UploadLibAPI = "UploadLibAPI";
    //获取菜单栏
    public static final String GetActivityMenuAPI = "GetActivityMenuAPI";
    //更新菜单栏
    public static final String UpdateActivityMenuAPI = "UpdateActivityMenuAPI";
    //获取菜单栏商品
    public static final String GetActivityProductAPI = "GetActivityProductAPI";
    //更新菜单栏商品
    public static final String UpdateActivityProductAPI = "UpdateActivityProductAPI";
    //获取直播间列表的详细状态信息
    public static final String ListActivityDetailStatusAPI = "ListActivityDetailStatusAPI";

    // translate
    public static final String LangDetect = "LangDetect";
    public static final String TranslateText = "TranslateText";
    public static final String TranslateImage = "TranslateImage";

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

    public static final String USERAGENT = "User-Agent";

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
    public static final String ContentVersion = "2021-01-01";

    //live
    public static final String LiveSDKVersion = "2020-08-01";
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

}
