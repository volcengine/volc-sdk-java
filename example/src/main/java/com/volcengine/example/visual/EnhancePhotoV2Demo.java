package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualEnhancePhotoV2Request;
import com.volcengine.service.visual.model.response.VisualEnhancePhotoV2Response;

import java.util.ArrayList;

public class EnhancePhotoV2Demo {

    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");
        
        VisualEnhancePhotoV2Request req = new VisualEnhancePhotoV2Request();
        req.setReqKey("lens_lqir");

        ArrayList<String> binaryData = new ArrayList<>();
        binaryData.add("image_base64");
        req.setBinaryDataBase64(binaryData);

        try {
            VisualEnhancePhotoV2Response response = visualService.enhancePhotoV2(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}