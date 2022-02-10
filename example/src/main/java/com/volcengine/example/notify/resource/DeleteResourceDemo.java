package com.volcengine.example.notify.resource;

import com.volcengine.service.notify.NotifyService;
import com.volcengine.service.notify.impl.NotifyServiceImpl;

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
