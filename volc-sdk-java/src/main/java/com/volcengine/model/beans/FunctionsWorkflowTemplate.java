package com.volcengine.model.beans;


import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.service.vod.model.business.VodUploadTemplate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FunctionsWorkflowTemplate {
    @JSONField(name = "TemplateIds")
    List<String> templateIds;

    @JSONField(name = "TemplateType")
    String templateType;
}