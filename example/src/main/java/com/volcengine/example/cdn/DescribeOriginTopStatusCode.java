package com.volcengine.example.cdn;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.beans.CDN;
import com.volcengine.service.cdn.CDNService;
import com.volcengine.service.cdn.impl.CDNServiceImpl;

public class DescribeOriginTopStatusCode {
    public static void main(String[] args) {
        CDNService service = CDNServiceImpl.getInstance();
        service.setAccessKey(Utils.ak);
        service.setSecretKey(Utils.sk);
        try {
            CDN.DescribeOriginTopStatusCodeRequest req = new CDN.DescribeOriginTopStatusCodeRequest()
                    .setMetric("status_5xx")
                    .setItem("domain")
                    .setDomain(Utils.exampleHost);;
            CDN.DescribeOriginTopStatusCodeResponse resp = service.describeOriginTopStatusCode(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
        service.destroy();
    }
}
