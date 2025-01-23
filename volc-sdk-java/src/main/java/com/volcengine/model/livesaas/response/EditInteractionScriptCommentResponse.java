package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class EditInteractionScriptCommentResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    EditInteractionScriptCommentResponseBody result;

    @Data
    public static class EditInteractionScriptCommentResponseBody {
    }
}
