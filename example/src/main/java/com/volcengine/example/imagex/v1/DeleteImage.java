package com.volcengine.example.imagex.v1;

import com.volcengine.model.request.DeleteImageReq;
import com.volcengine.model.response.DeleteImageResp;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * 删除文件
 */
public class DeleteImage {
    public static void main(String[] args) {
        // 默认 ImageX 实例为 `cn-north-1`，如果您想使用其他区域的实例，请使用 `ImageXServiceImpl.GetInstance(区域名)` 显式指定区域
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        List<String> uris = new ArrayList<>();
        uris.add("image uri 1");
        uris.add("image uri 2");

        DeleteImageReq req = new DeleteImageReq();
        req.setServiceId("service id"); // 服务 ID
        req.setStoreUris(uris);         // 想要删除的文件列表

        try {
            DeleteImageResp resp = service.deleteImages(req);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
