package com.volcengine.example.media;


import com.volcengine.model.vod.request.VodUpdateMediaInfoRequest;
import com.volcengine.model.vod.response.VodUpdateMediaInfoResponse;
import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.google.protobuf.StringValue;

public class UpdateMediaInfoDemo {
    public static void main(String[] args) {
        IVodService vodService = VodServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        // vodService.setAccessKey("");
        // vodService.setSecretKey("");

        String vid = "vid";
        String Title = "title";
        String Tags = "tag1,tag2";

        try {
            VodUpdateMediaInfoRequest.Builder req = VodUpdateMediaInfoRequest.newBuilder();
            req.setVid(vid);
            req.setTitle(StringValue.of(Title));
            req.setTags(StringValue.of(Tags));

            VodUpdateMediaInfoResponse resp = vodService.updateMediaInfo(req.build());
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
