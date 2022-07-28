package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.cms.Article;
import com.volcengine.model.beans.cms.BaseResp;
import lombok.Data;

import java.util.List;

@Data
public class ArticleRelatedFeedResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "BaseResp")
    BaseResp baseResp;
    @JSONField(name = "Data")
    RelatedFeedResult data;

    @Data
    public static class RelatedFeedResult {
        @JSONField(name = "ArticleList")
        List<Article> ArticleList;
    }
}
