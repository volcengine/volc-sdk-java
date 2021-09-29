package com.volcengine.example.cms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.ArticleDeleteRequest;
import com.volcengine.model.response.ArticleDeleteResponse;
import com.volcengine.service.cms.CmsPlatformService;
import com.volcengine.service.cms.impl.CmsPlatformServiceImpl;

public class DeleteArticleDemo {
    public static void main(String[] args) {
        CmsPlatformService service = CmsPlatformServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        ArticleDeleteRequest request = new ArticleDeleteRequest();
        // set article id here
        request.setId("");
        try {
            ArticleDeleteResponse response = service.deleteSourceArticle(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
