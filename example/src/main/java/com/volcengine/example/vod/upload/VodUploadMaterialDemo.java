package com.volcengine.example.vod.upload;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.vod.Const;
import com.volcengine.model.beans.Functions;
import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodUploadMaterialRequest;
import com.volcengine.service.vod.model.response.VodCommitUploadInfoResponse;

import java.util.ArrayList;
import java.util.List;

public class VodUploadMaterialDemo {

    public static void main(String[] args) {
        IVodService vodService = VodServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        String space = "your space name";
        String filePath = "your file path";

        List<Functions> functionsList = new ArrayList<>();
        Functions getMetaFunc = Functions.GetMetaFunction();
        functionsList.add(getMetaFunc);

        Functions snapShotFunc = Functions.SnapShotFunction(2.3);
        functionsList.add(snapShotFunc);

        Functions addOptionInfo = Functions.AddOptionInfoFunction("素材测试视频", "test", "素材测试，视频文件", Const.CategoryVideo, "mp4");
        functionsList.add(addOptionInfo);

        VodUploadMaterialRequest vodUploadMaterialRequest = VodUploadMaterialRequest.newBuilder()
                .setSpaceName(space)
                .setFilePath(filePath)
                .setFileType(Const.FileTypeMedia)
                .setFunctions(JSON.toJSONString(functionsList))
                .build();

        try {
            VodCommitUploadInfoResponse vodCommitUploadInfoResponse = vodService.uploadMaterial(vodUploadMaterialRequest);
            if (vodCommitUploadInfoResponse.getResponseMetadata().hasError()) {
                System.out.println(vodCommitUploadInfoResponse.getResponseMetadata().getError());
                System.exit(-1);
            }
            System.out.println(vodCommitUploadInfoResponse.toString());
            System.out.println(vodCommitUploadInfoResponse.getResult().getData().getMid());
            System.out.println(vodCommitUploadInfoResponse.getResponseMetadata().getRequestId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

////  图片素材上传
//    public static void main(String[] args) {
//        IVodService vodService = VodServiceImpl.getInstance();
//
//        // call below method if you dont set ak and sk in ～/.vcloud/config
//        vodService.setAccessKey("your ak");
//        vodService.setSecretKey("your sk");
//
//        String space = "your space name";
//        String filePath = "your file path";
//
//        List<Functions> functionsList = new ArrayList<>();
//        Functions getMetaFunc = Functions.GetMetaFunction();
//        functionsList.add(getMetaFunc);
//
//        Functions snapShotFunc = Functions.SnapShotFunction(2.3);
//        functionsList.add(snapShotFunc);
//
//        Functions addOptionInfo = Functions.AddOptionInfoFunction("素材测试图片", "test", "素材测试，图片文件", Const.CategoryImage, "jpg");
//        functionsList.add(addOptionInfo);
//
//        VodUploadMaterialRequest vodUploadMaterialRequest = VodUploadMaterialRequest.newBuilder()
//                .setSpaceName(space)
//                .setFilePath(filePath)
//                .setFileType(Const.FileTypeImage)
//                .setFileName("hello/vod/image")
//                .setFunctions(JSON.toJSONString(functionsList))
//                .build();
//
//        try {
//            VodCommitUploadInfoResponse vodCommitUploadInfoResponse = vodService.uploadMaterial(vodUploadMaterialRequest);
//            if (vodCommitUploadInfoResponse.getResponseMetadata().hasError()) {
//                System.out.println(vodCommitUploadInfoResponse.getResponseMetadata().getError());
//                System.exit(-1);
//            }
//            System.out.println(vodCommitUploadInfoResponse.toString());
//            System.out.println(vodCommitUploadInfoResponse.getResult().getData().getMid());
//            System.out.println(vodCommitUploadInfoResponse.getResponseMetadata().getRequestId());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

////    字幕素材上传
//    public static void main(String[] args) {
//        IVodService vodService = VodServiceImpl.getInstance();
//
//        // call below method if you dont set ak and sk in ～/.vcloud/config
//        vodService.setAccessKey("your ak");
//        vodService.setSecretKey("your sk");
//
//        String space = "your space name";
//        String filePath = "your file path";
//
//        List<Functions> functionsList = new ArrayList<>();
//        Functions getMetaFunc = Functions.GetMetaFunction();
//        functionsList.add(getMetaFunc);
//
//        Functions snapShotFunc = Functions.SnapShotFunction(2.3);
//        functionsList.add(snapShotFunc);
//
//        Functions addOptionInfo = Functions.AddOptionInfoFunction("素材测试字幕", "test", "素材测试，字幕文件", Const.CategorySubtitle, "vtt");
//        functionsList.add(addOptionInfo);
//
//        VodUploadMaterialRequest vodUploadMaterialRequest = VodUploadMaterialRequest.newBuilder()
//                .setSpaceName(space)
//                .setFilePath(filePath)
//                .setFileType(Const.FileTypeObject)
//                .setFileName("hello/vod/object")
//                .setFunctions(JSON.toJSONString(functionsList))
//                .build();
//
//        try {
//            VodCommitUploadInfoResponse vodCommitUploadInfoResponse = vodService.uploadMaterial(vodUploadMaterialRequest);
//            if (vodCommitUploadInfoResponse.getResponseMetadata().hasError()) {
//                System.out.println(vodCommitUploadInfoResponse.getResponseMetadata().getError());
//                System.exit(-1);
//            }
//            System.out.println(vodCommitUploadInfoResponse.toString());
//            System.out.println(vodCommitUploadInfoResponse.getResult().getData().getMid());
//            System.out.println(vodCommitUploadInfoResponse.getResponseMetadata().getRequestId());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

}
