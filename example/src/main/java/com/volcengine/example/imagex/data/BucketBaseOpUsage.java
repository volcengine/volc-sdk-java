package com.volcengine.example.imagex.data;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.imagex.data.DescribeImageXBaseOpUsageReq;
import com.volcengine.model.imagex.data.DescribeImageXBaseOpUsageResp;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.extension.DataModule;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

public class BucketBaseOpUsage {
    public static void main(String[] args) {
        DataModule.AddDataModule();

        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXBaseOpUsageReq req = new DescribeImageXBaseOpUsageReq();
        req.setStartTime("2023-01-21T00:00:00+08:00");
        req.setEndTime("2023-01-28T00:00:00+08:00");
        req.setInterval("300");

        try {
            DescribeImageXBaseOpUsageResp resp = DataModule.describeImageXBaseOpUsage(service, req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
