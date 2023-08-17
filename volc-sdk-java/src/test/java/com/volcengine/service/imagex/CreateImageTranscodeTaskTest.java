package com.volcengine.service.imagex;

import com.volcengine.model.imagex.CreateImageTranscodeTaskReq;
import com.volcengine.model.imagex.CreateImageTranscodeTaskResp;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CreateImageTranscodeTaskTest {
    @Test
    public void testCreateImageTranscodeTaskTest() {
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
