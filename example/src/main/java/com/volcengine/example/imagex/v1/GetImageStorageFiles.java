package com.volcengine.example.imagex.v1;

import com.volcengine.model.imagex.GetImageStorageFilesReq;
import com.volcengine.model.imagex.GetImageStorageFilesResp;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

/**
 * 查看存储文件
 */
public class GetImageStorageFiles {
    public static void main(String[] args) {
        // 默认 ImageX 实例为 `cn-north-1`，如果您想使用其他区域的实例，请使用 `ImageXServiceImpl.GetInstance(区域名)` 显式指定区域
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        GetImageStorageFilesReq req = new GetImageStorageFilesReq();
        req.setServiceId("service id");

        try {
            GetImageStorageFilesResp resp = service.getImageStorageFiles(req);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
