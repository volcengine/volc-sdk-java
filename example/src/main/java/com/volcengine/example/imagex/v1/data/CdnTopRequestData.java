package com.volcengine.example.imagex.v1.data;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.imagex.data.DescribeImageXCDNTopRequestDataReq;
import com.volcengine.model.imagex.data.DescribeImageXCDNTopRequestDataResp;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

public class CdnTopRequestData {
    public static void main(String[] args) {
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXCDNTopRequestDataReq req = new DescribeImageXCDNTopRequestDataReq();
        req.setKeyType("Domain");
        req.setValueType("Traffic");
        req.setStartTime("2023-01-21T00:00:00+08:00");
        req.setEndTime("2023-01-28T00:00:00+08:00");

        try {
            DescribeImageXCDNTopRequestDataResp resp = service.describeImageXCDNTopRequestData(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
