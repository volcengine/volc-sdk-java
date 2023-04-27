package com.volcengine.example.imagex;

import com.volcengine.model.imagex.UpdateImageStorageTTLRequest;
import com.volcengine.model.imagex.UpdateImageStorageTTLResponse;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

/**
 * 更新存储有效期
 */
public class UpdateStorageTtl {
    public static void main(String[] args) {
        // 默认 ImageX 实例为 `cn-north-1`，如果您想使用其他区域的实例，请使用 `ImageXServiceImpl.GetInstance(区域名)` 显式指定区域
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        UpdateImageStorageTTLRequest req = new UpdateImageStorageTTLRequest();
        req.setTtl(86400);
        req.setServiceId("service id");

        try {
            UpdateImageStorageTTLResponse resp = service.updateImageStorageTTL(req);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
