package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualFaceSwapV2Request;
import com.volcengine.service.visual.model.response.VisualFaceSwapV2Response;

import java.util.ArrayList;

public class FaceSwapV2Demo {
    
    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("your ak");
        visualService.setSecretKey("your sk");

        VisualFaceSwapV2Request req = new VisualFaceSwapV2Request();
        //注意 3.0版本传faceswap || 3.3版本传face_swap3_3
        req.setReqKey("face_swap3_3");
        ArrayList<String> list=new ArrayList<>();
        list.add("");
        list.add("");
        req.setImageUrls(list);
        req.setFaceType("area");
        ArrayList<VisualFaceSwapV2Request.MergeInfos> mergeInfosList= new ArrayList<>();
        VisualFaceSwapV2Request.MergeInfos mergeInfos=new VisualFaceSwapV2Request.MergeInfos();
        mergeInfos.setLocation(1);
        mergeInfos.setTemplate_location(1);
        mergeInfosList.add(mergeInfos);
        req.setMergeInfos(mergeInfosList);
        req.setDoRisk(false);
        req.setSourceSimilarity("1");
        try {
            VisualFaceSwapV2Response response = visualService.faceSwapV2(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}