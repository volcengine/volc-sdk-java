package com.volcengine.example.vms;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.vms.VmsService;
import com.volcengine.service.vms.impl.VmsServiceImpl;
import com.volcengine.service.vms.request.UpdateAXNERequest;
import com.volcengine.service.vms.response.OperationResponse;

/**
 * @author huangxing
 * @Date 2023/1/10
 */
public class UpdateAXNEDemo {
    public static void main(String[] args) {

        VmsService vmsService = VmsServiceImpl.getInstance();
        vmsService.setAccessKey("your ak");
        vmsService.setSecretKey("your sk");

        try {
            UpdateAXNERequest request = new UpdateAXNERequest();
            request.setNumberPoolNo("NP167091934402820309");
            request.setSubId("S16722090689534a63c75c");
            request.setUpdateType("updatePhoneNoB");
            request.setPhoneNoB("18916266831");
            OperationResponse response = vmsService.updateAXNE(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
