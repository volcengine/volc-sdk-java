package com.volcengine.service.im;


import com.volcengine.model.im.CreateConversationBody;
import com.volcengine.model.im.CreateConversationRes;

public class CreateConversationExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        CreateConversationBody body = new CreateConversationBody();

        try {
            CreateConversationRes resp = service.createConversation(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
