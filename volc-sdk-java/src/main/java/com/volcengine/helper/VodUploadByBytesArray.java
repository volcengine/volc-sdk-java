package com.volcengine.helper;

import com.github.rholder.retry.Retryer;
import com.volcengine.service.vod.impl.VodServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpResponse;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VodUploadByBytesArray extends VodUploadAbstractStrategy {
    @Override
    public void directUpload(VodServiceImpl vodService, String host, String oid, String auth, List<com.volcengine.service.vod.model.business.VodHeaderPair> uploadHeaderList, File file, Retryer retryer, int storageClass, com.volcengine.helper.VodUploadProgressListener listener) throws Exception {
        String oidEncode = StringUtils.replace(oid, " ", "%20");
        String url = String.format("https://%s/%s", host, oidEncode);
        byte[] bytes = Files.readAllBytes(Paths.get(file.getPath()));
        long crc32 = com.volcengine.helper.Utils.crc32(bytes);
        String checkSum = String.format("%08x", crc32);
        Map<String, String> headers = new HashMap<>();
        fillDirectUploadCommonHeaders(headers, uploadHeaderList, auth, checkSum, storageClass);

        retryer.call(() -> vodService.putData(url, bytes, headers));
        com.volcengine.helper.VodUploadProgressListenerHelper.sendVodUploadEvent(listener, com.volcengine.helper.VodUploadProgressEventType.UPLOAD_BYTES_EVENT, file.length() - 1);
    }

    @Override
    public void chunkUpload(VodServiceImpl vodService, String host, String oid, String auth, List<com.volcengine.service.vod.model.business.VodHeaderPair> uploadHeaderList, File file, boolean isLargeFile, Retryer retryer, int storageClass, com.volcengine.helper.VodUploadProgressListener listener) throws Exception {
        String uploadID = vodService.initUploadPart(host, oid, auth, isLargeFile, uploadHeaderList, retryer, storageClass);
        byte[] data = new byte[com.volcengine.service.vod.Const.MinChunkSize];
        List<String> parts = new ArrayList<>();
        long num = file.length() / com.volcengine.service.vod.Const.MinChunkSize;
        long lastNum = num - 1;
        long partNumber;
        String objectContentType = "";
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))) {
            for (long i = 0; i < lastNum; i++) {
                bis.read(data);
                partNumber = isLargeFile ? i + 1 : i;
                VodServiceImpl.UploadPartResponse uploadPartResponse = uploadPart(vodService, host, oid, auth, uploadID, partNumber, data, isLargeFile, retryer, storageClass);
                parts.add(uploadPartResponse.getCheckSum());
                if (partNumber == 1) {
                    objectContentType = uploadPartResponse.getObjectContentType();
                }
                com.volcengine.helper.VodUploadProgressListenerHelper.sendVodUploadEvent(listener, com.volcengine.helper.VodUploadProgressEventType.UPLOAD_BYTES_EVENT, data.length);
            }
            long readCount = (long) com.volcengine.service.vod.Const.MinChunkSize * lastNum;
            int len = (int) (file.length() - readCount);
            byte[] lastPart = new byte[len];
            bis.read(lastPart);
            partNumber = isLargeFile ? lastNum + 1 : lastNum;
            VodServiceImpl.UploadPartResponse uploadPartResponse = uploadPart(vodService, host, oid, auth, uploadID, partNumber, lastPart, isLargeFile, retryer, storageClass);
            parts.add(uploadPartResponse.getCheckSum());
            com.volcengine.helper.VodUploadProgressListenerHelper.sendVodUploadEvent(listener, com.volcengine.helper.VodUploadProgressEventType.UPLOAD_BYTES_EVENT, lastPart.length - 1);
        } catch (Exception e) {
            throw e;
        }
        vodService.uploadMergePart(host, oid, auth, uploadID, parts.stream().toArray(String[]::new), isLargeFile, retryer, storageClass, objectContentType);
    }

    private VodServiceImpl.UploadPartResponse uploadPart(VodServiceImpl vodService, String host, String oid, String auth, String uploadID, long partNumber, byte[] data, boolean isLargeFile, Retryer retryer, int storageClass) throws Exception {
        String oidEncode = StringUtils.replace(oid, " ", "%20");
        String url = String.format("http://%s/%s?partNumber=%d&uploadID=%s", host, oidEncode, partNumber, uploadID);
        Map<String, String> headers = new HashMap<>();
        long crc32 = com.volcengine.helper.Utils.crc32(data);
        String checkSum = String.format("%08x", crc32);
        fillPartUploadCommonHeaders(headers, auth, checkSum, isLargeFile, storageClass);

        HttpResponse httpResponse = (HttpResponse) (retryer.call(() -> vodService.putDataWithResponse(url, data, headers)));
        return getUploadPartResponse(isLargeFile, checkSum, httpResponse);
    }

}
