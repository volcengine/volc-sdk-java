package com.volcengine.example.media;

import com.google.protobuf.StringValue;
import com.volcengine.model.vod.request.VodUpdateSubtitleInfoRequest;
import com.volcengine.model.vod.response.VodUpdateSubtitleInfoResponse;
import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;

public class UpdateSubtitleInfoDemo {
    public static void main(String[] args) {
        IVodService vodService = VodServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        // vodService.setAccessKey("");
        // vodService.setSecretKey("");

        String vid = "vid";
        String fileIds = "fileIds";
        String formats = "formats";
        String languages = "languages";
        String title = "status";
        String tag = "tag";

        try {
            VodUpdateSubtitleInfoRequest.Builder req = VodUpdateSubtitleInfoRequest.newBuilder();
            req.setVid(vid);
            req.setFileId(fileIds);
            req.setFormat(formats);
            req.setLanguage(languages);
            req.setTitle(StringValue.of(title));
            req.setTag(StringValue.of(tag));

            VodUpdateSubtitleInfoResponse resp = vodService.updateSubtitleInfo(req.build());
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
