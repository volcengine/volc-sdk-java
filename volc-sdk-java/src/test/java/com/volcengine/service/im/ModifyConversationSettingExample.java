package com.volcengine.service.im;


import com.volcengine.model.im.ModifyConversationSettingBody;
import com.volcengine.model.im.ModifyConversationSettingRes;

public class ModifyConversationSettingExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        ModifyConversationSettingBody body = new ModifyConversationSettingBody();

        try {
            ModifyConversationSettingRes resp = service.modifyConversationSetting(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
