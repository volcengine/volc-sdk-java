package com.volcengine.example.imagex;

import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class CreateImageTranscodeTask {
    public static void main(String[] args) {
        // 默认 ImageX 实例为 `cn-north-1`，如果您想使用其他区域的实例，请使用 `ImageXServiceImpl.GetInstance(区域名)` 显式指定区域
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("");
        service.setSecretKey("");

        CreateImageTranscodeTaskReq req = new CreateImageTranscodeTaskReq();
        req.setServiceId("");
        req.setDataType("");
        req.setResKeyList(new ArrayList<>());
        List<String> urls = new ArrayList<>();
        urls.add("");
        req.setDataList(urls);
        req.setTemplate("");


        try {
            CreateImageTranscodeTaskResp resp = service.createImageTranscodeTask(req);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
