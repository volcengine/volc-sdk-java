package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class SendActivityRobotCommentRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "Comment")
    String Comment;
    @JSONField(name = "Nickname")
    String Nickname;
    @JSONField(name = "AudienceGroupId")
    Long AudienceGroupId;
}