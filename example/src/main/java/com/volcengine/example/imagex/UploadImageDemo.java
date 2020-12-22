package com.volcengine.example.imagex;

import com.volcengine.model.request.ApplyImageUploadRequest;
import com.volcengine.model.response.CommitImageUploadResponse;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class UploadImageDemo {
    public static void main(String[] args) {
        // default region cn-north-1, for other region, call ImageXServiceImpl.getInstance(region)
        IImageXService service = ImageXServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.volc/config
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        ApplyImageUploadRequest request = new ApplyImageUploadRequest();
        request.setServiceId("imagex service id");

        try {
            List<byte[]> datas = new ArrayList<>();
            datas.add(Files.readAllBytes(Paths.get("image path 1")));
            datas.add(Files.readAllBytes(Paths.get("image path 2")));

            CommitImageUploadResponse response = service.uploadImages(request, datas);
            System.out.println(response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
