package com.volcengine.service.im;


import com.volcengine.model.im.BatchUpdateUserTagsBody;
import com.volcengine.model.im.BatchUpdateUserTagsRes;

public class BatchUpdateUserTagsExample {
    public static void main(String[] args) {
        ImService service = ImService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        BatchUpdateUserTagsBody body = new BatchUpdateUserTagsBody();

        try {
            BatchUpdateUserTagsRes resp = service.batchUpdateUserTags(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
