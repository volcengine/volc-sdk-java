package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.InteractionScriptComment;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class EditInteractionScriptCommentRequest {
    @JSONField(name = "InteractionScriptId")
    Long InteractionScriptId;
    @JSONField(name = "Comment")
    InteractionScriptComment Comment;
}
