package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.cms.Article;
import com.volcengine.model.beans.cms.BaseResp;
import lombok.Data;

import java.util.List;

@Data
public class ArticleSearchResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "BaseResp")
    BaseResp baseResp;
    @JSONField(name = "Data")
    SearchResult Data;

    @Data
    public static class SearchResult {
        @JSONField(name = "ArticleList")
        List<SearchArticle> articleList;
        @JSONField(name = "Total")
        Long total; // 总数
        @JSONField(name = "HasMore")
        Boolean hasMore; // 是否有更多内容
        @JSONField(name = "Offset")
        Long offset; // 内容量锚点
        @JSONField(name = "Keyword")
        String keyword; // 搜索关键词
        @JSONField(name = "FixQuery")
        String fixQuery; // 纠错词/改写词
    }

    @Data
    public static class SearchArticle {
        @JSONField(name = "Article")
        Article article; // 文章内容
        @JSONField(name = "DisplayTitle")
        String displayTitle; // 带高亮的标题
        @JSONField(name = "DisplaySummary")
        String displaySummary; // 带高亮的摘要
    }
}
