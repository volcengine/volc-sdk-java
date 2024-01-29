package com.volcengine.example.imagex.api;


import com.volcengine.model.imagex.*;
import com.volcengine.service.imagex.ImagexService;

public class GetImageTranscodeDetailsExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        GetImageTranscodeDetailsQuery query = new GetImageTranscodeDetailsQuery();

        try {
            GetImageTranscodeDetailsRes resp = service.getImageTranscodeDetails(query);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
