package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class RobotCommentConfig {
    @JSONField(name = "IsRobotEnable")
    Integer IsRobotEnable;
    @JSONField(name = "RobotSendUnit")
    Long RobotSendUnit;
    @JSONField(name = "RobotSendNum")
    Long RobotSendNum;
    @JSONField(name = "RobotCommentRepositoryId")
    Long RobotCommentRepositoryId;
    @JSONField(name = "RobotCommentRepositoryName")
    String RobotCommentRepositoryName;
}
