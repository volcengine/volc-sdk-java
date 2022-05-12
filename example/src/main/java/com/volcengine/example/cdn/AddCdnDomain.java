package com.volcengine.example.cdn;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.beans.CDN;
import com.volcengine.service.cdn.CDNService;
import com.volcengine.service.cdn.impl.CDNServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;

public class AddCdnDomain {
    public static void main(String[] args) {
        CDNService service = CDNServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");
        try {
            CDN.AddCdnDomainRequest req = new CDN.AddCdnDomainRequest()
                    .setDomain("example.com")
                    .setServiceType("web")
                    .setOrigin(Arrays.asList(new CDN.OriginRule().setOriginAction(new CDN.OriginAction().setOriginLines(Arrays.asList(
                                    new CDN.OriginLine()
                                            .setOriginType("primary")
                                            .setInstanceType("ip")
                                            .setAddress("1.1.1.1")
                                            .setHttpPort("80")
                                            .setHttpsPort("443")
                                            .setWeight("100")
                            )
                    ))));
            CDN.EmptyResponse resp = service.addCdnDomain(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
