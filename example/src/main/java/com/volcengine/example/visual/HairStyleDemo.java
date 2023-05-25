package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualHairStyleRequest;
import com.volcengine.service.visual.model.response.VisualHairStyleResponse;

public class HairStyleDemo {
    
    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you don't set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");
        
        VisualHairStyleRequest req = new VisualHairStyleRequest();
        req.setImageBase64("image_base64");
        req.setHairType("0");
        req.setDoRisk(true);

        try {
            VisualHairStyleResponse response = visualService.hairStyle(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}