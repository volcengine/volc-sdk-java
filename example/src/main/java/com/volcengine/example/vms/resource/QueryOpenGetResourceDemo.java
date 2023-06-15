package com.volcengine.example.vms.resource;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.vms.VmsService;
import com.volcengine.service.vms.impl.VmsServiceImpl;
import com.volcengine.service.vms.request.QueryResourceRequest;
import com.volcengine.service.vms.response.CommonResponse;
import com.volcengine.service.vms.response.QueryOpenGetResourceResult;

/**
 * @author huangxing
 * @Date 2023/1/9
 */
public class QueryOpenGetResourceDemo {
    public static void main(String[] args) {

        VmsService vmsService = VmsServiceImpl.getInstance();
        vmsService.setAccessKey("your ak");
        vmsService.setSecretKey("your sk");

        try {
            QueryResourceRequest request = new QueryResourceRequest();
            request.setType(0);
            request.setLimit(2);
            CommonResponse<QueryOpenGetResourceResult> commonResponse = vmsService.queryOpenGetResource(request);
            System.out.println(JSON.toJSONString(commonResponse));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
