package com.volcengine.service.im;


import com.volcengine.model.im.BatchDeleteBlockParticipantsBody;
import com.volcengine.model.im.BatchDeleteBlockParticipantsRes;

public class BatchDeleteBlockParticipantsExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        BatchDeleteBlockParticipantsBody body = new BatchDeleteBlockParticipantsBody();

        try {
            BatchDeleteBlockParticipantsRes resp = service.batchDeleteBlockParticipants(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
