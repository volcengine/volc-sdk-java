package com.volcengine.example.imagex;

import com.volcengine.model.request.GetPrivateImageTypeRequest;
import com.volcengine.model.response.GetPrivateImageTypeResponse;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

/**
 * 图片隐私检测
 */
public class ExtensionGetPrivateImageType {
    public static void main(String[] args) {
        // 默认 ImageX 实例为 `cn-north-1`，如果您想使用其他区域的实例，请使用 `ImageXServiceImpl.GetInstance(区域名)` 显式指定区域
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        GetPrivateImageTypeRequest req = new GetPrivateImageTypeRequest();
        req.setServiceId("service id"); // 服务 ID
        req.setImageUri("store uri");   // 文件的 Store URI
        req.setMethod("all");           // 检测内容
        req.setThresFace(0.52);         // 人脸置信度
        req.setThresCloth(0.8);         // 衣物置信度

        try {
            GetPrivateImageTypeResponse resp = service.getPrivateImageType(req);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
