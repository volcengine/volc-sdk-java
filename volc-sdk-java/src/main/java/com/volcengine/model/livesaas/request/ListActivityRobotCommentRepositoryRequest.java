package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ListActivityRobotCommentRepositoryRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
}
