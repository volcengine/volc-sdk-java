package com.volcengine.example.iam.accessKey;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.iam.DeleteAccessKeyRequest;
import com.volcengine.model.response.CommonResponse;
import com.volcengine.service.iam.IIamService;
import com.volcengine.service.iam.impl.IamServiceImpl;

public class DeleteAccessKeyDemo {

    public static void main(String[] args) {
        IIamService iamService = IamServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        iamService.setAccessKey("Your AK");
        iamService.setSecretKey("Your SK");
        // list users
        try {
            DeleteAccessKeyRequest request = new DeleteAccessKeyRequest();
            request.setAccessKeyId("AK******example********");

            CommonResponse response = iamService.deleteAccessKey(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
