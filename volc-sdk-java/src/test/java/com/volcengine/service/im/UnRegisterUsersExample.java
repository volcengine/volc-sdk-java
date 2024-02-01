package com.volcengine.service.im;


import com.volcengine.model.im.UnRegisterUsersBody;
import com.volcengine.model.im.UnRegisterUsersRes;

public class UnRegisterUsersExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        UnRegisterUsersBody body = new UnRegisterUsersBody();

        try {
            UnRegisterUsersRes resp = service.unRegisterUsers(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
