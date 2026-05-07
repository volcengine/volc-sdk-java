package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.QuickCommentContentBody;

import java.util.List;

import lombok.Data;

@Data
public class UpdateQuickCommentContentRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;

    @JSONField(name = "QuickComments")
    List<String> QuickComments;
}
