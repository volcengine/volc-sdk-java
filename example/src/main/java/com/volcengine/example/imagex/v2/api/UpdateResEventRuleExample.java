package com.volcengine.example.imagex.v2.api;


import com.volcengine.model.imagex.v2.*;
import com.volcengine.service.imagex.v2.ImagexService;

public class UpdateResEventRuleExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        UpdateResEventRuleQuery query = new UpdateResEventRuleQuery();
        UpdateResEventRuleBody body = new UpdateResEventRuleBody();
        
        try {
            UpdateResEventRuleRes resp = service.updateResEventRule(query, body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
