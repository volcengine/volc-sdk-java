package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.CertSrcFaceCompRequest;
import com.volcengine.service.visual.model.response.CertSrcFaceCompResponse;

public class CertSrcFaceCompDemo {

    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");

        CertSrcFaceCompRequest req = new CertSrcFaceCompRequest();
        req.setReqKey("cert_src_face_comp");
        req.setIdcardNo("xxx");
        req.setIdcardName("name");
        req.setImage("image_base64");
        try {
            CertSrcFaceCompResponse response = visualService.certSrcFaceComp(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
