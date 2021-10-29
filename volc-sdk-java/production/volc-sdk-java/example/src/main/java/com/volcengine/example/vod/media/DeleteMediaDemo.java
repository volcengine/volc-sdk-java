package com.volcengine.example.vod.media;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodDeleteMediaRequest;
import com.volcengine.service.vod.model.response.VodDeleteMediaResponse;

public class DeleteMediaDemo {
    public static void main(String[] args) {
        IVodService vodService = VodServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        // vodService.setAccessKey("");
        // vodService.setSecretKey("");

        String vids = "vid1,vid2,vid3";
        String callBackArgs = "CallBackArgs";

        try {
            VodDeleteMediaRequest.Builder req = VodDeleteMediaRequest.newBuilder();
            req.setVids(vids);
            req.setCallbackArgs(callBackArgs);

            VodDeleteMediaResponse resp = vodService.deleteMedia(req.build());
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
