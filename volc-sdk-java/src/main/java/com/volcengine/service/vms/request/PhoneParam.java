package com.volcengine.service.vms.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PhoneParam {
    @JSONField(name = "Phone")
    private String phone;

    @JSONField(name = "PhoneParam")
    private Map<String, Object> phoneParam;

    @JSONField(name = "TtsContent")
    private String ttsContent;

    @JSONField(name = "Ext")
    private String ext;

    @JSONField(name = "SmsParam")
    private Map<String,Object> smsParam;
}
