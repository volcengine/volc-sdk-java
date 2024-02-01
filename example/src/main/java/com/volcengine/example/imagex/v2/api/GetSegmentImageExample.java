package com.volcengine.example.imagex.v2.api;


import com.volcengine.model.imagex.v2.*;
import com.volcengine.service.imagex.v2.ImagexService;

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
