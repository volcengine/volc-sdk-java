package com.volcengine.example.vod.upload;

import com.alibaba.fastjson.JSON;
import com.volcengine.helper.VodUploadMediaProcessListener;
import com.volcengine.helper.VodUploadProgressListener;
import com.volcengine.model.beans.Functions;
import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodUploadMediaRequest;
import com.volcengine.service.vod.model.response.VodCommitUploadInfoResponse;

import java.util.ArrayList;
import java.util.List;

public class VodUploadLocalM3u8Demo {
    public static void main(String[] args) {
        IVodService vodService = VodServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        String space = "your space name";
        String m3u8FilePath = "/Users/Downloads/main.m3u8";
        // ts 路径列表 & ts FileName 列表，设置时必须一一对应
        List<String> tsFilePaths = new ArrayList<>();
        List<String> tsFileNames = new ArrayList<>();

        tsFilePaths.add("/Users/Downloads/0.ts");
        tsFileNames.add("hello/vod/0.ts");

        tsFilePaths.add("/Users/Downloads/1.ts");
        tsFileNames.add("hello/vod/1.ts");

        List<Functions> functionsList = new ArrayList<>();
        Functions getMetaFunc = Functions.GetMetaFunction();
        functionsList.add(getMetaFunc);

        VodUploadMediaRequest vodUploadM3u8Request = VodUploadMediaRequest.newBuilder()
                .setSpaceName(space)
                .setFilePath(m3u8FilePath)
                .setFileName("hello/vod/main.m3u8")
                .setFunctions(JSON.toJSONString(functionsList))
                .build();
        // 需要进度条功能时添加相应 listener，如无需求，传 null 值即可
        VodUploadProgressListener listener = new VodUploadMediaProcessListener();

        try {
            VodCommitUploadInfoResponse vodCommitUploadInfoResponse = vodService.uploadLocalM3u8(vodUploadM3u8Request, tsFilePaths, tsFileNames, listener);
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
