package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.Ip;
import lombok.Data;

import java.util.List;

@Data
public class CreateAreaConfigRequest {
    @JSONField(name = "LBStrategy")
    String LBStrategy;
    @JSONField(name = "AreaIp")
    Ip AreaIp;
    @JSONField(name = "AreaName")
    String AreaName;
    @JSONField(name = "EnableExtranetUrl")
    Boolean EnableExtranetUrl;
}
