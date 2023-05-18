package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualImageCutRequest;
import com.volcengine.service.visual.model.response.VisualImageCutResponse;

public class ImageCutDemo {
    
    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you don't set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");
        
        VisualImageCutRequest req = new VisualImageCutRequest();
        req.setImageBase64("image_base64");
        req.setWidth(128);
        req.setHeight(128);
        req.setCutMethod("fix_size");

        try {
            VisualImageCutResponse response = visualService.imageCut(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}