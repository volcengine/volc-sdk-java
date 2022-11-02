package com.volcengine.example.imagex;

import com.volcengine.model.request.GetImagePSDetectionRequest;
import com.volcengine.model.response.GetImagePSDetectionResponse;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

/**
 * 检测图像是否经过处理
 */
public class ExtensionGetImagePSDetection {
    public static void main(String[] args) {
        // 默认 ImageX 实例为 `cn-north-1`，如果您想使用其他区域的实例，请使用 `ImageXServiceImpl.GetInstance(区域名)` 显式指定区域
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        GetImagePSDetectionRequest req = new GetImagePSDetectionRequest();
        req.setServiceId("service id"); // 服务 ID
        req.setImageUri("store uri");   // 文件的 Store URI
        req.setMethod("he");            // 检查方法

        try {
            GetImagePSDetectionResponse resp = service.getImagePSDetection(req);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
