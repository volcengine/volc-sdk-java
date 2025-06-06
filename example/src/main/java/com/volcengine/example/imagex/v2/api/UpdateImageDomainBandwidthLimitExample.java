package com.volcengine.example.imagex.v2.api;


import com.volcengine.model.imagex.v2.*;
import com.volcengine.service.imagex.v2.ImagexService;

public class UpdateImageDomainBandwidthLimitExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        UpdateImageDomainBandwidthLimitQuery query = new UpdateImageDomainBandwidthLimitQuery();
        UpdateImageDomainBandwidthLimitBody body = new UpdateImageDomainBandwidthLimitBody();
        
        try {
            UpdateImageDomainBandwidthLimitRes resp = service.updateImageDomainBandwidthLimit(query, body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
