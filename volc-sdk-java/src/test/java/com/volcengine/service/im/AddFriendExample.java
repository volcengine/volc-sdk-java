package com.volcengine.service.im;


import com.volcengine.model.im.AddFriendBody;
import com.volcengine.model.im.AddFriendRes;

public class AddFriendExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        AddFriendBody body = new AddFriendBody();

        try {
            AddFriendRes resp = service.addFriend(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
