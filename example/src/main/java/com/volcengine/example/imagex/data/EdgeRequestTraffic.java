package com.volcengine.example.imagex.data;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.imagex.data.DescribeImageXEdgeRequestTrafficReq;
import com.volcengine.model.imagex.data.DescribeImageXEdgeRequestTrafficResp;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.extension.DataModule;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

public class EdgeRequestTraffic {
    public static void main(String[] args) {
        DataModule.AddDataModule();

        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXEdgeRequestTrafficReq req = new DescribeImageXEdgeRequestTrafficReq();
        req.setStartTime("2023-01-21T00:00:00+08:00");
        req.setEndTime("2023-01-28T00:00:00+08:00");
        req.setInterval("300");

        try {
            DescribeImageXEdgeRequestTrafficResp resp = DataModule.describeImageXEdgeRequestTraffic(service, req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
