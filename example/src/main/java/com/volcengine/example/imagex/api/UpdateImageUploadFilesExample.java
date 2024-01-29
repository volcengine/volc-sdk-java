package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

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
