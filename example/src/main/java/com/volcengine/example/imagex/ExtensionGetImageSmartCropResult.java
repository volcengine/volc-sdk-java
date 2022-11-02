package com.volcengine.example.imagex;

import com.volcengine.model.request.GetImageSmartCropResultRequest;
import com.volcengine.model.response.GetImageSmartCropResultResponse;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

// 图片智能剪裁
public class ExtensionGetImageSmartCropResult {
    public static void main(String[] args) {
        // 默认 ImageX 实例为 `cn-north-1`，如果您想使用其他区域的实例，请使用 `ImageXServiceImpl.GetInstance(区域名)` 显式指定区域
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        GetImageSmartCropResultRequest req = new GetImageSmartCropResultRequest();
        req.setServiceId("service id"); // 服务 ID
        req.setStoreUri("store uri");   // 文件的 Store URI
        req.setPolicy("fglass");        // 高斯模糊模式
        req.setScene("normal");         // 普通人脸剪裁
        req.setSigma(5.0);              // 高斯模糊半径
        req.setWidth(480);              // 裁剪后的宽度
        req.setHeight(320);             // 裁剪后的高度

        try {
            GetImageSmartCropResultResponse resp = service.getImageSmartCropResult(req);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
