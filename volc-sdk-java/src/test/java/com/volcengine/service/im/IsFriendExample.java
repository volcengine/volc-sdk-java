package com.volcengine.service.im;


import com.volcengine.model.im.IsFriendBody;
import com.volcengine.model.im.IsFriendRes;

public class IsFriendExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        IsFriendBody body = new IsFriendBody();

        try {
            IsFriendRes resp = service.isFriend(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
