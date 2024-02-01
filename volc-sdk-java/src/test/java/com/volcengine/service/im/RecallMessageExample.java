package com.volcengine.service.im;


import com.volcengine.model.im.RecallMessageBody;
import com.volcengine.model.im.RecallMessageRes;

public class RecallMessageExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        RecallMessageBody body = new RecallMessageBody();

        try {
            RecallMessageRes resp = service.recallMessage(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
