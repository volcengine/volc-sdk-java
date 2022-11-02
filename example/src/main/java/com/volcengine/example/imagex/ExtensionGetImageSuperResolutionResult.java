package com.volcengine.example.imagex;

import com.volcengine.model.request.GetImageSuperResolutionResultRequest;
import com.volcengine.model.response.GetImageSuperResolutionResultResponse;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

/**
 * 超级分辨率
 */
public class ExtensionGetImageSuperResolutionResult {
    public static void main(String[] args) {
        // 默认 ImageX 实例为 `cn-north-1`，如果您想使用其他区域的实例，请使用 `ImageXServiceImpl.GetInstance(区域名)` 显式指定区域
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");


        GetImageSuperResolutionResultRequest req = new GetImageSuperResolutionResultRequest();
        req.setServiceId("service id"); // 服务 ID
        req.setStoreUri("store uri");   // 文件的 Store URI
        req.setMultiple(2.0);           // 倍率

        try {
            GetImageSuperResolutionResultResponse resp = service.getImageSuperResolutionResult(req);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
