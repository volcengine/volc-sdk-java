package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.Tag;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetScenarioResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetScenarioResponseBody result;

    @Data
    public static class GetScenarioResponseBody {
        @JSONField(name = "ScenarioId")
        Long ScenarioId;
        @JSONField(name = "ScenarioName")
        String ScenarioName;
        @JSONField(name = "ScenarioType")
        Integer ScenarioType;
        @JSONField(name = "ScenarioDesc")
        String ScenarioDesc;
        @JSONField(name = "CreatedTime")
        Long CreatedTime;
        @JSONField(name = "UpdatedTime")
        Long UpdatedTime;
        @JSONField(name = "Rules")
        List<Rule> Rules;
        @JSONField(name = "Tags")
        List<Tag> Tags;
    }

    @Data
    public static class Rule {
        @JSONField(name = "RuleId")
        Long RuleId;
        @JSONField(name = "RuleName")
        String RuleName;
        @JSONField(name = "RuleCategory")
        String RuleCategory;
        @JSONField(name = "RuleSubType")
        String RuleSubType;
        @JSONField(name = "RuleArgs")
        RuleArgs RuleArgs;
    }

    @Data
    public static class RuleArgs {
        @JSONField(name = "OcrTextRecognitionArgs")
        OcrTextRecognitionArgs OcrTextRecognitionArgs;
        @JSONField(name = "OcrScrollingSubtitlesArgs")
        OcrScrollingSubtitlesArgs OcrScrollingSubtitlesArgs;
    }

    @Data
    public static class OcrTextRecognitionArgs {
        @JSONField(name = "PositiveOrNegative")
        Integer PositiveOrNegative;
        @JSONField(name = "PresetText")
        String PresetText;
        @JSONField(name = "PresetTextSpecifiableOnCreate")
        Boolean PresetTextSpecifiableOnCreate;
    }

    @Data
    public static class OcrScrollingSubtitlesArgs {
        @JSONField(name = "PresetSubtitles")
        String PresetSubtitles;
        @JSONField(name = "PositiveOrNegative")
        Integer PositiveOrNegative;
        @JSONField(name = "PresetSubtitlesSpecifiableOnCreate")
        Boolean PresetSubtitlesSpecifiableOnCreate;
    }
}
