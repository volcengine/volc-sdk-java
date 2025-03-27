package com.volcengine.service.vod;

public class Const {
    public static final String FORMAT_JPEG = "jpeg";
    public static final String FORMAT_PNG = "png";
    public static final String FORMAT_WEBP = "webp";
    public static final String FORMAT_AWEBP = "awebp";
    public static final String FORMAT_GIF = "gif";
    public static final String FORMAT_HEIC = "heic";
    public static final String FORMAT_ORIGINAL = "image";

    public static final int MinChunkSize = 1024 * 1024 * 20;
    public static final int StreamMinChunkSize = 1024 * 1024 * 5;

    public static final String DSAHmacSha1 = "HMAC-SHA1";
    public static final String DSAHmacSha256 = "HMAC-SHA256";

    public static final String FileTypeMedia = "media";
    public static final String FileTypeImage = "image";
    public static final String FileTypeObject = "object";
    public static final String CategoryVideo = "video";
    public static final String CategoryAudio = "audio";
    public static final String CategoryImage = "image";
    public static final String CategoryDynamicImg = "dynamic_img";
    public static final String CategorySubtitle = "subtitle";
    public static final String CategoryFont = "font";

    public static final String FILE_TYPE_VIDEO = "video";
    public static final String FILE_TYPE_IMAGE = "image";
    public static final String FILE_TYPE_OBJECT = "object";

    // upload by url format type
    public static final String UPLOAD_FORMAT_MP4 = "mp4";
    public static final String UPLOAD_FORMAT_M3U8 = "m3u8";


    // vod
    public static final String VOD_TPL_OBJ = "tplv-vod-obj";
    public static final String VOD_TPL_NOOP = "tplv-vod-noop";
    public static final String VOD_TPL_RESIZE = "tplv-vod-rs";
    public static final String VOD_TPL_CENTER_CROP = "tplv-vod-cc";
    public static final String VOD_TPL_SMART_CROP = "tplv-vod-cs";

    public static final String SpaceName = "SpaceName";
    // vod-play
    public static final String GetPlayInfo = "GetPlayInfo";
    public static final String GetAllPlayInfo = "GetAllPlayInfo";
    public static final String GetPrivateDrmPlayAuth = "GetPrivateDrmPlayAuth";
    public static final String GetHlsDecryptionKey = "GetHlsDecryptionKey";
    public static final String DescribeDrmDataKey = "DescribeDrmDataKey";
    public static final String GetPlayInfoWithLiveTimeShiftScene = "GetPlayInfoWithLiveTimeShiftScene";
    // vod-upload
    public static final String UploadMediaByUrl = "UploadMediaByUrl";
    public static final String QueryUploadTaskInfo = "QueryUploadTaskInfo";
    public static final String ApplyUploadInfo = "ApplyUploadInfo";
    public static final String CommitUploadInfo = "CommitUploadInfo";
    // vod-media
    public static final String UpdateMediaInfo = "UpdateMediaInfo";
    public static final String GetMediaInfos20230701 = "GetMediaInfos";

    public static final String UpdateMediaPublishStatus = "UpdateMediaPublishStatus";
    public static final String UpdateMediaStorageClass = "UpdateMediaStorageClass";
    public static final String GetInnerAuditURLs = "GetInnerAuditURLs";
    public static final String GetAdAuditResultByVid = "GetAdAuditResultByVid";
    public static final String GetMediaInfos = "GetMediaInfos";
    public static final String GetRecommendedPoster = "GetRecommendedPoster";
    public static final String DeleteMedia = "DeleteMedia";
    public static final String DeleteTranscodes = "DeleteTranscodes";
    public static final String GetMediaList = "GetMediaList";
    public static final String DeleteMaterial = "DeleteMaterial";
    public static final String GetSubtitleInfoList = "GetSubtitleInfoList";
    public static final String UpdateSubtitleStatus = "UpdateSubtitleStatus";
    public static final String UpdateSubtitleInfo = "UpdateSubtitleInfo";
    public static final String GetAuditFramesForAudit = "GetAuditFramesForAudit";
    public static final String GetMLFramesForAudit = "GetMLFramesForAudit";
    public static final String GetBetterFramesForAudit = "GetBetterFramesForAudit";
    public static final String GetAudioInfoForAudit = "GetAudioInfoForAudit";
    public static final String GetAutomaticSpeechRecognitionForAudit = "GetAutomaticSpeechRecognitionForAudit";
    public static final String GetAudioEventDetectionForAudit = "GetAudioEventDetectionForAudit";
    public static final String CreateVideoClassification = "CreateVideoClassification";
    public static final String UpdateVideoClassification = "UpdateVideoClassification";
    public static final String DeleteVideoClassification = "DeleteVideoClassification";
    public static final String ListVideoClassifications = "ListVideoClassifications";
    public static final String ListSnapshots = "ListSnapshots";
    public static final String DeleteMediaTosFile = "DeleteMediaTosFile";
    //vod-transcode
    public static final String StartWorkflow = "StartWorkflow";
    public static final String RetrieveTranscodeResult = "RetrieveTranscodeResult";
    public static final String GetWorkflowExecution = "GetWorkflowExecution";
    public static final String GetWorkflowExecutionResult = "GetWorkflowExecutionResult";
    public static final String GetTaskTemplate = "GetTaskTemplate";
    public static final String CreateTaskTemplate = "CreateTaskTemplate";
    public static final String UpdateTaskTemplate = "UpdateTaskTemplate";
    public static final String ListTaskTemplate = "ListTaskTemplate";
    public static final String DeleteTaskTemplate = "DeleteTaskTemplate";
    public static final String GetWorkflowTemplate = "GetWorkflowTemplate";
    public static final String CreateWorkflowTemplate = "CreateWorkflowTemplate";
    public static final String UpdateWorkflowTemplate = "UpdateWorkflowTemplate";
    public static final String ListWorkflowTemplate = "ListWorkflowTemplate";
    public static final String DeleteWorkflowTemplate = "DeleteWorkflowTemplate";
    public static final String GetWatermarkTemplate = "GetWatermarkTemplate";
    public static final String CreateWatermarkTemplate = "CreateWatermarkTemplate";
    public static final String UpdateWatermarkTemplate = "UpdateWatermarkTemplate";
    public static final String ListWatermarkTemplate = "ListWatermarkTemplate";
    public static final String DeleteWatermarkTemplate = "DeleteWatermarkTemplate";
    //vod-edit
    public static final String SubmitDirectEditTaskAsync = "SubmitDirectEditTaskAsync";
    public static final String SubmitDirectEditTaskSync = "SubmitDirectEditTaskSync";
    public static final String GetDirectEditResult = "GetDirectEditResult";
    public static final String GetDirectEditProgress = "GetDirectEditProgress";
    public static final String CancelDirectEditTask = "CancelDirectEditTask";
    //vod-space
    public static final String CreateSpace = "CreateSpace";
    public static final String ListSpace = "ListSpace";
    public static final String GetSpaceDetail = "GetSpaceDetail";
    public static final String UpdateSpace = "UpdateSpace";
    public static final String UpdateSpaceUploadConfig = "UpdateSpaceUploadConfig";
    public static final String DescribeVodSpaceStorageData = "DescribeVodSpaceStorageData";
    //vod-cdn
    public static final String ListDomain = "ListDomain";
    public static final String CreateCdnRefreshTask = "CreateCDNRefreshTask";
    public static final String CreateCdnPreloadTask = "CreateCDNPreloadTask";
    public static final String ListCdnTasks = "ListCdnTasks";
    public static final String ListCdnAccessLog = "ListCdnAccessLog";
    public static final String ListCdnTopAccessUrl = "ListCdnTopAccessUrl";
    public static final String ListCdnTopAccess = "ListCdnTopAccess";
    public static final String DescribeVodDomainBandwidthData = "DescribeVodDomainBandwidthData";
    public static final String ListCdnUsageData = "ListCdnUsageData";
    public static final String ListCdnStatusData = "ListCdnStatusData";
    public static final String DescribeIpInfo = "DescribeIpInfo";
    public static final String DescribeVodDomainTrafficData = "DescribeVodDomainTrafficData";

    public static final String ListCdnPvData = "ListCdnPvData";

    public static final String SubmitBlockTasks = "SubmitBlockTasks";
    public static final String GetContentBlockTasks = "GetContentBlockTasks";
    public static final String ListFileMetaInfosByFileNames = "ListFileMetaInfosByFileNames";

    public static final String CreateDomain = "CreateDomain";

    public static final String UpdateDomainExpire = "UpdateDomainExpire";

    public static final String UpdateDomainAuthConfig = "UpdateDomainAuthConfig";

    public static final String AddOrUpdateCertificate = "AddOrUpdateCertificate";

    public static final String UpdateDomainUrlAuthConfig = "UpdateDomainUrlAuthConfig";

    public static final String DescribeDomainConfig = "DescribeDomainConfig";
    public static final String UpdateDomainConfig = "UpdateDomainConfig";

    public static final String VerifyDomainOwner = "VerifyDomainOwner";
    public static final String DescribeDomainVerifyContent = "DescribeDomainVerifyContent";

    //vod-callback
    public static final String AddCallbackSubscription = "AddCallbackSubscription";
    public static final String SetCallbackEvent = "SetCallbackEvent";
    public static final String GetCallbackRecord = "GetCallbackRecordV2";

    // vod-smartstrategy
    public static final String GetSmartStrategyLitePlayInfo = "GetSmartStrategyLitePlayInfo";

    // vod-appid
    public static final String GetAppInfo = "GetAppInfo";

    // vod-measure
    public static final String DescribeVodSpaceTranscodeData = "DescribeVodSpaceTranscodeData";
    public static final String DescribeVodSpaceAIStatisData = "DescribeVodSpaceAIStatisData";
    public static final String DescribeVodSpaceSubtitleStatisData = "DescribeVodSpaceSubtitleStatisData";
    public static final String DescribeVodSpaceDetectStatisData = "DescribeVodSpaceDetectStatisData";
    public static final String DescribeVodSnapshotData = "DescribeVodSnapshotData";
    public static final String DescribeVodSpaceWorkflowDetailData = "DescribeVodSpaceWorkflowDetailData";
    public static final String DescribeVodSpaceEditDetailData = "DescribeVodSpaceEditDetailData";
    public static final String DescribeVodEnhanceImageData = "DescribeVodEnhanceImageData";
    public static final String DescribeVodSpaceEditStatisData = "DescribeVodSpaceEditStatisData";
    public static final String DescribeVodPlayedStatisData = "DescribeVodPlayedStatisData";
    public static final String DescribeVodMostPlayedStatisData = "DescribeVodMostPlayedStatisData";
    public static final String DescribeVodRealtimeMediaData = "DescribeVodRealtimeMediaData";
    public static final String DescribeVodRealtimeMediaDetailData = "DescribeVodRealtimeMediaDetailData";
    public static final String DescribeVodVidTrafficFileLog = "DescribeVodVidTrafficFileLog";



    public static final String DeleteSpace = "DeleteSpace";
    public static final String ExtractMediaMetaTask = "ExtractMediaMetaTask";
    public static final String UpdateDomainPlayRule = "UpdateDomainPlayRule";
    public static final String AddDomainToScheduler = "AddDomainToScheduler";
    public static final String RemoveDomainFromScheduler = "RemoveDomainFromScheduler";
    public static final String DeleteDomain = "DeleteDomain";
    public static final String StartDomain = "StartDomain";
    public static final String StopDomain = "StopDomain";
    public static final String GetFileInfos = "GetFileInfos";
    public static final String UpdateFileStorageClass = "UpdateFileStorageClass";
    public static final String SubmitBlockObjectTasks = "SubmitBlockObjectTasks";
    public static final String ListBlockObjectTasks = "ListBlockObjectTasks";

    public static final String SetCloudMigrateJob = "SetCloudMigrateJob";
    public static final String GetCloudMigrateJob = "GetCloudMigrateJob";
    public static final String SubmitCloudMigrateJob = "SubmitCloudMigrateJob";

}
