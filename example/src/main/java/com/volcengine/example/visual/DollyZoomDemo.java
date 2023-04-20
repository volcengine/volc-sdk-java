package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualDollyZoomRequest;
import com.volcengine.service.visual.model.response.VisualDollyZoomResponse;

public class DollyZoomDemo {
    
    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you don't set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");
        
        VisualDollyZoomRequest req = new VisualDollyZoomRequest();
        req.setImageBase64("image_base64");
        req.setVideoType(0);
        req.setDeviceType(0);
        req.setVideoLength(2.5);

        try {
            VisualDollyZoomResponse response = visualService.dollyZoom(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}