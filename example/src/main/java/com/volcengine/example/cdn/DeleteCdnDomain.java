package com.volcengine.example.cdn;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.beans.CDN;
import com.volcengine.service.cdn.CDNService;
import com.volcengine.service.cdn.impl.CDNServiceImpl;

public class DeleteCdnDomain {
    public static void main(String[] args) {
        CDNService service = CDNServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");
        try {
            CDN.DeleteCdnDomainRequest req = new CDN.DeleteCdnDomainRequest()
                    .setDomain("example.com");
            CDN.EmptyResponse resp = service.deleteCdnDomain(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
