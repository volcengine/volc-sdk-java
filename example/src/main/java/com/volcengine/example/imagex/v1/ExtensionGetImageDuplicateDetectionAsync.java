package com.volcengine.example.imagex.v1;

import com.volcengine.model.request.GetDeduplicateTaskStatusRequest;
import com.volcengine.model.request.GetImageDuplicateDetectionAsyncRequest;
import com.volcengine.model.response.GetDeduplicateTaskStatusResponse;
import com.volcengine.model.response.GetImageDuplicateDetectionAsyncResponse;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * 重复图片检测（异步）
 */
public class ExtensionGetImageDuplicateDetectionAsync {
    public static void main(String[] args) {
        // 默认 ImageX 实例为 `cn-north-1`，如果您想使用其他区域 的实例，请使用 `ImageXServiceImpl.GetInstance(区域名)` 显式指定区域
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        List<String> urls = new ArrayList<>();
        urls.add("store uri 1");
        urls.add("store uri 2");
        urls.add("store uri 3");

        GetImageDuplicateDetectionAsyncRequest req = new GetImageDuplicateDetectionAsyncRequest();
        req.setServiceId("service id"); // 服务 ID
        req.setUrls(urls);              // 待检测的图片地址
        req.setCallback("https://example.com/callback"); // 回调地址

        // 创建重复检测任务
        GetImageDuplicateDetectionAsyncResponse resp;
        try {
            resp = service.getImageDuplicateDetectionAsync(req);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        // // 你可以使用回调来获得结果
        // // 使用 SpringBoot 解析回调信息的一个例子
        // @PostMapping
        // fun callbackHandler(@RequestBody data :com.volcengine.model.beans.GetImageDuplicateDetectionCallbackBody) {
        //     // 处理数据
        // }

        // 也可以主动获取结果
        // 获取检测任务状态
        GetDeduplicateTaskStatusRequest req1 = new GetDeduplicateTaskStatusRequest();
        req1.setTaskId(resp.getResult().getTaskId());
        try {
            GetDeduplicateTaskStatusResponse resp1 = service.getDeduplicateTaskStatus(req1);
            System.out.println(resp1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
