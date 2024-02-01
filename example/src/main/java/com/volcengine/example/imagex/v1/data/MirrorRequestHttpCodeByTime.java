package com.volcengine.example.imagex.v1.data;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.imagex.data.DescribeImageXMirrorRequestHttpCodeByTimeReq;
import com.volcengine.model.imagex.data.DescribeImageXMirrorRequestHttpCodeByTimeResp;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

public class MirrorRequestHttpCodeByTime {
    public static void main(String[] args) {
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXMirrorRequestHttpCodeByTimeReq req = new DescribeImageXMirrorRequestHttpCodeByTimeReq();
        req.setStartTime("2023-01-21T00:00:00+08:00");
        req.setEndTime("2023-01-28T00:00:00+08:00");
        req.setGranularity("5m");

        try {
            DescribeImageXMirrorRequestHttpCodeByTimeResp resp = service.describeImageXMirrorRequestHttpCodeByTime(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
