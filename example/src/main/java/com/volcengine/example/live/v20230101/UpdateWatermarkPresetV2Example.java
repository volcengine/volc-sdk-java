package com.volcengine.example.live.v20230101;


import com.volcengine.model.live.v20230101.*;
import com.volcengine.service.live.v20230101.LiveService;

public class UpdateWatermarkPresetV2Example {
    public static void main(String[] args) {
        LiveService service = LiveService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        UpdateWatermarkPresetV2Body body = new UpdateWatermarkPresetV2Body();

        try {
            UpdateWatermarkPresetV2Res resp = service.updateWatermarkPresetV2(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
