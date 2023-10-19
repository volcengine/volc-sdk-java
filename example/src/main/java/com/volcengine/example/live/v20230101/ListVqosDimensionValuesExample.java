package com.volcengine.example.live.v20230101;


import com.volcengine.model.live.v20230101.*;
import com.volcengine.service.live.v20230101.LiveService;

public class ListVqosDimensionValuesExample {
    public static void main(String[] args) {
        LiveService service = LiveService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        ListVqosDimensionValuesQuery query = new ListVqosDimensionValuesQuery();
        ListVqosDimensionValuesBody body = new ListVqosDimensionValuesBody();
        
        try {
            ListVqosDimensionValuesRes resp = service.listVqosDimensionValues(query, body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
