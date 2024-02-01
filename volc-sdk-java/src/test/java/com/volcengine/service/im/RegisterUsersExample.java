package com.volcengine.service.im;


import com.volcengine.model.im.RegisterUsersBody;
import com.volcengine.model.im.RegisterUsersRes;

public class RegisterUsersExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        RegisterUsersBody body = new RegisterUsersBody();

        try {
            RegisterUsersRes resp = service.registerUsers(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
