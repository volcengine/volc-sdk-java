package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.EmojiSetLocation;
import lombok.Data;

import java.util.List;


@Data
public class ModifyActivityCustomEmojiSetsRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "EmojiSetLocations")
    List<EmojiSetLocation> EmojiSetLocations;
}