package com.volcengine.example.cms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.ArticleUploadDetailRequest;
import com.volcengine.model.response.ArticleUploadDetailResponse;
import com.volcengine.service.cms.CmsPlatformService;
import com.volcengine.service.cms.impl.CmsPlatformServiceImpl;

public class GetArticleUploadDetailDemo {
    public static void main(String[] args) {
        CmsPlatformService articleService = CmsPlatformServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.volc/config
        articleService.setAccessKey("ak");
        articleService.setSecretKey("sk");

        ArticleUploadDetailRequest request = new ArticleUploadDetailRequest();
        // set batchId
        request.setBatchId("");
        try {
            ArticleUploadDetailResponse response = articleService.getArticleBatchUploadDetail(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
