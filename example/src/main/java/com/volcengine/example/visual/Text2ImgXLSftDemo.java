package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualImg2ImgInpaintingRequest;
import com.volcengine.service.visual.model.response.VisualHighAesSmartDrawingResponse;
import com.volcengine.service.visual.model.response.VisualImg2ImgInpaintingResponse;

import java.util.ArrayList;

public class Text2ImgXLSftDemo {

    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("");
        visualService.setSecretKey("");

        JSONObject req=new JSONObject();
        req.put("req_key","t2i_xl_sft");
        req.put("prompt","");
        req.put("return_url",true);
        try {
            Object response =  visualService.text2ImgXLSft(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
