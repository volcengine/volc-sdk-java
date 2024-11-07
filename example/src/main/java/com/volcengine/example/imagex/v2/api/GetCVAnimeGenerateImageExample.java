package com.volcengine.example.imagex.v2.api;


import com.volcengine.model.imagex.v2.*;
import com.volcengine.service.imagex.v2.ImagexService;

public class GetCVAnimeGenerateImageExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        GetCVAnimeGenerateImageQuery query = new GetCVAnimeGenerateImageQuery();
        GetCVAnimeGenerateImageBody body = new GetCVAnimeGenerateImageBody();
        
        try {
            GetCVAnimeGenerateImageRes resp = service.getCVAnimeGenerateImage(query, body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
