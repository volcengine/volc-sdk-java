package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.RobotCommentConfig;
import lombok.Data;

@Data
public class UpdateActivityRobotCommentConfigRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "RobotCommentConfig")
    RobotCommentConfig RobotCommentConfig;
}

