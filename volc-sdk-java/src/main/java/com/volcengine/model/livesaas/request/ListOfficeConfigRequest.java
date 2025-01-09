package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListOfficeConfigRequest {
    @JSONField(name = "OfficeName")
    String OfficeName;
    @JSONField(name = "AreaId")
    String AreaId;
    @JSONField(name = "OfficeId")
    String OfficeId;
    @JSONField(name = "OfficeStatus")
    String OfficeStatus;
    @JSONField(name = "PageNumber")
    Integer PageNumber;
    @JSONField(name = "PageSize")
    Integer PageSize;
}