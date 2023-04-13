package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualVideoOverResolutionQueryTaskV2Request;
import com.volcengine.service.visual.model.request.VisualVideoOverResolutionSubmitTaskV2Request;
import com.volcengine.service.visual.model.response.VisualVideoOverResolutionQueryTaskV2Response;
import com.volcengine.service.visual.model.response.VisualVideoOverResolutionSubmitTaskV2Response;

public class VideoOverResolutionV2Demo {
    
    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");
        //提交任务
        VisualVideoOverResolutionSubmitTaskV2Request req = new VisualVideoOverResolutionSubmitTaskV2Request();
        req.setReqKey("lens_video_nnsr");
        req.setUrl("http://xxxxx");


        try {
            VisualVideoOverResolutionSubmitTaskV2Response response = visualService.videoOverResolutionSubmitTaskV2(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 查询任务
//        VisualVideoOverResolutionQueryTaskV2Request req = new VisualVideoOverResolutionQueryTaskV2Request();
//        req.setReqKey("lens_video_nnsr");
//        req.setTaskId("7221461931064033315");
//
//        try {
//            VisualVideoOverResolutionQueryTaskV2Response response = visualService.videoOverResolutionQueryTaskV2(req);
//            System.out.println(JSON.toJSONString(response));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}