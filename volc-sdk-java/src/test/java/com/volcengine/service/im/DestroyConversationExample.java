package com.volcengine.service.im;


import com.volcengine.model.im.DestroyConversationBody;
import com.volcengine.model.im.DestroyConversationRes;

public class DestroyConversationExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DestroyConversationBody body = new DestroyConversationBody();

        try {
            DestroyConversationRes resp = service.destroyConversation(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
