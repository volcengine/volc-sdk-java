package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class GetResponseHeaderValidateKeysExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        try {
            GetResponseHeaderValidateKeysRes resp = service.getResponseHeaderValidateKeys();
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
