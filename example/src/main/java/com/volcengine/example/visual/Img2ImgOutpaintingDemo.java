package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualImg2ImgInpaintingEditRequest;
import com.volcengine.service.visual.model.request.VisualImg2ImgOutpaintingRequest;
import com.volcengine.service.visual.model.response.VisualImg2ImgInpaintingEditResponse;
import com.volcengine.service.visual.model.response.VisualImg2ImgOutpaintingResponse;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Base64;

public class Img2ImgOutpaintingDemo {
    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("your ak");
        visualService.setSecretKey("your sk");

        VisualImg2ImgOutpaintingRequest req = new VisualImg2ImgOutpaintingRequest();
        req.setReqKey("i2i_outpainting");
        ArrayList<String> binaryDataBase64 = new ArrayList<String>();
        binaryDataBase64.add("imageBase64");
        binaryDataBase64.add("imageBase64");
        req.setBinary_data_base64(binaryDataBase64);
        req.setCustomPrompt("");
//        req.setSteps(30);
//        req.setStrength(0.8);
//        req.setRight(7.0);
//        req.setSeed(0);
//        req.setTop(0.1);
//        req.setBottom(0.1);
//        req.setLeft(0.1);
//        req.setRight(0.1);
//        req.setMax_height(1920);
//        req.setMax_width(1920);
        try {
            VisualImg2ImgOutpaintingResponse response = visualService.Img2ImgOutpainting(req);
            System.out.println(JSON.toJSONString(response.toString()));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}