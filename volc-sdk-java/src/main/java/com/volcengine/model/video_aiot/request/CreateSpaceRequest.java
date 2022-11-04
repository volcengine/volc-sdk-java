package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CreateSpaceRequest {
    @JSONField(name = "SpaceName")
    String spaceName;
    @JSONField(name = "Description")
    String description;
    @JSONField(name = "Region")
    String region;
    @JSONField(name = "AccessType")
    String accessType;
    @JSONField(name = "Rtmp")
    RtmpOptions rtmpOptions;
    @JSONField(name = "GB")
    GBOptions gbOptions;
    @JSONField(name = "HLSLowLatency")
    boolean hLSLowLatency;
    @JSONField(name = "CallbackURL")
    String callback;

    @Data
    public static class RtmpOptions {
    }

    @Data
    public static class GBOptions {
        @JSONField(name = "PullOnDemand")
        boolean pullOnDemand;
    }
}
