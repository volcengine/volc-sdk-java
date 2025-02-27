package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UpdateRobotNickNameRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "RobotNameId")
    Long RobotNameId;
    @JSONField(name = "RobotNameContent")
    String RobotNameContent;
}
