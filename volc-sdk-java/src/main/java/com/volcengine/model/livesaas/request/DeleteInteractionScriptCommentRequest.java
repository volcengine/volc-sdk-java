package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class DeleteInteractionScriptCommentRequest {
    @JSONField(name = "InteractionScriptId")
    Long InteractionScriptId;
    @JSONField(name = "CommentId")
    Integer CommentId;
}
