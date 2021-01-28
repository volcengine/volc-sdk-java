package com.volcengine.example.imagex;

import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class GetUploadTokenDemo {

    public static void main(String[] args) {
        // default region cn-north-1, for other region, call ImageXServiceImpl.getInstance(region)
        IImageXService service = ImageXServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.volc/config
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        Map<String, String> params = new HashMap<>();
        params.put("ServiceId", "imagex service id");
        // set expires time of the upload token, defalut is 15min(900s)
        params.put("X-Amz-Expires", "60");

        try {
            String token = service.getUploadToken(params);
            System.out.println(token);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
