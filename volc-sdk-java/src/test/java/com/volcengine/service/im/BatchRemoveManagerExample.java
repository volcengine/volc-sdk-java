package com.volcengine.service.im;


import com.volcengine.model.im.BatchRemoveManagerBody;
import com.volcengine.model.im.BatchRemoveManagerRes;

public class BatchRemoveManagerExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        BatchRemoveManagerBody body = new BatchRemoveManagerBody();

        try {
            BatchRemoveManagerRes resp = service.batchRemoveManager(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
