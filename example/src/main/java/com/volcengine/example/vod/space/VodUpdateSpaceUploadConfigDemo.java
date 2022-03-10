package com.volcengine.example.vod.space;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodUpdateSpaceRequest;
import com.volcengine.service.vod.model.request.VodUpdateSpaceUploadConfigRequest;
import com.volcengine.service.vod.model.response.VodUpdateSpaceResponse;
import com.volcengine.service.vod.model.response.VodUpdateSpaceUploadConfigResponse;

public class VodUpdateSpaceUploadConfigDemo {
    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.vcloud/config
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            VodUpdateSpaceUploadConfigRequest.Builder input = com.volcengine.service.vod.model.request.VodUpdateSpaceUploadConfigRequest.newBuilder();
            input.setSpaceName("your space name");
            input.setConfigKey("your config key");
            input.setConfigValue("your config value");
            VodUpdateSpaceUploadConfigResponse resp = vodService.updateSpaceUploadConfig(input.build());
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
