package com.volcengine.example.live;


import com.volcengine.model.live.DescribeLiveRecordDataBody;
import com.volcengine.model.live.DescribeLiveRecordDataRes;
import com.volcengine.service.live.LiveServiceNew;

public class DescribeLiveRecordDataExample {
    public static void main(String[] args) {
        LiveServiceNew service = LiveServiceNew.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeLiveRecordDataBody body = new DescribeLiveRecordDataBody();

        try {
            DescribeLiveRecordDataRes resp = service.describeLiveRecordData(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
