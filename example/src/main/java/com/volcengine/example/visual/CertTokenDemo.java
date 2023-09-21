package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.VisualDefaultClient;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualCertTokenRequest;
import com.volcengine.service.visual.model.response.VisualCertTokenResponse;

import java.util.ArrayList;

public class CertTokenDemo {

    public static void main(String[] args) {
        //获取IVisualService新实例
        //IVisualService visualService = VisualServiceImpl.getInstance();
        //获取全局的IVisualService实例
        IVisualService visualService = VisualDefaultClient.iVisualService;

        visualService.setAccessKey("your ak");
        visualService.setSecretKey("your sk");

        VisualCertTokenRequest visualCertTokenRequest=new VisualCertTokenRequest();
        visualCertTokenRequest.setReqKey("cert_token");
        visualCertTokenRequest.setStsToken("token");
        visualCertTokenRequest.setTosInfo(null);
        visualCertTokenRequest.setRefSource("1");
        visualCertTokenRequest.setLivenessType("");
        visualCertTokenRequest.setIdcardName("");
        visualCertTokenRequest.setIdcardNo("");
        visualCertTokenRequest.setRefImage("");
        visualCertTokenRequest.setLivenessTimeout(10);
        visualCertTokenRequest.setMotionList(new ArrayList<>());
        visualCertTokenRequest.setMotionCount(2);
        visualCertTokenRequest.setMaxLivenessTrial(10);
        visualCertTokenRequest.setCallBackInfo(null);
        visualCertTokenRequest.setConfigId("");
        try {
            VisualCertTokenResponse response = visualService.certToken(visualCertTokenRequest);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }

        //身份认证Token服务V2，返回全部response
//        VisualCertTokenRequest visualCertTokenRequest=new VisualCertTokenRequest();
//        visualCertTokenRequest.setReqKey("cert_token");
//        visualCertTokenRequest.setStsToken("token");
//        visualCertTokenRequest.setTosInfo(null);
//        visualCertTokenRequest.setRefSource("0");
//        visualCertTokenRequest.setLivenessType("");
//        visualCertTokenRequest.setIdcardName("");
//        visualCertTokenRequest.setIdcardNo("");
//        visualCertTokenRequest.setRefImage("");
//        visualCertTokenRequest.setLivenessTimeout(10);
//        visualCertTokenRequest.setMotionList(new ArrayList<>());
//        visualCertTokenRequest.setMotionCount(2);
//        visualCertTokenRequest.setMaxLivenessTrial(10);
//        visualCertTokenRequest.setCallBackInfo(null);
//        visualCertTokenRequest.setConfigId("");
//        Object response = visualService.certTokenV2(visualCertTokenRequest);
//        System.out.println(JSON.toJSONString(response));
    }
}
