package com.volcengine.example.imagex;

import com.volcengine.model.request.GetImageSegmentRequest;
import com.volcengine.model.response.GetImageSegmentResponse;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

/**
 * 智能移除背景
 */
public class ExtensionGetSegmentImage {
    public static void main(String[] args) {
        // 默认 ImageX 实例为 `cn-north-1`，如果您想使用其他区域的实例，请使用 `ImageXServiceImpl.GetInstance(区域名)` 显式指定区域
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        GetImageSegmentRequest request = new GetImageSegmentRequest();
        request.setServiceId("service id"); // 服务 ID
        request.setStoreUri("store uri");   // 文件的 Store URI
        request.setClassify(GetImageSegmentRequest.Classify.HUMAN_V2); // 模型
        request.setRefine(true);            // 处理效果
        request.setOutFormat("png");        // 输出格式
        request.setTransBg(true);           // 透明背景

        GetImageSegmentRequest.Contour contour = new GetImageSegmentRequest.Contour();
        contour.setColor("#000000");
        contour.setSize(0);

        request.setContour(contour);        // 描边

        try {
            GetImageSegmentResponse resp = service.getImageSegment(request);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
