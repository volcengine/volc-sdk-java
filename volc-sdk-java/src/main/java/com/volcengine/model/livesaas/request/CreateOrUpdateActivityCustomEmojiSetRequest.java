package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.UpdateEmojiConfig;
import com.volcengine.model.beans.livesaas.UpdateEmojiSetConfig;
import lombok.Data;


@Data
public class CreateOrUpdateActivityCustomEmojiSetRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "EmojiSet")
    UpdateEmojiSetConfig EmojiSet;
}