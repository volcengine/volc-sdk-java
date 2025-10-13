package com.volcengine.model.response.sms;


import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetTobTrafficDrivingLinkListResponse {

    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetTobTrafficDrivingLinkListResponse.ResultBean result;

    @Data
    public static class ResultBean {
        @JSONField(name = "list")
        List<GetTobTrafficDrivingLinkListResponse.TobTrafficDrivingLinkJson> list;
        @JSONField(name = "total")
        Integer total;
    }

    @Data
    public static class TobTrafficDrivingLinkJson {
        @JSONField(name = "account")
        private String account;

        @JSONField(name = "useVolcLink")
        private Boolean useVolcLink;

        @JSONField(name = "protocol")
        private String protocol;

        @JSONField(name = "link")
        private String link;

        @JSONField(name = "linkDomainIcp")
        private String linkDomainIcp;

        @JSONField(name = "linkDomainIcpBody")
        private String linkDomainIcpBody;

        @JSONField(name = "linkDomain")
        private String linkDomain;

        @JSONField(name = "linkPath")
        private String linkPath;

        @JSONField(name = "jumpLink")
        private String jumpLink;

        @JSONField(name = "jumpLinkDomain")
        private String jumpLinkDomain;

        @JSONField(name = "jumpLinkPath")
        private String jumpLinkPath;

        @JSONField(name = "jumpLinkDomainIcp")
        private String jumpLinkDomainIcp;

        @JSONField(name = "jumpLinkDomainIcpBody")
        private String jumpLinkDomainIcpBody;

        @JSONField(name = "createdAt")
        private Long createdAt;

        @JSONField(name = "updatedAt")
        private Long updatedAt;
    }
}
