package com.volcengine.example.imagex.v1;

import com.volcengine.model.imagex.GetImageContentBlockListReq;
import com.volcengine.model.imagex.GetImageContentBlockListResp;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

/**
 * 刷新/预热/禁用/解禁
 * 获取禁用 URL 列表详情
 */
public class GetImageContentBlockListDemo {
    public static void main(String[] args) {
        // 默认 ImageX 实例为 `cn-north-1`，如果您想使用其他区域的实例，请使用 `ImageXServiceImpl.GetInstance(区域名)` 显式指定区域
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        GetImageContentBlockListReq req = new GetImageContentBlockListReq();
        req.setServiceId("service id"); // 服务 ID
        req.setStartTime(0L);
        req.setEndTime(2147483647L);

        try {
            GetImageContentBlockListResp resp = service.getImageContentBlockList(req);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
