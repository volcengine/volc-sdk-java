package com.volcengine.example.vms;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.vms.VmsService;
import com.volcengine.service.vms.impl.VmsServiceImpl;
import com.volcengine.service.vms.request.BindYBForAXYBRequest;
import com.volcengine.service.vms.response.SecretBindResponse;

/**
 * @author huangxing
 * @Date 2023/1/10
 */
public class BindYBForAXYBDemo {
    public static void main(String[] args) {

        VmsService vmsService = VmsServiceImpl.getInstance();
        vmsService.setAccessKey("your ak");
        vmsService.setSecretKey("your sk");

        try {
            BindYBForAXYBRequest request = new BindYBForAXYBRequest();
            request.setNumberPoolNo("NP163573566110906243");
            request.setParentSubId("S16722126795817211a93e");
            request.setPhoneNoB("18800000001");
            request.setCityCode("010");
            request.setEnableDuration(360);
            SecretBindResponse response = vmsService.bindYBForAXYB(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
