package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.VisualDefaultClient;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualCertConfigGetRequest;
import com.volcengine.service.visual.model.response.VisualCertConfigGetResponse;

public class CertConfigGetDemo {

    public static void main(String[] args) {
        //获取IVisualService新实例
        //IVisualService visualService = VisualServiceImpl.getInstance();
        //获取全局的IVisualService实例
        IVisualService visualService = VisualDefaultClient.iVisualService;


        // call below method if you dont set ak and sk in ～/.vcloud/config

        visualService.setAccessKey("your ak");
        visualService.setSecretKey("your sk");

        VisualCertConfigGetRequest request=new VisualCertConfigGetRequest();
        request.setReqKey("cert_config_get");
        request.setConfigId("configId");
        try {
            VisualCertConfigGetResponse response = visualService.certConfigGet(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }

        //身份认证ConfigGet服务V2，返回全部response
//        VisualCertConfigGetRequest request=new VisualCertConfigGetRequest();
//        request.setReqKey("cert_config_get");
//        request.setConfigId("configId");
//        Object response = visualService.certConfigGetV2(request);
//        System.out.println(JSON.toJSONString(response));

    }
}
