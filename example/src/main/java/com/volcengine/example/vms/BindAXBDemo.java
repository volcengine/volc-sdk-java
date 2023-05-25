package com.volcengine.example.vms;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.vms.ISecretNumberService;
import com.volcengine.service.vms.impl.SecretNumberServiceImpl;
import com.volcengine.service.vms.request.BindAXBRequest;
import com.volcengine.service.vms.response.SecretBindResponse;

/**
 * @author huangxing
 * @Date 2023/1/10
 */
public class BindAXBDemo {
    public static void main(String[] args) {
        ISecretNumberService secretNumberService = SecretNumberServiceImpl.getInstance();

        secretNumberService.setAccessKey("your ak");
        secretNumberService.setSecretKey("your sk");

        try {
            BindAXBRequest bindAXBRequest = new BindAXBRequest();
            bindAXBRequest.setNumberPoolNo("NP167092059702820327");
            bindAXBRequest.setPhoneNoA("18800000001");
            bindAXBRequest.setPhoneNoB("18800000002");
            bindAXBRequest.setPhoneNoX("17061361223");
            bindAXBRequest.setExpireTime(1674261085L);
            SecretBindResponse response = secretNumberService.bindAXB(bindAXBRequest);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
