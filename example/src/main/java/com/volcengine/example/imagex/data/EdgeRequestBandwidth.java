package com.volcengine.example.imagex.data;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.imagex.data.DescribeImageXEdgeRequestBandwidthReq;
import com.volcengine.model.imagex.data.DescribeImageXEdgeRequestBandwidthResp;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

public class EdgeRequestBandwidth {
    public static void main(String[] args) {
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXEdgeRequestBandwidthReq req = new DescribeImageXEdgeRequestBandwidthReq();
        req.setStartTime("2023-01-21T00:00:00+08:00");
        req.setEndTime("2023-01-28T00:00:00+08:00");
        req.setInterval("300");

        try {
            DescribeImageXEdgeRequestBandwidthResp resp = service.describeImageXEdgeRequestBandwidth(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
