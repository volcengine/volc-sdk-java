package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class TopChatAPIRequest {
    @JSONField(name = "TopStatus")
    Integer TopStatus;
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "ChatId")
    Long ChatId;
}