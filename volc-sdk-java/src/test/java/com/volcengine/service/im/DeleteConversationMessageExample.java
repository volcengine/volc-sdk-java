package com.volcengine.service.im;


import com.volcengine.model.im.DeleteConversationMessageBody;
import com.volcengine.model.im.DeleteConversationMessageRes;

public class DeleteConversationMessageExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DeleteConversationMessageBody body = new DeleteConversationMessageBody();

        try {
            DeleteConversationMessageRes resp = service.deleteConversationMessage(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
