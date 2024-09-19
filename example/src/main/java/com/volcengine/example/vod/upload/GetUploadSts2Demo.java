package com.volcengine.example.vod.upload;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.sts2.SecurityToken2;
import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.util.Time;


public class GetUploadSts2Demo {

    public static void main(String[] args) throws Exception {
        // Create a VOD instance in the specified region.
        // IVodService vodService = VodServiceImpl.getInstance("cn-north-1");
        IVodService vodService = VodServiceImpl.getInstance();

        // Configure your Access Key ID (AK) and Secret Access Key (SK) in the environment variables or in the local ~/.volc/config file. For detailed instructions, see https://www.volcengine.com/docs/4/65641.
        // The SDK will automatically fetch the AK and SK from the environment variables or the ~/.volc/config file as needed.
        // During testing, you may use the following code snippet. However, do not store the AK and SK directly in your project code to prevent potential leakage and safeguard the security of all resources associated with your account.
        // vodService.setAccessKey("your ak");
        // vodService.setSecretKey("your sk");

        //set expire time
        SecurityToken2 sts2WithExpire = vodService.getUploadSts2WithExpire(Time.Hour);
        System.out.println(JSON.toJSONString(sts2WithExpire));


        //expire after one hour by default
        SecurityToken2 sts2 = vodService.getUploadSts2();
        System.out.println(JSON.toJSONString(sts2));

    }
}
