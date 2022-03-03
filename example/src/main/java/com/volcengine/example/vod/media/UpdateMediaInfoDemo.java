package com.volcengine.example.vod.media;


import com.google.protobuf.Int64Value;
import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.google.protobuf.StringValue;
import com.volcengine.service.vod.model.request.VodUpdateMediaInfoRequest;
import com.volcengine.service.vod.model.response.VodUpdateMediaInfoResponse;

public class UpdateMediaInfoDemo {
    public static void main(String[] args) {
        IVodService vodService = VodServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        // vodService.setAccessKey("");
        // vodService.setSecretKey("");

        String vid = "vid";
        String Title = "title";
        String Description = "description";
        String Tags = "tag1,tag2";
        long ClassificationId = 0;

        try {
            VodUpdateMediaInfoRequest.Builder req = VodUpdateMediaInfoRequest.newBuilder();
            req.setVid(vid);
            req.setTitle(StringValue.of(Title));
            req.setTags(StringValue.of(Tags));
            req.setDescription(StringValue.of(Description));
            req.setClassificationId(Int64Value.of(ClassificationId));

            VodUpdateMediaInfoResponse resp = vodService.updateMediaInfo(req.build());
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
