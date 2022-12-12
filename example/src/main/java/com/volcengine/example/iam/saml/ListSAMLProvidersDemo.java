package com.volcengine.example.iam.saml;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.iam.ListSAMLProvidersRequest;
import com.volcengine.model.response.iam.ListSAMLProvidersResponse;
import com.volcengine.service.iam.IIamService;
import com.volcengine.service.iam.impl.IamServiceImpl;

public class ListSAMLProvidersDemo {

    public static void main(String[] args) {
        IIamService iamService = IamServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        iamService.setAccessKey("Your AK");
        iamService.setSecretKey("Your SK");
        // list users
        try {
            ListSAMLProvidersRequest request = ListSAMLProvidersRequest.builder().offset(0).limit(10).build();

            ListSAMLProvidersResponse listSAMLProvidersResponse = iamService.listSAMLProviders(request);
            System.out.println(JSON.toJSONString(listSAMLProvidersResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
