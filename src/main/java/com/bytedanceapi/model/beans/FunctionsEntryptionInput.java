package com.bytedanceapi.model.beans;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Map;

@Data
public class FunctionsEntryptionInput {
    @JSONField(name = "Config")
    Map<String, String> config;
    @JSONField(name = "PolicyParams")
    Map<String, String> policyParams;
}
