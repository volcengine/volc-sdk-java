package com.volcengine.example.sms;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.ApplySignatureIdentRequest;
import com.volcengine.model.response.ApplySignatureIdentResponse;
import com.volcengine.model.sms.DocType;
import com.volcengine.model.sms.ImageType;
import com.volcengine.model.sms.SignAuthFile;
import com.volcengine.service.sms.SmsService;
import com.volcengine.service.sms.impl.SmsServiceImpl;

import java.io.DataInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.List;

public class ApplySignatureIdentDemo {
    public static void main(String[] args) {
        SmsService smsService = SmsServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        smsService.setAccessKey("");
        smsService.setSecretKey("");

        ApplySignatureIdentRequest request = new ApplySignatureIdentRequest();
        request.setFrom("");
        request.setPurpose(1); // 资质用途；1.自用，2.他用
        request.setMaterialName(""); // 资质名称
        request.setBusinessInfo(getBusinessInfo()); // 企业信息
        request.setOperatorPersonInfo(getPersonInfo()); // 经办人信息
        request.setResponsiblePersonInfo(getPersonInfo()); // 责任人信息
        request.setLegalPersonInfo(getPersonInfo()); // 法人信息
        request.setPowerOfAttorney(getSignAuthFile()); // 授权书
        request.setOtherMaterials(getSignAuthFile()); // 其他材料
        request.setEffectSignatures(getEffectSignatures()); // 生效签名范围
        request.setBusinessCheckTicket(""); // 企业验证票据
        request.setOperatorCheckTicket(""); // 经办人验证票据
        request.setResponsibleCheckTicket(""); // 责任人验证票据

        try {
            ApplySignatureIdentResponse response = smsService.applySignatureIdent(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static ApplySignatureIdentRequest.BusinessInfo getBusinessInfo() {
        ApplySignatureIdentRequest.BusinessInfo businessInfo = new ApplySignatureIdentRequest.BusinessInfo();
        businessInfo.setBusinessCertificate(getSignAuthFile().get(0)); // 营业证件
        businessInfo.setBusinessCertificateType(1);  // 营业证件类型
        businessInfo.setBusinessCertificateName(""); // 营业证件名称
        businessInfo.setUnifiedSocialCreditIdentifier("");  // 统一社会信用代码
        businessInfo.setBusinessCertificateValidityPeriodStart("2022-01-12");// 营业证件有效期开始
        businessInfo.setBusinessCertificateValidityPeriodEnd("2099-01-12");// 营业证件有效期结束
        businessInfo.setLegalPersonName("");//法人名称
        return businessInfo;
    }

    private static ApplySignatureIdentRequest.PersonInfo getPersonInfo() {
        ApplySignatureIdentRequest.PersonInfo personInfo = new ApplySignatureIdentRequest.PersonInfo();
        personInfo.setPersonIDCard("");  // 证件号码
        personInfo.setPersonCertificate(getSignAuthFile());// 证件信息
        personInfo.setCertificateType(0);// 证件类型 0.身份证
        personInfo.setPersonName("");// 名字
        personInfo.setPersonMobile("");// 手机号
        return personInfo;
    }

    private static List<SignAuthFile> getSignAuthFile() {
        //java读取本地文件，仅供参考
        String file = "/Users/Desktop/tt.jpg";
        DataInputStream reader = null;
        try {
            reader = new DataInputStream(Files.newInputStream(Paths.get(file)));
            byte[] bytes = new byte[reader.available()];
            reader.read(bytes);
            SignAuthFile filePgn = new SignAuthFile(DocType.ThreeInOne, Base64.getEncoder().encodeToString(bytes), ImageType.JPG.getImageType());
            return new ArrayList<>(Collections.singletonList(filePgn));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<String> getEffectSignatures() {
        List<String> effectSignatures = new ArrayList<>();
        effectSignatures.add("");
        return effectSignatures;
    }
}
