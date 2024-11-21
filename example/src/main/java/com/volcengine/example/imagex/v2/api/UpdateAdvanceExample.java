package com.volcengine.example.imagex.v2.api;


import com.volcengine.model.imagex.v2.*;
import com.volcengine.service.imagex.v2.ImagexService;

public class UpdateAdvanceExample {
    public static void main(String[] args) {
        ImagexService service = ImagexService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        UpdateAdvanceQuery query = new UpdateAdvanceQuery();
        UpdateAdvanceBody body = new UpdateAdvanceBody();
        
        try {
            UpdateAdvanceRes resp = service.updateAdvance(query, body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
