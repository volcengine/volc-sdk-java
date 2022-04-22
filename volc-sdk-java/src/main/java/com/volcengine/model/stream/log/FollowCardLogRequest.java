package com.volcengine.model.stream.log;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class FollowCardLogRequest {
    @JSONField(name = "Timestamp")
    long timestamp;
    @JSONField(name = "Partner")
    String partner;
    @JSONField(name = "AccessToken")
    String accessToken;
    @JSONField(name = "Ouid")
    String ouid;
    @JSONField(name = "Body")
    List<Body> body;

    @Data
    public static class Body {
        @JSONField(name = "to_user_id")
        String toUserId;
        @JSONField(name = "follow_type")
        String followType;
        @JSONField(name = "profile_user_id")
        String profileUserId;
        @JSONField(name = "category_name")
        String categoryName;
        @JSONField(name = "source")
        String source;
        @JSONField(name = "action_type")
        String actionType;
        @JSONField(name = "order")
        int order;
    }
}
