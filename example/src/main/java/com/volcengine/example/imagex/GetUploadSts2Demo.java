package com.volcengine.example.imagex;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.sts2.SecurityToken2;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class GetUploadSts2Demo {

    public static void main(String[] args) {
        // default region cn-north-1, for other region, call ImageXServiceImpl.getInstance(region)
        IImageXService service = ImageXServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.volc/config
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        List<String> serviceIds = new ArrayList<>(0);
        // add service ids allowed to upload image to
        serviceIds.add("imagex service id");

        try {
            // default sts2 expire time is 1 hour, call service.getUploadSts2WithExpire to set custom expire time in ms
            SecurityToken2 sts2 = service.getUploadSts2(serviceIds);
            System.out.println(JSON.toJSONString(sts2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
