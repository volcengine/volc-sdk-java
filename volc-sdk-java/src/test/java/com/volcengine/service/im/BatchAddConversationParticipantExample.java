package com.volcengine.service.im;


import com.volcengine.model.im.BatchAddConversationParticipantBody;
import com.volcengine.model.im.BatchAddConversationParticipantRes;

public class BatchAddConversationParticipantExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        BatchAddConversationParticipantBody body = new BatchAddConversationParticipantBody();

        try {
            BatchAddConversationParticipantRes resp = service.batchAddConversationParticipant(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
