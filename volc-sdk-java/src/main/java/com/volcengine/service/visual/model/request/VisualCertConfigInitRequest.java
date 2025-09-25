package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;

@Data
public class VisualCertConfigInitRequest {

    @JSONField(name = "req_key")
    String reqKey;

    @JSONField(name = "config_name")
    String configName;

    @JSONField(name = "config_desc")
    String configDesc;

    @JSONField(name = "token_api_config")
    TokenApiConfig tokenApiConfig;

    @Data
    public static class TokenApiConfig {
        @JSONField(name = "ref_source")
        String refSource;
        @JSONField(name = "liveness_type")
        String livenessType;
        @JSONField(name = "motion_list")
        ArrayList<String> motionList = new ArrayList<>();
        @JSONField(name = "fixed_motion_list")
        ArrayList<String> fixedMotionList = new ArrayList<>();
        @JSONField(name = "motion_count")
        Integer motionCount = 10;
        @JSONField(name = "max_liveness_trial")
        Integer maxLivenessTrial = 10;
        @JSONField(name = "reflection_mode")
        Integer reflectionMode = 0;
        @JSONField(name = "tos_info")
        TosInfo tosInfo;
        @Data
        public static class TosInfo {
            @JSONField(name = "bucket")
            String bucket;
            @JSONField(name = "endpoint")
            String endpoint;
            @JSONField(name = "region")
            String region;
        }
        @JSONField(name = "callback_info")
        CallBackInfo callBackInfo;
        @Data
        public static class CallBackInfo {
            @JSONField(name = "switch")
            Boolean isCallBack;
            @JSONField(name = "block")
            Boolean block;
            @JSONField(name = "url")
            String url;
            @JSONField(name = "client_name")
            String clientName;
        }
    }

    @JSONField(name = "h5_config")
    H5Config h5Config;
    @Data
    public static class H5Config {
        @JSONField(name = "redirectUrl")
        String redirectUrl;
        @JSONField(name = "source")
        Integer source;
        @JSONField(name = "bucket")
        String bucket;
        @JSONField(name = "endpoint")
        String endpoint;
        @JSONField(name = "region")
        String region;
        @JSONField(name = "type")
        Integer type;
        @JSONField(name = "showResult")
        Integer showResult;
        @JSONField(name = "protocolName")
        String protocolName;
        @JSONField(name = "protocolLink")
        String protocolLink;
        @JSONField(name = "demoteType")
        Integer demoteType;
        @JSONField(name = "styleConf")
        String styleConf;
        @JSONField(name = "protocolNav")
        Integer protocolNav;
        @JSONField(name = "protocolNavTitle")
        String protocolNavTitle;
    }
}