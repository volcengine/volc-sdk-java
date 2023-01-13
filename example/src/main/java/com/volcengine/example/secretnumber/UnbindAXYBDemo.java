package com.volcengine.example.secretnumber;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.sercretnumber.ISecretNumberService;
import com.volcengine.service.sercretnumber.impl.SecretNumberServiceImpl;
import com.volcengine.service.sercretnumber.model.request.SpecificSubIdRequest;
import com.volcengine.service.sercretnumber.model.response.OperationResponse;

/**
 * @author huangxing
 * @Date 2023/1/10
 */
public class UnbindAXYBDemo {
    public static void main(String[] args) {
        ISecretNumberService secretNumberService = SecretNumberServiceImpl.getInstance();

        secretNumberService.setAccessKey("your ak");
        secretNumberService.setSecretKey("your sk");

        try {
            SpecificSubIdRequest request = new SpecificSubIdRequest();
            request.setNumberPoolNo("NP167092136302829051");
            request.setSubId("S16705013079847ce8a5a3");
            OperationResponse response = secretNumberService.unbindAXYB(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
