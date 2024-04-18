package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.volcengine.model.request.AssumeRoleRequest;
import com.volcengine.model.response.AssumeRoleResponse;
import com.volcengine.service.sts.ISTSService;
import com.volcengine.service.sts.impl.STSServiceImpl;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.VisualDefaultClient;
import com.volcengine.service.visual.model.request.VisualCertH5ConfigInitRequest;
import com.volcengine.service.visual.model.request.VisualCertQueryProRequest;
import com.volcengine.service.visual.model.request.VisualH5TokenRequest;
import com.volcengine.service.visual.model.response.VisualCertQueryProResponse;
import com.volcengine.service.visual.model.response.VisualH5CertConfigInitResponse;
import com.volcengine.service.visual.model.response.VisualH5TokenResponse;

public class CertH5VerifyQueryDemo {
    public static void main(String[] args) {
        //获取IVisualService新实例
        //IVisualService visualService = VisualServiceImpl.getInstance();
        //获取全局的IVisualService实例
        IVisualService visualService = VisualDefaultClient.iVisualService;

        visualService.setAccessKey("your ak");
        visualService.setSecretKey("your sk");

        VisualCertQueryProRequest req = new VisualCertQueryProRequest();
        req.setReqKey("cert_pro_verify_query");
        req.setBytedToken("");
        req.setOmitData(false);
        req.setOmitImageData(false);
        req.setOmitVideoData(false);
        req.setIncludeIdcardData(false);
        try {
            VisualCertQueryProResponse response = visualService.certQueryPro(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
