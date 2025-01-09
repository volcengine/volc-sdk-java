package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class Office {
    @JSONField(name = "OfficeId")
    String OfficeId;
    @JSONField(name = "LBStrategy")
    String LBStrategy;
    @JSONField(name = "OfficeIp")
    Ip OfficeIp;
    @JSONField(name = "OfficeName")
    String OfficeName;
    @JSONField(name = "RecommendedSize")
    String RecommendedSize;
    @JSONField(name = "EnableExtranetUrl")
    Boolean EnableExtranetUrl;
    @JSONField(name = "AllowedSize")
    List<String> AllowedSize;
    @JSONField(name = "OfficeStatus")
    String OfficeStatus;
    @JSONField(name = "AreaId")
    String AreaId;
    @JSONField(name = "CreateTime")
    Long CreateTime;
}
