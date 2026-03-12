package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;

public class CVCancelTask {

    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("your ak");
        visualService.setSecretKey("your sk");

        JSONObject req=new JSONObject();
        req.put("req_key","");
        req.put("task_id","");

        try {
            Object response = visualService.cvCancelTask(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
