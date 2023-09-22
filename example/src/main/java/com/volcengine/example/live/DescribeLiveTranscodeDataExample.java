package com.volcengine.example.live;


import com.volcengine.model.live.DescribeLiveTranscodeDataBody;
import com.volcengine.model.live.DescribeLiveTranscodeDataRes;
import com.volcengine.service.live.LiveServiceNew;

public class DescribeLiveTranscodeDataExample {
    public static void main(String[] args) {
        LiveServiceNew service = LiveServiceNew.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeLiveTranscodeDataBody body = new DescribeLiveTranscodeDataBody();

        try {
            DescribeLiveTranscodeDataRes resp = service.describeLiveTranscodeData(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
