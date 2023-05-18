package com.volcengine.model.sms;


import com.alibaba.fastjson.annotation.JSONField;

public enum SignSourceType {
    SignSourceTypeCompany("公司全称/简称"),
    SignSourceTypeSite("工信部备案网站全称/简称"),
    SignSourceTypeApp("APP全称/简称"),
    SignSourceTypeOfficialAccounts("公众号、小程序全称/简称"),
    SignSourceTypeBrand("商标全称/简称"),
    SignSourceTypeStore("电商平台店铺名的全称/简称");
    private String name;

    SignSourceType(String name) {
        this.name = name;
    }

    @JSONField
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
