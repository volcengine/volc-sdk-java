package com.volcengine.example.vms.resource;

import com.volcengine.service.vms.VmsService;
import com.volcengine.service.vms.impl.VmsServiceImpl;

public class DeleteResourceDemo {
    // Make sure only get instance once throughout the entire running program.
    // We suggest using Singleton design model to get the instance.
    // And using the Singleton instance to call functions
    private static VmsService vmsService = VmsServiceImpl.getInstance();

    static {
        vmsService.setAccessKey("your ak");
        vmsService.setSecretKey("your sk");
    }
    public static void main(String[] args) {
        try {
            String resourceKey = "40c0356d722f43e580e342b5e726c610";
            vmsService.deleteResourceByResourceKey(resourceKey);
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
