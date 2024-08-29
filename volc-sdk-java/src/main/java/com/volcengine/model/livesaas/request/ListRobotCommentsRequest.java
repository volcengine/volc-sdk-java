package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListRobotCommentsRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "CommentContent")
    String CommentContent;
    @JSONField(name = "PageNumber")
    Integer PageNumber;
    @JSONField(name = "PageSize")
    Integer PageSize;
}
