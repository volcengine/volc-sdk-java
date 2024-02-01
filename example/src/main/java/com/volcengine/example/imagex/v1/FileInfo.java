package com.volcengine.example.imagex.v1;

import com.volcengine.model.request.GetImageUploadFileRequest;
import com.volcengine.model.response.GetImageUploadFileResponse;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

/**
 * 获取文件信息
 */
public class FileInfo {
    public static void main(String[] args) {
        // 默认 ImageX 实例为 `cn-north-1`，如果您想使用其他区域的实例，请使用 `ImageXServiceImpl.GetInstance(区域名)` 显式指定区域
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");


        GetImageUploadFileRequest req = new GetImageUploadFileRequest();
        req.setServiceId("service id"); // 服务 ID
        req.setStoreUri("store uri");   // 文件的 Store URI

        try {
            GetImageUploadFileResponse resp = service.getImageUploadFile(req);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
