package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class SpecifiableRuleArg {
    @JSONField(name = "RuleId")
    Long RuleId;
    @JSONField(name = "OcrTextRecognitionArgs")
    OcrTextRecognitionArgs OcrTextRecognitionArgs;
    @JSONField(name = "OcrScrollingSubtitlesArgs")
    OcrScrollingSubtitlesArgs OcrScrollingSubtitlesArgs;
    @JSONField(name = "PresetScriptArgs")
    PresetScriptArgs PresetScriptArgs;
}
