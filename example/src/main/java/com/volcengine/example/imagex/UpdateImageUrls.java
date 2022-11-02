package com.volcengine.example.imagex;

import com.volcengine.model.request.UpdateImageFilesRequest;
import com.volcengine.model.response.UpdateImageFilesResponse;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * 更新文件 URL 状态
 */
public class UpdateImageUrls {
    public static void main(String[] args) {
        // 默认 ImageX 实例为 `cn-north-1`，如果您想使用其他区域的实例，请使用 `ImageXServiceImpl.GetInstance(区域名)` 显式指定区域
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        List<String> urls = new ArrayList<>();
        urls.add("image url 1");
        urls.add("image url 2");

        UpdateImageFilesRequest req = new UpdateImageFilesRequest();
        req.setServiceId("service id"); // 服务 ID
        req.setAction(UpdateImageFilesRequest.Action.REFRESH); // 操作
        req.setImageUrls(urls); // 欲操作的文件 Store URI

        try {
            UpdateImageFilesResponse resp = service.updateImageUrls(req);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
