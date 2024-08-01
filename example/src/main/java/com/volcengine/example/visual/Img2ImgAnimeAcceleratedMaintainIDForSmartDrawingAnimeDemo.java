package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.response.Img2ImgAnimeAcceleratedMaintainIDForSmartDrawingAnimeResponse;
import com.volcengine.service.visual.model.response.Img2ImgAnimeAcceleratedMaintainIDResponse;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Base64;

public class Img2ImgAnimeAcceleratedMaintainIDForSmartDrawingAnimeDemo {
    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();

        visualService.setAccessKey("your ak");
        visualService.setSecretKey("your sk");

        JSONObject req = new JSONObject();
        req.put("req_key", "img2img_anime_accelerated_maintain_id_for_smart_drawing_anime");
        ArrayList<String> binaryDataBase64 = new ArrayList<String>();
        binaryDataBase64.add("");
        req.put("image_urls", binaryDataBase64);
        req.put("return_url",true);
        try {
            Img2ImgAnimeAcceleratedMaintainIDForSmartDrawingAnimeResponse response = visualService.Img2ImgAnimeAcceleratedMaintainIDForSmartDrawingAnime(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
