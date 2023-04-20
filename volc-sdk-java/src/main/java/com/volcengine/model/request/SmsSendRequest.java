package com.volcengine.model.request;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Map;

@Data
public class SmsSendRequest {
    @JSONField(name = "SmsAccount")
    String smsAccount;
    @JSONField(name = "Sign")
    String sign;
    @JSONField(name = "TemplateId")
    String templateId;
    @JSONField(name = "TemplateParam")
    String templateParam;
    @JSONField(name = "PhoneNumbers")
    String phoneNumbers;
    @JSONField(name = "Tag")
    String tag;
    @JSONField(name = "UserExtCode")
    String userExtCode;

    public void setTemplateParamByMap(Map<String,String> paramMap){
        if (paramMap==null|| paramMap.isEmpty()){
            return;
        }
        this.templateParam = JSON.toJSONString(paramMap);
    }
}
