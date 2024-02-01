package com.volcengine.service.im;


import com.volcengine.model.im.UpdateBlackListBody;
import com.volcengine.model.im.UpdateBlackListRes;

public class UpdateBlackListExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        UpdateBlackListBody body = new UpdateBlackListBody();

        try {
            UpdateBlackListRes resp = service.updateBlackList(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
