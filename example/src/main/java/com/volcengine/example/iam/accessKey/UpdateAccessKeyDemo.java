package com.volcengine.example.iam.accessKey;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.iam.UpdateAccessKeyRequest;
import com.volcengine.model.response.CommonResponse;
import com.volcengine.service.iam.IIamService;
import com.volcengine.service.iam.impl.IamServiceImpl;

public class UpdateAccessKeyDemo {

    public static void main(String[] args) {
        IIamService iamService = IamServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        iamService.setAccessKey("Your AK");
        iamService.setSecretKey("Your SK");
        // list users
        try {
            UpdateAccessKeyRequest request = new UpdateAccessKeyRequest();
            request.setAccessKeyId("***REMOVED***");
            request.setStatus("inactive"); // active、inactive

            CommonResponse response = iamService.updateAccessKey(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
