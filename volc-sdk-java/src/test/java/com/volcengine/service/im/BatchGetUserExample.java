package com.volcengine.service.im;


import com.volcengine.model.im.BatchGetUserBody;
import com.volcengine.model.im.BatchGetUserRes;

public class BatchGetUserExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        BatchGetUserBody body = new BatchGetUserBody();

        try {
            BatchGetUserRes resp = service.batchGetUser(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
