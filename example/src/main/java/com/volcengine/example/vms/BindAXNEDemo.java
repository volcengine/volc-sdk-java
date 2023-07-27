package com.volcengine.example.vms;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.vms.VmsService;
import com.volcengine.service.vms.impl.VmsServiceImpl;
import com.volcengine.service.vms.request.BindAXNERequest;
import com.volcengine.service.vms.response.SecretBindResponse;

/**
 * @author huangxing
 * @Date 2023/1/10
 */
public class BindAXNEDemo {
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
            BindAXNERequest bindAXNERequest = new BindAXNERequest();
            bindAXNERequest.setNumberPoolNo("NP167092136302829051");
            bindAXNERequest.setPhoneNoA("18800000001");
            bindAXNERequest.setPhoneNoB("18800000002");
            bindAXNERequest.setPhoneNoX("18723844643");
            bindAXNERequest.setExpireTime(1674261085L);
            SecretBindResponse response = vmsService.bindAXNE(bindAXNERequest);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
