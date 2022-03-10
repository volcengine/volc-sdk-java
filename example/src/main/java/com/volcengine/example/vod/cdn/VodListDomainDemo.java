package com.volcengine.example.vod.cdn;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodListDomainRequest;
import com.volcengine.service.vod.model.response.VodListDomainResponse;

public class VodListDomainDemo {
    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.vcloud/config
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            VodListDomainRequest.Builder input = com.volcengine.service.vod.model.request.VodListDomainRequest.newBuilder();
            input.setSpaceName("your space name");
            VodListDomainResponse resp = vodService.listDomain(input.build());
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
