package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ArticleEventNotifyResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ArticleEventNotifyResult result;

    @Data
    public static class ArticleEventNotifyResult {
        @JSONField(name = "CursorTime")
        Long cursorTime;
        @JSONField(name = "Items")
        List<ArticleEvent> items;
    }

    @Data
    public static class ArticleEvent {
        @JSONField(name = "EventType")
        String eventType;
        @JSONField(name = "SubEventType")
        String subEventType;
        @JSONField(name = "EventTime")
        Long eventTime;
        @JSONField(name = "ArticleId")
        Long articleId;
        @JSONField(name = "EventDetail")
        String eventDetail;
    }
}
