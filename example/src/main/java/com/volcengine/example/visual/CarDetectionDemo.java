package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualCarDetectionRequest;
import com.volcengine.service.visual.model.response.VisualCarDetectionResponse;

public class CarDetectionDemo {
    
    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");
        
        VisualCarDetectionRequest req = new VisualCarDetectionRequest();
        req.setImageBase64("image_base64");

        try {
            VisualCarDetectionResponse response = visualService.carDetection(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}