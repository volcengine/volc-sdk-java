package com.volcengine.service.im;


import com.volcengine.model.im.ScanConversationParticipantListBody;
import com.volcengine.model.im.ScanConversationParticipantListRes;

public class ScanConversationParticipantListExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        ScanConversationParticipantListBody body = new ScanConversationParticipantListBody();

        try {
            ScanConversationParticipantListRes resp = service.scanConversationParticipantList(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
