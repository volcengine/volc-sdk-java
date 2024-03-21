package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualImg2ImgInpaintingEditRequest;
import com.volcengine.service.visual.model.request.VisualImg2ImgInpaintingRequest;
import com.volcengine.service.visual.model.response.VisualImg2ImgInpaintingEditResponse;
import com.volcengine.service.visual.model.response.VisualImg2ImgInpaintingResponse;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Base64;

public class Img2ImgInpaintingEditDemo {
    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("your ak");
        visualService.setSecretKey("your sk");

        VisualImg2ImgInpaintingEditRequest req = new VisualImg2ImgInpaintingEditRequest();
        req.setReqKey("i2i_inpainting_edit");
        ArrayList<String> binaryDataBase64 = new ArrayList<String>();
        binaryDataBase64.add("imageBase64");
        binaryDataBase64.add("imageBase64");
        req.setBinary_data_base64(binaryDataBase64);
        req.setCustomPrompt("");
//        req.setSteps(25);
//        req.setScale(5);
//        req.setSeed(-1);
        try {
            VisualImg2ImgInpaintingEditResponse response = visualService.imgInpaintingEdit(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}