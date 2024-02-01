package com.volcengine.service.im;


import com.volcengine.model.im.MarkConversationBody;
import com.volcengine.model.im.MarkConversationRes;

public class MarkConversationExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        MarkConversationBody body = new MarkConversationBody();

        try {
            MarkConversationRes resp = service.markConversation(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
