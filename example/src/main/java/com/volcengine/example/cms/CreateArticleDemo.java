package com.volcengine.example.cms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.ArticleCreateRequest;
import com.volcengine.model.response.ArticleCreateResponse;
import com.volcengine.service.cms.CmsPlatformService;
import com.volcengine.service.cms.impl.CmsPlatformServiceImpl;

import java.util.Collections;

public class CreateArticleDemo {

    public static void main(String[] args) {
        CmsPlatformService articleService = CmsPlatformServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.volc/config
        articleService.setAccessKey("ak");
        articleService.setSecretKey("sk");

        ArticleCreateRequest request = new ArticleCreateRequest();
        request.setArticles(Collections.singletonList(createRequest()));
        try {
            ArticleCreateResponse response = articleService.batchCreateSourceArticle(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static ArticleCreateRequest.ArticleModel createRequest() {
        ArticleCreateRequest.ArticleModel article = new ArticleCreateRequest.ArticleModel();
        article.setTitle("SDK测试用例-Title");
        article.setArticleAbstract("SDK测试用例-摘要");
        article.setContent("<p>SDK测试用例-正文</p>");
        article.setGroupType("article");
        article.setGroupSource("api");
        article.setGenerateType("SDK测试");
        article.setSourceName("SDK测试");
        article.setOpenId("");
        article.setPublishTime(System.currentTimeMillis() / 1000);
        // set author
        ArticleCreateRequest.ArticleAuthorModel author = new ArticleCreateRequest.ArticleAuthorModel();
        author.setAuthorName("SDK测试");
        article.setAuthor(author);
        return article;
    }
}
