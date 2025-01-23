package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;
import com.volcengine.model.beans.livesaas.InteractionScriptComment;

import java.util.List;
import java.util.Map;

@Data
public class ListInteractionScriptCommentsResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListInteractionScriptCommentsResponseBody result;

    @Data
    public static class ListInteractionScriptCommentsResponseBody {
        @JSONField(name = "PageNumber")
        Integer PageNumber;
        @JSONField(name = "PageSize")
        Integer PageSize;
        @JSONField(name = "TotalAmount")
        Integer TotalAmount;
        @JSONField(name = "Comments")
        List<InteractionScriptComment> Comments;
    }
}
