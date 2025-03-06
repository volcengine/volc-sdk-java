package com.volcengine.model.sms;

import com.alibaba.fastjson.annotation.JSONField;

public enum DocType {
    ThreeInOne(0, "三证合一"),
    BusinessLicense(1, "企业营业执照"),
    OrganizationCodeCertificate(2, "组织机构代码证"),
    TaxRegistrationCertificate(3, "税务登记证"),
    SocialCreditCodeCertificate(4, "社会信用代码证书"),
    PowerOfAttorney(5, "授权委托书"),
    Others(6, "其他/更多"),
    InstitutionLegalPersonCertificate(7,"事业单位法人证书"),
    RepresentativeIDCardFront(8,"经办人身份证人像面"),
    RepresentativeIDCardBack(9,"经办人身份证国徽面"),
    ResponsiblePersonIDCardFront(10,"责任人身份证人像面"),
    ResponsiblePersonIDCardBack(11,"责任人身份证国徽面"),
    PassportCard(12,"护照照片"),
    HKMPassportCard(13,"港澳居民来往内地通行证照片"),
    TWPassportCard(14,"台湾居民来往大陆通行证照片"),
    HMTResidenceCard(15,"港澳台居民居住证照片");

    private int code;

    private String desc;

    private DocType(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    @JSONField
    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
