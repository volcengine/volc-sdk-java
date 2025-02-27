package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UpdateRobotCommentRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "RobotCommentId")
    Long RobotCommentId;
    @JSONField(name = "RobotCommentContent")
    String RobotCommentContent;
}
