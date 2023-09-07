package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;

@Data
public class VisualCertTokenRequest {

    @JSONField(name = "req_key")
    String reqKey;

    @JSONField(name = "sts_token")
    String stsToken;

    @JSONField(name = "tos_info")
    JSONObject tosInfo;

    @JSONField(name = "ref_source")
    String refSource;

    @JSONField(name = "liveness_type")
    String livenessType;

    @JSONField(name = "idcard_name")
    String idcardName;

    @JSONField(name = "idcard_no")
    String idcardNo;

    @JSONField(name = "ref_image")
    String refImage;

    @JSONField(name = "liveness_timeout")
    Integer livenessTimeout = 10;

    @JSONField(name = "motion_list")
    ArrayList<String> motionList = new ArrayList<>();

    @JSONField(name = "fixed_motion_list")
    ArrayList<String> fixedMotionList = new ArrayList<>();

    @JSONField(name = "motion_count")
    Integer motionCount = 2;

    @JSONField(name = "max_liveness_trial")
    Integer maxLivenessTrial = 10;

    @JSONField(name = "callback_info")
    JSONObject callBackInfo;

    @JSONField(name = "config_id")
    String configId;


}