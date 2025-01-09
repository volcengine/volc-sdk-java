package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.Ip;
import lombok.Data;

import java.util.List;

@Data
public class CreateOfficeConfigRequest {
    @JSONField(name = "RecommendedSize")
    String RecommendedSize;
    @JSONField(name = "AllowedSize")
    List<String> AllowedSize;
    @JSONField(name = "LBStrategy")
    String LBStrategy;
    @JSONField(name = "OfficeIp")
    Ip OfficeIp;
    @JSONField(name = "AreaId")
    String AreaId;
    @JSONField(name = "OfficeName")
    String OfficeName;
    @JSONField(name = "EnableExtranetUrl")
    Boolean EnableExtranetUrl;
}
