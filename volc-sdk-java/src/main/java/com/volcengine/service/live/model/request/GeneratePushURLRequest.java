package com.volcengine.service.live.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GeneratePushURLRequest {

    @JSONField(name = "Vhost")
    private String Vhost;

    @JSONField(name = "Domain")
    private String Domain;

    @JSONField(name = "App")
    private String App;

    @JSONField(name = "Stream")
    private String Stream;

    @JSONField(name = "ValidDuration")
    private Long ValidDuration;

    @JSONField(name = "ExpiredTime")
    private String ExpiredTime;

}
