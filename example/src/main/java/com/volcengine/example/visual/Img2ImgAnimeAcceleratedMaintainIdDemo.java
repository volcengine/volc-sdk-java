package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.response.Img2ImgAnimeAcceleratedMaintainIDResponse;

import java.util.ArrayList;

public class Img2ImgAnimeAcceleratedMaintainIdDemo {


    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();

        visualService.setAccessKey("");
        visualService.setSecretKey("");

        JSONObject req = new JSONObject();
        req.put("req_key", "img2img_anime_accelerated_maintain_id");
        ArrayList<String> binaryDataBase64 = new ArrayList<String>();
        binaryDataBase64.add("");
        req.put("binary_data_base64", binaryDataBase64);
        req.put("return_url",true);
        try {
            Img2ImgAnimeAcceleratedMaintainIDResponse response = visualService.img2ImgAnimeAcceleratedMaintainID(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
