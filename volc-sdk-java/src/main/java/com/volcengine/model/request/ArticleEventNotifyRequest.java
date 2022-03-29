package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ArticleEventNotifyRequest {
    @JSONField(name = "GenerateType")
    String generateType;
    @JSONField(name = "EventType")
    String eventType;
    @JSONField(name = "SubEventType")
    String subEventType;
    @JSONField(name = "CursorTime")
    Long cursorTime;
    @JSONField(name = "SubEventTypeList")
    List<String> subEventTypeList;
}
