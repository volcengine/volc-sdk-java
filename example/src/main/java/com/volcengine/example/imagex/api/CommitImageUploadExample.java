package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

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
