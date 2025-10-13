package com.volcengine.example.sms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.UpdateSignatureIdentRequest;
import com.volcengine.model.response.UpdateSignatureIdentResponse;
import com.volcengine.model.sms.DocType;
import com.volcengine.model.sms.ImageType;
import com.volcengine.model.sms.SignAuthFile;
import com.volcengine.service.sms.SmsService;
import com.volcengine.service.sms.SmsServiceInfoConfig;
import com.volcengine.service.sms.impl.SmsServiceImpl;

import java.io.DataInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.List;

public class UpdateSignatureIdentDemo {
    private static SmsService smsService = SmsServiceImpl.getInstance(new SmsServiceInfoConfig("ak", "sk"));

    public static void main(String[] args) {
        UpdateSignatureIdentRequest request = new UpdateSignatureIdentRequest();
        request.setId(1);
        request.setOperatorPersonInfo(getPersonInfo()); // 经办人信息
        request.setResponsiblePersonInfo(getPersonInfo()); // 责任人信息
        request.setLegalPersonInfo(getPersonInfo()); // 法人信息
        try {
            UpdateSignatureIdentResponse response = smsService.updateSignatureIdent(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static UpdateSignatureIdentRequest.BusinessInfo getBusinessInfo() {
        UpdateSignatureIdentRequest.BusinessInfo businessInfo = new UpdateSignatureIdentRequest.BusinessInfo();
        businessInfo.setBusinessCertificate(getSignAuthFile().get(0)); // 营业证件
        businessInfo.setBusinessCertificateType(1);  // 营业证件类型
        businessInfo.setBusinessCertificateName("营业证件名称"); // 营业证件名称
        businessInfo.setUnifiedSocialCreditIdentifier("91110105xxxxxxxxx");  // 统一社会信用代码
        businessInfo.setBusinessCertificateValidityPeriodStart("2022-01-12");// 营业证件有效期开始
        businessInfo.setBusinessCertificateValidityPeriodEnd("2099-01-12");// 营业证件有效期结束
        businessInfo.setLegalPersonName("李强");//法人名称
        return businessInfo;
    }

    private static UpdateSignatureIdentRequest.PersonInfo getPersonInfo() {
        UpdateSignatureIdentRequest.PersonInfo personInfo = new UpdateSignatureIdentRequest.PersonInfo();
        personInfo.setPersonIDCard("130227199501306448");  // 证件号码
        personInfo.setPersonCertificate(getSignAuthFile());// 证件信息
        personInfo.setCertificateType(0);// 证件类型 0.身份证
        personInfo.setPersonName("赵金丹");// 名字
        personInfo.setPersonMobile("15800000000");// 手机号
        return personInfo;
    }

    private static List<SignAuthFile> getSignAuthFile() {
        // 注意区分fileType
        SignAuthFile filePgn = new SignAuthFile(DocType.ThreeInOne, "", ImageType.JPG.getImageType(), "http://wechatapp/1974330.jpg");
        return new ArrayList<>(Collections.singletonList(filePgn));
    }
}
