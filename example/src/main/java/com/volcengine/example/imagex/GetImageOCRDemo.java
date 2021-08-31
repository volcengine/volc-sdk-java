package com.volcengine;

import com.volcengine.model.response.GetImageOCRResponse;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class GetImageOCRDemo {
    public static void main(String[] args) {
        System.out.println("==");
        IImageXService service = ImageXServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.volc/config
        service.setAccessKey("ak");
        service.setSecretKey("sk");


        try {
            Map<String, String> params = new HashMap<>();
            params.put("ServiceId", "xx");
            params.put("Scene", "license");
            params.put("StoreUri", "xx");
            GetImageOCRResponse response = service.getImageOCR(params);
            System.out.println(response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}