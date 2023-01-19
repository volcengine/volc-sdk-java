package com.volcengine.service.live.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class GeneratePlayURLRequest {

    @JSONField(name = "Vhost")
    private String Vhost;

    @JSONField(name = "Domain")
    private String Domain;

    @JSONField(name = "App")
    private String App;

    @JSONField(name = "Stream")
    private String Stream;

    @JSONField(name = "Suffix")
    private String Suffix;

    @JSONField(name = "Type")
    private String Type;

    @JSONField(name = "ValidDuration")
    private Long ValidDuration;

    @JSONField(name = "ExpiredTime")
    private String ExpiredTime;

}
