package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.sms.SignAuthFile;
import lombok.Data;

import java.util.List;

@Data
public class ApplySignatureIdentRequest {
    @JSONField(name = "id")
    long id;

    @JSONField(name = "purpose")
    int purpose;


    @JSONField(name = "materialName")
    String materialName;

    @JSONField(name = "businessInfo")
    BusinessInfo businessInfo;

    @JSONField(name = "operatorPerson")
    PersonInfo operatorPersonInfo;

    @JSONField(name = "responsiblePersonInfo")
    PersonInfo responsiblePersonInfo;


    @JSONField(name = "powerOfAttorney")
    List<SignAuthFile> powerOfAttorney;

    @JSONField(name = "otherMaterials")
    List<SignAuthFile> otherMaterials;


    @JSONField(name = "effectSignatures")
    List<String> effectSignatures;

    @JSONField(name = "businessCheckTicket")
    String businessCheckTicket;

    @JSONField(name = "operatorCheckTicket")
    String operatorCheckTicket;

    @JSONField(name = "responsibleCheckTicket")
    String responsibleCheckTicket;

    @JSONField(name = "from")
    String from;

    @JSONField(name = "copyNew")
    boolean copyNew;

    @Data
    public static class BusinessInfo {
        @JSONField(name = "businessCertificateType")
        int businessCertificateType;

        @JSONField(name = "businessCertificate")
        SignAuthFile businessCertificate;

        @JSONField(name = "businessCertificateName")
        String businessCertificateName;

        @JSONField(name = "unifiedSocialCreditIdentifier")
        String unifiedSocialCreditIdentifier;

        @JSONField(name = "businessCertificateValidityPeriodStart")
        String businessCertificateValidityPeriodStart;

        @JSONField(name = "businessCertificateValidityPeriodEnd")
        String businessCertificateValidityPeriodEnd;

        @JSONField(name = "legalPersonName")
        String legalPersonName;
    }

    @Data
    public static class PersonInfo {
        @JSONField(name = "certificateType")
        int certificateType;

        @JSONField(name = "personCertificate")
        List<SignAuthFile> personCertificate;

        @JSONField(name = "personName")
        String personName;

        @JSONField(name = "personIDCard")
        String personIDCard;

        @JSONField(name = "personMobile")
        String personMobile;
    }


}
