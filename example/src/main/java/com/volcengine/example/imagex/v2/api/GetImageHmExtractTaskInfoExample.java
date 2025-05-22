package com.volcengine.example.imagex.v2.api;


import com.volcengine.model.imagex.v2.*;
import com.volcengine.service.imagex.v2.ImagexService;

public class GetImageHmExtractTaskInfoExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        GetImageHmExtractTaskInfoQuery query = new GetImageHmExtractTaskInfoQuery();
        GetImageHmExtractTaskInfoBody body = new GetImageHmExtractTaskInfoBody();
        
        try {
            GetImageHmExtractTaskInfoRes resp = service.getImageHmExtractTaskInfo(query, body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
