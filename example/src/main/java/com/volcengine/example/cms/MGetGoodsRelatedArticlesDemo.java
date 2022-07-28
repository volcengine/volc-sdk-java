package com.volcengine.example.cms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.ArticleMGetGoodsRelatedRequest;
import com.volcengine.model.response.ArticleMGetGoodsRelatedResponse;
import com.volcengine.service.cms.CmsApiService;
import com.volcengine.service.cms.impl.CmsApiServiceImpl;

import java.util.Arrays;

public class MGetGoodsRelatedArticlesDemo {

    public static void main(String[] args) {
        CmsApiService apiService = CmsApiServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.volc/config
        apiService.setAccessKey("ak");
        apiService.setSecretKey("sk");

        ArticleMGetGoodsRelatedRequest request = new ArticleMGetGoodsRelatedRequest();
        // set goodsIds
        request.setGoodsIds(Arrays.asList("111", "222"));
        try {
            ArticleMGetGoodsRelatedResponse response = apiService.mGetGoodsRelatedArticles(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
