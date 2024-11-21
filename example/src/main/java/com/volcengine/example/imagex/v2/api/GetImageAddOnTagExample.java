package com.volcengine.example.imagex.v2.api;


import com.volcengine.model.imagex.v2.*;
import com.volcengine.service.imagex.v2.ImagexService;

public class GetImageAddOnTagExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        GetImageAddOnTagQuery query = new GetImageAddOnTagQuery();

        try {
            GetImageAddOnTagRes resp = service.getImageAddOnTag(query);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
