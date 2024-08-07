package com.volcengine.model.beans;


import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FunctionsWorkflowInput {
    @JSONField(name = "TemplateId")
    String templateId;

    @JSONField(name = "Templates")
    List<FunctionsWorkflowTemplate> templates;
}