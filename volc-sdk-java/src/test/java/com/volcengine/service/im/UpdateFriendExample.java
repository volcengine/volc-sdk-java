package com.volcengine.service.im;


import com.volcengine.model.im.UpdateFriendBody;
import com.volcengine.model.im.UpdateFriendRes;

public class UpdateFriendExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        UpdateFriendBody body = new UpdateFriendBody();

        try {
            UpdateFriendRes resp = service.updateFriend(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
