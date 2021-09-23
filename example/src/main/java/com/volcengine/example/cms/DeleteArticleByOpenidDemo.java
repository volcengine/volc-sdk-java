package com.volcengine.example.cms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.ArticleDeleteByOpenidRequest;
import com.volcengine.model.response.ArticleDeleteByOpenidResponse;
import com.volcengine.service.cms.CmsPlatformService;
import com.volcengine.service.cms.impl.CmsPlatformServiceImpl;

public class DeleteArticleByOpenidDemo {
    public static void main(String[] args) {
        CmsPlatformService service = CmsPlatformServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.vcloud/config
        service.setAccessKey("");
        service.setSecretKey("");

        ArticleDeleteByOpenidRequest request = new ArticleDeleteByOpenidRequest();
        // set openid here
        request.setOpenId("");
        try {
            ArticleDeleteByOpenidResponse response = service.deleteSourceArticleByOpenid(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
