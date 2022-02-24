package com.volcengine.model.stream.log;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class MultiShowLogRequest {
    @JSONField(name = "Timestamp")
    long timestamp;
    @JSONField(name = "Partner")
    String partner;
    @JSONField(name = "AccessToken")
    String accessToken;
    @JSONField(name = "Body")
    List<Body> body;

    @Data
    public static class Body {
        @JSONField(name = "GroupId")
        String groupId;
        @JSONField(name = "Category")
        String category;
        @JSONField(name = "EventTime")
        long eventTime;
        @JSONField(name = "FromGid")
        String fromGid;
        @JSONField(name = "Dt")
        String dt;
        @JSONField(name = "Os")
        String os;
        @JSONField(name = "OsVersion")
        String osVersion;
        @JSONField(name = "ClientVersion")
        String clientVersion;
        @JSONField(name = "DeviceBrand")
        String deviceBrand;
    }
}
