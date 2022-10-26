package com.volcengine.example.cms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.ArticleUploadDetailRequest;
import com.volcengine.model.response.ArticleUploadDetailResponse;
import com.volcengine.service.cms.CmsPlatformService;

public class GetArticleUploadDetailDemo {
    public static void main(String[] args) {
        CmsPlatformService articleService = Instance.getPlatformInstance();

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
