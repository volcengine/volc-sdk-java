package com.volcengine.example.imagex.data;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.imagex.data.DescribeImageXMirrorRequestHttpCodeOverviewReq;
import com.volcengine.model.imagex.data.DescribeImageXMirrorRequestHttpCodeOverviewResp;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

public class MirrorRequestHttpCodeOverview {
    public static void main(String[] args) {
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXMirrorRequestHttpCodeOverviewReq req = new DescribeImageXMirrorRequestHttpCodeOverviewReq();
        req.setStartTime("2023-01-21T00:00:00+08:00");
        req.setEndTime("2023-01-28T00:00:00+08:00");
        req.setGranularity("5m");
        req.setAggregateCode("false");

        try {
            DescribeImageXMirrorRequestHttpCodeOverviewResp resp = service.describeImageXMirrorRequestHttpCodeOverview(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
