package com.volcengine.example.imagex.v1;

import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

public class GetImageTranscodeDetails {
    public static void main(String[] args) {
        // 默认 ImageX 实例为 `cn-north-1`，如果您想使用其他区域的实例，请使用 `ImageXServiceImpl.GetInstance(区域名)` 显式指定区域
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("");
        service.setSecretKey("==");

        GetImageTranscodeDetailsReq request = new GetImageTranscodeDetailsReq();

        request.setQueueId("xxx");
        request.setStartTime(1691683200);
        request.setEndTime(1691855999);

        try {
            GetImageTranscodeDetailsResp resp = service.getImageTranscodeDetails(request);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
