package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualFaceSwapRequest;
import com.volcengine.service.visual.model.response.VisualFaceSwapResponse;

public class FaceSwapDemo {
    
    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");

        VisualFaceSwapRequest req = new VisualFaceSwapRequest();
        req.setImageBase64("image_base64");
        req.setTemplateBase64("template_base64");
        req.setActionId("faceswap");

        try {
            VisualFaceSwapResponse response = visualService.faceSwap(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}