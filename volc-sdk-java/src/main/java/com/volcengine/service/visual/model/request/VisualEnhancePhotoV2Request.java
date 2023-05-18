package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;

@Data
public class VisualEnhancePhotoV2Request {

    @JSONField(name = "req_key")
    String reqKey = "lens_lqir";

    @JSONField(name = "binary_data_base64")
    ArrayList<String> binaryDataBase64;

    @JSONField(name = "resolution_boundary")
    String resolutionBoundary = "720p";

    @JSONField(name = "enable_hdr")
    Boolean enableHdr = false;

    @JSONField(name = "enable_wb")
    Boolean enableWb = false;

    @JSONField(name = "result_format")
    Integer resultFormat = 0;

    @JSONField(name = "jpg_quality")
    Integer jpgQuality = 95;
}