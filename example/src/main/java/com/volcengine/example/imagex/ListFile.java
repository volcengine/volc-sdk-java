package com.volcengine.example.imagex;

import com.volcengine.model.request.GetImageUploadFilesRequest;
import com.volcengine.model.response.GetImageUploadFilesResponse;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

/**
 * 获取文件列表
 */
public class ListFile {
    public static void main(String[] args) {
        // 默认 ImageX 实例为 `cn-north-1`，如果您想使用其他区域的实例，请使用 `ImageXServiceImpl.GetInstance(区域名)` 显式指定区域
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");


        GetImageUploadFilesRequest req = new GetImageUploadFilesRequest();
        req.setServiceId("service id"); // 服务 ID
        req.setLimit(50);               // 获取数量
        req.setMarker(0L);               // 偏移量

        try {
            GetImageUploadFilesResponse resp = service.getImageUploadFiles(req);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
