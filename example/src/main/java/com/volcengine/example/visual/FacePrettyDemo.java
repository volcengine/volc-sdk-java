package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualFacePrettyRequest;
import com.volcengine.service.visual.model.response.VisualFacePrettyResponse;

public class FacePrettyDemo {
    
    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you don't set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");
        
        VisualFacePrettyRequest req = new VisualFacePrettyRequest();
        req.setImageBase64("image_base64");
        req.setDoRisk(true);

        try {
            VisualFacePrettyResponse response = visualService.facePretty(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}