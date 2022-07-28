package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.cms.Article;
import com.volcengine.model.beans.cms.BaseResp;
import lombok.Data;

import java.util.List;

@Data
public class ArticleGetGoodsRelatedResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "BaseResp")
    BaseResp baseResp;
    @JSONField(name = "Data")
    RelatedResult data;

    @Data
    public static class RelatedResult {
        @JSONField(name = "Total")
        Long total; // 文章数
        @JSONField(name = "Cursor")
        String cursor; // 内容锚点
        @JSONField(name = "Articles")
        List<Article> articles;
    }
}
