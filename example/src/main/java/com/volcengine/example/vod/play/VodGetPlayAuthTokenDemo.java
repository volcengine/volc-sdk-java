package com.volcengine.example.vod.play;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodGetPlayInfoRequest;

public class VodGetPlayAuthTokenDemo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();

        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            VodGetPlayInfoRequest.Builder reqBuilder = VodGetPlayInfoRequest.newBuilder();
            reqBuilder.setVid("your vid");
            reqBuilder.setFormat("your Format");
            reqBuilder.setDefinition("your Definition");
            reqBuilder.setFileType("your FileType");
            reqBuilder.setLogoType("your LogoType");
            reqBuilder.setSsl("your Ssl");
            reqBuilder.setNeedThumbs("your NeedThumbs");
            reqBuilder.setNeedBarrageMask("your NeedBarrageMask");
            reqBuilder.setUnionInfo("your UnionInfo");
            reqBuilder.setHDRDefinition("your HDRDefinition");
            reqBuilder.setPlayScene("your PlayScene");
            reqBuilder.setDrmExpireTimestamp("your DrmExpireTimestamp");
            reqBuilder.setQuality("your Quality");
            String resp = vodService.getPlayAuthToken(reqBuilder.build(), 3600L);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
