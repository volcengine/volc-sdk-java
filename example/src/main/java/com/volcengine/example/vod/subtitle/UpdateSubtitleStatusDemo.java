package com.volcengine.example.vod.subtitle;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodUpdateSubtitleStatusRequest;
import com.volcengine.service.vod.model.response.VodUpdateSubtitleStatusResponse;

public class UpdateSubtitleStatusDemo {
    public static void main(String[] args) {
        IVodService vodService = VodServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        // vodService.setAccessKey("");
        // vodService.setSecretKey("");

        String vid = "vid";
        String fileIds = "fileId1,fileId2";
        String formats = "format1,format2";
        String languages = "language1,language2";
        String status = "status";

        try {
            VodUpdateSubtitleStatusRequest.Builder req = VodUpdateSubtitleStatusRequest.newBuilder();
            req.setVid(vid);
            req.setFileIds(fileIds);
            req.setFormats(formats);
            req.setLanguages(languages);
            req.setStatus(status);

            VodUpdateSubtitleStatusResponse resp = vodService.updateSubtitleStatus(req.build());
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
