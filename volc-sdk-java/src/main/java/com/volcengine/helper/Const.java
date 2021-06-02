package com.volcengine.helper;

public class Const {

    public static final String ACCESS_KEY = "VOLC_ACCESSKEY";
    public static final String SECRET_KEY = "VOLC_SECRETKEY";

    public static final String REGION_CN_NORTH_1 = "cn-north-1";
    public static final String REGION_AP_SINGAPORE_1 = "ap-singapore-1";
    public static final String REGION_US_EASE_1 = "us-east-1";

    public static final String INNER_REGION_CN_NORTH_1 = "cn-north-1-inner";
    public static final String INNER_REGION_AP_SINGAPORT_1 = "ap-singapore-1-inner";
    public static final String INNER_REGION_US_EAST_1 = "us-east-1-inner";

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

    public static final String FORMAT_JPEG = "jpeg";
    public static final String FORMAT_PNG = "png";
    public static final String FORMAT_WEBP = "webp";
    public static final String FORMAT_AWEBP = "awebp";
    public static final String FORMAT_GIF = "gif";
    public static final String FORMAT_HEIC = "heic";
    public static final String FORMAT_ORIGINAL = "image";

    public static final String HTTP = "http";
    public static final String HTTPS = "https";

    public static final String VOD_TPL_OBJ = "tplv-vod-obj";
    public static final String VOD_TPL_NOOP = "tplv-vod-noop";
    public static final String VOD_TPL_RESIZE = "tplv-vod-rs";
    public static final String VOD_TPL_CENTER_CROP = "tplv-vod-cc";
    public static final String VOD_TPL_SMART_CROP = "tplv-vod-cs";
    public static final String VOD_TPL_SIG = "tplv-bd-sig";

    public static final String SpaceName = "SpaceName";

    // vod
    public static final String GetPlayInfo = "GetPlayInfo";
    public static final String StartWorkflow = "StartWorkflow";
    public static final String UploadMediaByUrl = "UploadMediaByUrl";
    public static final String ApplyUploadInfo = "ApplyUploadInfo";
    public static final String CommitUploadInfo = "CommitUploadInfo";
    public static final String QueryUploadTaskInfo = "QueryUploadTaskInfo";
    public static final String UpdateMediaPublishStatus = "UpdateMediaPublishStatus";
    public static final String UpdateMediaInfo = "UpdateMediaInfo";
    public static final String GetMediaInfos = "GetMediaInfos";
    public static final String GetRecommendedPoster = "GetRecommendedPoster";
    public static final String DeleteMedia = "DeleteMedia";
    public static final String DeleteTranscodes = "DeleteTranscodes";
    public static final String GetHlsDecryptionKey = "GetHlsDecryptionKey";
    public static final String GetPrivateDrmPlayAuth = "GetPrivateDrmPlayAuth";

    public static final int MinChunkSize = 1024 * 1024 * 20;
    public static final int LargeFileSize = 1024 * 1024 * 50;
    public static final String FileTypeMedia = "media";
    public static final String FileTypeImage = "image";
    public static final String FileTypeObject = "object";
    public static final String CategoryVideo = "video";
    public static final String CategoryAudio = "audio";
    public static final String CategoryImage = "image";
    public static final String CategoryDynamicImg = "dynamic_img";
    public static final String CategorySubtitle = "subtitle";
    public static final String CategoryFont = "font";

    public static final String DSAHmacSha1 = "HMAC-SHA1";
    public static final String DSAHmacSha256 = "HMAC-SHA256";

    // iam
    public static final String CreateUser = "CreateUser";
    public static final String ListUsers = "ListUsers";

    public static final String FILE_TYPE_VIDEO = "video";
    public static final String FILE_TYPE_IMAGE = "image";
    public static final String FILE_TYPE_OBJECT = "object";

    // upload by url format type
    public static final String UPLOAD_FORMAT_MP4 = "mp4";
    public static final String UPLOAD_FORMAT_M3U8 = "m3u8";

    // ad blocker
    public static final String AdBlock = "AdBlock";
    // game protect
    public static final String GameProtect = "GameProtect";
    // business security
    public static final String RiskDetection = "RiskDetection";
    public static final String AsyncRiskDetection = "AsyncRiskDetection";
    public static final String RiskResult = "RiskResult";

    // livesaas
    public static final String CreateActivityAPI = "CreateActivityAPI";
    public static final String GetActivityAPI = "GetActivityAPI";
    public static final String GetStreamsAPI = "GetStreamsAPI";
    public static final String GetAdvertisementDataAPI = "GetAdvertisementDataAPI";
    public static final String GetRealTimeOnlineNumberAPI = "GetRealTimeOnlineNumberAPI";

    // translate
    public static final String LangDetect = "LangDetect";
    public static final String TranslateText = "TranslateText";
}
