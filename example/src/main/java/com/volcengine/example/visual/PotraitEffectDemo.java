package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualPotraitEffectRequest;
import com.volcengine.service.visual.model.response.VisualPotraitEffectResponse;

public class PotraitEffectDemo {
    
    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you don't set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");
        
        VisualPotraitEffectRequest req = new VisualPotraitEffectRequest();
//        req.setImageBase64("image_base64");
        req.setImageUrl("http://xxxx");
        req.setType("pixar");
//        req.setReturnType(0);

        try {
            VisualPotraitEffectResponse response = visualService.potraitEffect(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}