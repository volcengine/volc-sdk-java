package com.volcengine.example.imagex.v2;

import com.volcengine.model.request.ApplyImageUploadRequest;
import com.volcengine.model.response.CommitImageUploadResponse;
import com.volcengine.service.imagex.v2.ImagexService;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * 上传文件
 */
public class UploadImage {
    public static void main(String[] args) {
        // 默认 ImageX 实例为 `cn-north-1`，如果您想使用其他区域的实例，请使用 `ImageXServiceImpl.GetInstance(区域名)` 显式指定区域
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        ApplyImageUploadRequest request = new ApplyImageUploadRequest();
        request.setServiceId("service id"); // 服务 ID
        // request.setUploadHost("upload host");
        // request.setOverwrite("False");
        try {
            // 读取文件
            List<byte[]> datas = new ArrayList<>();
            datas.add(Files.readAllBytes(Paths.get("image path 1")));
            datas.add(Files.readAllBytes(Paths.get("image path 2")));

            // 上传文件
            CommitImageUploadResponse response = service.uploadImages(request, datas);
            System.out.println(response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
