package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualCertTokenRequest;
import com.volcengine.service.visual.model.request.VisualCertVerifyQueryRequest;
import com.volcengine.service.visual.model.response.VisualCertTokenResponse;
import com.volcengine.service.visual.model.response.VisualCertVerifyQueryResponse;

import java.util.ArrayList;

public class certVerifyQueryDemo {

    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();
        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");

        VisualCertVerifyQueryRequest request=new VisualCertVerifyQueryRequest();
        request.setReqKey("cert_verify_query");
        request.setBytedToken("token");
        request.setOmitData(false);
        request.setOmitImageData(false);
        request.setOmitVideoData(false);
        try {
            VisualCertVerifyQueryResponse response = visualService.certVerifyQuery(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
