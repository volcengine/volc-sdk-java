package com.volcengine.example.vod.media;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodDeleteTranscodesRequest;
import com.volcengine.service.vod.model.response.VodDeleteTranscodesResponse;

public class DeleteTranscodesDemo {
    public static void main(String[] args) {
        IVodService vodService = VodServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        // vodService.setAccessKey("");
        // vodService.setSecretKey("");

        String vid = "vid";
        String fileIds = "fileId1,fileId2";
        String callBackArgs = "CallBackArgs";

        try {
            VodDeleteTranscodesRequest.Builder req = VodDeleteTranscodesRequest.newBuilder();
            req.setVid(vid);
            req.setFileIds(fileIds);
            req.setCallbackArgs(callBackArgs);

            VodDeleteTranscodesResponse resp = vodService.deleteTranscodes(req.build());
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
