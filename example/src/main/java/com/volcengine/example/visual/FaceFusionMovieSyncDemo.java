package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualFaceFusionMovieSyncRequest;
import com.volcengine.service.visual.model.response.VisualFaceFusionMovieSyncResponse;

public class FaceFusionMovieSyncDemo {
    
    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");

        //视频人脸融合同步接口
        VisualFaceFusionMovieSyncRequest req = new VisualFaceFusionMovieSyncRequest();
        req.setReqKey("facefusionmovie_standard");
        req.setImage_url("http://xxxxxx");
        req.setVideo_url("http://xxxxx");
        req.setEnableFaceBeautify(true);

        try {
            VisualFaceFusionMovieSyncResponse response = visualService.faceFusionMovieSync(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}