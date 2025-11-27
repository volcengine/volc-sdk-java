package com.volcengine.example.sms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.UpdateSmsSignatureRequest;
import com.volcengine.model.response.UpdateSmsSignatureResponse;
import com.volcengine.model.sms.*;
import com.volcengine.service.sms.SmsService;
import com.volcengine.service.sms.impl.SmsServiceImpl;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UpdateSmsSignatureDemo {
    public static void main(String[] args) throws IOException {
        SmsService smsService = SmsServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        smsService.setAccessKey("ak");
        smsService.setSecretKey("sk");
        //java读取本地文件，仅供参考
//        String file = "/Users/user/test.jpeg";
//        DataInputStream reader = new DataInputStream(new FileInputStream(file));
//        byte[] bytes = new byte[reader.available()];
//        reader.read(bytes);

        UpdateSmsSignatureRequest req = new UpdateSmsSignatureRequest();
        req.setDesc("测试 SDK");
        req.setContent("测试");
        req.setSource(SignSourceTypeV2.SignSourceTypeApp);
        req.setDomain("www.xxx.com");
        req.setPurpose(PurposeType.SignPurposeForOwn);
        req.setSignatureIdentificationID(5827123307211L); // 实名资质id(类型从int转成long)
        SignAuthFile appIcpFileList = new SignAuthFile(DocType.AppIcpCertificate, "", ImageType.JPG.getImageType(), "http://wechatapppr/fda5cf6cdba1974330.jpg");
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
        req.setSubAccounts(new ArrayList<>(Arrays.asList("subAccount1", "subAccount2")));
        req.setChannelTypes(new ArrayList<>(Arrays.asList("channelType1", "channelType2")));
        req.setUpdateType(0); // 标记更新类型,0默认，1发送类型，2消息组
        try {
            UpdateSmsSignatureResponse response = smsService.updateSmsSignature(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            System.out.println(e.getMessage());

            e.printStackTrace();
        }
    }
}
