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
    public static final int LargeFileSize = 1024 * 1024 * 1024;


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
    public static final String GetPrivateDrmPlayAuth = "GetPrivateDrmPlayAuth";
    public static final String GetHlsDecryptionKey = "GetHlsDecryptionKey";
    public static final String GetPlayInfoWithLiveTimeShiftScene = "GetPlayInfoWithLiveTimeShiftScene";
    // vod-upload
    public static final String UploadMediaByUrl = "UploadMediaByUrl";
    public static final String QueryUploadTaskInfo = "QueryUploadTaskInfo";
    public static final String ApplyUploadInfo = "ApplyUploadInfo";
    public static final String CommitUploadInfo = "CommitUploadInfo";
    // vod-media
    public static final String UpdateMediaInfo = "UpdateMediaInfo";
    public static final String UpdateMediaPublishStatus = "UpdateMediaPublishStatus";
    public static final String GetMediaInfos = "GetMediaInfos";
    public static final String GetRecommendedPoster = "GetRecommendedPoster";
    public static final String DeleteMedia = "DeleteMedia";
    public static final String DeleteTranscodes = "DeleteTranscodes";
    public static final String GetMediaList = "GetMediaList";
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
    //vod-transcode
    public static final String StartWorkflow = "StartWorkflow";
    //vod-space
    public static final String CreateSpace = "CreateSpace";
    public static final String ListSpace = "ListSpace";
    public static final String GetSpaceDetail = "GetSpaceDetail";
    public static final String UpdateSpace = "UpdateSpace";
    public static final String UpdateSpaceUploadConfig = "UpdateSpaceUploadConfig";
    //vod-cdn
    public static final String ListDomain = "ListDomain";
    public static final String CreateCdnRefreshTask = "CreateCDNRefreshTask";
    public static final String CreateCdnPreloadTask = "CreateCDNPreloadTask";
    public static final String ListCdnTasks = "ListCdnTasks";
    public static final String ListCdnAccessLog = "ListCdnAccessLog";
    public static final String ListCdnTopAccessUrl = "ListCdnTopAccessUrl";
    public static final String DescribeVodDomainBandwidthData = "DescribeVodDomainBandwidthData";
    public static final String ListCdnUsageData = "ListCdnUsageData";
    public static final String ListCdnStatusData = "ListCdnStatusData";


    //vod-callback
    public static final String AddCallbackSubscription = "AddCallbackSubscription";
    public static final String SetCallbackEvent = "SetCallbackEvent";
}
