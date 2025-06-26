package com.volcengine.example.live.v20230101;


import com.volcengine.model.live.v20230101.*;
import com.volcengine.service.live.v20230101.LiveService;

public class RelaunchPullToPushTaskExample {
    public static void main(String[] args) {
        LiveService service = LiveService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        RelaunchPullToPushTaskBody body = new RelaunchPullToPushTaskBody();

        try {
            RelaunchPullToPushTaskRes resp = service.relaunchPullToPushTask(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
