package com.volcengine.example.imagex;

import com.volcengine.model.request.ExtractImageHmRequest;
import com.volcengine.model.response.ExtractImageHmResponse;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

public class ExtractImageHm {
    public static void main(String[] args) {
        // default region cn-north-1, for other region, call ImageXServiceImpl.getInstance(region)
        IImageXService service = ImageXServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.volc/config
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        ExtractImageHmRequest request = new ExtractImageHmRequest();
        request.setServiceId("xx");
        request.setStoreUri("uri");
        request.setStrength(30); // 和添加时保持一致

        try {
            ExtractImageHmResponse resp = service.extractImageHm(request);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
