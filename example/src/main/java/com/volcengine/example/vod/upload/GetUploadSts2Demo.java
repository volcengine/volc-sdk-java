package com.volcengine.example.vod.upload;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.sts2.SecurityToken2;
import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.util.Time;


public class GetUploadSts2Demo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        //set expire time
        SecurityToken2 sts2WithExpire = vodService.getUploadSts2WithExpire(Time.Hour);
        System.out.println(JSON.toJSONString(sts2WithExpire));


        //expire after one hour by default
        SecurityToken2 sts2 = vodService.getUploadSts2();
        System.out.println(JSON.toJSONString(sts2));

    }
}
