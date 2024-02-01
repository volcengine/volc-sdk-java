package com.volcengine.service.im;


import com.volcengine.model.im.GetParticipantReadIndexBody;
import com.volcengine.model.im.GetParticipantReadIndexRes;

public class GetParticipantReadIndexExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        GetParticipantReadIndexBody body = new GetParticipantReadIndexBody();

        try {
            GetParticipantReadIndexRes resp = service.getParticipantReadIndex(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
