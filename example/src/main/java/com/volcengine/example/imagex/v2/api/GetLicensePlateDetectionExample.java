package com.volcengine.example.imagex.v2.api;


import com.volcengine.model.imagex.v2.*;
import com.volcengine.service.imagex.v2.ImagexService;

public class GetLicensePlateDetectionExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        GetLicensePlateDetectionQuery query = new GetLicensePlateDetectionQuery();
        GetLicensePlateDetectionBody body = new GetLicensePlateDetectionBody();
        
        try {
            GetLicensePlateDetectionRes resp = service.getLicensePlateDetection(query, body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
