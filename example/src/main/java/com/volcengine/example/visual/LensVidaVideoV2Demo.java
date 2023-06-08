package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualLensVidaVideoSubmitTaskV2Request;
import com.volcengine.service.visual.model.response.VisualLensVidaVideoSubmitTaskV2Response;

public class LensVidaVideoV2Demo {

    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");
        //提交任务
        VisualLensVidaVideoSubmitTaskV2Request req = new VisualLensVidaVideoSubmitTaskV2Request();
        req.setReqKey("lens_vida_video");
        req.setUrl("https://xxxx");
        req.setVidaMode("vida_simple");

        try {
            VisualLensVidaVideoSubmitTaskV2Response response = visualService.lensVidaVideoSubmitTaskV2(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }

//        // 查询任务
//        VisualLensVidaVideoGetResultV2Request req = new VisualLensVidaVideoGetResultV2Request();
//        req.setReqKey("lens_vida_video");
//        req.setTaskId("");
//
//        try {
//            VisualLensVidaVideoGetResultV2Response response = visualService.lensVidaVideoGetResultV2(req);
//            System.out.println(JSON.toJSONString(response));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}