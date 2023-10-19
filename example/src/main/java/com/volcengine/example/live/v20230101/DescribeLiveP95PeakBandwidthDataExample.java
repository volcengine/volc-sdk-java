package com.volcengine.example.live.v20230101;


import com.volcengine.model.live.v20230101.*;
import com.volcengine.service.live.v20230101.LiveService;

public class DescribeLiveP95PeakBandwidthDataExample {
    public static void main(String[] args) {
        LiveService service = LiveService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DescribeLiveP95PeakBandwidthDataBody body = new DescribeLiveP95PeakBandwidthDataBody();

        try {
            DescribeLiveP95PeakBandwidthDataRes resp = service.describeLiveP95PeakBandwidthData(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
