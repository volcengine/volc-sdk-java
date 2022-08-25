package com.volcengine.model.stream.log;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class DislikeLogRequest {
    @JSONField(name = "Timestamp")
    long timestamp;
    @JSONField(name = "Partner")
    String partner;
    @JSONField(name = "Ouid")
    String ouid;
    @JSONField(name = "AccessToken")
    String accessToken;
    @JSONField(name = "Body")
    List<Body> body;

    @Data
    public static class Body {
        @JSONField(name = "Category")
        String category;
        @JSONField(name = "GroupId")
        String groupId;
        @JSONField(name = "Timestamp")
        long timestamp;
        @JSONField(name = "FilterWords")
        List<String> filterWords;
        @JSONField(name = "ReqId")
        String reqId;
    }
}
