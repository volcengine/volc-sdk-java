package com.volcengine.model.stream.consumer;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.stream.CommonPo;
import com.volcengine.model.stream.CommonPoV2;
import lombok.Data;

import java.util.List;

@Data
public class MultiArticlesResponseV2 {
    @JSONField(name = "ResponseMetadata")
    CommonPoV2.ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    Result result;

    @Data
    public static class Result {
        List<SingleArticleResponseV2.Result> articleInfos;
    }
}
