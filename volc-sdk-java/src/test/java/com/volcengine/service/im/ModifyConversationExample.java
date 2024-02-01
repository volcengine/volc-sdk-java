package com.volcengine.service.im;


import com.volcengine.model.im.ModifyConversationBody;
import com.volcengine.model.im.ModifyConversationRes;

public class ModifyConversationExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        ModifyConversationBody body = new ModifyConversationBody();

        try {
            ModifyConversationRes resp = service.modifyConversation(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
