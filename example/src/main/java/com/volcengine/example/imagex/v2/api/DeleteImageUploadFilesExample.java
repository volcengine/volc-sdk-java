package com.volcengine.example.imagex.v2.api;


import com.volcengine.model.imagex.v2.*;
import com.volcengine.service.imagex.v2.ImagexService;

public class DeleteImageUploadFilesExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DeleteImageUploadFilesQuery query = new DeleteImageUploadFilesQuery();
        DeleteImageUploadFilesBody body = new DeleteImageUploadFilesBody();
        
        try {
            DeleteImageUploadFilesRes resp = service.deleteImageUploadFiles(query, body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
