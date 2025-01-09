package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.Ip;
import lombok.Data;

@Data
public class DeleteAreaConfigRequest {
    @JSONField(name = "AreaId")
    String AreaId;
}
