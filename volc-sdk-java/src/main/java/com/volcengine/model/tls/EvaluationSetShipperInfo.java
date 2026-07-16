package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class EvaluationSetShipperInfo {
    @JSONField(name = "WorkspaceId")
    private String workspaceId;
    @JSONField(name = "ProjectName")
    private String projectName;
    @JSONField(name = "EvaluationSetId")
    private String evaluationSetId;
    @JSONField(name = "EvaluationSetName")
    private String evaluationSetName;
    @JSONField(name = "EvaluationSetDescription")
    private String evaluationSetDescription;
    @JSONField(name = "BizCategory")
    private String bizCategory;
    @JSONField(name = "EvaluationSetSchema")
    private EvaluationSetSchema evaluationSetSchema;
    @JSONField(name = "FieldMappings")
    private List<EvaluationSetFieldMapping> fieldMappings;
    @JSONField(name = "ItemKeyField")
    private String itemKeyField;
    @JSONField(name = "BatchSize")
    private Integer batchSize;
    @JSONField(name = "SkipInvalidItems")
    private Boolean skipInvalidItems;
    @JSONField(name = "AllowPartialAdd")
    private Boolean allowPartialAdd;
}
