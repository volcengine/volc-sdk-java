package com.volcengine.example.imagex.v1.data;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.imagex.data.DescribeImageXMirrorRequestTrafficReq;
import com.volcengine.model.imagex.data.DescribeImageXMirrorRequestTrafficResp;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

public class MirrorRequestTraffic {
    public static void main(String[] args) {
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXMirrorRequestTrafficReq req = new DescribeImageXMirrorRequestTrafficReq();
        req.setStartTime("2023-01-21T00:00:00+08:00");
        req.setEndTime("2023-01-28T00:00:00+08:00");
        req.setInterval("5m");

        try {
            DescribeImageXMirrorRequestTrafficResp resp = service.describeImageXMirrorRequestTraffic(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
