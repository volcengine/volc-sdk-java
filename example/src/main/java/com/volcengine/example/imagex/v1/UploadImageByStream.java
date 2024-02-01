package com.volcengine.example.imagex.v1;

import com.volcengine.model.request.ApplyImageUploadRequest;
import com.volcengine.model.response.CommitImageUploadResponse;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;
import lombok.SneakyThrows;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 * 上传文件
 */
public class UploadImageByStream {
    public static void main(String[] args) {
        // 默认 ImageX 实例为 `cn-north-1`，如果您想使用其他区域的实例，请使用 `ImageXServiceImpl.GetInstance(区域名)` 显式指定区域
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        ApplyImageUploadRequest request = new ApplyImageUploadRequest();
        request.setServiceId("service id");
        // 服务 ID
//        request.setStoreKeys(new ArrayList<>());

        try {
            // 读取文件
            List<InputStream> files = new ArrayList<>();
            List<Long> sizeArr = new ArrayList<>();
            addFile(request, files, sizeArr, "key 1", "path 1");
            addFile(request, files, sizeArr, "key 2", "path 2");

            // 上传文件
            CommitImageUploadResponse response = service.uploadImages(request, files, sizeArr);
            System.out.println(response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SneakyThrows
    private static void addFile(ApplyImageUploadRequest request, List<InputStream> files, List<Long> sizeArr, String storeKey, String filePath) {
        // 读取文件f
        File file = new File(filePath);
        if (request.getStoreKeys() != null) {
            request.getStoreKeys().add(storeKey);
        }
        files.add(Files.newInputStream(file.toPath()));
        sizeArr.add(file.length());
    }
}
