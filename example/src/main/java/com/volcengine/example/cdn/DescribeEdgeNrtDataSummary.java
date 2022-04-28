package com.volcengine.example.cdn;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.beans.CDN;
import com.volcengine.service.cdn.CDNService;
import com.volcengine.service.cdn.impl.CDNServiceImpl;

public class DescribeEdgeNrtDataSummary {
    public static void main(String[] args) {
        CDNService service = CDNServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");
        try {
            CDN.DescribeEdgeNrtDataSummaryRequest req = new CDN.DescribeEdgeNrtDataSummaryRequest()
                    .setStartTime(Utils.startTime)
                    .setEndTime(Utils.endTime)
                    .setMetric("flux");

            CDN.DescribeEdgeNrtDataSummaryResponse resp = service.describeEdgeNrtDataSummary(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
