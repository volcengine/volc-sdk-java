package com.volcengine.service.im;


import com.volcengine.model.im.BatchAddManagerBody;
import com.volcengine.model.im.BatchAddManagerRes;

public class BatchAddManagerExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        BatchAddManagerBody body = new BatchAddManagerBody();

        try {
            BatchAddManagerRes resp = service.batchAddManager(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
