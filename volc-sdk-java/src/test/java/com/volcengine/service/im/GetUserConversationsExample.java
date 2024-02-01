package com.volcengine.service.im;


import com.volcengine.model.im.GetUserConversationsBody;
import com.volcengine.model.im.GetUserConversationsRes;

public class GetUserConversationsExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        GetUserConversationsBody body = new GetUserConversationsBody();

        try {
            GetUserConversationsRes resp = service.getUserConversations(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
