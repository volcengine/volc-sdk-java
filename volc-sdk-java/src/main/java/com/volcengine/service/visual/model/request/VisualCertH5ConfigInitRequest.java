package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;

@Data
public class VisualCertH5ConfigInitRequest {

    @JSONField(name = "req_key")
    String reqKey;
    @JSONField(name = "h5_config")
    H5Config h5Config;

    @JSONField(name = "liveness_config")
    LivenessConfig livenessConfig;

    @JSONField(name = "tos_config")
    TOSConfig tosConfig;

    @JSONField(name = "callback_info")
    CallBackInfo callbackInfo;

    @JSONField(name = "expire_duration")
    int expireDuration=900;

    @Data
    public static class H5Config {
        @JSONField(name = "type")
        String type="0";
        @JSONField(name = "theme_color")
        String themeColor;
        @JSONField(name = "show_guide")
        String showGuide="1";
        @JSONField(name = "show_result")
        String showResult="1";
        @JSONField(name = "protocol_name")
        String protocolName;
        @JSONField(name = "protocol_link")
        String protocolLink;
        @JSONField(name = "enable_record")
        String enableRecord="1";
        @JSONField(name = "redirect_url")
        String redirectUrl;
        @JSONField(name = "ignore_homepage_agreement")
        Boolean ignoreHomepageAgreement=false;
        @JSONField(name = "ignore_bottom_text")
        Boolean ignoreBottomText=false;

    }
    @Data
    public static class LivenessConfig {
        @JSONField(name = "ref_source")
        String refSource;
        @JSONField(name = "liveness_type")
        String livenessType;
        @JSONField(name = "livenessTimeout")
        int livenessTimeout=10;
        @JSONField(name = "motion_list")
        ArrayList<String> motionList = new ArrayList<>();
        @JSONField(name = "fixed_motion_list")
        ArrayList<String> fixedMotionList = new ArrayList<>();
        @JSONField(name = "motion_count")
        int motionCount=2;
        @JSONField(name = "max_liveness_trial")
        int maxLivenessTrial=10;
        @JSONField(name = "reflection_mode")
        int reflectionMode=0;

    }
    @Data
    public static class TOSConfig {
        @JSONField(name = "sts_ak")
        String stsAk;
        @JSONField(name = "sts_sk")
        String stsSk;
        @JSONField(name = "sts_token")
        String stsToken;
        @JSONField(name = "bucket")
        String bucket;
        @JSONField(name = "endpoint")
        String endpoint;
        @JSONField(name = "region")
        String region;

    }
    @Data
    public static class CallBackInfo {
        @JSONField(name = "switch")
        Boolean Switch;
        @JSONField(name = "block")
        Boolean block;
        @JSONField(name = "url")
        String url;
        @JSONField(name = "client_name")
        String clientName;
    }

}