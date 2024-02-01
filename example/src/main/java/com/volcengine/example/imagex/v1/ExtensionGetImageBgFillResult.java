package com.volcengine.example.imagex.v1;

import com.volcengine.model.request.GetImageBgFillResultRequest;
import com.volcengine.model.response.GetImageBgFillResultResponse;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

/**
 * 智能图像扩展
 */
public class ExtensionGetImageBgFillResult {
    public static void main(String[] args) {
        // 默认 ImageX 实例为 `cn-north-1`，如果您想使用其他区域的实例，请使用 `ImageXServiceImpl.GetInstance(区域名)` 显式指定区域
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        GetImageBgFillResultRequest req = new GetImageBgFillResultRequest();
        req.setServiceId("service id"); // 服务 ID
        req.setStoreUri("store uri");   // 文件的 Store URI
        req.setModel(0);                // 0 表示漫画模式, 1 表示一般模式
        req.setLeft(0.1);               // 向左延伸 10%
        req.setRight(0.1);              // 向右延伸 10%
        req.setTop(0.1);                // 向上延伸 10%
        req.setBottom(0.1);             // 向下延伸 10%

        try {
            GetImageBgFillResultResponse resp = service.getImageBgFillResult(req);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
