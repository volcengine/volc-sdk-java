package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualEntitySegmentRequest;
import com.volcengine.service.visual.model.response.VisualEntitySegmentResponse;
import com.volcengine.service.visual.model.response.VisualHighAesSmartDrawingResponse;

import java.util.ArrayList;

public class EntitySegmentDemo {
    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("");
        visualService.setSecretKey("");

        VisualEntitySegmentRequest visualEntitySegmentRequest=new VisualEntitySegmentRequest();
        visualEntitySegmentRequest.setReqKey("entity_seg");
        visualEntitySegmentRequest.setReturnUrl(true);
        visualEntitySegmentRequest.setReturnFormat(1);
        ArrayList<String> image=new ArrayList<>();
        image.add("");
        visualEntitySegmentRequest.setImageUrls(image);
        try {
            VisualEntitySegmentResponse response = visualService.entitySegment(visualEntitySegmentRequest);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
