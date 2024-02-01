package com.volcengine.service.im;


import com.volcengine.model.im.BatchUpdateLiveParticipantsBody;
import com.volcengine.model.im.BatchUpdateLiveParticipantsRes;

public class BatchUpdateLiveParticipantsExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        BatchUpdateLiveParticipantsBody body = new BatchUpdateLiveParticipantsBody();

        try {
            BatchUpdateLiveParticipantsRes resp = service.batchUpdateLiveParticipants(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
