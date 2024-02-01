package com.volcengine.example.imagex.v1;

import com.volcengine.model.imagex.CreateImageContentTaskReq;
import com.volcengine.model.imagex.CreateImageContentTaskResp;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

import java.util.Collections;

/**
 * 刷新/预热/禁用/解禁
 * 创建刷新/预热/禁用/解禁任务
 */
public class CreateImageContentTaskDemo {
    public static void main(String[] args) {
        // 默认 ImageX 实例为 `cn-north-1`，如果您想使用其他区域的实例，请使用 `ImageXServiceImpl.GetInstance(区域名)` 显式指定区域
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        CreateImageContentTaskReq req = new CreateImageContentTaskReq();
        req.setServiceId("service id"); // 服务 ID
        req.setTaskType("block_url"); // 任务类型
        req.setUrls(Collections.singletonList("url")); // 待更新的文件 URL 列表（可以通过浏览器访问的完整 URL）

        try {
            CreateImageContentTaskResp resp = service.createImageContentTask(req);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
