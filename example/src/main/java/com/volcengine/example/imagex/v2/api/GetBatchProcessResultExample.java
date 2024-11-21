package com.volcengine.example.imagex.v2.api;


import com.volcengine.model.imagex.v2.*;
import com.volcengine.service.imagex.v2.ImagexService;

public class GetBatchProcessResultExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        GetBatchProcessResultQuery query = new GetBatchProcessResultQuery();
        GetBatchProcessResultBody body = new GetBatchProcessResultBody();
        
        try {
            GetBatchProcessResultRes resp = service.getBatchProcessResult(query, body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
