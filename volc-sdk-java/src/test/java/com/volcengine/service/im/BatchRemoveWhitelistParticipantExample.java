package com.volcengine.service.im;


import com.volcengine.model.im.BatchRemoveWhitelistParticipantBody;
import com.volcengine.model.im.BatchRemoveWhitelistParticipantRes;

public class BatchRemoveWhitelistParticipantExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        BatchRemoveWhitelistParticipantBody body = new BatchRemoveWhitelistParticipantBody();

        try {
            BatchRemoveWhitelistParticipantRes resp = service.batchRemoveWhitelistParticipant(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
