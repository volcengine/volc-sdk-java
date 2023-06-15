package com.volcengine.example.vms.resource;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.vms.VmsService;
import com.volcengine.service.vms.impl.VmsServiceImpl;
import com.volcengine.service.vms.response.BasicResourceResult;
import com.volcengine.service.vms.response.CommonResponse;

/**
 * @author huangxing
 * @Date 2023/1/9
 */
public class OpenUpdateResourceDemo {
    public static void main(String[] args) {

        VmsService vmsService = VmsServiceImpl.getInstance();
        vmsService.setAccessKey("your ak");
        vmsService.setSecretKey("your sk");

        try {
            CommonResponse<BasicResourceResult> commonResponse = vmsService.openUpdateResource("1ca08a45a937411ebd78e572cef87086", "12345.mp3");
            System.out.println(JSON.toJSONString(commonResponse));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
