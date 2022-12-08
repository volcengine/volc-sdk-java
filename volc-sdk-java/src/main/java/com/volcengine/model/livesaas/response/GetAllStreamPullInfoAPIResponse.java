package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class GetAllStreamPullInfoAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    List<StreamPullInfoAPI> result;

    @Data
    public static class StreamPullInfoAPI {
        @JSONField(name = "LineName")
        String LineName;
        @JSONField(name = "Main")
        List<ElePlayInfo> Main;
        @JSONField(name = "Backup")
        List<ElePlayInfo> Backup;
    }

    @Data
    public static class ElePlayInfo {
        @JSONField(name = "VCodec")
        String VCodec;
        @JSONField(name = "Size")
        String Size;
        @JSONField(name = "Url")
        UrlInfo Url;
        @JSONField(name = "BackupUrl")
        List<UrlInfo> BackupUrl;
    }

    @Data
    public static class UrlInfo {
        @JSONField(name = "HlsUrl")
        String HlsUrl;
        @JSONField(name = "RtmpUrl")
        String RtmpUrl;
        @JSONField(name = "LLSUrl")
        String LLSUrl;
        @JSONField(name = "FlvUrl")
        String FlvUrl;
    }
}