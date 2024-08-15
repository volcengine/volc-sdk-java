package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.response.VisualHighAesSmartDrawingResponse;

import java.util.ArrayList;
import java.util.List;

public class Img2ImgXLSftDemo {
    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("");
        visualService.setSecretKey("");

        JSONObject req=new JSONObject();
        req.put("req_key","i2i_xl_sft");
        List<String> images=new ArrayList<>();
        images.add("");
        req.put("image_urls",images);
        req.put("prompt","");
        req.put("return_url",true);

        try {
            Object response = visualService.img2ImgXLSft(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
