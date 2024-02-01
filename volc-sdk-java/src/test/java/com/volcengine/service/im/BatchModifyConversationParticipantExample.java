package com.volcengine.service.im;


import com.volcengine.model.im.BatchModifyConversationParticipantBody;
import com.volcengine.model.im.BatchModifyConversationParticipantRes;

public class BatchModifyConversationParticipantExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        BatchModifyConversationParticipantBody body = new BatchModifyConversationParticipantBody();

        try {
            BatchModifyConversationParticipantRes resp = service.batchModifyConversationParticipant(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
