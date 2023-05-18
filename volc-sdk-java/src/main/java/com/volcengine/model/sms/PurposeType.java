package com.volcengine.model.sms;

import com.alibaba.fastjson.annotation.JSONField;

public enum PurposeType {
    SignPurposeForOwn(1,"自用"),
    SignPurposeForOther(2,"他用");
    private int code;
    private String desc;

    PurposeType(int code,String desc){
        this.code = code;
        this.desc = desc;
    }

    @JSONField
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
