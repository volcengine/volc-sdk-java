package com.volcengine.example.vms;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.vms.VmsService;
import com.volcengine.service.vms.impl.VmsServiceImpl;
import com.volcengine.service.vms.request.SelectNumberAndBindAXBRequest;
import com.volcengine.service.vms.response.SecretBindResponse;

/**
 * @author huangxing
 * @Date 2023/1/10
 */
public class SelectNumberAndBindAXBDemo {
    // Make sure only get instance once throughout the entire running program.
    // We suggest using Singleton design model to get the instance.
    // And using the Singleton instance to call functions
    private static VmsService vmsService = VmsServiceImpl.getInstance();

    static {
        vmsService.setAccessKey("your ak");
        vmsService.setSecretKey("your sk");
    }
    public static void main(String[] args) {
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
            SecretBindResponse response = vmsService.selectNumberAndBindAXB(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
