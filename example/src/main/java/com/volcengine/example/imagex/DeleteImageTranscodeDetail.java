package com.volcengine.example.imagex;

import com.volcengine.model.imagex.DeleteImageTranscodeDetailReq;
import com.volcengine.model.imagex.DeleteImageTranscodeDetailResp;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

public class DeleteImageTranscodeDetail {
    public static void main(String[] args) {
        // 默认 ImageX 实例为 `cn-north-1`，如果您想使用其他区域的实例，请使用 `ImageXServiceImpl.GetInstance(区域名)` 显式指定区域
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("");
        service.setSecretKey("==");

        DeleteImageTranscodeDetailReq request = new DeleteImageTranscodeDetailReq();

        request.setEntryId("");

        try {
            DeleteImageTranscodeDetailResp resp = service.deleteImageTranscodeDetail(request);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
