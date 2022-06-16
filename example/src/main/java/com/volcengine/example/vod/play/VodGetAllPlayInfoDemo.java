package com.volcengine.example.vod.play;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodGetAllPlayInfoRequest;
import com.volcengine.service.vod.model.response.VodGetAllPlayInfoResponse;

public class VodGetAllPlayInfoDemo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.vcloud/config
        // vodService.setAccessKey("");
        // vodService.setSecretKey("");

        try {
            VodGetAllPlayInfoRequest.Builder reqBuilder = VodGetAllPlayInfoRequest.newBuilder();
            reqBuilder.setVids("your Vids");
            reqBuilder.setFormats("your Formats");
            reqBuilder.setCodecs("your Codecs");
            reqBuilder.setDefinitions("your Definitions");
            reqBuilder.setFileTypes("your FileTypes");
            reqBuilder.setLogoTypes("your LogoTypes");
            reqBuilder.setNeedEncryptStream("your NeedEncryptStream");
            reqBuilder.setSsl("your Ssl");
            reqBuilder.setNeedThumbs("your NeedThumbs");
            reqBuilder.setNeedBarrageMask("your NeedBarrageMask");
            reqBuilder.setCdnType("your CdnType");
            reqBuilder.setUnionInfo("your UnionInfo");
            reqBuilder.setPlayScene("your PlayScene");
            reqBuilder.setDrmExpireTimestamp("your DrmExpireTimestamp");
            reqBuilder.setHDRType("your HDRType");
            reqBuilder.setKeyFrameAlignmentVersion("your KeyFrameAlignmentVersion");
            reqBuilder.setUserAction("your UserAction");
            reqBuilder.setQuality("your Quality");
            VodGetAllPlayInfoResponse resp = vodService.getAllPlayInfo(reqBuilder.build());
            if (resp.getResponseMetadata().hasError()) {
                System.out.println(resp.getResponseMetadata().getError());
                System.exit(-1);
            }
            System.out.println(resp.getResult());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
