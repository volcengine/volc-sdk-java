package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class KnowledgeClassMeta {
    @JSONField(name = "KnowledgeClassDesc")
    String KnowledgeClassDesc;
    @JSONField(name = "IsBulletScreenEnable")
    Boolean IsBulletScreenEnable;
    @JSONField(name = "KnowledgeClassName")
    String KnowledgeClassName;
}
