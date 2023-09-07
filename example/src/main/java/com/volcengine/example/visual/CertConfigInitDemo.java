package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualCertConfigInitRequest;
import com.volcengine.service.visual.model.request.VisualCertTokenRequest;
import com.volcengine.service.visual.model.response.VisualCertConfigInitResponse;
import com.volcengine.service.visual.model.response.VisualCertTokenResponse;

import java.util.ArrayList;

public class CertConfigInitDemo {

    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config

        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");
        VisualCertConfigInitRequest request=new VisualCertConfigInitRequest();
        request.setReqKey("cert_config_init");
        request.setConfigName("test");
        request.setConfigDesc("test config");
        request.setTokenApiConfig(null);
        request.setH5Config(null);
        try {
            VisualCertConfigInitResponse response = visualService.certConfigInit(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
