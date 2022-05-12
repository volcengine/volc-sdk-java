package com.volcengine.example.vod.space;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodListSpaceRequest;
import com.volcengine.service.vod.model.response.VodListSpaceResponse;

public class VodListSpaceDemo {
    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.vcloud/config
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            VodListSpaceRequest.Builder input = com.volcengine.service.vod.model.request.VodListSpaceRequest.newBuilder();
            VodListSpaceResponse resp = vodService.listSpace(input.build());
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
