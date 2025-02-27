package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class AddRobotCommentConfigModel {
    @JSONField(name = "IsRobotEnable")
    Integer IsRobotEnable;
    @JSONField(name = "RobotSendUnit")
    Long RobotSendUnit;
    @JSONField(name = "RobotSendNum")
    Long RobotSendNum;
    @JSONField(name = "RobotCommentRepositoryName")
    String RobotCommentRepositoryName;
}
