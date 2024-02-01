package com.volcengine.service.im;


import com.volcengine.model.im.QueryLiveParticipantStatusBody;
import com.volcengine.model.im.QueryLiveParticipantStatusRes;

public class QueryLiveParticipantStatusExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        QueryLiveParticipantStatusBody body = new QueryLiveParticipantStatusBody();

        try {
            QueryLiveParticipantStatusRes resp = service.queryLiveParticipantStatus(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
