package com.volcengine.example.imagex.v1;

import com.volcengine.model.request.GetImageQualityRequest;
import com.volcengine.model.response.GetImageQualityResponse;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

/**
 * 画质评估
 */
public class ExtensionGetImageQuality {
    public static void main(String[] args) {
        // 默认 ImageX 实例为 `cn-north-1`，如果您想使用其他区域的实例，请使用 `ImageXServiceImpl.GetInstance(区域名)` 显式指定区域
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        GetImageQualityRequest req = new GetImageQualityRequest();
        req.setServiceId("service id"); // 服务 ID
        req.setImageUrl("store uri");   // 文件的 Store URI
        req.setVqType("vqscore");       // 评估工具，使用逗号分隔的评估工具列表

        try {
            GetImageQualityResponse resp = service.getImageQuality(req);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
