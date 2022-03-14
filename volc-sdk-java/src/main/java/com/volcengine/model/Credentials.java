package com.volcengine.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class Credentials {

    @JSONField(name = "ak")
    private String accessKeyID;
    @JSONField(name = "sk")
    private String secretAccessKey;
    private String service;
    private String region;
    private String sessionToken;

    public Credentials() {
    }

    public Credentials(String region, String service) {
        this.region = region;
        this.service = service;
    }
}
