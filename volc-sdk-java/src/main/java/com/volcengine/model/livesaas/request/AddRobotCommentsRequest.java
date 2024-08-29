package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class AddRobotCommentsRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "RobotCommentContents")
    List<String> RobotCommentContents;
}
