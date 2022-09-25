package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualHumanSegmentRequest;
import com.volcengine.service.visual.model.response.VisualHumanSegmentResponse;

public class HumanSegmentDemo {
    
    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");
        
        VisualHumanSegmentRequest req = new VisualHumanSegmentRequest();
        req.setImageBase64("image_base64");
        // req.setRefine(1);
        // req.setReturnForegroundImage(1);

        try {
            VisualHumanSegmentResponse response = visualService.humanSegment(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}