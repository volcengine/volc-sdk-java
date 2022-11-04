package com.volcengine.model.video_aiot.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class GetStreamDataResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetStreamDataRes getStreamDataRes;

    @Data
    public static class GetStreamDataRes {
        @JSONField(name = "Height")
        int height;
        @JSONField(name = "Width")
        int width;

        @JSONField(name = "BVideo")
        List<DataProject> bVideo;
        @JSONField(name = "BAudio")
        List<DataProject> bAudio;
        @JSONField(name = "FPS")
        List<DataProject> fps;

    }

    @Data
    public static class DataProject {
        @JSONField(name = "TimeStamp")
        String timeStamp;
        @JSONField(name = "Value")
        Float value;
    }
}
