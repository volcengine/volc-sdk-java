package com.volcengine.service.im;


import com.volcengine.model.im.ListFriendBody;
import com.volcengine.model.im.ListFriendRes;

public class ListFriendExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        ListFriendBody body = new ListFriendBody();

        try {
            ListFriendRes resp = service.listFriend(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
