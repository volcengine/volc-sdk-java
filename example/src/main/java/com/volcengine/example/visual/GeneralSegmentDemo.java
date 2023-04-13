package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualGeneralSegmentRequest;
import com.volcengine.service.visual.model.response.VisualGeneralSegmentResponse;

public class GeneralSegmentDemo {
    
    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");

        VisualGeneralSegmentRequest req = new VisualGeneralSegmentRequest();
        req.setImageBase64("image_base64");
        req.setReturnForegroundImage(1);

        try {
            VisualGeneralSegmentResponse response = visualService.generalSegment(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}