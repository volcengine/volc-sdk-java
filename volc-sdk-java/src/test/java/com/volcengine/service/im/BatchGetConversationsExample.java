package com.volcengine.service.im;


import com.volcengine.model.im.BatchGetConversationsBody;
import com.volcengine.model.im.BatchGetConversationsRes;

public class BatchGetConversationsExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        BatchGetConversationsBody body = new BatchGetConversationsBody();

        try {
            BatchGetConversationsRes resp = service.batchGetConversations(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
