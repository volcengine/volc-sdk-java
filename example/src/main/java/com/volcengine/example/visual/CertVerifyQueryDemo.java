package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.VisualDefaultClient;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualCertVerifyQueryRequest;
import com.volcengine.service.visual.model.response.VisualCertVerifyQueryResponse;

public class CertVerifyQueryDemo {

    public static void main(String[] args) {
        //获取IVisualService新实例
        //IVisualService visualService = VisualServiceImpl.getInstance();
        //获取全局的IVisualService实例
        IVisualService visualService = VisualDefaultClient.iVisualService;

        visualService.setAccessKey("your ak");
        visualService.setSecretKey("your sk");

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
        //身份认证Query服务V2，返回全部response
//        VisualCertVerifyQueryRequest request=new VisualCertVerifyQueryRequest();
//        request.setReqKey("cert_verify_query");
//        request.setBytedToken("token");
//        request.setOmitData(false);
//        request.setOmitImageData(false);
//        request.setOmitVideoData(false);
//        Object response = visualService.certVerifyQueryV2(request);
//        System.out.println(JSON.toJSONString(response));




    }
}
