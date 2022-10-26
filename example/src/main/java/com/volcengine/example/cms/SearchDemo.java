package com.volcengine.example.cms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.ArticleSearchRequest;
import com.volcengine.model.response.ArticleSearchResponse;
import com.volcengine.service.cms.CmsApiService;

public class SearchDemo {
    public static void main(String[] args) {
        CmsApiService apiService = Instance.getApiInstance();

        ArticleSearchRequest request = new ArticleSearchRequest();
        request.setUniqUserId("");
        // set category here
        request.setCategory("");
        request.setKeyword("11");
        try {
            ArticleSearchResponse response = apiService.articleSearch(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
