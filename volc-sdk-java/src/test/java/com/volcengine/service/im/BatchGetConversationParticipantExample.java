package com.volcengine.service.im;


import com.volcengine.model.im.BatchGetConversationParticipantBody;
import com.volcengine.model.im.BatchGetConversationParticipantRes;

public class BatchGetConversationParticipantExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        BatchGetConversationParticipantBody body = new BatchGetConversationParticipantBody();

        try {
            BatchGetConversationParticipantRes resp = service.batchGetConversationParticipant(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
