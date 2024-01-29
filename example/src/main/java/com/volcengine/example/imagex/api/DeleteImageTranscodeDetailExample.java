package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class DeleteImageTranscodeDetailExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        DeleteImageTranscodeDetailBody body = new DeleteImageTranscodeDetailBody();

        try {
            DeleteImageTranscodeDetailRes resp = service.deleteImageTranscodeDetail(body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
