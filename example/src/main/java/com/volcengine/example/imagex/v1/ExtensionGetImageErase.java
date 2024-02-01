package com.volcengine.example.imagex.v1;

import com.volcengine.model.request.GetImageEraseModelsRequest;
import com.volcengine.model.request.GetImageEraseResultRequest;
import com.volcengine.model.response.GetImageEraseModelsResponse;
import com.volcengine.model.response.GetImageEraseResultResponse;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

import java.util.Arrays;
import java.util.Collections;

public class ExtensionGetImageErase {
    public static void main(String[] args) {
        // 默认 ImageX 实例为 `cn-north-1`，如果您想使用其他区域的实例，请使用 `ImageXServiceImpl.GetInstance(区域名)` 显式指定区域
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        // 获取图像擦除模型
        GetImageEraseModelsRequest request = new GetImageEraseModelsRequest();
        request.setType(1);    // 0 表示获取自动检测并擦除模型列表，1 表示获取指定区域擦除模型列表。默认 0

        GetImageEraseModelsResponse response;
        try {
            response = service.getImageEraseModels(request);
            System.out.println(response);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        // 图像擦除
        GetImageEraseResultRequest request1 = new GetImageEraseResultRequest();
        request1.setServiceId("service id"); // 服务 ID
        request1.setStoreUri("store uri");   // 文件的 Store URI
        request1.setModel(Arrays.stream(response.getResult().getModels()).findFirst().orElse("default")); // 使用的模型
        GetImageEraseResultRequest.BBox bbox = new GetImageEraseResultRequest.BBox();
        bbox.setX1(0f);
        bbox.setY1(0f);
        bbox.setX2(1f);
        bbox.setY2(1f);
        request1.setBbox(Collections.singletonList(bbox)); // 处理指定区域

        try {
            GetImageEraseResultResponse response1 = service.getImageEraseResult(request1);
            System.out.println(response1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
