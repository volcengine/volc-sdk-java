package com.volcengine.example.cms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.ArticleFeedRequest;
import com.volcengine.model.response.ArticleFeedResponse;
import com.volcengine.service.cms.CmsApiService;

public class FeedDemo {
    public static void main(String[] args) {
        CmsApiService apiService = Instance.getApiInstance();

        ArticleFeedRequest request = new ArticleFeedRequest();
        request.setUniqUserId("");
        // set category here
        request.setCategory("");
        request.setPersonalRec(1);

        ArticleFeedRequest.Context context = new ArticleFeedRequest.Context();
        context.setIp("");
        context.setProvince("浙江");
        context.setRefreshType("open");

        request.setContext(context);

        try {
            ArticleFeedResponse response = apiService.feed(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
