package com.volcengine.example.imagex;

import com.volcengine.model.imagex.CreateImageCompressTaskReq;
import com.volcengine.model.imagex.CreateImageCompressTaskReqFile;
import com.volcengine.model.imagex.CreateImageCompressTaskResp;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class CreateImageCompressTask {
    public static void main(String[] args) {
        // 默认 ImageX 实例为 `cn-north-1`，如果您想使用其他区域的实例，请使用 `ImageXServiceImpl.GetInstance(区域名)` 显式指定区域
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("");
        service.setSecretKey("==");

        CreateImageCompressTaskReq request = new CreateImageCompressTaskReq();
        List<CreateImageCompressTaskReqFile> list = new ArrayList<CreateImageCompressTaskReqFile>();
        request.setFileList(list);
        request.setServiceId("");

        try {
            CreateImageCompressTaskResp resp = service.createImageCompressTask(request);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
