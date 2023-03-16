package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualT2ILDMRequest;
import com.volcengine.service.visual.model.response.VisualT2ILDMResponse;

public class T2ILDMDemo {
    
    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");
        
        VisualT2ILDMRequest req = new VisualT2ILDMRequest();
        req.setReqKey("t2i_ldm");
        req.setText("大草原上一群羊");
        req.setStyleTerm("cubism style");

        try {
            VisualT2ILDMResponse response = visualService.t2ILDM(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}