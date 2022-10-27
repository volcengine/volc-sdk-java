package com.volcengine.model.stream.consumer;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.stream.CommonPo;
import lombok.Data;

import java.util.List;

@Data
public class MultiArticlesResponse {
    @JSONField(name = "ResponseMetadata")
    CommonPo.ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    Result result;

    @Data
    public static class Result {
        List<SingleArticleResponse.Result> articleInfos;
    }
}
