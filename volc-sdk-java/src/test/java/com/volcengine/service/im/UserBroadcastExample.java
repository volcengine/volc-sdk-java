package com.volcengine.service.im;


import com.volcengine.model.im.UserBroadcastBody;
import com.volcengine.model.im.UserBroadcastRes;

public class UserBroadcastExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        UserBroadcastBody body = new UserBroadcastBody();

        try {
            UserBroadcastRes resp = service.userBroadcast(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
