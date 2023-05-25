package com.volcengine.example.vms.resource;

import com.volcengine.service.vms.NotifyService;
import com.volcengine.service.vms.impl.NotifyServiceImpl;

public class DeleteResourceDemo {

    public static void main(String[] args) {

        NotifyService notifyService = NotifyServiceImpl.getInstance();

        notifyService.setAccessKey("your ak");
        notifyService.setSecretKey("your sk");

        try {
            String resourceKey = "40c0356d722f43e580e342b5e726c610";
            notifyService.deleteResourceByResourceKey(resourceKey);
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
