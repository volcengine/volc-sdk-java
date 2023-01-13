package com.volcengine.example.secretnumber;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.sercretnumber.ISecretNumberService;
import com.volcengine.service.sercretnumber.impl.SecretNumberServiceImpl;
import com.volcengine.service.sercretnumber.model.request.BindAXNERequest;
import com.volcengine.service.sercretnumber.model.response.SecretBindResponse;

/**
 * @author huangxing
 * @Date 2023/1/10
 */
public class BindAXNEDemo {
    public static void main(String[] args) {
        ISecretNumberService secretNumberService = SecretNumberServiceImpl.getInstance();

        secretNumberService.setAccessKey("your ak");
        secretNumberService.setSecretKey("your sk");

        try {
            BindAXNERequest bindAXNERequest = new BindAXNERequest();
            bindAXNERequest.setNumberPoolNo("NP167092136302829051");
            bindAXNERequest.setPhoneNoA("18800000001");
            bindAXNERequest.setPhoneNoB("18800000002");
            bindAXNERequest.setPhoneNoX("18723844643");
            bindAXNERequest.setExpireTime(1674261085L);
            SecretBindResponse response = secretNumberService.bindAXNE(bindAXNERequest);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
