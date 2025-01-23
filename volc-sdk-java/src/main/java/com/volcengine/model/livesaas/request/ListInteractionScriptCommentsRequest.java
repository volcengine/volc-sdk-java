package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class ListInteractionScriptCommentsRequest {
    @JSONField(name = "InteractionScriptId")
    Long InteractionScriptId;
    @JSONField(name = "PageNumber")
    Integer PageNumber;
    @JSONField(name = "PageSize")
    Integer PageSize;
    @JSONField(name = "SendTime")
    Integer SendTime;
    @JSONField(name = "CommentId")
    Integer CommentId;
}
