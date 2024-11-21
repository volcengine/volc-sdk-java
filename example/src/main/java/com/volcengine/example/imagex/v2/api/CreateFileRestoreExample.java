package com.volcengine.example.imagex.v2.api;


import com.volcengine.model.imagex.v2.*;
import com.volcengine.service.imagex.v2.ImagexService;

public class CreateFileRestoreExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        CreateFileRestoreQuery query = new CreateFileRestoreQuery();
        CreateFileRestoreBody body = new CreateFileRestoreBody();
        
        try {
            CreateFileRestoreRes resp = service.createFileRestore(query, body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
