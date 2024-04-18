package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualFaceFusionMovieGetResultRequest;
import com.volcengine.service.visual.model.request.VisualFaceFusionMovieSubmitTaskRequest;
import com.volcengine.service.visual.model.response.VisualFaceFusionMovieGetResultResponse;
import com.volcengine.service.visual.model.response.VisualFaceFusionMovieSubmitTaskResponse;

import java.util.ArrayList;

public class FaceFusionMovieDemo {
    
    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("your ak");
        visualService.setSecretKey("your sk");
        //提交任务
        VisualFaceFusionMovieSubmitTaskRequest req = new VisualFaceFusionMovieSubmitTaskRequest();
        req.setReqKey("facefusionmovie_standard");//3.x版本更换reqKey,facefusionmovie_standard_v2
        req.setVideoUrl("");
        req.setImageUrl("");
        req.setRefImgUrl("");
        req.setSourceSimilarity("");
        //水印信息
//        VisualFaceFusionMovieSubmitTaskRequest.LogoInfo  logoInfo= new VisualFaceFusionMovieSubmitTaskRequest.LogoInfo();
//        logoInfo.setAddlogo(true);
//        logoInfo.setPosition(2);
//        logoInfo.setLanguage(0);
//        logoInfo.setOpacity(0.9);
//        req.setLogoInfo(logoInfo);
        //3.x版本参数
//        req.setEnableFaceBeautify(false);
//        req.setSharpening(0);
//        req.setWhitening(0);
//        req.setDermabrasion(0);
//        req.setGpen(1);
        try {
            VisualFaceFusionMovieSubmitTaskResponse response = visualService.faceFusionMovieSubmitTask(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 查询任务
//        VisualFaceFusionMovieGetResultRequest req = new VisualFaceFusionMovieGetResultRequest();
//        req.setReqKey("facefusionmovie_standard");//3.x版本更换reqKey,facefusionmovie_standard_v2
//        req.setTaskId("task_id");
//
//        try {
//            VisualFaceFusionMovieGetResultResponse response = visualService.faceFusionMovieGetResult(req);
//            System.out.println(JSON.toJSONString(response));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}