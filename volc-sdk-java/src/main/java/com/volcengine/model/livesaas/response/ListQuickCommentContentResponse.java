package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import java.util.List;
import lombok.Data;

@Data
public class ListQuickCommentContentResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    ListQuickCommentContentResponseBody result;

    @Data
    public static class ListQuickCommentContentResponseBody {
        @JSONField(name = "QuickComments")
        List<String> QuickComments;
    }
}
