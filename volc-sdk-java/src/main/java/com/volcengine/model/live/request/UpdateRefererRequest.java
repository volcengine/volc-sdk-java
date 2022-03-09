package com.volcengine.model.live.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UpdateRefererRequest {

    @JSONField(name = "Vhost")
    String vhost;
    @JSONField(name = "Domain")
    String domain;
    @JSONField(name = "App")
    String app;
    @JSONField(name = "RefererInfoList")
    RefererInfo[] refererInfoList;

    @Data
    public static class RefererInfo {
        @JSONField(name = "Type")
        String type;
        @JSONField(name = "Key")
        String key;
        @JSONField(name = "Value")
        String value;
        @JSONField(name = "Priority")
        Long priority;
    }
}
