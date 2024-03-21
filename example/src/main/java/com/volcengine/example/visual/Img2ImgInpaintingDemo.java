package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualImg2ImgInpaintingRequest;
import com.volcengine.service.visual.model.response.VisualImg2ImgInpaintingResponse;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Base64;

public class Img2ImgInpaintingDemo {
    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("your ak");
        visualService.setSecretKey("your sk");

        VisualImg2ImgInpaintingRequest req = new VisualImg2ImgInpaintingRequest();
        req.setReqKey("i2i_inpainting");
        ArrayList<String> binaryDataBase64 = new ArrayList<String>();
        binaryDataBase64.add("imageBase64");
        binaryDataBase64.add("imageBase64");
        req.setBinary_data_base64(binaryDataBase64);
//        req.setSteps(30);
//        req.setStrength(0.8);
//        req.setScale(7);
//        req.setSeed(0);
        try {
            VisualImg2ImgInpaintingResponse response = visualService.img2ImgInpainting(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}