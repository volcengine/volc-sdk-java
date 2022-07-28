package com.volcengine.example.cms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.ArticleSearchRequest;
import com.volcengine.model.response.ArticleSearchResponse;
import com.volcengine.service.cms.CmsApiService;
import com.volcengine.service.cms.impl.CmsApiServiceImpl;

public class SearchDemo {
    public static void main(String[] args) {
        CmsApiService apiService = CmsApiServiceImpl.getInstance();

        // call below method if you don't set ak and sk in ～/.volc/config
        apiService.setAccessKey("ak");
        apiService.setSecretKey("sk");

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
