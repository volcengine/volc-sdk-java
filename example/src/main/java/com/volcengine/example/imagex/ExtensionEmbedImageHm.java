package com.volcengine.example.imagex;

import com.volcengine.model.request.EmbedImageHmRequest;
import com.volcengine.model.response.EmbedImageHmResponse;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

/**
 * 添加盲水印
 */
public class ExtensionEmbedImageHm {
    public static void main(String[] args) {
        // 默认 ImageX 实例为 `cn-north-1`，如果您想使用其他区域的实例，请使用 `ImageXServiceImpl.GetInstance(区域名)` 显式指定区域
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        EmbedImageHmRequest request = new EmbedImageHmRequest();
        request.setServiceId("service id"); // 服务 ID
        request.setStoreUri("store uri");   // 文件的 Store URI
        request.setAlgorithm("default");    // 算法模型
        request.setInfo("info");            // 盲水印的內容
        request.setOutFormat("jpeg");       // 输出图片格式
        request.setOutQuality(90);          // 输出图片质量
        request.setStrengthLevel("medium"); // 算法强度

        try {
            EmbedImageHmResponse resp = service.embedImageHm(request);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
