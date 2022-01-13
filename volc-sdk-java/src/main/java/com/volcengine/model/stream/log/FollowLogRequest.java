package com.volcengine.model.stream.log;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class FollowLogRequest {
    @JSONField(name = "Timestamp")
    long timestamp;
    @JSONField(name = "Partner")
    String partner;
    @JSONField(name = "AccessToken")
    String accessToken;
    @JSONField(name = "Ouid")
    String ouid;
    @JSONField(name = "Body")
    Body body;

    @Data
    public static class Body {
        @JSONField(name = "to_user_id")
        String toUserId;
        @JSONField(name = "group_id")
        String groupId;
        @JSONField(name = "profile_user_id")
        String profileUserId;
        @JSONField(name = "category_name")
        String categoryName;
        @JSONField(name = "source")
        String source;
    }
}
