package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualPoemMaterialRequest;
import com.volcengine.service.visual.model.response.VisualPoemMaterialResponse;

public class PoemMaterialDemo {
    
    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");
        
        VisualPoemMaterialRequest req = new VisualPoemMaterialRequest();
        req.setImageBase64("image_base64");

        try {
            VisualPoemMaterialResponse response = visualService.poemMaterial(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}