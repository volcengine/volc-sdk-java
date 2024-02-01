package com.volcengine.example.imagex.v1;

import com.volcengine.model.request.GetImageStyleResultRequest;
import com.volcengine.model.response.GetImageStyleResultResponse;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

import java.util.Collections;

/**
 * 创意魔方
 */
public class ExtensionGetImageStyleResult {
    public static void main(String[] args) {
        // 默认 ImageX 实例为 `cn-north-1`，如果您想使用其他区域的实例，请使用 `ImageXServiceImpl.GetInstance(区域名)` 显式指定区域
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        GetImageStyleResultRequest req = new GetImageStyleResultRequest();
        req.setServiceId("service id");     // 服务 ID
        req.setStyleId("style id");         // 样式编号
        // 如果您选择的样式支持参数，可以在 Params 中填写对应的参数
        req.setParams(Collections.singletonMap("参数名", "参数值"));
        req.setOutputFormat("jpeg");        // 输出图片格式
        req.setOutputQuality(90);           // 输出图片质量

        try {
            GetImageStyleResultResponse resp = service.getImageStyleResult(req);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}