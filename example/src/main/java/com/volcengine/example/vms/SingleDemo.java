package com.volcengine.example.vms;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.vms.VmsService;
import com.volcengine.service.vms.impl.VmsServiceImpl;
import com.volcengine.service.vms.request.SingleAppendRequest;
import com.volcengine.service.vms.request.SingleParam;
import com.volcengine.service.vms.response.CommonResponse;
import com.volcengine.service.vms.response.SingleAppendResult;
import com.volcengine.service.vms.response.SingleInfo;

import java.util.Arrays;
import java.util.Date;

public class SingleDemo {
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
            SingleParam singleParam = SingleParam.builder().numberPoolNo("NP162215338604095636").phone("19900000000").singleOpenId("test122002")
                    .numberList(Arrays.asList("075561169508")).numberType(0).resource("618f1ee1d8a94d4d8eaee06482fda70e")
                    .triggerTime(new Date(System.currentTimeMillis() + 30 * 1000)).type(0).build();

            CommonResponse<SingleAppendResult> operationResponse = vmsService.singleBatchAppend(SingleAppendRequest.builder().list(Arrays.asList(singleParam)).build());
            System.out.println(JSON.toJSONString(operationResponse));

            CommonResponse<SingleInfo> infoCommonResponse = vmsService.singleInfo("test122002");
            System.out.println(JSON.toJSONString(infoCommonResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
