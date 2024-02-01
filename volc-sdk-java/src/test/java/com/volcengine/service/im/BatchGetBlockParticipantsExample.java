package com.volcengine.service.im;


import com.volcengine.model.im.BatchGetBlockParticipantsBody;
import com.volcengine.model.im.BatchGetBlockParticipantsRes;

public class BatchGetBlockParticipantsExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        BatchGetBlockParticipantsBody body = new BatchGetBlockParticipantsBody();

        try {
            BatchGetBlockParticipantsRes resp = service.batchGetBlockParticipants(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
