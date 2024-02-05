package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.VisualDefaultClient;
import com.volcengine.service.visual.model.request.VisualCertConfigInitRequest;
import com.volcengine.service.visual.model.request.VisualCertH5ConfigInitRequest;
import com.volcengine.service.visual.model.response.VisualCertConfigInitResponse;
import com.volcengine.service.visual.model.response.VisualH5CertConfigInitResponse;

public class CertH5ConfigInitDemo {

    public static void main(String[] args) {
        //获取IVisualService新实例
        //IVisualService visualService = VisualServiceImpl.getInstance();
        //获取全局的IVisualService实例
        IVisualService visualService = VisualDefaultClient.iVisualService;

        // call below method if you dont set ak and sk in ～/.vcloud/config

        visualService.setAccessKey("");
        visualService.setSecretKey("");

        VisualCertH5ConfigInitRequest request=new VisualCertH5ConfigInitRequest();
        request.setReqKey("cert_h5_config_init");
        VisualCertH5ConfigInitRequest.H5Config h5Config=new VisualCertH5ConfigInitRequest.H5Config();
        h5Config.setRedirectUrl("");
        request.setH5Config(h5Config);
        VisualCertH5ConfigInitRequest.LivenessConfig livenessConfig=new VisualCertH5ConfigInitRequest.LivenessConfig();
        livenessConfig.setRefSource("1");
        livenessConfig.setLivenessType("motion");
        request.setLivenessConfig(livenessConfig);
        request.setTosConfig(null);
        request.setCallbackInfo(null);
        try {
            VisualH5CertConfigInitResponse response = visualService.certH5ConfigInit(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
