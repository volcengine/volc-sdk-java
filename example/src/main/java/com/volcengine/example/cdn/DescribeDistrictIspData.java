package com.volcengine.example.cdn;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.beans.CDN;
import com.volcengine.service.cdn.CDNService;
import com.volcengine.service.cdn.impl.CDNServiceImpl;

import java.util.Date;

public class DescribeDistrictIspData {
    public static void main(String[] args) {
        CDNService service = CDNServiceImpl.getInstance();
        service.setAccessKey(Utils.ak);
        service.setSecretKey(Utils.sk);
        try {
            CDN.DescribeDistrictIspDataRequest req = new CDN.DescribeDistrictIspDataRequest()
                    .setStartTime(new Date().getTime()/1000 - 3600)
                    .setEndTime(new Date().getTime()/1000)
                    .setMetric("bandwidth")
                    .setDomain(Utils.exampleHost);;
            CDN.DescribeDistrictIspDataResponse resp = service.describeDistrictIspData(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
        service.destroy();
    }
}
