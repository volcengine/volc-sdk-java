package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualDistortionFreeRequest;
import com.volcengine.service.visual.model.response.VisualDistortionFreeResponse;

public class DistortionFreeDemo {
    
    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");
        
        VisualDistortionFreeRequest req = new VisualDistortionFreeRequest();
        req.setImageBase64("image_base64");

        try {
            VisualDistortionFreeResponse response = visualService.distortionFree(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}