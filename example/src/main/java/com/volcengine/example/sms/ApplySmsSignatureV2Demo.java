package com.volcengine.example.sms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.ApplySmsSignatureV2Request;
import com.volcengine.model.response.ApplySmsSignatureResponse;
import com.volcengine.model.sms.*;
import com.volcengine.service.sms.SmsService;
import com.volcengine.service.sms.impl.SmsServiceImpl;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;

public class ApplySmsSignatureV2Demo {
    public static void main(String[] args) throws IOException {
        SmsService smsService = SmsServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        smsService.setAccessKey("");
        smsService.setSecretKey("");
        //java读取本地文件，仅供参考
//        String file = "/Users/user/img_v2_2d3be85c-d52a-4f85-88af-9fa0485d63cg.jpg";
//        DataInputStream reader = new DataInputStream(new FileInputStream(file));
//        byte[] bytes = new byte[reader.available()];
//        reader.read(bytes);

        ApplySmsSignatureV2Request req = new ApplySmsSignatureV2Request();
        req.setDesc("测试 SDK");
        req.setContent("测试");
        req.setSource(SignSourceTypeV2.SignSourceTypeApp);
        req.setDomain("www.xxx.com");
        req.setPurpose(PurposeType.SignPurposeForOwn);
        req.setSignatureIdentificationID(1); // 实名资质id
        SignAuthFile appIcpFileList = new SignAuthFile(DocType.AppIcpCertificate, "", ImageType.JPG.getImageType(), "http://wechatapppro.com/cdba1974330.jpg");
        AppIcp appIcp = new AppIcp();
        appIcp.setAppIcpFileList(new ArrayList<>(Collections.singletonList(appIcpFileList)));
        appIcp.setAppIcpFilling("appIcp");
        req.setAppIcp(appIcp);
        Trademark trademark = new Trademark();
        trademark.setTrademarkCn("中文商标");
        trademark.setTrademarkEn("English trademark");
        trademark.setTrademarkNumber("123234");
        trademark.setTrademarkFileList(new ArrayList<>(Collections.singletonList(appIcpFileList)));
        req.setTrademark(trademark);
        req.setScene("通用");// 可选，非必填
        req.setSubAccounts(new ArrayList<String>(Arrays.asList("subAccount1", "subAccount2")));
        req.setChannelTypes(new ArrayList<String>(Arrays.asList("channelType1", "channelType2")));
        try {
            ApplySmsSignatureResponse response = smsService.applySmsSignatureV2(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
