package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DeleteImageAnalyzeTaskExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DeleteImageAnalyzeTaskBody body = new DeleteImageAnalyzeTaskBody();

        try {
            DeleteImageAnalyzeTaskRes resp = service.deleteImageAnalyzeTask(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
