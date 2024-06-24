package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class PresenterChatRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "Comment")
    String Comment;
    @JSONField(name = "AudienceGroupId")
    Long AudienceGroupId;
}