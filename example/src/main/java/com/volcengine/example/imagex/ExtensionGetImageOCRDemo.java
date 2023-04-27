package com.volcengine.example.imagex;

import com.volcengine.model.imagex.GetImageOCRResponse;
import com.volcengine.model.request.GetImageOCRRequest;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

/**
 * 光学字符识别
 */
public class ExtensionGetImageOCRDemo {
    public static void main(String[] args) {
        // 默认 ImageX 实例为 `cn-north-1`，如果您想使用其他区域的实例，请使用 `ImageXServiceImpl.GetInstance(区域名)` 显式指定区域
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        try {
            GetImageOCRRequest params = new GetImageOCRRequest();
            params.setServiceId("service id"); // 服务 ID
            params.setStoreUri("store uri");   // 文件的 Store URI
            params.setImageUrl("image url");   // 若 Store Uri 为空则访问 url
            params.setScene(GetImageOCRRequest.Scene.GENERAL);
            GetImageOCRResponse response = service.getImageOCRV2(params);

            // if (response instanceof GetImageOCRGeneralResponse) {
            //     GetImageOCRGeneralResponse result = (GetImageOCRGeneralResponse) response;
            // }

            System.out.println(response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}