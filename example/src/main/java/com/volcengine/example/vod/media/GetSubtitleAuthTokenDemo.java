package com.volcengine.example.vod.media;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodGetSubtitleInfoListRequest;
import com.volcengine.service.vod.model.response.VodGetSubtitleInfoListResponse;

public class GetSubtitleAuthTokenDemo {
    public static void main(String[] args) {
        IVodService vodService = VodServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        // vodService.setAccessKey("");
        // vodService.setSecretKey("");

        String vid = "vid";
        String fileIds = "fid1,fid2";
        String formats = "format1,format2";
        String languages = "l1,l2";
        String languageIds = "lId1,lId2";
        String subtitleIds = "s1,s2";
        String status = "Published,Unpublished";
        String title = "title";
        String tag = "tag";
        String ssl = "ssl";
        String offset = "offset";
        String pageSize = "pageSize";


        try {
            VodGetSubtitleInfoListRequest.Builder req = VodGetSubtitleInfoListRequest.newBuilder();
            req.setVid(vid);
            req.setFileIds(fileIds);
            req.setFormats(formats);
            req.setLanguages(languages);
            req.setLanguageIds(languageIds);
            req.setSubtitleIds(subtitleIds);
            req.setStatus(status);
            req.setTitle(title);
            req.setTag(tag);
            req.setSsl(ssl);
            req.setOffset(offset);
            req.setPageSize(pageSize);
            Long expireTime = new Long(60);

            String token = vodService.getSubtitleAuthToken(req.build(), expireTime);
            System.out.println(token);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

