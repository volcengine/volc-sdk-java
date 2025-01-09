package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.livesaas.response.ListAreaConfigResponse;
import lombok.Data;

import java.util.List;

@Data
public class Area {
    @JSONField(name = "AreaId")
    String AreaId;
    @JSONField(name = "LBStrategy")
    String LBStrategy;
    @JSONField(name = "AreaIp")
    Ip AreaIp;
    @JSONField(name = "AreaName")
    String AreaName;
    @JSONField(name = "EnableExtranetUrl")
    Boolean EnableExtranetUrl;
    @JSONField(name = "EnableOfficeList")
    List<String> EnableOfficeList;
    @JSONField(name = "EnableStreamRouterList")
    List<String> EnableStreamRouterList;
    @JSONField(name = "CreateTime")
    Long CreateTime;
}
