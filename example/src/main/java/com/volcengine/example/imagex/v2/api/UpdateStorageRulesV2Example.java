package com.volcengine.example.imagex.v2.api;


import com.volcengine.model.imagex.v2.*;
import com.volcengine.service.imagex.v2.ImagexService;

public class UpdateStorageRulesV2Example {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        UpdateStorageRulesV2Query query = new UpdateStorageRulesV2Query();
        UpdateStorageRulesV2Body body = new UpdateStorageRulesV2Body();
        
        try {
            UpdateStorageRulesV2Res resp = service.updateStorageRulesV2(query, body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
