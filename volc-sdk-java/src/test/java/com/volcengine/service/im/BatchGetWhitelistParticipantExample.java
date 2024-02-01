package com.volcengine.service.im;


import com.volcengine.model.im.BatchGetWhitelistParticipantBody;
import com.volcengine.model.im.BatchGetWhitelistParticipantRes;

public class BatchGetWhitelistParticipantExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        BatchGetWhitelistParticipantBody body = new BatchGetWhitelistParticipantBody();

        try {
            BatchGetWhitelistParticipantRes resp = service.batchGetWhitelistParticipant(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
