package com.volcengine.service.im;


import com.volcengine.model.im.IsInBlackListBody;
import com.volcengine.model.im.IsInBlackListRes;

public class IsInBlackListExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        IsInBlackListBody body = new IsInBlackListBody();

        try {
            IsInBlackListRes resp = service.isInBlackList(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
