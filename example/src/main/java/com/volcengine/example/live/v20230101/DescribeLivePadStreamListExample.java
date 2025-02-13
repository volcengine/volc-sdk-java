package com.volcengine.example.live.v20230101;


import com.volcengine.model.live.v20230101.*;
import com.volcengine.service.live.v20230101.LiveService;

public class DescribeLivePadStreamListExample {
    public static void main(String[] args) {
        LiveService service = LiveService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeLivePadStreamListBody body = new DescribeLivePadStreamListBody();

        try {
            DescribeLivePadStreamListRes resp = service.describeLivePadStreamList(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
