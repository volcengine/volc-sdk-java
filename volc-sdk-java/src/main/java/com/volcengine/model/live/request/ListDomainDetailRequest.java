package com.volcengine.model.live.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListDomainDetailRequest {
    @JSONField(name = "AccountIDList")
    String[] accountIDList;
    @JSONField(name = "VhostList")
    String[] vhostList;
    @JSONField(name = "DomainTypeList")
    String[] domainTypeList;
    @JSONField(name = "DomainStatusList")
    Long[] domainStatusList;
    @JSONField(name = "DomainRegionList")
    String[] domainRegionList;
    @JSONField(name = "DomainNameList")
    String[] domainNameList;
    @JSONField(name = "CnameNameList")
    String[] cnameNameList;
    @JSONField(name = "ListType")
    String listType;

}
