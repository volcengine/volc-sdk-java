package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualImageAnimationRequest;
import com.volcengine.service.visual.model.response.VisualImageAnimationResponse;

public class ImageAnimationDemo {
    
    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you don't set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");

        VisualImageAnimationRequest req = new VisualImageAnimationRequest();
        req.setImageBase64("image_base64");
        req.setType(0);

        try {
            VisualImageAnimationResponse response = visualService.imageAnimation(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}