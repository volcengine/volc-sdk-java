package com.volcengine.example.vod.space;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodUpdateSpaceRequest;
import com.volcengine.service.vod.model.response.VodUpdateSpaceResponse;

public class VodUpdateSpaceDemo {
    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.vcloud/config
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            VodUpdateSpaceRequest.Builder input = com.volcengine.service.vod.model.request.VodUpdateSpaceRequest.newBuilder();
            input.setSpaceName("your space name");
            input.setDescription("your new desc");
            VodUpdateSpaceResponse resp = vodService.updateSpace(input.build());
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
