package com.volcengine.example.cms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.beans.cms.Context;
import com.volcengine.model.request.ArticleRelatedFeedRequest;
import com.volcengine.model.response.ArticleRelatedFeedResponse;
import com.volcengine.service.cms.CmsApiService;
import com.volcengine.service.cms.impl.CmsApiServiceImpl;

public class RelatedFeedDemo {
    public static void main(String[] args) {
        CmsApiService apiService = CmsApiServiceImpl.getInstance();

        // call below method if you don't set ak and sk in ～/.volc/config
        apiService.setAccessKey("ak");
        apiService.setSecretKey("sk");

        ArticleRelatedFeedRequest request = new ArticleRelatedFeedRequest();

        request.setUniqUserId("");
        // set category here
        request.setCategory("");
        request.setRelatedBizId("");

        Context context = new Context();
        context.setIp("");
        context.setProvince("");

        request.setContext(context);

        try {
            ArticleRelatedFeedResponse response = apiService.relatedFeed(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
