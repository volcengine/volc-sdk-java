package com.volcengine.example.imagex.v1;

import com.volcengine.model.response.CommonResponse;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

import java.util.HashMap;
import java.util.Map;

/**
 * 通用 API 调用例程
 * 您可以在 <a href="https://www.volcengine.cn/docs/508/14106">火山引擎文档</a> 中查到 API 定义
 */
public class CommonRequest {
    public static void main(String[] args) {
        // 默认 ImageX 实例为 `cn-north-1`，如果您想使用其他区域的实例，请使用 `ImageXServiceImpl.GetInstance(区域名)` 显式指定区域
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        // 以 GetImageUploadFile 为例
        // 这个 API 需要一个 GET 请求，查询参数需要包含 ServiceId 和 StoreUri

        Map<String, String> param = new HashMap<>();
        param.put("ServiceId", "service id"); // 服务 ID
        param.put("StoreUri", "store uri");   // 文件的 Store URI

        try {
            CommonResponse response = service.getImageX("GetImageUploadFile", param);
            System.out.println(response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
