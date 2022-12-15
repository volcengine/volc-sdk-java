package com.volcengine.example.iam.saml;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.iam.GetSAMLProviderRequest;
import com.volcengine.model.response.iam.GetSAMLProviderResponse;
import com.volcengine.service.iam.IIamService;
import com.volcengine.service.iam.impl.IamServiceImpl;

public class GetSAMLProviderDemo {

    public static void main(String[] args) {
        IIamService iamService = IamServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        iamService.setAccessKey("Your AK");
        iamService.setSecretKey("Your SK");
        // list users
        try {
            GetSAMLProviderRequest request = new GetSAMLProviderRequest();
            request.setSAMLProviderName("provider_name");

            GetSAMLProviderResponse response = iamService.getSAMLProvider(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
