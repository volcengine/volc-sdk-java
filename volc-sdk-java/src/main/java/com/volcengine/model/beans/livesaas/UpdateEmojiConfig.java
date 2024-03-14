package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UpdateEmojiConfig {
    @JSONField(name = "EmojiId")
    Long EmojiId;
    @JSONField(name = "EmojiName")
    java.lang.String EmojiName;
    @JSONField(name = "EmojiImage")
    java.lang.String EmojiImage;
    @JSONField(name = "EmojiLocation")
    Integer EmojiLocation;
}