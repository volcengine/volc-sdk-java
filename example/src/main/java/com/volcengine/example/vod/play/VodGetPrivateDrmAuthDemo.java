package com.volcengine.example.vod.play;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodGetPrivateDrmPlayAuthRequest;
import com.volcengine.service.vod.model.response.VodGetPrivateDrmPlayAuthResponse;

public class VodGetPrivateDrmAuthDemo {
    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.vcloud/config
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");
        String vid = "your vid";
        String unionInfo = "your unionInfo";
        try {
            VodGetPrivateDrmPlayAuthRequest.Builder reqBuilder = VodGetPrivateDrmPlayAuthRequest.newBuilder();
            reqBuilder.setVid(vid);
            reqBuilder.setDrmType("your drmType");
            reqBuilder.setPlayAuthIds("your playAuthIds");
            reqBuilder.setUnionInfo(unionInfo);

            VodGetPrivateDrmPlayAuthResponse resp = vodService.getPrivateDrmPlayAuth(reqBuilder.build());
            System.out.println(resp.getResult().getPlayAuthInfoList(0).getPlayAuthContent().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
