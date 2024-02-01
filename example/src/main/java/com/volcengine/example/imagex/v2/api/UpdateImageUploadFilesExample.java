package com.volcengine.example.imagex.v2.api;


import com.volcengine.model.imagex.v2.*;
import com.volcengine.service.imagex.v2.ImagexService;

public class UpdateImageUploadFilesExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        UpdateImageUploadFilesQuery query = new UpdateImageUploadFilesQuery();
        UpdateImageUploadFilesBody body = new UpdateImageUploadFilesBody();
        
        try {
            UpdateImageUploadFilesRes resp = service.updateImageUploadFiles(query, body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
