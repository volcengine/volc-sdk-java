package com.volcengine.model.sms;

import com.alibaba.fastjson.annotation.JSONField;

public enum DocType {
    ThreeInOne(0,"三证合一"),
    BusinessLicense(1,"企业营业执照"),
    OrganizationCodeCertificate(2,"组织机构代码证"),
    TaxRegistrationCertificate(3,"税务登记证"),
    SocialCreditCodeCertificate(4,"社会信用代码证书"),
    PowerOfAttorney(5,"授权委托书"),
    Others(6,"其他/更多");

    private  int code;

    private  String desc;

    private DocType(int code,String desc){
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
