package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;

@Data
public class VisualCertTokenProRequest {

    @JSONField(name = "req_key")
    String reqKey = "cert_pro_token";
    @JSONField(name = "sts_token")
    String stsToken;
    @JSONField(name = "tos_info")
    JSONObject tosInfo;
    @JSONField(name = "ref_source")
    String refSource;
    @JSONField(name = "idcard_name")
    String idcardName;
    @JSONField(name = "idcard_no")
    String idcardNo;
    @JSONField(name = "ref_image")
    String refImage;
    @JSONField(name = "max_liveness_trial")
    Integer maxLivenessTrial = 10;
    @JSONField(name = "liveness_timeout")
    Integer livenessTimeout = 10;

    @JSONField(name = "risk_liveness_type")
    RiskLivenessType riskLivenessType = new RiskLivenessType();

    @Data
    public static class RiskLivenessType {
        @JSONField(name = "free")
        String free = "motion";
        @JSONField(name = "low")
        String low = "motion";
        @JSONField(name = "medium")
        String medium = "motion";
        @JSONField(name = "high")
        String high = "reflection";
    }

    @JSONField(name = "risk_motion_count")
    RiskMotionCount riskMotionCount = new RiskMotionCount();
    @Data
    public static class RiskMotionCount {
        @JSONField(name = "free")
        Integer free = 2;
        @JSONField(name = "low")
        Integer low = 2;
        @JSONField(name = "medium")
        Integer medium = 3;
        @JSONField(name = "high")
        Integer high = 4;
    }

    @JSONField(name = "risk_motion_list")
    RiskMotionList riskMotionList = new RiskMotionList();
    @Data
    public static class RiskMotionList {
        @JSONField(name = "free")
        ArrayList<String> free = new ArrayList<>(Arrays.asList("0", "1", "2", "3"));
        @JSONField(name = "low")
        ArrayList<String> low = new ArrayList<>(Arrays.asList("0", "1", "2", "3"));
        @JSONField(name = "medium")
        ArrayList<String> medium = new ArrayList<>(Arrays.asList("0", "1", "2", "3"));
        @JSONField(name = "high")
        ArrayList<String> high = new ArrayList<>(Arrays.asList("0", "1", "2", "3"));
    }

    @JSONField(name = "risk_fixed_motion_list")
    RiskFixedMotionList riskFixedMotionList = new RiskFixedMotionList();
    @Data
    public static class RiskFixedMotionList {
        @JSONField(name = "free")
        ArrayList<String> free;
        @JSONField(name = "low")
        ArrayList<String> low;
        @JSONField(name = "medium")
        ArrayList<String> medium;
        @JSONField(name = "high")
        ArrayList<String> high;
    }

    @JSONField(name = "callback_info")
    CallBackInfo callBackInfo = new CallBackInfo();
    @Data
    public static class CallBackInfo {
        @JSONField(name = "switch")
        Boolean switchBack = false;
        @JSONField(name = "block")
        Boolean block = false;
        @JSONField(name = "url")
        String url;
        @JSONField(name = "client_name")
        String clientName;
    }
    @JSONField(name = "config_id")
    String configId;
}