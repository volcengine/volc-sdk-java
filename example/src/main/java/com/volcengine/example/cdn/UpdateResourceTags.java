package com.volcengine.example.cdn;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.beans.CDN;
import com.volcengine.service.cdn.CDNService;
import com.volcengine.service.cdn.impl.CDNServiceImpl;

import java.util.Arrays;

public class UpdateResourceTags {
    public static void main(String[] args) {
        CDNService service = CDNServiceImpl.getInstance();
        service.setAccessKey(Utils.ak);
        service.setSecretKey(Utils.sk);
        try {
            CDN.UpdateResourceTagsRequest req = new CDN.UpdateResourceTagsRequest()
                .setResources(Arrays.asList("www.example.com", "www.example2.com"))
                .setResourceTags(Arrays.asList(new CDN.ResourceTag().setKey("userKey").setValue("userValue")));

            CDN.UpdateResourceTagsResponse resp = service.updateResourceTags(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
