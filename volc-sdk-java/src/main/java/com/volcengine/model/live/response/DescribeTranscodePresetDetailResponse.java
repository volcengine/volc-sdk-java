package com.volcengine.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class DescribeTranscodePresetDetailResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    DescribeTranscodePresetDetailOutput Result;

    @Data
    private static class DescribeTranscodePresetDetailOutput {

        @JSONField(name = "PresetDetailList")
        TranscodePreset[] PresetDetailList;
    }

    @Data
    private static class TranscodePreset{
        @JSONField(name = "Preset")
        String Preset;
        @JSONField(name = "Vhost")
        String Vhost;
        @JSONField(name = "App")
        String App;
        @JSONField(name = "Status")
        String Status;
        @JSONField(name = "SuffixName")
        String SuffixName;
        @JSONField(name = "VideoBitrate")
        Long VideoBitrate;
        @JSONField(name = "Vcodec")
        String Vcodec;
        @JSONField(name = "AudioBitrate")
        Long AudioBitrate;
        @JSONField(name = "Acodec")
        String Acodec;
        @JSONField(name = "FPS")
        Long FPS;
        @JSONField(name = "GOP")
        Long GOP;
        @JSONField(name = "Width")
        Long Width;
        @JSONField(name = "Height")
        Long Height;
        @JSONField(name = "AutoTrans")//-
        Long AutoTrans;
        @JSONField(name = "As")//-
        String As;
        @JSONField(name = "ShortSide")//-
        Long ShortSide;
        @JSONField(name = "LongSide")//-
        Long LongSide;
        @JSONField(name = "Roi")//-
        Boolean Roi;
    }


}
