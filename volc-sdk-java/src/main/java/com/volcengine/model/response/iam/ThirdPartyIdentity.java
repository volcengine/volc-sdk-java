package com.volcengine.model.response.iam;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ThirdPartyIdentity {
    @JSONField(name = "Personal")
    List<Personal> personals;

    @JSONField(name = "Enterprise")
    List<Enterprise> enterprises;

    @Data
    public static class Personal {
        @JSONField(name = "IDPType")
        String iDPType;
        @JSONField(name = "ThirdPartyIdentityID")
        String thirdPartyIdentityID;
        @JSONField(name = "ThirdPartyIdentityName")
        String thirdPartyIdentityName;
        @JSONField(name = "ThirdPartyIdentityExtra")
        String thirdPartyIdentityExtra;
    }

    @Data
    public static class Enterprise {
        @JSONField(name = "IDPType")
        String iDPType;
        @JSONField(name = "EnterpriseID")
        String enterpriseID;
        @JSONField(name = "EnterpriseName")
        String enterpriseName;
        @JSONField(name = "ThirdPartyIdentityID")
        String thirdPartyIdentityID;
        @JSONField(name = "ThirdPartyIdentityName")
        String thirdPartyIdentityName;
    }
}
