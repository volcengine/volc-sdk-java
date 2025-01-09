package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListAreaConfigRequest {
    @JSONField(name = "AreaName")
    String AreaName;
    @JSONField(name = "AreaId")
    String AreaId;
    @JSONField(name = "PageNumber")
    Integer PageNumber;
    @JSONField(name = "PageSize")
    Integer PageSize;
}