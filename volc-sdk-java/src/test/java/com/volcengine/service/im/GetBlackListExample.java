package com.volcengine.service.im;


import com.volcengine.model.im.GetBlackListBody;
import com.volcengine.model.im.GetBlackListRes;

public class GetBlackListExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        GetBlackListBody body = new GetBlackListBody();

        try {
            GetBlackListRes resp = service.getBlackList(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
