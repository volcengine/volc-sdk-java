package com.volcengine.example.imagex.data;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.imagex.data.DescribeImageXSummaryReq;
import com.volcengine.model.imagex.data.DescribeImageXSummaryResp;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.extension.DataModule;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

public class ImageXSummary {
    public static void main(String[] args) {
        DataModule.AddDataModule();

        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXSummaryReq req = new DescribeImageXSummaryReq();
        req.setServiceIds("service1,service2");
        req.setTimestamp("2023-02-08T00:00:00+08:00");

        try {
            DescribeImageXSummaryResp resp = DataModule.describeImageXSummary(service, req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
