package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ReplyCommentMeta {
    @JSONField(name = "TriggerReplyKeyword")
    String TriggerReplyKeyword;
    @JSONField(name = "ReplyCommentContent")
    String ReplyCommentContent;
}
