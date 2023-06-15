package com.volcengine.example.vms;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.vms.VmsService;
import com.volcengine.service.vms.impl.VmsServiceImpl;
import com.volcengine.service.vms.request.BindAXNRequest;
import com.volcengine.service.vms.response.SecretBindResponse;

/**
 * @author huangxing
 * @Date 2023/1/10
 */
public class BindAXNDemo {
    public static void main(String[] args) {

        VmsService vmsService = VmsServiceImpl.getInstance();
        vmsService.setAccessKey("your ak");
        vmsService.setSecretKey("your sk");

        try {
            BindAXNRequest bindAXNRequest = new BindAXNRequest();
            bindAXNRequest.setNumberPoolNo("NP167092127702825445");
            bindAXNRequest.setPhoneNoA("18800000003");
            bindAXNRequest.setPhoneNoB("18800000004");
            bindAXNRequest.setPhoneNoX("13120407901");
            bindAXNRequest.setExpireTime(1674261085L);
            SecretBindResponse response = vmsService.bindAXN(bindAXNRequest);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
