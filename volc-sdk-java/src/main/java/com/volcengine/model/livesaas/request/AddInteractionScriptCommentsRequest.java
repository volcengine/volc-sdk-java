package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.InteractionScriptComment;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class AddInteractionScriptCommentsRequest {
    @JSONField(name = "InteractionScriptId")
    Long InteractionScriptId;
    @JSONField(name = "Comments")
    List<InteractionScriptComment> Comments;
}
