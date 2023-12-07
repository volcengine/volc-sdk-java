package com.volcengine.service.vikingDB.common;

import lombok.Data;

@Data
public class Text {
    private String text = null;
    private String url = null;
    private String base64 = null;
    public Text setText(String text) {
        this.text = text;
        return this;
    }
    public Text setUrl(String url) {
        this.url = url;
        return this;
    }
    public Text setBase64(String base64) {
        this.base64 = base64;
        return this;
    }
    public Text build(){
        return this;
    }

}
