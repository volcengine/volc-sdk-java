package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualImageFlowRequest;
import com.volcengine.service.visual.model.response.VisualImageFlowResponse;

public class ImageFlowDemo {
    
    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");
        
        VisualImageFlowRequest req = new VisualImageFlowRequest();
        req.setImageBase64("image_base64");
        // req.setMotionRatio(2.0f);

        try {
            VisualImageFlowResponse response = visualService.imageFlow(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}