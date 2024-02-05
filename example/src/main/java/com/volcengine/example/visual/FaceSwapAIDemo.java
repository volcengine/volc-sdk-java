package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualFaceSwapAIRequest;
import com.volcengine.service.visual.model.response.VisualFaceSwapAIResponse;

import java.util.ArrayList;

public class FaceSwapAIDemo {
    
    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("your ak");
        visualService.setSecretKey("your sk");

        VisualFaceSwapAIRequest req = new VisualFaceSwapAIRequest();
        req.setReqKey("faceswap_ai");
        ArrayList<String> list=new ArrayList<>();
        list.add("");
        list.add("");
        req.setImageUrls(list);
        req.setDoRisk(false);
        req.setGpen(0.4);
        req.setSkin(0.9);
        req.setTouRepair(0);
        try {
            VisualFaceSwapAIResponse response = visualService.faceSwapAI(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}