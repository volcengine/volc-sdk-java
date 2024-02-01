package com.volcengine.service.im;


import com.volcengine.model.im.RemoveBlackListBody;
import com.volcengine.model.im.RemoveBlackListRes;

public class RemoveBlackListExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        RemoveBlackListBody body = new RemoveBlackListBody();

        try {
            RemoveBlackListRes resp = service.removeBlackList(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
