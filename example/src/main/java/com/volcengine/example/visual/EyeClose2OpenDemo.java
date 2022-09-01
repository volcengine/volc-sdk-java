package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualEyeClose2OpenRequest;
import com.volcengine.service.visual.model.response.VisualEyeClose2OpenResponse;

public class EyeClose2OpenDemo {
    
    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");
        
        VisualEyeClose2OpenRequest req = new VisualEyeClose2OpenRequest();
        req.setImageBase64("image_base64");

        try {
            VisualEyeClose2OpenResponse response = visualService.eyeClose2Open(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}