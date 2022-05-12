package com.volcengine.example.cdn;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.beans.CDN;
import com.volcengine.service.cdn.CDNService;
import com.volcengine.service.cdn.impl.CDNServiceImpl;

public class DescribeCdnRegionAndIsp {
    public static void main(String[] args) {
        CDNService service = CDNServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");
        try {
            CDN.DescribeCdnRegionAndIspRequest req = new CDN.DescribeCdnRegionAndIspRequest()
                    .setArea("China");

            CDN.DescribeCdnRegionAndIspResponse resp = service.describeCdnRegionAndIsp(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
