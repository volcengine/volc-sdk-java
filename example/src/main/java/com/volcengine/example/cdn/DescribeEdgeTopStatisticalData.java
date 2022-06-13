package com.volcengine.example.cdn;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.beans.CDN;
import com.volcengine.service.cdn.CDNService;
import com.volcengine.service.cdn.impl.CDNServiceImpl;

public class DescribeEdgeTopStatisticalData {
    public static void main(String[] args) {
        CDNService service = CDNServiceImpl.getInstance();
        service.setAccessKey(Utils.ak);
        service.setSecretKey(Utils.sk);
        try {
            CDN.DescribeEdgeTopStatisticalDataRequest req = new CDN.DescribeEdgeTopStatisticalDataRequest()
                .setStartTime(Utils.startTime)
                .setEndTime(Utils.endTime)
                .setMetric("clientIp")
                .setDomain(Utils.exampleHost)
                .setItem("region");

            CDN.DescribeEdgeTopStatisticalDataResponse resp = service.describeEdgeTopStatisticalData(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
