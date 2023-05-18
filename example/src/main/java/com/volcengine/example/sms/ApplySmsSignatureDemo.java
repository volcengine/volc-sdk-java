package com.volcengine.example.sms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.ApplySmsSignatureRequest;
import com.volcengine.model.response.ApplySmsSignatureResponse;
import com.volcengine.model.sms.*;
import com.volcengine.service.sms.SmsService;
import com.volcengine.service.sms.impl.SmsServiceImpl;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;

public class ApplySmsSignatureDemo {
    public static void main(String[] args) throws Exception {
        // Make sure only get instance once throughout the entire running program.
        // We suggest using Singleton design model to get the instance.
        // And using the Singleton instance to call functions
        SmsService smsService = SmsServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        smsService.setAccessKey("ak");
        smsService.setSecretKey("sk");


        //java读取本地文件，仅供参考
        String file = "/Users/user/img_v2_2d3be85c-d52a-4f85-88af-9fa0485d63cg.jpg";
        DataInputStream reader = new DataInputStream(new FileInputStream(file));
        byte[] bytes = new byte[reader.available()];
        reader.read(bytes);

        ApplySmsSignatureRequest req = new ApplySmsSignatureRequest();
        req.setDesc("测试 SDK");
        req.setSubAccount("subAccount");
        req.setContent("测试"); //不能是已存在
        req.setSource(SignSourceType.SignSourceTypeCompany);
        req.setDomain("www.xxx.com"); // 必填
        req.setPurpose(PurposeType.SignPurposeForOwn);
        SignAuthFile filePgn = new SignAuthFile(DocType.ThreeInOne, Base64.getEncoder().encodeToString(bytes), ImageType.JPG.getImageType());
        req.setUploadFileList(new ArrayList<>(Collections.singletonList(filePgn)));
        try {
            ApplySmsSignatureResponse response = smsService.applySmsSignature(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
