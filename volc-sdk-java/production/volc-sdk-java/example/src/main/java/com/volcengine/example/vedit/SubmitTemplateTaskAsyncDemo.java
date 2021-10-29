package com.volcengine.example.vedit;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.SubmitTemplateTaskRequest;
import com.volcengine.model.response.SubmitTemplateTaskAsyncResponse;
import com.volcengine.service.vedit.IVEditService;
import com.volcengine.service.vedit.impl.VEditServiceImpl;

public class SubmitTemplateTaskAsyncDemo {
    public static void main(String[] args) {
        IVEditService veditService = VEditServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        veditService.setAccessKey("your ak");
        veditService.setSecretKey("your sk");

        SubmitTemplateTaskRequest req = new SubmitTemplateTaskRequest();
        req.setTemplateId("xxx");

        try {
            SubmitTemplateTaskAsyncResponse response = veditService.submitTemplateTaskAsync(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
