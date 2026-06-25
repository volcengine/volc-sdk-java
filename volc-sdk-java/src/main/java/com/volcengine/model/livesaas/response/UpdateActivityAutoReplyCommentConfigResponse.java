package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.ReplyCommentMeta;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class UpdateActivityAutoReplyCommentConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    AutoReplyCommentConfigResult result;

    @Data
    public static class AutoReplyCommentConfigResult {
        @JSONField(name = "IsAutoReplyEnable")
        Integer IsAutoReplyEnable;
        @JSONField(name = "AutoReplyCommentOpName")
        String AutoReplyCommentOpName;
        @JSONField(name = "AutoReplyCommentOpAvatar")
        String AutoReplyCommentOpAvatar;
        @JSONField(name = "ReplyCommentMetas")
        List<ReplyCommentMeta> ReplyCommentMetas;
    }
}
