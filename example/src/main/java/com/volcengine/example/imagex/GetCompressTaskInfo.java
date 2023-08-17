package com.volcengine.example.imagex;

import com.volcengine.model.imagex.GetCompressTaskInfoReq;
import com.volcengine.model.imagex.GetCompressTaskInfoResp;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

public class GetCompressTaskInfo {
    public static void main(String[] args) {
        // 默认 ImageX 实例为 `cn-north-1`，如果您想使用其他区域的实例，请使用 `ImageXServiceImpl.GetInstance(区域名)` 显式指定区域
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("");
        service.setSecretKey("");

        GetCompressTaskInfoReq request = new GetCompressTaskInfoReq();

        try {
            GetCompressTaskInfoResp resp = service.getCompressTaskInfo(request);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
