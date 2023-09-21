package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.response.RawResponse;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.VisualDefaultClient;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.CertSrcFaceCompRequest;
import com.volcengine.service.visual.model.response.CertSrcFaceCompResponse;

public class CertSrcFaceCompDemo {
    public static void main(String[] args) {

        //获取IVisualService新实例
        //IVisualService visualService = VisualServiceImpl.getInstance();
        //获取全局的IVisualService实例
        IVisualService visualService = VisualDefaultClient.iVisualService;

        visualService.setAccessKey("your ak");
        visualService.setSecretKey("your sk");
        CertSrcFaceCompRequest req = new CertSrcFaceCompRequest();
        req.setReqKey("cert_src_face_comp");
        req.setIdcardNo("");
        req.setIdcardName("");
        req.setImage("");
        try {
            CertSrcFaceCompResponse response = visualService.certSrcFaceComp(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
           e.printStackTrace();
        }

        //certSrcFaceCompV2直接返回response
//        CertSrcFaceCompRequest req = new CertSrcFaceCompRequest();
//        req.setReqKey("cert_src_face_comp");
//        req.setIdcardNo("");
//        req.setIdcardName("");
//        req.setImage("");
//        Object o = visualService.certSrcFaceCompV2(req);
//        System.out.println(JSON.toJSONString(o));
    }

}
