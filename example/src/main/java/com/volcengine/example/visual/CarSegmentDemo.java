package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualCarSegmentRequest;
import com.volcengine.service.visual.model.response.VisualCarSegmentResponse;

public class CarSegmentDemo {
    
    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");
        
        VisualCarSegmentRequest req = new VisualCarSegmentRequest();
        req.setImageBase64("image_base64");

        try {
            VisualCarSegmentResponse response = visualService.carSegment(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}