package com.volcengine.example.vod.upload;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.beans.Functions;
import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodCommitUploadInfoRequest;
import com.volcengine.service.vod.model.response.VodCommitUploadInfoResponse;

import java.util.ArrayList;
import java.util.List;

public class VodCommitUploadInfoDemo {

    public static void main(String[] args) {
        IVodService vodService = VodServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        String space = "your space";
        String session = "";

        List<Functions> functionsList = new ArrayList<>();
        Functions getMetaFunc = Functions.GetMetaFunction();
        functionsList.add(getMetaFunc);

        Functions snapShotFunc = Functions.SnapShotFunction(2.3);
        functionsList.add(snapShotFunc);

        VodCommitUploadInfoRequest vodCommitUploadInfoRequest = VodCommitUploadInfoRequest.newBuilder()
                .setSpaceName(space)
                .setSessionKey(session)
                .setFunctions(JSON.toJSONString(functionsList))
                .build();
        try {
            VodCommitUploadInfoResponse vodCommitUploadInfoResponse = vodService.commitUploadInfo(vodCommitUploadInfoRequest);
            if (vodCommitUploadInfoResponse.getResponseMetadata().hasError()) {
                System.out.println(vodCommitUploadInfoResponse.getResponseMetadata().getError());
                System.exit(-1);
            }
            System.out.println(vodCommitUploadInfoResponse.toString());
            System.out.println(vodCommitUploadInfoResponse.getResult().getData().getVid());
            System.out.println(vodCommitUploadInfoResponse.getResponseMetadata().getRequestId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
