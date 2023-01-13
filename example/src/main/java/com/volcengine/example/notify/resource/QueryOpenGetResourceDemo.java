package com.volcengine.example.notify.resource;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.notify.NotifyService;
import com.volcengine.service.notify.impl.NotifyServiceImpl;
import com.volcengine.service.notify.model.request.QueryResourceRequest;
import com.volcengine.service.notify.model.response.CommonResponse;
import com.volcengine.service.notify.model.response.QueryOpenGetResourceResult;

/**
 * @author huangxing
 * @Date 2023/1/9
 */
public class QueryOpenGetResourceDemo {
    public static void main(String[] args) {

        NotifyService notifyService = NotifyServiceImpl.getInstance();

        notifyService.setAccessKey("your ak");
        notifyService.setSecretKey("your sk");


        try {
            QueryResourceRequest request = new QueryResourceRequest();
            request.setType(0);
            request.setLimit(2);
            CommonResponse<QueryOpenGetResourceResult> commonResponse = notifyService.queryOpenGetResource(request);
            System.out.println(JSON.toJSONString(commonResponse));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
