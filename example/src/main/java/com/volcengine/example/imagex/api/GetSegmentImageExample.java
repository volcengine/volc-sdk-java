package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class GetSegmentImageExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        GetSegmentImageQuery query = new GetSegmentImageQuery();
        GetSegmentImageBody body = new GetSegmentImageBody();
        
        try {
            GetSegmentImageRes resp = service.getSegmentImage(query, body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
