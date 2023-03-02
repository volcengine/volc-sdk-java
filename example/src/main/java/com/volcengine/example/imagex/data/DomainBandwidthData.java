package com.volcengine.example.imagex.data;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.imagex.data.DescribeImageXDomainBandwidthDataReq;
import com.volcengine.model.imagex.data.DescribeImageXDomainBandwidthDataResp;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.extension.DataModule;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

public class DomainBandwidthData {
    public static void main(String[] args) {
        DataModule.AddDataModule();

        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageXDomainBandwidthDataReq req = new DescribeImageXDomainBandwidthDataReq();
        req.setStartTime("2023-01-21T00:00:00+08:00");
        req.setEndTime("2023-01-28T00:00:00+08:00");
        req.setInterval("300");

        try {
            DescribeImageXDomainBandwidthDataResp resp = DataModule.describeImageXDomainBandwidthData(service, req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
