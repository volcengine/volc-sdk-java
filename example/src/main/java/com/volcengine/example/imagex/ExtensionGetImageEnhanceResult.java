package com.volcengine.example.imagex;

import com.volcengine.model.request.GetImageEnhanceResultRequest;
import com.volcengine.model.response.GetImageEnhanceResultResponse;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

import java.util.Collections;

/**
 * 画质增强
 */
public class ExtensionGetImageEnhanceResult {
    public static void main(String[] args) {
        // 默认 ImageX 实例为 `cn-north-1`，如果您想使用其他区域的实例，请使用 `ImageXServiceImpl.GetInstance(区域名)` 显式指定区域
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        GetImageEnhanceResultRequest req = new GetImageEnhanceResultRequest();
        req.setServiceId("service id"); // 服务 ID
        req.setStoreUri("store uri");   // 文件的 Store URI
        req.setModel(0);                // 0 一般增强, 1 质量增强
        req.setDisableAr(false);        // 是否不优化失真
        req.setDisableSharp(false);     // 是否不自动锐化
        req.setResolution("720p");      // 分辨率
        // req.setActions(Collections.singletonList("action")); // 自适应处理列表

        try {
            GetImageEnhanceResultResponse resp = service.getImageEnhanceResult(req);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
