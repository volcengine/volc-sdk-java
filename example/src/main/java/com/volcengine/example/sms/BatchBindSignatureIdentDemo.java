package com.volcengine.example.sms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.BatchBindSignatureIdentRequest;
import com.volcengine.model.response.BatchBindSignatureIdentResponse;
import com.volcengine.service.sms.SmsService;
import com.volcengine.service.sms.impl.SmsServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class BatchBindSignatureIdentDemo {
    public static void main(String[] args) {
        SmsService smsService = SmsServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        smsService.setAccessKey("ak");
        smsService.setSecretKey("sk");

        BatchBindSignatureIdentRequest request = new BatchBindSignatureIdentRequest();
        List<String> signatures = new ArrayList<>();// 签名,可多个
        signatures.add("");
        request.setSignatures(signatures);
        request.setId(1);// 资质id
        request.setPurpose(1);// 资质用途； 1.自用，2.他用
        request.setSubAccount("");// 子账号
        try {
            BatchBindSignatureIdentResponse response = smsService.batchBindSignatureIdent(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
