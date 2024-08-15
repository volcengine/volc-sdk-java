package com.volcengine.example.live.v20230101;


import com.volcengine.model.live.v20230101.*;
import com.volcengine.service.live.v20230101.LiveService;

public class GetHLSEncryptDataKeyExample {
    public static void main(String[] args) {
        LiveService service = LiveService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        GetHLSEncryptDataKeyQuery query = new GetHLSEncryptDataKeyQuery();

        try {
            GetHLSEncryptDataKeyRes resp = service.getHLSEncryptDataKey(query);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
