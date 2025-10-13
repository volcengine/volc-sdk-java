package com.volcengine.model.request.sms;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class BulkCreateTobTrafficDrivingLinkRequest {
    @JSONField(name = "data")
    private List<BulkCreateTobTrafficDrivingLinkReqItem> data;

    @Data
    public static class BulkCreateTobTrafficDrivingLinkReqItem {
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

        @JSONField(name = "jumpLink")
        private String jumpLink;

        @JSONField(name = "jumpLinkDomainIcp")
        private String jumpLinkDomainIcp;

        @JSONField(name = "jumpLinkDomainIcpBody")
        private String jumpLinkDomainIcpBody;
    }
}
