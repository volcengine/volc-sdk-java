package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.ReplyCommentMeta;
import lombok.Data;

import java.util.List;

@Data
public class UpdateActivityAutoReplyCommentConfigRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "IsAutoReplyEnable")
    Integer IsAutoReplyEnable;
    @JSONField(name = "AutoReplyCommentOpName")
    String AutoReplyCommentOpName;
    @JSONField(name = "AutoReplyCommentOpAvatar")
    String AutoReplyCommentOpAvatar;
    @JSONField(name = "ReplyCommentMetas")
    List<ReplyCommentMeta> ReplyCommentMetas;
}
