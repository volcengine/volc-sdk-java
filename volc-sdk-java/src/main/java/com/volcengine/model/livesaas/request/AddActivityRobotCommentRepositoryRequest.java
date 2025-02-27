package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.AddRobotCommentConfigModel;
import lombok.Data;

@Data
public class AddActivityRobotCommentRepositoryRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "RobotCommentConfig")
    AddRobotCommentConfigModel RobotCommentConfig;
}

