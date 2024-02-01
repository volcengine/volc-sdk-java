package com.volcengine.service.im;


import com.volcengine.model.im.BatchDeleteConversationParticipantBody;
import com.volcengine.model.im.BatchDeleteConversationParticipantRes;

public class BatchDeleteConversationParticipantExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        BatchDeleteConversationParticipantBody body = new BatchDeleteConversationParticipantBody();

        try {
            BatchDeleteConversationParticipantRes resp = service.batchDeleteConversationParticipant(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
