package com.volcengine.example.secretnumber;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.sercretnumber.ISecretNumberService;
import com.volcengine.service.sercretnumber.impl.SecretNumberServiceImpl;
import com.volcengine.service.sercretnumber.model.request.SelectNumberAndBindAXBRequest;
import com.volcengine.service.sercretnumber.model.response.SecretBindResponse;

/**
 * @author huangxing
 * @Date 2023/1/10
 */
public class SelectNumberAndBindAXBDemo {
    public static void main(String[] args) {
        ISecretNumberService secretNumberService = SecretNumberServiceImpl.getInstance();

        secretNumberService.setAccessKey("your ak");
        secretNumberService.setSecretKey("your sk");

        try {
            SelectNumberAndBindAXBRequest request = new SelectNumberAndBindAXBRequest();
            request.setNumberPoolNo("NP167091949502821554");
            request.setPhoneNoA("18810075753");
            request.setCityCode("010");
            request.setOutId("123");
            request.setUserData("test");
            request.setExpireTime(1674261085L);
            request.setVerifyFlag(0);
            request.setAxConflictAxbFlag(1);
            SecretBindResponse response = secretNumberService.selectNumberAndBindAXB(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
