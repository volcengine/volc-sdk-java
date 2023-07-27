package com.volcengine.example.vms;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.vms.VmsService;
import com.volcengine.service.vms.impl.VmsServiceImpl;
import com.volcengine.service.vms.request.BindAXBForAXNERequest;
import com.volcengine.service.vms.response.SecretBindResponse;

/**
 * @author huangxing
 * @Date 2023/1/10
 */
public class BindAXBForAXNEDemo {
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
            BindAXBForAXNERequest request = new BindAXBForAXNERequest();
            request.setNumberPoolNo("NP167091951102821491");
            request.setParentSubId("S167221098095340440644");
            request.setPhoneNoB("18800000004");
            request.setEnableDuration(360);
            request.setOutId("123");
            request.setUserData("test");
            SecretBindResponse response = vmsService.bindAXBForAXNE(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
