package com.volcengine.example.cms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.ArticleEventNotifyRequest;
import com.volcengine.model.response.ArticleEventNotifyResponse;
import com.volcengine.service.cms.CmsPlatformService;
import com.volcengine.service.cms.impl.CmsPlatformServiceImpl;

public class ArticleEventNotifyDemo {
    public static void main(String[] args) {
        CmsPlatformService service = CmsPlatformServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config
        service.setAccessKey("");
        service.setSecretKey("");

        articleStatusUpdateEvent(service);
        articleTagUpdateEvent(service);
    }

    /**
     * 内容状态同步demo
     */
    public static void articleStatusUpdateEvent(CmsPlatformService service) {
        ArticleEventNotifyRequest request = new ArticleEventNotifyRequest();
        request.setEventType("ArticleStatusUpdate");
        request.setSubEventType("SetOnline");
        try {
            ArticleEventNotifyResponse response = service.articleEventNotify(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 标签结果同步demo
     */
    public static void articleTagUpdateEvent(CmsPlatformService service) {
        ArticleEventNotifyRequest request = new ArticleEventNotifyRequest();
        request.setEventType("ArticleTagUpdate");
        try {
            ArticleEventNotifyResponse response = service.articleEventNotify(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
