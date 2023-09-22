package com.volcengine.example.live;


import com.volcengine.model.live.DescribeLivePullToPushDataBody;
import com.volcengine.model.live.DescribeLivePullToPushDataRes;
import com.volcengine.service.live.LiveServiceNew;

public class DescribeLivePullToPushDataExample {
    public static void main(String[] args) {
        LiveServiceNew service = LiveServiceNew.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeLivePullToPushDataBody body = new DescribeLivePullToPushDataBody();

        try {
            DescribeLivePullToPushDataRes resp = service.describeLivePullToPushData(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
