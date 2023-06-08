package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualConvertPhotoV2Request;
import com.volcengine.service.visual.model.response.VisualConvertPhotoV2Response;

import java.util.ArrayList;

public class ConvertPhotoV2Demo {

    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");
        
        VisualConvertPhotoV2Request req = new VisualConvertPhotoV2Request();
        req.setReqKey("lens_opr");

        ArrayList<String> binaryData = new ArrayList<>();
        binaryData.add("image_base64");
        req.setBinaryDataBase64(binaryData);
        req.setIsColor(true);

        try {
            VisualConvertPhotoV2Response response = visualService.convertPhotoV2(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}