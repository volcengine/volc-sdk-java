package com.volcengine.example.imagex.v1;

import com.volcengine.model.request.GetLicensePlateDetectionRequest;
import com.volcengine.model.response.GetLicensePlateDetectionResponse;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

/**
 * 车牌检测
 */
public class ExtensionGetLicensePlateDetection {
    public static void main(String[] args) {
        // 默认 ImageX 实例为 `cn-north-1`，如果您想使用其他区域的实例，请使用 `ImageXServiceImpl.GetInstance(区域名)` 显式指定区域
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        GetLicensePlateDetectionRequest req = new GetLicensePlateDetectionRequest();
        req.setServiceId("service id"); // 服务 ID
        req.setImageUri("store uri");   // 文件的 Store URI

        try {
            GetLicensePlateDetectionResponse resp = service.getLicensePlateDetection(req);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
