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
        // Create a VOD instance in the specified region.
        // IVodService vodService = VodServiceImpl.getInstance("cn-north-1");
        IVodService vodService = VodServiceImpl.getInstance();

        // Configure your Access Key ID (AK) and Secret Access Key (SK) in the environment variables or in the local ~/.volc/config file. For detailed instructions, see https://www.volcengine.com/docs/4/65641.
        // The SDK will automatically fetch the AK and SK from the environment variables or the ~/.volc/config file as needed.
        // During testing, you may use the following code snippet. However, do not store the AK and SK directly in your project code to prevent potential leakage and safeguard the security of all resources associated with your account.
        // vodService.setAccessKey("your ak");
        // vodService.setSecretKey("your sk");

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
