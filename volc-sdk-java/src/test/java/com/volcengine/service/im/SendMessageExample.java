package com.volcengine.service.im;


import com.volcengine.model.im.SendMessageBody;
import com.volcengine.model.im.SendMessageRes;

public class SendMessageExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        SendMessageBody body = new SendMessageBody();

        try {
            SendMessageRes resp = service.sendMessage(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
