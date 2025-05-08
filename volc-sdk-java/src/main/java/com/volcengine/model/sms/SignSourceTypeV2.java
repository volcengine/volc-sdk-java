package com.volcengine.model.sms;

import com.alibaba.fastjson.annotation.JSONField;

public enum SignSourceTypeV2 {
    SignSourceTypeCompany(1, "公司全称/简称"),
    SignSourceTypeApp(2, "APP全称/简称"),
    SignSourceTypeBrand(3, "商标全称/简称");

    final int sourceType;

    final String desc;

    SignSourceTypeV2(int sourceType, String desc) {
        this.sourceType = sourceType;
        this.desc = desc;
    }

    @JSONField
    public int getSourceType() {
        return sourceType;
    }

}
