package com.volcengine.model.request.sms;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ListSmsTemplateV2Request {
    @JSONField(name = "page")
    private Integer page;

    @JSONField(name = "pageSize")
    private Integer pageSize;

    @JSONField(name = "templateId")
    private String templateId;

    @JSONField(name = "signature")
    private String signature;

    @JSONField(name = "name")
    private String name;

    @JSONField(name = "content")
    private String content;

    @JSONField(name = "subAccounts")
    private List<String> subAccounts;
}
