package com.volcengine.example.vod.cdn;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodDescribeIPInfoRequest;
import com.volcengine.service.vod.model.response.VodDescribeIPInfoResponse;

public class VodDescribeIpInfoDemo {
    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.vcloud/config
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            VodDescribeIPInfoRequest.Builder input = com.volcengine.service.vod.model.request.VodDescribeIPInfoRequest.newBuilder();
            input.setIps("1.1.1.1,2.2.2.2");
            VodDescribeIPInfoResponse resp = vodService.describeIpInfo(input.build());
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
