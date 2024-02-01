package com.volcengine.service.im;


import com.volcengine.model.im.GetConversationUserCountBody;
import com.volcengine.model.im.GetConversationUserCountRes;

public class GetConversationUserCountExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        GetConversationUserCountBody body = new GetConversationUserCountBody();

        try {
            GetConversationUserCountRes resp = service.getConversationUserCount(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
