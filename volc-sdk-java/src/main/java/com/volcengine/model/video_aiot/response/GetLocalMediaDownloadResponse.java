package com.volcengine.model.video_aiot.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class GetLocalMediaDownloadResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    LocalMediaDownloadWrapper localMediaDownload;


    @Data
    public static class LocalMediaDownloadWrapper {
        @JSONField(name = "PageNumber")
        int pageNumber;
        @JSONField(name = "PageSize")
        int pageSize;
        @JSONField(name = "TotalCount")
        int totalCount;
        @JSONField(name = "GBMedias")
        List<LocalMediaDownload> gbMedias;
    }

    @Data
    public static class LocalMediaDownload {
        @JSONField(name = "ID")
        String id;
        @JSONField(name = "StartTime")
        int startTime;
        @JSONField(name = "EndTime")
        int endTime;
        @JSONField(name = "CallID")
        String callID;
        @JSONField(name = "Status")
        String status;
        @JSONField(name = "Url")
        String url;
        @JSONField(name = "SubtitleUrl")
        String subtitleUrl;
        @JSONField(name = "FileSize")
        int fileSize;
        @JSONField(name = "Msg")
        String msg;
        @JSONField(name = "FileStreamLength")
        int fileStreamLength;
        @JSONField(name = "FileName")
        String fileName;
    }
}
