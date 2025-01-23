package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class UpdateActivityMediaInfoRequest {
    @JSONField(name = "Id")
    String Id;
    @JSONField(name = "Name")
    String Name;
    @JSONField(name = "InteractionScriptId")
    Long InteractionScriptId;
}
