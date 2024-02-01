package com.volcengine.service.im;


import com.volcengine.model.im.DeleteFriendBody;
import com.volcengine.model.im.DeleteFriendRes;

public class DeleteFriendExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DeleteFriendBody body = new DeleteFriendBody();

        try {
            DeleteFriendRes resp = service.deleteFriend(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
