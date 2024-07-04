package com.volcengine.helper;

import com.github.rholder.retry.Retryer;
import com.volcengine.model.beans.PartInputStream;
import com.volcengine.service.vod.UploadException;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.business.VodHeaderPair;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpResponse;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VodUploadByStream extends VodUploadAbstractStrategy {
    @Override
    public void directUpload(VodServiceImpl vodService, String host, String oid, String auth, List<VodHeaderPair> uploadHeaderList, File file, Retryer retryer, int storageClass, VodUploadProgressListener listener) throws Exception {
        String oidEncode = StringUtils.replace(oid, " ", "%20");
        String url = String.format("https://%s/%s", host, oidEncode);
        try (InputStream inputStream = com.volcengine.helper.Utils.newRepeatableInputStream(new FileInputStream(file))) {
            inputStream.mark(0);
            long crc32 = com.volcengine.helper.Utils.crc32(inputStream);
            inputStream.reset();
            String checkSum = String.format("%08x", crc32);
            Map<String, String> headers = new HashMap<>();
            fillDirectUploadCommonHeaders(headers, uploadHeaderList, auth, checkSum, storageClass);

            boolean response = (boolean) retryer.call(() -> vodService.putData(url, inputStream, headers));
            com.volcengine.helper.VodUploadProgressListenerHelper.sendVodUploadEvent(listener, com.volcengine.helper.VodUploadProgressEventType.UPLOAD_BYTES_EVENT, file.length() - 1);
            if (!response){
                throw new UploadException(-1, -1, "");
            }
        }
    }

    @Override
    public void chunkUpload(VodServiceImpl vodService, String host, String oid, String auth, List<com.volcengine.service.vod.model.business.VodHeaderPair> uploadHeaderList, File file, boolean isLargeFile, Retryer retryer, int storageClass, com.volcengine.helper.VodUploadProgressListener listener) throws Exception {
        String uploadID = vodService.initUploadPart(host, oid, auth, isLargeFile, uploadHeaderList, retryer, storageClass);
        List<String> parts = new ArrayList<>();
        long num = file.length() / com.volcengine.service.vod.Const.MinChunkSize;
        long lastNum = num - 1;
        long partNumber;
        String objectContentType = "";
        for (long i = 0; i < lastNum; i++) {
            try (InputStream fileInputStream = new FileInputStream(file)) {
                fileInputStream.skip(i * com.volcengine.service.vod.Const.MinChunkSize);
                try (InputStream inputStream = com.volcengine.helper.Utils.newRepeatableInputStream(new PartInputStream(fileInputStream, com.volcengine.service.vod.Const.MinChunkSize))) {
                    partNumber = isLargeFile ? i + 1 : i;
                    VodServiceImpl.UploadPartResponse uploadPartResponse = uploadPart(vodService, host, oid, auth, uploadID, partNumber, inputStream, isLargeFile, retryer, storageClass);
                    parts.add(uploadPartResponse.getCheckSum());
                    if (partNumber == 1) {
                        objectContentType = uploadPartResponse.getObjectContentType();
                    }
                    com.volcengine.helper.VodUploadProgressListenerHelper.sendVodUploadEvent(listener, com.volcengine.helper.VodUploadProgressEventType.UPLOAD_BYTES_EVENT, com.volcengine.service.vod.Const.MinChunkSize);
                } catch (Exception e) {
                    throw e;
                }
            }
        }
        long readCount = (long) com.volcengine.service.vod.Const.MinChunkSize * lastNum;
        int len = (int) (file.length() - readCount);
        try (InputStream fileInputStream = new FileInputStream(file)) {
            fileInputStream.skip(readCount);
            try (InputStream inputStream = com.volcengine.helper.Utils.newRepeatableInputStream(new PartInputStream(fileInputStream, len))) {
                partNumber = isLargeFile ? lastNum + 1 : lastNum;
                VodServiceImpl.UploadPartResponse uploadPartResponse = uploadPart(vodService, host, oid, auth, uploadID, partNumber, inputStream, isLargeFile, retryer, storageClass);
                parts.add(uploadPartResponse.getCheckSum());
                if (partNumber == 1) {
                    objectContentType = uploadPartResponse.getObjectContentType();
                }
                com.volcengine.helper.VodUploadProgressListenerHelper.sendVodUploadEvent(listener, com.volcengine.helper.VodUploadProgressEventType.UPLOAD_BYTES_EVENT, len - 1);
            } catch (Exception e) {
                throw e;
            }
        }

        vodService.uploadMergePart(host, oid, auth, uploadID, parts.stream().toArray(String[]::new), isLargeFile, retryer, storageClass, objectContentType);
    }

    private VodServiceImpl.UploadPartResponse uploadPart(VodServiceImpl vodService, String host, String oid, String auth, String uploadID, long partNumber, InputStream inputStream, boolean isLargeFile, Retryer retryer, int storageClass) throws Exception {
        String oidEncode = StringUtils.replace(oid, " ", "%20");
        String url = String.format("https://%s/%s?partNumber=%d&uploadID=%s", host, oidEncode, partNumber, uploadID);
        Map<String, String> headers = new HashMap<>();
        inputStream.mark(0);
        long crc32 = com.volcengine.helper.Utils.crc32(inputStream);
        inputStream.reset();
        String checkSum = String.format("%08x", crc32);
        fillPartUploadCommonHeaders(headers, auth, checkSum, isLargeFile, storageClass);

        HttpResponse httpResponse = (HttpResponse) (retryer.call(() -> vodService.putDataWithResponse(url, inputStream, headers)));
        return getUploadPartResponse(isLargeFile, checkSum, httpResponse);
    }

}
