package com.volcengine.service.im;


import com.volcengine.model.im.GetConversationMessagesBody;
import com.volcengine.model.im.GetConversationMessagesRes;

public class GetConversationMessagesExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        GetConversationMessagesBody body = new GetConversationMessagesBody();

        try {
            GetConversationMessagesRes resp = service.getConversationMessages(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
