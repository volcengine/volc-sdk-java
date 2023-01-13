package com.volcengine.example.secretnumber;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.sercretnumber.ISecretNumberService;
import com.volcengine.service.sercretnumber.impl.SecretNumberServiceImpl;
import com.volcengine.service.sercretnumber.model.request.UpdateAXNERequest;
import com.volcengine.service.sercretnumber.model.response.OperationResponse;

/**
 * @author huangxing
 * @Date 2023/1/10
 */
public class UpdateAXNEDemo {
    public static void main(String[] args) {
        ISecretNumberService secretNumberService = SecretNumberServiceImpl.getInstance();

        secretNumberService.setAccessKey("your ak");
        secretNumberService.setSecretKey("your sk");

        try {
            UpdateAXNERequest request = new UpdateAXNERequest();
            request.setNumberPoolNo("NP167091934402820309");
            request.setSubId("S16722090689534a63c75c");
            request.setUpdateType("updatePhoneNoB");
            request.setPhoneNoB("18916266831");
            OperationResponse response = secretNumberService.updateAXNE(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
