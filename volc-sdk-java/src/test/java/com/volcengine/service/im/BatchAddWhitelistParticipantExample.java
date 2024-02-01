package com.volcengine.service.im;


import com.volcengine.model.im.BatchAddWhitelistParticipantBody;
import com.volcengine.model.im.BatchAddWhitelistParticipantRes;

public class BatchAddWhitelistParticipantExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        BatchAddWhitelistParticipantBody body = new BatchAddWhitelistParticipantBody();

        try {
            BatchAddWhitelistParticipantRes resp = service.batchAddWhitelistParticipant(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
