package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.CertSrcFaceCompRequest;
import com.volcengine.service.visual.model.request.VisualCertTokenRequest;
import com.volcengine.service.visual.model.response.CertSrcFaceCompResponse;
import com.volcengine.service.visual.model.response.VisualCertTokenResponse;

import java.util.ArrayList;

public class CertTokenDemo {

    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();

        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");

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
    }
}
