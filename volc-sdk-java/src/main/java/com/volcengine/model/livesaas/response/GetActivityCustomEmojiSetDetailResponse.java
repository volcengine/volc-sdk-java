package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetActivityCustomEmojiSetDetailResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetActivityCustomEmojiSetDetailResponseBody result;

    @Data
    public static class GetActivityCustomEmojiSetDetailResponseBody {
        @JSONField(name = "EmojiSet")
        EmojiSetDetailConfig EmojiSet;
    }

    @Data
    public static class EmojiSetDetailConfig {
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
        @JSONField(name = "Emojis")
        List<EmojiConfig> Emojis;
    }

    @Data
    public static class EmojiConfig {
        @JSONField(name = "EmojiId")
        Long EmojiId;
        @JSONField(name = "EmojiName")
        java.lang.String EmojiName;
        @JSONField(name = "EmojiImage")
        java.lang.String EmojiImage;
        @JSONField(name = "EmojiType")
        Integer EmojiType;
        @JSONField(name = "EmojiLocation")
        Integer EmojiLocation;
    }
}