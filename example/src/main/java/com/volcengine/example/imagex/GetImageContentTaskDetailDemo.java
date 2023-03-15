package com.volcengine.example.imagex;

import com.volcengine.model.imagex.GetImageContentTaskDetailReq;
import com.volcengine.model.imagex.GetImageContentTaskDetailResp;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

/**
 * 刷新/预热/禁用/解禁
 * 获取任务详情
 */
public class GetImageContentTaskDetailDemo {
    public static void main(String[] args) {
        // 默认 ImageX 实例为 `cn-north-1`，如果您想使用其他区域的实例，请使用 `ImageXServiceImpl.GetInstance(区域名)` 显式指定区域
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        GetImageContentTaskDetailReq req = new GetImageContentTaskDetailReq();
        req.setServiceId("service id"); // 服务 ID
        req.setStartTime(0L);
        req.setEndTime(2147483647L);

        try {
            GetImageContentTaskDetailResp resp = service.getImageContentTaskDetail(req);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

