package com.volcengine.example.cdn;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.beans.CDN;
import com.volcengine.service.cdn.CDNService;
import com.volcengine.service.cdn.impl.CDNServiceImpl;

public class BatchDeployCert {
    public static void main(String[] args) {
        CDNService service = CDNServiceImpl.getInstance();
        service.setAccessKey(Utils.ak);
        service.setSecretKey(Utils.sk);
        try {
            CDN.BatchDeployCertRequest req = new CDN.BatchDeployCertRequest()
                    .setCertId("cert-c195f679cecb4fc5yjt3dd8c54e6c0a2")
                    .setDomain("www.example.com,img.example.com");
            CDN.BatchDeployCertResponse resp = service.batchDeployCert(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
