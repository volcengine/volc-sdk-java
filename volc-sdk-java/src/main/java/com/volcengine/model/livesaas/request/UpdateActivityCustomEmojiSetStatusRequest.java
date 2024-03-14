package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;


@Data
public class UpdateActivityCustomEmojiSetStatusRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "EmojiSetId")
    Long EmojiSetId;

    @JSONField(name = "EmojiSetStatus")
    Integer EmojiSetStatus;
}