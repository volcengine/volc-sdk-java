package com.volcengine.service.im;


import com.volcengine.model.im.BatchAddBlockParticipantsBody;
import com.volcengine.model.im.BatchAddBlockParticipantsRes;

public class BatchAddBlockParticipantsExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        BatchAddBlockParticipantsBody body = new BatchAddBlockParticipantsBody();

        try {
            BatchAddBlockParticipantsRes resp = service.batchAddBlockParticipants(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
