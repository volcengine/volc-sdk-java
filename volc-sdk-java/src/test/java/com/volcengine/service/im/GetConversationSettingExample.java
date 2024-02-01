package com.volcengine.service.im;


import com.volcengine.model.im.GetConversationSettingBody;
import com.volcengine.model.im.GetConversationSettingRes;

public class GetConversationSettingExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        GetConversationSettingBody body = new GetConversationSettingBody();

        try {
            GetConversationSettingRes resp = service.getConversationSetting(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
