package com.volcengine.service.im;


import com.volcengine.model.im.IsUserInConversationBody;
import com.volcengine.model.im.IsUserInConversationRes;

public class IsUserInConversationExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        IsUserInConversationBody body = new IsUserInConversationBody();

        try {
            IsUserInConversationRes resp = service.isUserInConversation(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
