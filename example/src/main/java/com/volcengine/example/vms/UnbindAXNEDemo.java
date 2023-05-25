package com.volcengine.example.vms;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.vms.ISecretNumberService;
import com.volcengine.service.vms.impl.SecretNumberServiceImpl;
import com.volcengine.service.vms.request.SpecificSubIdRequest;
import com.volcengine.service.vms.response.OperationResponse;

/**
 * @author huangxing
 * @Date 2023/1/10
 */
public class UnbindAXNEDemo {
    public static void main(String[] args) {
        ISecretNumberService secretNumberService = SecretNumberServiceImpl.getInstance();

        secretNumberService.setAccessKey("your ak");
        secretNumberService.setSecretKey("your sk");

        try {
            SpecificSubIdRequest request = new SpecificSubIdRequest();
            request.setNumberPoolNo("NP167092136302829051");
            request.setSubId("S16705013079847ce8a5a3");
            OperationResponse response = secretNumberService.unbindAXNE(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
