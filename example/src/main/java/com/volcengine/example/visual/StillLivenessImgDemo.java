package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.FaceCompareRequest;
import com.volcengine.service.visual.model.request.StillLivenessImgRequest;
import com.volcengine.service.visual.model.response.FaceCompareResponse;
import com.volcengine.service.visual.model.response.StillLivenessImgResponse;

import java.util.ArrayList;

public class StillLivenessImgDemo {

    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();


        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");
        StillLivenessImgRequest request=new StillLivenessImgRequest();
        request.setReqKey("still_liveness");
        ArrayList<String> faceBase64=new ArrayList<>();
        faceBase64.add("");
        request.setBinaryDataBase64(faceBase64);
        request.setImageUrls(null);
        try {
            StillLivenessImgResponse response = visualService.stillLivenessImg(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
