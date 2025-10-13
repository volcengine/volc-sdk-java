package com.volcengine.model.request.sms;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListSubContentRequest {
    @JSONField(name = "secondTemplateId")
    private String secondTemplateId;

    @JSONField(name = "page")
    private Integer page;

    @JSONField(name = "pageSize")
    private Integer pageSize;

    @JSONField(name = "subContentId")
    private String subContentId;
}
