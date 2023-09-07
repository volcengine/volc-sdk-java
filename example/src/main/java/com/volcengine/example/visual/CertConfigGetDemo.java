package com.volcengine.example.visual;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.impl.VisualServiceImpl;
import com.volcengine.service.visual.model.request.VisualCertConfigGetRequest;
import com.volcengine.service.visual.model.request.VisualCertConfigInitRequest;
import com.volcengine.service.visual.model.response.VisualCertConfigGetResponse;
import com.volcengine.service.visual.model.response.VisualCertConfigInitResponse;

public class CertConfigGetDemo {

    public static void main(String[] args) {
        IVisualService visualService = VisualServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config

        visualService.setAccessKey("ak");
        visualService.setSecretKey("sk");
        VisualCertConfigGetRequest request=new VisualCertConfigGetRequest();
        request.setReqKey("cert_config_get");
        request.setConfigId("configId");
        try {
            VisualCertConfigGetResponse response = visualService.certConfigGet(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
