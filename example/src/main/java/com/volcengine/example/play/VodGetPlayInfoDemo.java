package com.volcengine.example.play;

import com.volcengine.model.vod.request.VodGetOriginalPlayInfoRequest;
import com.volcengine.model.vod.request.VodGetPlayInfoRequest;
import com.volcengine.model.vod.response.VodGetOriginalPlayInfoResponse;
import com.volcengine.model.vod.response.VodGetPlayInfoResponse;
import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;

public class VodGetPlayInfoDemo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();

        String vid = "v0c2c369007abu04ru8riko30uo9n73g";

        // call below method if you dont set ak and sk in ～/.vcloud/config
        // vodService.setAccessKey("");
        // vodService.setSecretKey("");

        try {
            VodGetPlayInfoRequest.Builder reqBuilder = VodGetPlayInfoRequest.newBuilder();
            reqBuilder.setVid(vid);
            reqBuilder.setSsl("1");

            VodGetPlayInfoResponse resp = vodService.getPlayInfo(reqBuilder.build());
            if (resp.getResponseMetadata().hasError()) {
                System.out.println(resp.getResponseMetadata().getError());
                System.exit(-1);
            }
            System.out.println(resp.getResult().getPlayInfoList(0).getMainPlayUrl());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
