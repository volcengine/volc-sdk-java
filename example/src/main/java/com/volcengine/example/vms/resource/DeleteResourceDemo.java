package com.volcengine.example.vms.resource;

import com.volcengine.service.vms.VmsService;
import com.volcengine.service.vms.impl.VmsServiceImpl;

public class DeleteResourceDemo {

    public static void main(String[] args) {

        VmsService vmsService = VmsServiceImpl.getInstance();
        vmsService.setAccessKey("your ak");
        vmsService.setSecretKey("your sk");

        try {
            String resourceKey = "40c0356d722f43e580e342b5e726c610";
            vmsService.deleteResourceByResourceKey(resourceKey);
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
