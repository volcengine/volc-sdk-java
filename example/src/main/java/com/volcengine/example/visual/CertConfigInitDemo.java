package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.VisualDefaultClient;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualCertConfigInitRequest;
import com.volcengine.service.visual.model.response.VisualCertConfigInitResponse;

public class CertConfigInitDemo {

    public static void main(String[] args) {
        //获取IVisualService新实例
        //IVisualService visualService = VisualServiceImpl.getInstance();
        //获取全局的IVisualService实例
        IVisualService visualService = VisualDefaultClient.iVisualService;

        // call below method if you dont set ak and sk in ～/.vcloud/config

        visualService.setAccessKey("your ak");
        visualService.setSecretKey("your sk");

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

        //身份认证ConfigInit服务V2，返回全部response
//        VisualCertConfigInitRequest request=new VisualCertConfigInitRequest();
//        request.setReqKey("cert_config_init");
//        request.setConfigName("test");
//        request.setConfigDesc("test config");
//        request.setTokenApiConfig(null);
//        request.setH5Config(null);
//        Object response = visualService.certConfigInitV2(request);
//        System.out.println(JSON.toJSONString(response));

    }
}
