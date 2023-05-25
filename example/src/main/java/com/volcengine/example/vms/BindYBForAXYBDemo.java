package com.volcengine.example.vms;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.vms.ISecretNumberService;
import com.volcengine.service.vms.impl.SecretNumberServiceImpl;
import com.volcengine.service.vms.request.BindYBForAXYBRequest;
import com.volcengine.service.vms.response.SecretBindResponse;

/**
 * @author huangxing
 * @Date 2023/1/10
 */
public class BindYBForAXYBDemo {
    public static void main(String[] args) {
        ISecretNumberService secretNumberService = SecretNumberServiceImpl.getInstance();

        secretNumberService.setAccessKey("your ak");
        secretNumberService.setSecretKey("your sk");

        try {
            BindYBForAXYBRequest request = new BindYBForAXYBRequest();
            request.setNumberPoolNo("NP163573566110906243");
            request.setParentSubId("S16722126795817211a93e");
            request.setPhoneNoB("18800000001");
            request.setCityCode("010");
            request.setEnableDuration(360);
            SecretBindResponse response = secretNumberService.bindYBForAXYB(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
