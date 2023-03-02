package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ServiceDomainDataItem {
    @JSONField(name = "ServiceId")
    private String serviceId;
    @JSONField(name = "DomainName")
    private String domainName;
    @JSONField(name = "Data")
    private List<TSFloatItem> data;
}
