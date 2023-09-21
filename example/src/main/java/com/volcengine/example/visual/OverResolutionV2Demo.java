package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.OverResolutionV2Request;
import com.volcengine.service.visual.model.response.OverResolutionV2Response;

import java.io.IOException;
import java.util.ArrayList;

public class OverResolutionV2Demo {
    public static void main(String[] args) throws IOException {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("your ak");
        visualService.setSecretKey("your sk");
        //提交任务
        OverResolutionV2Request req = new OverResolutionV2Request();
        req.setReqKey("lens_vida_nnsr");
        ArrayList<String> list=new ArrayList<>();
        list.add("");
        req.setBinaryDataBase64(list);
        try {
            OverResolutionV2Response response = visualService.OverResolutionV2(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
