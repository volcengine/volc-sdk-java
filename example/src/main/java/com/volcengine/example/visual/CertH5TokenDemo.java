package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.VisualDefaultClient;
import com.volcengine.service.visual.model.request.VisualCertTokenRequest;
import com.volcengine.service.visual.model.request.VisualH5TokenRequest;
import com.volcengine.service.visual.model.response.VisualCertTokenResponse;
import com.volcengine.service.visual.model.response.VisualH5TokenResponse;

import java.util.ArrayList;

public class CertH5TokenDemo {

    public static void main(String[] args) {
        //获取IVisualService新实例
        //IVisualService visualService = VisualServiceImpl.getInstance();
        //获取全局的IVisualService实例
        IVisualService visualService = VisualDefaultClient.iVisualService;

        visualService.setAccessKey("");
        visualService.setSecretKey("");

        VisualH5TokenRequest visualCertTokenRequest=new VisualH5TokenRequest();
        visualCertTokenRequest.setReqKey("cert_h5_token");
        visualCertTokenRequest.setH5ConfigId("");
        visualCertTokenRequest.setStsToken("");
        visualCertTokenRequest.setIdcardName("");
        visualCertTokenRequest.setIdcardNo("");
        visualCertTokenRequest.setRefImage("");
        try {
            VisualH5TokenResponse response = visualService.certH5Token(visualCertTokenRequest);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
