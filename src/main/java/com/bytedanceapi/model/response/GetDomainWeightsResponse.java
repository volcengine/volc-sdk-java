package com.bytedanceapi.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Map;

@Data
public class GetDomainWeightsResponse {
    @JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    private String result;
    @JSONField(name = "ResultMap")
    private Map<String, Map<String, Integer>> resultMap;
}
