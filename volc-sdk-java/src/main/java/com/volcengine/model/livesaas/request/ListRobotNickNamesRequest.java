package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListRobotNickNamesRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "NameContent")
    String NameContent;
    @JSONField(name = "PageNumber")
    Integer PageNumber;
    @JSONField(name = "PageSize")
    Integer PageSize;
    @JSONField(name = "RobotCommentRepositoryId")
    Long RobotCommentRepositoryId;
}
