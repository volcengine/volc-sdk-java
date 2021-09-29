package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ArticleCreateResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ArticleCreateResult result;

    @Data
    public static class ArticleCreateResult {
        @JSONField(name = "BatchId")
        String batchId;
    }
}
