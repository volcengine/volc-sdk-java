package com.volcengine.service.im;


import com.volcengine.model.im.GetMessagesBody;
import com.volcengine.model.im.GetMessagesRes;

public class GetMessagesExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        GetMessagesBody body = new GetMessagesBody();

        try {
            GetMessagesRes resp = service.getMessages(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
