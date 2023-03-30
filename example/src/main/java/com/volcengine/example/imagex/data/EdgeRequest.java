package com.volcengine.example.imagex.data;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.imagex.data.DescribeImageXEdgeRequestReq;
import com.volcengine.model.imagex.data.DescribeImageXEdgeRequestResp;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

public class EdgeRequest {
    public static void main(String[] args) {
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXEdgeRequestReq req = new DescribeImageXEdgeRequestReq();
        req.setDataTypes("2xx,3xx,4xx,5xx");
        req.setGroupBy("DomainName,DataType");
        req.setStartTime("2023-01-21T00:00:00+08:00");
        req.setEndTime("2023-01-28T00:00:00+08:00");
        req.setInterval("300");

        try {
            DescribeImageXEdgeRequestResp resp = service.describeImageXEdgeRequest(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
