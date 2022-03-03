package com.volcengine.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class ListDomainDetailResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    ListDomainDetailOutput result;


    @Data
    public static class ListDomainDetailOutput {

        @JSONField(name = "DomainList")
        DomainInfo[] domainList;
        @JSONField(name = "Total")
        Long Total;
    }

    @Data
    public static class DomainInfo {
        @JSONField(name = "Vhost")
        String vhost;
        @JSONField(name = "Domain")
        String domain;
        @JSONField(name = "Type")
        String type;
        @JSONField(name = "Region")
        String region;
        @JSONField(name = "Status")
        Long status;
        @JSONField(name = "CName")
        String cname;
        @JSONField(name = "ChainID")
        String chainID;
        @JSONField(name = "CertDomain")
        String certDomain;
        @JSONField(name = "CnameCheck")
        Long cnameCheck;
        @JSONField(name = "DomainCheck")
        Long domainCheck;
        @JSONField(name = "ICPCheck")
        Long ICPCheck;
        @JSONField(name = "CreateTime")
        String createTime;
        @JSONField(name = "CertName")
        String certName;
        @JSONField(name = "PushDomain")
        String pushDomain;
    }
}
