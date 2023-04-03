package com.volcengine.example.imagex;

import com.volcengine.model.imagex.DescribeImageVolcCdnAccessLogReq;
import com.volcengine.model.imagex.DescribeImageVolcCdnAccessLogResp;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

/**
 * 查询离线日志下载地址
 */
public class DescribeImageVolcCdnAccessLogDemo {
    public static void main(String[] args) {
        // 默认 ImageX 实例为 `cn-north-1`，如果您想使用其他区域的实例，请使用 `ImageXServiceImpl.GetInstance(区域名)` 显式指定区域
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeImageVolcCdnAccessLogReq req = new DescribeImageVolcCdnAccessLogReq();
        req.setServiceId("service id");
        req.setStartTime(1680500000);
        req.setEndTime(1680515000);
        req.setDomain("example.com");
        req.setRegion("global");
        req.setPageNum(1);
        req.setPageSize(10);

        try {
            DescribeImageVolcCdnAccessLogResp resp = service.describeImageVolcCdnAccessLog(req);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
