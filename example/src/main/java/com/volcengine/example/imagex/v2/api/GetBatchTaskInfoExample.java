package com.volcengine.example.imagex.v2.api;


import com.volcengine.model.imagex.v2.*;
import com.volcengine.service.imagex.v2.ImagexService;

public class GetBatchTaskInfoExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        GetBatchTaskInfoQuery query = new GetBatchTaskInfoQuery();

        try {
            GetBatchTaskInfoRes resp = service.getBatchTaskInfo(query);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
