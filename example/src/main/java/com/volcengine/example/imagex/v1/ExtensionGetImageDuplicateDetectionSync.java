package com.volcengine.example.imagex.v1;

import com.volcengine.model.request.GetImageDuplicateDetectionSyncRequest;
import com.volcengine.model.response.GetImageDuplicateDetectionSyncResponse;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * 重复图片检测（同步）
 */
public class ExtensionGetImageDuplicateDetectionSync {
    public static void main(String[] args) {
        // 默认 ImageX 实例为 `cn-north-1`，如果您想使用其他区域的实例，请使用 `ImageXServiceImpl.GetInstance(区域名)` 显式指定区域
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        List<String> urls = new ArrayList<>();
        urls.add("store uri 1");
        urls.add("store uri 2");
        urls.add("store uri 3");

        GetImageDuplicateDetectionSyncRequest req = new GetImageDuplicateDetectionSyncRequest();
        req.setServiceId("service id"); // 服务 ID
        req.setUrls(urls);              // 待检测的图片地址

        try {
            GetImageDuplicateDetectionSyncResponse resp = service.getImageDuplicateDetectionSync(req);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
