package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.RobotCommentInfo;
import lombok.Data;

import java.util.List;

@Data
public class BatchSendActivityRobotCommentRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "RobotCommentInfos")
    List<RobotCommentInfo> RobotCommentInfos;
    @JSONField(name = "AudienceGroupId")
    Long AudienceGroupId;
}