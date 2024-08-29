package com.volcengine.example.live.v20230101;


import com.volcengine.model.live.v20230101.*;
import com.volcengine.service.live.v20230101.LiveService;

public class DeleteWatermarkPresetV2Example {
    public static void main(String[] args) {
        LiveService service = LiveService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DeleteWatermarkPresetV2Body body = new DeleteWatermarkPresetV2Body();

        try {
            DeleteWatermarkPresetV2Res resp = service.deleteWatermarkPresetV2(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
