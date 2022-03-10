package com.volcengine.example.vod.space;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodCreateSpaceRequest;
import com.volcengine.service.vod.model.response.VodCreateSpaceResponse;

public class VodCreateSpaceDemo {
    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.vcloud/config
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            VodCreateSpaceRequest.Builder input = com.volcengine.service.vod.model.request.VodCreateSpaceRequest.newBuilder();
            input.setSpaceName("your space name");
            input.setDescription("desc");
            input.setProjectName("your project name");
            input.setRegion("same with VodService region");
            VodCreateSpaceResponse resp = vodService.createSpace(input.build());
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
