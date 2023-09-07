package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.FaceCompareRequest;
import com.volcengine.service.visual.model.request.VisualCertConfigInitRequest;
import com.volcengine.service.visual.model.response.FaceCompareResponse;
import com.volcengine.service.visual.model.response.VisualCertConfigInitResponse;

import java.util.ArrayList;
import java.util.List;

public class FaceCompareDemo {

    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();


        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");
        FaceCompareRequest request=new FaceCompareRequest();
        request.setReqKey("face_compare");
        ArrayList<String> faceBase64=new ArrayList<>();
        faceBase64.add("");
        request.setBinaryDataBase64(faceBase64);
        try {
            FaceCompareResponse response = visualService.faceCompare(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
