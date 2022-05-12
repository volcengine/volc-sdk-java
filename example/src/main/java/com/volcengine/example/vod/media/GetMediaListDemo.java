package com.volcengine.example.vod.media;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodGetMediaListRequest;
import com.volcengine.service.vod.model.response.VodGetMediaListResponse;

public class GetMediaListDemo {
    public static void main(String[] args) {
        IVodService vodService = VodServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        // vodService.setAccessKey("");
        // vodService.setSecretKey("");

        try {
            VodGetMediaListRequest.Builder req = VodGetMediaListRequest.newBuilder();
            req.setSpaceName("spacexxx");
            req.setVid("vidxxx");
            req.setStatus("Unpublished,Published"); // Published or Unpublished
            req.setOrder("Asc");       // Asc or Desc
            req.setTags("tag1,tag2");
            req.setStartTime("1999-01-01T00:00:00Z");
            req.setEndTime("2021-04-01T00:00:00Z");
            req.setOffset("0");
            req.setPageSize("10");
            req.setClassificationIds("id1,id2");

            VodGetMediaListResponse resp = vodService.getMediaList(req.build());
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
