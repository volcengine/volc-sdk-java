package com.volcengine.example.imagex;

import com.volcengine.model.response.CommonResponse;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class CommonReqeustDemo {
    public static void main(String[] args) {
        // default region cn-north-1, for other region, call ImageXServiceImpl.getInstance(region)
        IImageXService service = ImageXServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.volc/config
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        Map<String, String> param = new HashMap<>();
        param.put("ServiceId", "imagex service id");
        param.put("StoreUri", "image uri");

        try {
            CommonResponse response = service.getImageX("GetImageUploadFile", param);
            System.out.println(response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
