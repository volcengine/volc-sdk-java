package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualAllAgeGenerationRequest;
import com.volcengine.service.visual.model.response.VisualAllAgeGenerationResponse;

import java.util.ArrayList;

public class AllAgeGenerationDemo {

    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");
        
        VisualAllAgeGenerationRequest req = new VisualAllAgeGenerationRequest();
        req.setReqKey("all_age_generation");

        ArrayList<String> binaryData = new ArrayList<>();
        binaryData.add("image_base64");
        req.setBinaryDataBase64(binaryData);
        req.setTargetAge(5);

        try {
            VisualAllAgeGenerationResponse response = visualService.allAgeGeneration(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}