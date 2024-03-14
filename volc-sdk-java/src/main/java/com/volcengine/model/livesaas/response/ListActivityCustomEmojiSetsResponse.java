package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ListActivityCustomEmojiSetsResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListActivityCustomEmojiSetsResponseBody result;

    @Data
    public static class ListActivityCustomEmojiSetsResponseBody {
        @JSONField(name = "EmojiSets")
        List<EmojiSetBasicConfig> EmojiSets;
    }

    @Data
    public static class EmojiSetBasicConfig {
        @JSONField(name = "EmojiSetId")
        Long EmojiSetId;
        @JSONField(name = "EmojiSetName")
        java.lang.String EmojiSetName;
        @JSONField(name = "EmojiSetStatus")
        Integer EmojiSetStatus;
        @JSONField(name = "EmojiSetType")
        Integer EmojiSetType;
        @JSONField(name = "EmojiNum")
        Integer EmojiNum;
        @JSONField(name = "EmojiSetLocation")
        Integer EmojiSetLocation;
        @JSONField(name = "IsSystemEmojiSet")
        Integer IsSystemEmojiSet;
        @JSONField(name = "EmojiSetIcon")
        java.lang.String EmojiSetIcon;
    }
}