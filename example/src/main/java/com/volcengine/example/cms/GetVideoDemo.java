package com.volcengine.example.cms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.ArticleGetVideoRequest;
import com.volcengine.model.response.ArticleGetVideoResponse;
import com.volcengine.service.cms.CmsApiService;
import com.volcengine.service.cms.impl.CmsApiServiceImpl;

public class GetVideoDemo {
    public static void main(String[] args) {
        CmsApiService apiService = CmsApiServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.volc/config
        apiService.setAccessKey("ak");
        apiService.setSecretKey("sk");

        ArticleGetVideoRequest request = new ArticleGetVideoRequest();
        // set group id here
        request.setGroupId(0L);
        // set vid here
        request.setVid("");

        try {
            ArticleGetVideoResponse response = apiService.getVideoByVid(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
