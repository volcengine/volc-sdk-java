package com.volcengine.example.cdn;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.beans.CDN;
import com.volcengine.service.cdn.CDNService;
import com.volcengine.service.cdn.impl.CDNServiceImpl;

public class DescribeContentTasks {
    public static void main(String[] args) {
        CDNService service = CDNServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");
        try {
            CDN.DescribeContentTasksRequest req = new CDN.DescribeContentTasksRequest()
                    .setTaskType("file")
                    .setStartTime(Utils.startTime)
                    .setEndTime(Utils.endTime);
            CDN.DescribeContentTasksResponse resp = service.describeContentTasks(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
