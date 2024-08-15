package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import java.util.ArrayList;
import java.util.List;

public class SaliencySegDemo {
    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("");
        visualService.setSecretKey("");

        JSONObject req=new JSONObject();
        req.put("req_key","saliency_seg");
        List<String> images=new ArrayList<>();
        images.add("");
        req.put("image_urls",images);
        req.put("only_mask",3);
        req.put("refine_mask",1);
        req.put("return_url",true);
        try {
            Object response = visualService.saliencySeg(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
