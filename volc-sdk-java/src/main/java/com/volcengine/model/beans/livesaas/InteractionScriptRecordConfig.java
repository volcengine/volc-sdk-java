package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.Data;

@Data
public class InteractionScriptRecordConfig {
    @JSONField(name = "EnableComment")
    Boolean EnableComment;
    @JSONField(name = "EnableProductCard")
    Boolean EnableProductCard;
}
