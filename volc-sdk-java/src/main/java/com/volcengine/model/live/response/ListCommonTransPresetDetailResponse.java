package com.volcengine.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class ListCommonTransPresetDetailResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListCommonTransPresetDetailResult result;

    @Data
    public static class ListCommonTransPresetDetailResult {
        @JSONField(name = "StandardPresetDetail")
        TranscodePresetResult[] transcodePresetResult;

        @JSONField(name = "NarrowBandHDPresetDetail")
        TranscodePresetResult[] narrowBandHDPresetDetail;
    }

    @Data
    public static class TranscodePresetResult {
        @JSONField(name = "Preset")
        String preset;
        @JSONField(name = "Status")
        Long status;
        @JSONField(name = "SuffixName")
        String suffixName;
        @JSONField(name = "VideoBitrate")
        Long videoBitrate;
        @JSONField(name = "Vcodec")
        String vcodec;
        @JSONField(name = "AudioBitrate")
        Long audioBitrate;
        @JSONField(name = "Acodec")
        String acodec;
        @JSONField(name = "FPS")
        Long FPS;
        @JSONField(name = "GOP")
        Long GOP;
        @JSONField(name = "Width")
        Long width;
        @JSONField(name = "Height")
        Long height;
        @JSONField(name = "AutoTrans")
        Long autoTrans;
        @JSONField(name = "As")
        String AS;
        @JSONField(name = "ShortSide")
        Long shortSide;
        @JSONField(name = "LongSide")
        Long longSide;
        @JSONField(name = "Roi")
        Boolean roi;
    }


}
