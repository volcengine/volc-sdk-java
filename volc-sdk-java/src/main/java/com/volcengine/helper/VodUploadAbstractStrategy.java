package com.volcengine.helper;

import com.alibaba.fastjson.JSONObject;
import com.volcengine.service.vod.UploadException;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.business.VodHeaderPair;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public abstract class VodUploadAbstractStrategy implements IVodUploadStrategy {
    public void fillDirectUploadCommonHeaders(Map<String, String> headers, List<VodHeaderPair> uploadHeaderList, String auth, String checkSum, int storageClass) {
        headers.put("Authorization", auth);
        headers.put("Content-CRC32", checkSum);
        uploadHeaderList.forEach(vodHeaderPair -> headers.put(vodHeaderPair.getKey(), vodHeaderPair.getValue()));

        if (storageClass == com.volcengine.service.vod.model.business.StorageClassType.Archive_VALUE) {
            headers.put("X-Upload-Storage-Class", "archive");
        }
        if (storageClass == com.volcengine.service.vod.model.business.StorageClassType.IA_VALUE) {
            headers.put("X-Upload-Storage-Class", "ia");
        }
    }

    public void fillPartUploadCommonHeaders(Map<String, String> headers, String auth, String checkSum, boolean isLargeFile, int storageClass) {
        headers.put("Authorization", auth);
        headers.put("Content-CRC32", checkSum);
        if (isLargeFile) {
            headers.put("X-Storage-Mode", "gateway");
        }
        if (storageClass == com.volcengine.service.vod.model.business.StorageClassType.Archive_VALUE) {
            headers.put("X-Upload-Storage-Class", "archive");
        }
        if (storageClass == com.volcengine.service.vod.model.business.StorageClassType.IA_VALUE) {
            headers.put("X-Upload-Storage-Class", "ia");
        }
    }

    VodServiceImpl.UploadPartResponse getUploadPartResponse(boolean isLargeFile, String checkSum, HttpResponse httpResponse) throws IOException {
        if (httpResponse == null) {
            throw new RuntimeException("upload part error,response is empty");
        }
        if (httpResponse.getStatusLine().getStatusCode() != 200) {
            throw new RuntimeException("http code is " + httpResponse.getStatusLine().getStatusCode());
        }
        String entity = EntityUtils.toString(httpResponse.getEntity());
        JSONObject result = JSONObject.parseObject(entity);

        if (result.getIntValue("success") != 0) {
            JSONObject errObj = result.getJSONObject("error");
            throw new UploadException(
                    errObj.getIntValue("code"),
                    errObj.getIntValue("error_code"),
                    errObj.getString("message")
            );
        }

        VodServiceImpl.UploadPartResponse.UploadPartResponseBuilder builder = VodServiceImpl.UploadPartResponse.builder()
                .checkSum(checkSum);
        if (isLargeFile) {
            builder.objectContentType(result.getJSONObject("payload").getJSONObject("meta").getString("ObjectContentType"));
        }
        return builder.build();
    }
}
