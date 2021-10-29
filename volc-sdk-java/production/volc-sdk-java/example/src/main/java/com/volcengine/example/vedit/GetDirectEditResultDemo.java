package com.volcengine.example.vedit;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.GetDirectEditResultRequest;
import com.volcengine.model.response.GetDirectEditResultResponse;
import com.volcengine.service.vedit.IVEditService;
import com.volcengine.service.vedit.impl.VEditServiceImpl;

import java.util.Arrays;

public class GetDirectEditResultDemo {
    public static void main(String[] args) {
        IVEditService veditService = VEditServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        veditService.setAccessKey("your ak");
        veditService.setSecretKey("your sk");

        GetDirectEditResultRequest req = new GetDirectEditResultRequest();
        req.setReqIds(Arrays.asList("xxx", "yyy"));

        try {
            GetDirectEditResultResponse response = veditService.getDirectEditResult(req);
            System.out.println(response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
