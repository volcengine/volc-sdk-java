package com.volcengine.example.imagex;

import com.volcengine.model.request.GetImageComicResultRequest;
import com.volcengine.model.response.GetImageComicResultResponse;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

/**
 * 图像动漫化
 */
public class ExtensionGetImageComicResult {
    public static void main(String[] args) {
        // 默认 ImageX 实例为 `cn-north-1`，如果您想使用其他区域的实例，请使用 `ImageXServiceImpl.GetInstance(区域名)` 显式指定区域
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        GetImageComicResultRequest req = new GetImageComicResultRequest();
        req.setServiceId("service id"); // 服务 ID
        req.setStoreUri("uri");         // 文件的 Store URI

        try {
            GetImageComicResultResponse resp = service.getImageComicResult(req);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
