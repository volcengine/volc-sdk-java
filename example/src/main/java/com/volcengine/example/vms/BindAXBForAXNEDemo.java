package com.volcengine.example.vms;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.vms.ISecretNumberService;
import com.volcengine.service.vms.impl.SecretNumberServiceImpl;
import com.volcengine.service.vms.request.BindAXBForAXNERequest;
import com.volcengine.service.vms.response.SecretBindResponse;

/**
 * @author huangxing
 * @Date 2023/1/10
 */
public class BindAXBForAXNEDemo {
    public static void main(String[] args) {
        ISecretNumberService secretNumberService = SecretNumberServiceImpl.getInstance();

        secretNumberService.setAccessKey("your ak");
        secretNumberService.setSecretKey("your sk");

        try {
            BindAXBForAXNERequest request = new BindAXBForAXNERequest();
            request.setNumberPoolNo("NP167091951102821491");
            request.setParentSubId("S167221098095340440644");
            request.setPhoneNoB("18800000004");
            request.setEnableDuration(360);
            request.setOutId("123");
            request.setUserData("test");
            SecretBindResponse response = secretNumberService.bindAXBForAXNE(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
