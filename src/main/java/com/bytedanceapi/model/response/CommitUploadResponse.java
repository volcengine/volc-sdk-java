package com.bytedanceapi.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedanceapi.model.beans.ImageInfo;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class CommitUploadResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    CommitUploadResultBean result;

    @Data
    public static class CommitUploadResultBean {
        @JSONField(name = "RequestId")
        String requestId;
        @JSONField(name = "Results")
        List<UploadResultBean> results;
        @JSONField(name = "PluginResult")
        List<ImageInfo> imageInfos;
    }

    @Data
    public static class UploadResultBean {
        @JSONField(name = "Uri")
        String uri;
        @JSONField(name = "Vid")
        String vid;
        @JSONField(name = "VideoMeta")
        VideoMetaBean videoMeta;
        @JSONField(name = "ImageMeta")
        ImageMetaBean imageMeta;
        @JSONField(name = "ObjectMeta")
        ObjectMetaBean objectMeta;
        @JSONField(name = "Encryption")
        EncryptionBean encryption;
        @JSONField(name = "SnapshotUri")
        String snapshotUri;
    }

    @Data
    public static class VideoMetaBean {
        @JSONField(name = "Uri")
        String uri;
        @JSONField(name = "Height")
        int height;
        @JSONField(name = "Width")
        int width;
        @JSONField(name = "Duration")
        float duration;
        @JSONField(name = "Bitrate")
        int bitrate;
        @JSONField(name = "Md5")
        String md5;
        @JSONField(name = "Format")
        String format;
        @JSONField(name = "Size")
        int size;
    }

    @Data
    public static class ImageMetaBean {
        @JSONField(name = "Uri")
        String uri;
        @JSONField(name = "Height")
        int height;
        @JSONField(name = "Width")
        int width;
        @JSONField(name = "Md5")
        String md5;
    }

    @Data
    public static class ObjectMetaBean {
        @JSONField(name = "Uri")
        String uri;
        @JSONField(name = "Md5")
        String md5;
    }

    @Data
    public static class EncryptionBean {
        @JSONField(name = "Uri")
        String uri;
        @JSONField(name = "SecretKey")
        String secretKey;
        @JSONField(name = "Algorithm")
        String algorithm;
        @JSONField(name = "Version")
        String version;
        @JSONField(name = "SourceMd5")
        String sourceMd5;
        @JSONField(name = "Extra")
        Map<String, String> extra;
    }
}
