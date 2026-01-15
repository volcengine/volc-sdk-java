package com.volcengine.example.vms;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.vms.VmsService;
import com.volcengine.service.vms.impl.VmsServiceImpl;
import com.volcengine.service.vms.request.Click2CallCompanyAuthRequest;
import com.volcengine.service.vms.response.Click2CallAuthResponse;

import java.util.ArrayList;
import java.util.List;

public class Click2CallDemo {
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
            Click2CallCompanyAuthRequest companyAuthRequest = new Click2CallCompanyAuthRequest();
            companyAuthRequest.setCompanyName("companyName");
            companyAuthRequest.setCompanyCreditCode("companyCreditCode");
            companyAuthRequest.setBusinessLicensePicUrl("https://cdn.pixabay.com/photo/2025/12/10/22/35/grass-10007509_1280.jpg");
            companyAuthRequest.setBusinessLicensePicFilename("grass-10007509_1280.jpg");
            companyAuthRequest.setProprietorIdcardPicUrl("https://cdn.pixabay.com/photo/2025/12/10/22/35/grass-10007509_1280.jpg");
            companyAuthRequest.setProprietorIdcardPicFilename("grass-10007509_1280.jpg");
            companyAuthRequest.setOperatorIdcardPicUrl("https://cdn.pixabay.com/photo/2025/12/10/22/35/grass-10007509_1280.jpg");
            companyAuthRequest.setOperatorIdcardPicFilename("grass-10007509_1280.jpg");
            companyAuthRequest.setOperatorIdcardInhandPicUrl("https://cdn.pixabay.com/photo/2025/12/10/22/35/grass-10007509_1280.jpg");
            companyAuthRequest.setOperatorIdcardInhandPicFilename("grass-10007509_1280.jpg");
            companyAuthRequest.setNetworkaccessCommitmentletterPicUrl("https://cdn.pixabay.com/photo/2025/12/10/22/35/grass-10007509_1280.jpg");
            companyAuthRequest.setNetworkaccessCommitmentletterPicFilename("grass-10007509_1280.jpg");
            companyAuthRequest.setNumberapplicationOfficialletterPicUrl("https://cdn.pixabay.com/photo/2025/12/10/22/35/grass-10007509_1280.jpg");
            companyAuthRequest.setNumberapplicationOfficialletterPicFilename("grass-10007509_1280.jpg");
            companyAuthRequest.setCalleeSource("网站");
            companyAuthRequest.setBusinessCarrier("字节");
            List<Click2CallCompanyAuthRequest.Script> scriptList = new ArrayList<>();
            Click2CallCompanyAuthRequest.Script script = new Click2CallCompanyAuthRequest.Script();
            script.setScriptContent("你好啊测试话术");
            script.setScriptScene("快递");
            scriptList.add(script);
            companyAuthRequest.setScriptList(scriptList);
            Click2CallAuthResponse response = vmsService.click2CallCompanyAuth(companyAuthRequest);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
