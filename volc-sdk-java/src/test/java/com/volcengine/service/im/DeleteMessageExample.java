package com.volcengine.service.im;


import com.volcengine.model.im.DeleteMessageBody;
import com.volcengine.model.im.DeleteMessageRes;

public class DeleteMessageExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DeleteMessageBody body = new DeleteMessageBody();

        try {
            DeleteMessageRes resp = service.deleteMessage(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
