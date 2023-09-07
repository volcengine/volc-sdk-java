package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.ImageStyleConversionRequest;
import com.volcengine.service.visual.model.response.ImageStyleConversionResponse;

public class ImageStyleConversionDemo {

    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");

        ImageStyleConversionRequest req = new ImageStyleConversionRequest();
        req.setImageBase64("image_base64");
        req.setType("watercolor_cartoon");
        try {
            ImageStyleConversionResponse response = visualService.imageStyleConversion(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
