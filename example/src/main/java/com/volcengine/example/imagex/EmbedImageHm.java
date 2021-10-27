package com.volcengine.example.imagex;

import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

public class EmbedImageHm {
    public static void main(String[] args) {
        // default region cn-north-1, for other region, call ImageXServiceImpl.getInstance(region)
        IImageXService service = ImageXServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.volc/config
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        EmbedImageHmRequest request = new EmbedImageHmRequest();
        request.setServiceId("xx");
        request.setStoreUri("uri");
        request.setInfo("test");
        request.setOutFormat("jpeg/webp/png"); // 支持三种输出图片格式
        request.setOutQuality(80); // 输出图片质量, 质量越高，提取出盲水印的概率越大
        request.setStrength(30); // 10-100, 提取的时候需要保持和添加时一致

        try {
            EmbedImageHmResponse resp = service.embedImageHm(request);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
