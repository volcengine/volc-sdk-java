package com.volcengine.example.imagex.data;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.imagex.data.DescribeImageXCompressUsageReq;
import com.volcengine.model.imagex.data.DescribeImageXCompressUsageResp;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.extension.DataModule;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

public class CompressUsage {
    public static void main(String[] args) {
        DataModule.AddDataModule();

        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXCompressUsageReq req = new DescribeImageXCompressUsageReq();
        req.setStartTime("2023-01-21T00:00:00+08:00");
        req.setEndTime("2023-01-28T00:00:00+08:00");
        req.setInterval("300");

        try {
            DescribeImageXCompressUsageResp resp = DataModule.describeImageXCompressUsage(service, req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
