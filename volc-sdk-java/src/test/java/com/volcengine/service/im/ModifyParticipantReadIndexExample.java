package com.volcengine.service.im;


import com.volcengine.model.im.ModifyParticipantReadIndexBody;
import com.volcengine.model.im.ModifyParticipantReadIndexRes;

public class ModifyParticipantReadIndexExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        ModifyParticipantReadIndexBody body = new ModifyParticipantReadIndexBody();

        try {
            ModifyParticipantReadIndexRes resp = service.modifyParticipantReadIndex(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
