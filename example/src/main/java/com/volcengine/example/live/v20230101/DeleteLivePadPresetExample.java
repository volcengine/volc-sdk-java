package com.volcengine.example.live.v20230101;


import com.volcengine.model.live.v20230101.*;
import com.volcengine.service.live.v20230101.LiveService;

public class DeleteLivePadPresetExample {
    public static void main(String[] args) {
        LiveService service = LiveService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DeleteLivePadPresetBody body = new DeleteLivePadPresetBody();

        try {
            DeleteLivePadPresetRes resp = service.deleteLivePadPreset(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
