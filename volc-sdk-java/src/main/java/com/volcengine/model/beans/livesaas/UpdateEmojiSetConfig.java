package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class UpdateEmojiSetConfig {
    @JSONField(name = "EmojiSetId")
    Long EmojiSetId;
    @JSONField(name = "EmojiSetName")
    String EmojiSetName;
    @JSONField(name = "EmojiSetIcon")
    String EmojiSetIcon;
    @JSONField(name = "EmojiSetType")
    Integer EmojiSetType;
    @JSONField(name = "Emojis")
    List<UpdateEmojiConfig> Emojis;
}