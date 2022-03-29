package com.volcengine.example.notify;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.notify.NotifyService;
import com.volcengine.service.notify.impl.NotifyServiceImpl;
import com.volcengine.service.notify.model.request.SingleAppendRequest;
import com.volcengine.service.notify.model.request.SingleParam;
import com.volcengine.service.notify.model.response.CommonResponse;
import com.volcengine.service.notify.model.response.SingleAppendResult;
import com.volcengine.service.notify.model.response.SingleInfo;

import java.util.Arrays;
import java.util.Date;

public class SingleDemo {
    public static void main(String[] args) {
        NotifyService notifyService = NotifyServiceImpl.getInstance();

        notifyService.setAccessKey("your ak");
        notifyService.setSecretKey("your sk");

        try {
            SingleParam singleParam = SingleParam.builder().numberPoolNo("NP162215338604095636").phone("19900000000").singleOpenId("test122002")
                    .numberList(Arrays.asList("075561169508")).numberType(0).resource("618f1ee1d8a94d4d8eaee06482fda70e")
                    .triggerTime(new Date(System.currentTimeMillis() + 30 * 1000)).type(0).build();

            CommonResponse<SingleAppendResult> operationResponse = notifyService.singleBatchAppend(SingleAppendRequest.builder().list(Arrays.asList(singleParam)).build());
            System.out.println(JSON.toJSONString(operationResponse));

            CommonResponse<SingleInfo> infoCommonResponse = notifyService.singleInfo("test122002");
            System.out.println(JSON.toJSONString(infoCommonResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
