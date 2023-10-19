package com.volcengine.example.live.v20230101;


import com.volcengine.model.live.v20230101.*;
import com.volcengine.service.live.v20230101.LiveService;

public class DescribeLiveBatchStreamTranscodeDataExample {
    public static void main(String[] args) {
        LiveService service = LiveService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeLiveBatchStreamTranscodeDataBody body = new DescribeLiveBatchStreamTranscodeDataBody();

        try {
            DescribeLiveBatchStreamTranscodeDataRes resp = service.describeLiveBatchStreamTranscodeData(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
