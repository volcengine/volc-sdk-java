package com.volcengine.example.imagex.v2.api;


import com.volcengine.model.imagex.v2.*;
import com.volcengine.service.imagex.v2.ImagexService;

public class CommitImageUploadExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        CommitImageUploadQuery query = new CommitImageUploadQuery();
        CommitImageUploadBody body = new CommitImageUploadBody();
        
        try {
            CommitImageUploadRes resp = service.commitImageUpload(query, body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
