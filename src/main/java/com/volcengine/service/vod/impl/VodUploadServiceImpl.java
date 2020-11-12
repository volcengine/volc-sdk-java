package com.volcengine.service.vod.impl;

import com.volcengine.error.SdkError;
import com.volcengine.helper.Utils;
import com.volcengine.model.beans.UploadCompleteInfo;
import com.volcengine.model.vod.business.VodUploadAddress;
import com.volcengine.model.vod.request.VodApplyUploadInfoRequest;
import com.volcengine.model.vod.request.VodCommitUploadInfoRequest;
import com.volcengine.model.vod.request.VodUploadMediaRequest;
import com.volcengine.model.vod.response.VodApplyUploadInfoResponse;
import com.volcengine.model.vod.response.VodCommitUploadInfoResponse;

import java.io.File;
import java.util.HashMap;
import java.util.Map;


public class VodUploadServiceImpl extends VodServiceImpl {

    private VodUploadServiceImpl() {
        super();
    }

    public static VodUploadServiceImpl getInstance() {
        return new VodUploadServiceImpl();
    }

    public VodCommitUploadInfoResponse uploadMedia(VodUploadMediaRequest vodUploadMediaRequest) throws Exception {
        UploadCompleteInfo uploadCompleteInfo = uploadToB(vodUploadMediaRequest.getSpaceName(), vodUploadMediaRequest.getFilePath());

        VodCommitUploadInfoRequest vodCommitUploadInfoRequest = VodCommitUploadInfoRequest.newBuilder()
                .setSpaceName(vodUploadMediaRequest.getSpaceName())
                .setSessionKey(uploadCompleteInfo.getSessionKey())
                .setFunctions(vodUploadMediaRequest.getFunctions())
                .setCallbackArgs(vodUploadMediaRequest.getCallbackArgs())
                .build();

        return commitUploadInfo(vodCommitUploadInfoRequest);
    }

    private UploadCompleteInfo uploadToB(String spaceName, String filePath) throws Exception {
        File file = new File(filePath);
        if (!(file.isFile() && file.exists())) {
            throw new Exception(SdkError.getErrorDesc(SdkError.ENOFILE));
        }
        long crc32 = Utils.crc32(filePath);
        if (crc32 == -1) {
            throw new Exception("file crc32 error");
        }
        String checkSum = String.format("%x", crc32);

        VodApplyUploadInfoRequest vodApplyUploadInfoRequest = VodApplyUploadInfoRequest.newBuilder()
                .setSpaceName(spaceName)
                .build();

        VodApplyUploadInfoResponse vodApplyUploadInfoResponse = applyUploadInfo(vodApplyUploadInfoRequest);
        if (vodApplyUploadInfoResponse.getResponseMetadata().hasError()) {
            throw new Exception(vodApplyUploadInfoResponse.getResponseMetadata().getError().getMessage());
        }
        VodUploadAddress vodUploadAddress = vodApplyUploadInfoResponse.getResult().getData().getUploadAddress();
        if (!vodApplyUploadInfoResponse.hasResult() || vodUploadAddress.getStoreInfosCount() == 0) {
            throw new Exception("apply upload result is null");
        }

        String oid = vodUploadAddress.getStoreInfos(0).getStoreUri();
        String sessionKey = vodUploadAddress.getSessionKey();
        String auth = vodUploadAddress.getStoreInfos(0).getAuth();
        String host = vodUploadAddress.getUploadHosts(0);
        //TODO 提取成函数，url 生成
        String url = String.format("http://%s/%s", host, oid);

        Map<String, String> headers = new HashMap<>();
        //TODO 常量提取
        headers.put("Content-CRC32", checkSum);
        headers.put("Authorization", auth);

        long startTime = System.currentTimeMillis();
        boolean uploadStatus = false;
        //TODO 抽出 retry
        for (int i = 0; i < 3; i++) {
            //TODO put 方法需要改进，HTTPUtil.Put
            uploadStatus = put(url, filePath, headers);
            if (uploadStatus) {
                break;
            }
        }
        if (!uploadStatus) {
            throw new Exception(SdkError.getErrorDesc(SdkError.EUPLOAD));
        }
        long endTime = System.currentTimeMillis();
        long cost = endTime - startTime;
        float avgSpeed = (float) file.length() / (float) cost;
        System.out.println(String.format("upload {%s} cost {%d} ms, avgSpeed: {%f} KB/s", filePath, cost, avgSpeed));

        UploadCompleteInfo uploadCompleteInfo = new UploadCompleteInfo(oid, sessionKey);
        return uploadCompleteInfo;
    }

}
