package com.volcengine.example.live.v20230101;


import com.volcengine.model.live.v20230101.*;
import com.volcengine.service.live.v20230101.LiveService;

public class UpdatePullToPushGroupExample {
    public static void main(String[] args) {
        LiveService service = LiveService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        UpdatePullToPushGroupBody body = new UpdatePullToPushGroupBody();

        try {
            UpdatePullToPushGroupRes resp = service.updatePullToPushGroup(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
