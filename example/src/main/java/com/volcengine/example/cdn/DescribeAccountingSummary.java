package com.volcengine.example.cdn;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.beans.CDN;
import com.volcengine.service.cdn.CDNService;
import com.volcengine.service.cdn.impl.CDNServiceImpl;

public class DescribeAccountingSummary {
    public static void main(String[] args) {
        CDNService service = CDNServiceImpl.getInstance();
        service.setAccessKey(Utils.ak);
        service.setSecretKey(Utils.sk);
        try {
            CDN.DescribeAccountingSummaryRequest req = new CDN.DescribeAccountingSummaryRequest()
                    .setStartTime(Utils.startTime)
                    .setEndTime(Utils.endTime)
                    .setDomain("example.com");;
            CDN.DescribeAccountingSummaryResponse resp = service.describeAccountingSummary(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
        service.destroy();
    }
}
