package com.volcengine.example.cms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.ArticleGetGoodsRelatedRequest;
import com.volcengine.model.response.ArticleGetGoodsRelatedResponse;
import com.volcengine.service.cms.CmsApiService;

public class GetGoodsRelatedArticlesDemo {

    public static void main(String[] args) {
        CmsApiService apiService = Instance.getApiInstance();

        ArticleGetGoodsRelatedRequest request = new ArticleGetGoodsRelatedRequest();
        // set goodsId
        request.setGoodsId("111");
        try {
            ArticleGetGoodsRelatedResponse response = apiService.getGoodsRelatedArticles(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
