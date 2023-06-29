package com.volcengine.example.cdn;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.beans.CDN;
import com.volcengine.service.cdn.CDNService;
import com.volcengine.service.cdn.impl.CDNServiceImpl;

public class ListCdnDomains {
    public static void main(String[] args) {
        CDNService service = CDNServiceImpl.getInstance();
        service.setAccessKey(Utils.ak);
        service.setSecretKey(Utils.sk);
        try {
            CDN.ListCdnDomainsRequest req = new CDN.ListCdnDomainsRequest()
                .setPageNum(Long.valueOf(1))
                .setPageSize(Long.valueOf(10));
            CDN.ListCdnDomainsResponse resp = service.listCdnDomains(req);
            // use method get
            // CDN.ListCdnDomainsResponse resp = service.listCdnDomains(req, CDNServiceImpl.useGet());

            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
        service.destroy();
    }
}
