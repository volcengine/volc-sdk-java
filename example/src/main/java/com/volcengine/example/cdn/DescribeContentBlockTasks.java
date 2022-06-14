package com.volcengine.example.cdn;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.beans.CDN;
import com.volcengine.service.cdn.CDNService;
import com.volcengine.service.cdn.impl.CDNServiceImpl;

public class DescribeContentBlockTasks {
    public static void main(String[] args) {
        CDNService service = CDNServiceImpl.getInstance();
        service.setAccessKey(Utils.ak);
        service.setSecretKey(Utils.sk);
        try {
            CDN.DescribeContentBlockTasksRequest req = new CDN.DescribeContentBlockTasksRequest()
                    .setTaskType("block_url")
                    .setStartTime(Utils.startTime)
                    .setEndTime(Utils.endTime);
            CDN.DescribeContentBlockTasksResponse resp = service.describeContentBlockTasks(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
