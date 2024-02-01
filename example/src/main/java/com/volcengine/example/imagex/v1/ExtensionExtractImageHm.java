package com.volcengine.example.imagex.v1;

import com.volcengine.model.request.ExtractImageHmRequest;
import com.volcengine.model.response.ExtractImageHmResponse;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

/**
 * 提取盲水印
 */
public class ExtensionExtractImageHm {
    public static void main(String[] args) {
        // 默认 ImageX 实例为 `cn-north-1`，如果您想使用其他区域的实例，请使用 `ImageXServiceImpl.GetInstance(区域名)` 显式指定区域
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        ExtractImageHmRequest request = new ExtractImageHmRequest();
        request.setServiceId("service id"); // 服务 ID
        request.setStoreUri("store uri");   // 文件的 Store URI
        request.setAlgorithm("default");    // 算法模型

        try {
            ExtractImageHmResponse resp = service.extractImageHm(request);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
