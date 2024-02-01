package com.volcengine.example.imagex.v1;

import com.volcengine.model.request.GetDenoisingImageRequest;
import com.volcengine.model.response.GetDenoisingImageResponse;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

/**
 * 图片降噪
 */
public class ExtensionGetDenoisingImage {
    public static void main(String[] args) {
        // 默认 ImageX 实例为 `cn-north-1`，如果您想使用其他区域的实例，请使用 `ImageXServiceImpl.GetInstance(区域名)` 显式指定区域
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        GetDenoisingImageRequest req = new GetDenoisingImageRequest();
        req.setServiceId("service id"); // 服务 ID
        req.setStoreUri("store uri");   // 文件的 Store URI
        // req.setImageUrl("image url");   // 文件的网址
        req.setOutFormat("png");        // 输出的文件格式
        req.setIntensity(0.1);          // 降噪强度
        req.setCanDemotion(true);       // 是否允许降级

        try {
            GetDenoisingImageResponse resp = service.getDenoisingImage(req);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
