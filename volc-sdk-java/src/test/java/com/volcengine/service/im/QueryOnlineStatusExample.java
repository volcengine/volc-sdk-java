package com.volcengine.service.im;


import com.volcengine.model.im.QueryOnlineStatusBody;
import com.volcengine.model.im.QueryOnlineStatusRes;

public class QueryOnlineStatusExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        QueryOnlineStatusBody body = new QueryOnlineStatusBody();

        try {
            QueryOnlineStatusRes resp = service.queryOnlineStatus(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
