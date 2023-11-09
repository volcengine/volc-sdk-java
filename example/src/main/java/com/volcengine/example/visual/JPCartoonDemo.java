package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualJPCartoonRequest;
import com.volcengine.service.visual.model.response.VisualJPCartoonResponse;

public class JPCartoonDemo {
    
    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");
        
        VisualJPCartoonRequest req = new VisualJPCartoonRequest();
        req.setImageBase64("image_base64");
        //req.setImageUrl("image_url");
        // req.setCartoonType("jpcartoon_head"); // jpcartoon_head | jpcartoon | hkcartoon
        // req.setRotation(1);

        try {
            VisualJPCartoonResponse response = visualService.jpCartoon(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}