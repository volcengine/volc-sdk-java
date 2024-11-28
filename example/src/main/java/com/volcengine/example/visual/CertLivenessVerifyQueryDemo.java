package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.VisualDefaultClient;
import com.volcengine.service.visual.model.request.VisualCertLivenessVerifyQueryRequest;
import com.volcengine.service.visual.model.request.VisualCertVerifyQueryRequest;
import com.volcengine.service.visual.model.response.VisualCertLivenessVerifyQueryResponse;
import com.volcengine.service.visual.model.response.VisualCertVerifyQueryResponse;

public class CertLivenessVerifyQueryDemo {

    public static void main(String[] args) {
        //获取IVisualService新实例
        //IVisualService visualService = VisualServiceImpl.getInstance();
        //获取全局的IVisualService实例
        IVisualService visualService = VisualDefaultClient.iVisualService;

        visualService.setAccessKey("your ak");
        visualService.setSecretKey("your sk");

        VisualCertLivenessVerifyQueryRequest request=new VisualCertLivenessVerifyQueryRequest();
        request.setReqKey("cert_pro_liveness_verify_query");
        request.setBytedToken("");
        request.setOmitData(false);
        request.setOmitImageData(false);
        request.setOmitVideoData(false);
        try {
            VisualCertLivenessVerifyQueryResponse response = visualService.CertLivenessVerifyQuery(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
