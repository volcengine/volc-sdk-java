package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualAIGufengRequest;
import com.volcengine.service.visual.model.response.VisualAIGufengResponse;

import java.util.ArrayList;

public class AIGufengDemo {

    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");

        VisualAIGufengRequest req = new VisualAIGufengRequest();
        req.setReqKey("ai_gufeng");
//        ArrayList<String> binaryData = new ArrayList<>();
//        binaryData.add("image_base64");
//        req.setBinaryDataBase64(binaryData);
        ArrayList<String> imageUrls = new ArrayList<>();
        imageUrls.add("https://xxxx");
        req.setImage_urls(imageUrls);

        try {
            VisualAIGufengResponse response = visualService.aiGufeng(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}