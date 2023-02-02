package com.volcengine.model.request;


import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetVmsTemplateStatusRequest {
    @JSONField(name = "SubAccount")
    String subAccount;
    @JSONField(name = "TemplateId")
    String templateId;
}
