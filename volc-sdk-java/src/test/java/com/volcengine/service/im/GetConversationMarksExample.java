package com.volcengine.service.im;


import com.volcengine.model.im.GetConversationMarksBody;
import com.volcengine.model.im.GetConversationMarksRes;

public class GetConversationMarksExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        GetConversationMarksBody body = new GetConversationMarksBody();

        try {
            GetConversationMarksRes resp = service.getConversationMarks(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
