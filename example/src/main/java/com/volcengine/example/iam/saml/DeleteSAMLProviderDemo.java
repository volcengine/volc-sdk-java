package com.volcengine.example.iam.saml;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.iam.DeleteSAMLProviderRequest;
import com.volcengine.model.response.CommonResponse;
import com.volcengine.service.iam.IIamService;
import com.volcengine.service.iam.impl.IamServiceImpl;

public class DeleteSAMLProviderDemo {

    public static void main(String[] args) {
        IIamService iamService = IamServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        iamService.setAccessKey("Your AK");
        iamService.setSecretKey("Your SK");
        // list users
        try {
            DeleteSAMLProviderRequest request = new DeleteSAMLProviderRequest();
            request.setSAMLProviderName("provider_name");

            CommonResponse response = iamService.deleteSAMLProvider(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
