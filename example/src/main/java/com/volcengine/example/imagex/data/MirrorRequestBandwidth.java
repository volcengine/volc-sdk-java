package com.volcengine.example.imagex.data;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.imagex.data.DescribeImageXMirrorRequestBandwidthReq;
import com.volcengine.model.imagex.data.DescribeImageXMirrorRequestBandwidthResp;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

public class MirrorRequestBandwidth {
    public static void main(String[] args) {
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXMirrorRequestBandwidthReq req = new DescribeImageXMirrorRequestBandwidthReq();
        req.setStartTime("2023-01-21T00:00:00+08:00");
        req.setEndTime("2023-01-28T00:00:00+08:00");
        req.setInterval("5m");

        try {
            DescribeImageXMirrorRequestBandwidthResp resp = service.describeImageXMirrorRequestBandwidth(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
