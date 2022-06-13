package com.volcengine.example.cdn;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.beans.CDN;
import com.volcengine.service.cdn.CDNService;
import com.volcengine.service.cdn.impl.CDNServiceImpl;

import java.util.Arrays;

public class AddResourceTags {
    public static void main(String[] args) {
        CDNService service = CDNServiceImpl.getInstance();
        service.setAccessKey(Utils.ak);
        service.setSecretKey(Utils.sk);
        try {
            CDN.AddResourceTagsRequest req = new CDN.AddResourceTagsRequest()
            .setResources(Arrays.asList("www.example.com", "www.example2.com"))
            .setResourceTags(Arrays.asList(new CDN.ResourceTagEntry().setKey("userKey").setValue("userValue")));

            CDN.EmptyResponse resp = service.addResourceTags(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
