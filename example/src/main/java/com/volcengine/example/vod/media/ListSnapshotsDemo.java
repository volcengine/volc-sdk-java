package com.volcengine.example.vod.media;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodListSnapshotsRequest;
import com.volcengine.service.vod.model.response.VodListSnapshotsResponse;

public class ListSnapshotsDemo {
    public static void main(String[] args) {
        IVodService vodService = VodServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        // vodService.setAccessKey("");
        // vodService.setSecretKey("");

        String vid = "your vid";

        try {
            VodListSnapshotsRequest.Builder req = VodListSnapshotsRequest.newBuilder();
            VodListSnapshotsResponse resp = vodService.listSnapshots(req.build());
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
