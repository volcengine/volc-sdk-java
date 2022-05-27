package com.volcengine.example.cdn;
import java.util.Date;
import com.alibaba.fastjson.JSON;
import com.volcengine.model.beans.CDN;
import com.volcengine.service.cdn.CDNService;
import com.volcengine.service.cdn.impl.CDNServiceImpl;

public class DescribeCdnDataDetail {
    public static void main(String[] args) {
        CDNService service = CDNServiceImpl.getInstance();
        service.setAccessKey(Utils.ak);
        service.setSecretKey(Utils.sk);
        try {
            CDN.DescribeCdnDataDetailRequest req = new CDN.DescribeCdnDataDetailRequest()
                    .setStartTime(new Date().getTime()/1000 - 3600)
                    .setEndTime(new Date().getTime()/1000)
                    .setMetric("flux")
                    .setDomain(Utils.exampleHost);

            CDN.DescribeCdnDataDetailResponse resp = service.describeCdnDataDetail(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
