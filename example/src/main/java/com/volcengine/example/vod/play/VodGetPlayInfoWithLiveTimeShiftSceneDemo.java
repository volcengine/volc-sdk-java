package com.volcengine.example.vod.play;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequest;
import com.volcengine.service.vod.model.response.VodGetPlayInfoWithLiveTimeShiftSceneResponse;

public class VodGetPlayInfoWithLiveTimeShiftSceneDemo {
    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.vcloud/config
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            VodGetPlayInfoWithLiveTimeShiftSceneRequest.Builder input = com.volcengine.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequest.newBuilder();
            input.setSpaceName("your space name");
            input.setExpireTimestamp("expire timestamp");
            input.setNeedComposeBucketName("1");
            input.setSsl("1");
            input.setStoreUris("your store uris");
            VodGetPlayInfoWithLiveTimeShiftSceneResponse resp = vodService.getPlayInfoWithLiveTimeShiftScene(input.build());
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
