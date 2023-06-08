package com.volcengine.example.imagex;


import com.volcengine.model.imagex.GetUrlFetchTaskRequest;
import com.volcengine.model.imagex.GetUrlFetchTaskResponse;
import com.volcengine.model.request.FetchImageUrlRequest;
import com.volcengine.model.response.FetchImageUrlResponse;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

/**
 * 单资源 URL 数据迁移
 */
public class FetchUrl {
    public static void main(String[] args) throws Exception {
        // 默认 ImageX 实例为 `cn-north-1`，如果您想使用其他区域的实例，请使用 `ImageXServiceImpl.GetInstance(区域名)` 显式指定区域
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        FetchImageUrlRequest req1 = new FetchImageUrlRequest();
        req1.setServiceId("service id"); // 服务 ID
        req1.setUrl("https://example.com/");

        FetchImageUrlResponse resp1;
        try {
            resp1 = service.fetchImageUrl(req1);
            System.out.println(resp1);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }

        if (!Boolean.TRUE.equals(req1.getAsync())) {
            return;
        }

        try {
            GetUrlFetchTaskRequest req2 = new GetUrlFetchTaskRequest();
            req2.setId(resp1.getResult().getTaskId());
            req2.setServiceId(req1.getServiceId());
            GetUrlFetchTaskResponse resp2 = service.getUrlFetchTask(req2);
            System.out.println(resp2);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }

    }
}
