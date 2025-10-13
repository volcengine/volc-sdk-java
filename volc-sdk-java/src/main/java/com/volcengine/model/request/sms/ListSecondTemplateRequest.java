package com.volcengine.model.request.sms;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ListSecondTemplateRequest {
    @JSONField(name = "templateId")
    private String templateId;

    @JSONField(name = "templateIdList")
    private List<String> templateIdList;

    @JSONField(name = "signatures")
    private String signatures;

    @JSONField(name = "secondTemplateId")
    private String secondTemplateId;

    @JSONField(name = "secondTemplateIdList")
    private List<String> secondTemplateIdList;

    @JSONField(name = "statusList")
    private List<Integer> statusList;

    @JSONField(name = "subAccounts")
    private List<String> subAccounts;
}
