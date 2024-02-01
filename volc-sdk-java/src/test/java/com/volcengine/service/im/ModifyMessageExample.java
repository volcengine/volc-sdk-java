package com.volcengine.service.im;


import com.volcengine.model.im.ModifyMessageBody;
import com.volcengine.model.im.ModifyMessageRes;

public class ModifyMessageExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        ModifyMessageBody body = new ModifyMessageBody();

        try {
            ModifyMessageRes resp = service.modifyMessage(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
