package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ListLiveScreenshotResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListLiveScreenshotResponseBody result;

    @Data
    public static class ListLiveScreenshotResponseBody {
        @JSONField(name = "PageNumber")
        Integer PageNumber;
        @JSONField(name = "PageSize")
        Integer PageSize;
        @JSONField(name = "TotalCount")
        Integer TotalCount;
        @JSONField(name = "TaskId")
        Long TaskId;
        @JSONField(name = "ActivityId")
        Long ActivityId;
        @JSONField(name = "Data")
        List<LiveScreenshotDetail> Data;
    }

    @Data
    public static class LiveScreenshotDetail {
        @JSONField(name = "Url")
        String Url;
        @JSONField(name = "ScreenshotTime")
        Long ScreenshotTime;
        @JSONField(name = "AbsoluteTime")
        Long AbsoluteTime;
    }
}