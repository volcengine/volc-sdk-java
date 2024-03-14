package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class EmojiSetLocation {
    @JSONField(name = "EmojiSetId")
    Long EmojiSetId;
    @JSONField(name = "EmojiSetLocation")
    Integer EmojiSetLocation;
}