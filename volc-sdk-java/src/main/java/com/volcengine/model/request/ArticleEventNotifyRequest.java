package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ArticleEventNotifyRequest {
    @JSONField(name = "EventType")
    String eventType;
    @JSONField(name = "SubEventType")
    String subEventType;
    @JSONField(name = "CursorTime")
    Integer cursorTime;
}
