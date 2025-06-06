package com.volcengine.example.vod.upload;

import com.alibaba.fastjson.JSON;
import com.volcengine.helper.VodUploadMediaProcessListener;
import com.volcengine.helper.VodUploadProgressListener;
import com.volcengine.model.beans.Functions;
import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodUploadMediaRequest;
import com.volcengine.model.request.vod.VodStreamUploadRequest;
import com.volcengine.service.vod.model.response.VodCommitUploadInfoResponse;

import java.util.ArrayList;
import java.util.List;

public class VodUploadObjectDemo {

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
        String filePath = "your file path";

        List<Functions> functionsList = new ArrayList<>();
        Functions getMetaFunc = Functions.GetMetaFunction();
        functionsList.add(getMetaFunc);

        VodUploadMediaRequest vodUploadMediaRequest = VodUploadMediaRequest.newBuilder()
                .setSpaceName(space)
                .setFilePath(filePath)
                .setFileName("hello/vod/1.ts")
                .setFunctions(JSON.toJSONString(functionsList))
                .build();
        // 需要进度条功能时添加相应 listener，如无需求，传 null 值即可
        VodUploadProgressListener listener = new VodUploadMediaProcessListener();

        try {
            VodCommitUploadInfoResponse vodCommitUploadInfoResponse = vodService.uploadObject(vodUploadMediaRequest, listener);
            if (vodCommitUploadInfoResponse.getResponseMetadata().hasError()) {
                System.out.println(vodCommitUploadInfoResponse.getResponseMetadata().getError());
                System.exit(-1);
            }
            System.out.println(vodCommitUploadInfoResponse.toString());
            System.out.println(vodCommitUploadInfoResponse.getResult().getData().getSourceInfo().getStoreUri());
            System.out.println(vodCommitUploadInfoResponse.getResponseMetadata().getRequestId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    //Object流上传
//    public static void main(String[] args) {
//        // Create a VOD instance in the specified region.
//        // IVodService vodService = VodServiceImpl.getInstance("cn-north-1");
//        IVodService vodService = VodServiceImpl.getInstance();
//
//        // Configure your Access Key ID (AK) and Secret Access Key (SK) in the environment variables or in the local ~/.volc/config file. For detailed instructions, see https://www.volcengine.com/docs/4/65641.
//        // The SDK will automatically fetch the AK and SK from the environment variables or the ~/.volc/config file as needed.
//        // During testing, you may use the following code snippet. However, do not store the AK and SK directly in your project code to prevent potential leakage and safeguard the security of all resources associated with your account.
//        // vodService.setAccessKey("your ak");
//        // vodService.setSecretKey("your sk");
//
//        String space = "your space name";
//
//        List<Functions> functionsList = new ArrayList<>();
//        Functions getMetaFunc = Functions.GetMetaFunction();
//        functionsList.add(getMetaFunc);
//
//        VodStreamUploadRequest vodUploadObjectRequest = new VodStreamUploadRequest();
//        vodUploadObjectRequest.setSpaceName(space);
//        vodUploadObjectRequest.setContent(null);
//        vodUploadObjectRequest.setSize(0L);
//        vodUploadObjectRequest.setChunkSize(0L);
//        vodUploadObjectRequest.setFileName("hello/vod/1.ts");
//        vodUploadObjectRequest.setFunctions(JSON.toJSONString(functionsList));
//
//        try {
//            VodCommitUploadInfoResponse vodCommitUploadInfoResponse = vodService.streamUploadObject(vodUploadObjectRequest);
//            if (vodCommitUploadInfoResponse.getResponseMetadata().hasError()) {
//                System.out.println(vodCommitUploadInfoResponse.getResponseMetadata().getError());
//                System.exit(-1);
//            }
//            System.out.println(vodCommitUploadInfoResponse.toString());
//            System.out.println(vodCommitUploadInfoResponse.getResult().getData().getSourceInfo().getStoreUri());
//            System.out.println(vodCommitUploadInfoResponse.getResponseMetadata().getRequestId());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

}
