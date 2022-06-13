package com.volcengine.example.cdn;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.beans.CDN;
import com.volcengine.service.cdn.CDNService;
import com.volcengine.service.cdn.impl.CDNServiceImpl;

public class DescribeCdnAccountingData {
    public static void main(String[] args) {
        CDNService service = CDNServiceImpl.getInstance();
        service.setAccessKey(Utils.ak);
        service.setSecretKey(Utils.sk);
        try {
            CDN.DescribeAccountingDataRequest req = new CDN.DescribeAccountingDataRequest()
                .setDomain(Utils.exampleHost)
                .setStartTime(Utils.startTime)
                .setEndTime(Utils.endTime)
                .setMetric("flux");

            CDN.DescribeAccountingDataResponse resp = service.describeAccountingData(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
