package com.volcengine.service.imagex.v2;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.rholder.retry.Retryer;
import com.github.rholder.retry.RetryerBuilder;
import com.github.rholder.retry.StopStrategies;
import com.github.rholder.retry.WaitStrategies;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Utils;
import com.volcengine.model.ServiceInfo;
import com.volcengine.model.request.ApplyImageUploadRequest;
import com.volcengine.model.request.CommitImageUploadRequest;
import com.volcengine.model.request.CommitImageUploadRequestBody;
import com.volcengine.model.response.ApplyImageUploadResponse;
import com.volcengine.model.response.CommitImageUploadResponse;
import com.volcengine.model.response.RawResponse;
import com.volcengine.model.response.ResponseMetadata;
import com.volcengine.model.sts2.Policy;
import com.volcengine.model.sts2.SecurityToken2;
import com.volcengine.model.sts2.Statement;
import com.volcengine.util.Sts2Utils;
import com.volcengine.util.Time;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * ImagexService
 */
public class ImagexService extends ImagexTrait {

    public static final String RESOURCE_SERVICE_ID_FORMAT = "trn:ImageX:*:*:ServiceId/%s";
    public static final String RESOURCE_STORE_KEY_FORMAT = "trn:ImageX:*:*:StoreKeys/%s";
    public static final int MIN_CHUNK_SIZE = 1024 * 1024 * 20;
    public static final int LARGE_FILE_SIZE = 1024 * 1024 * 1024;
    private static Logger LOG = Logger.getLogger("ImageXLogger");
    private final Retryer<Boolean> uploadRetryer = createUploadDefaultRetryer();
    private final Retryer<HttpResponse> httpRetryer = createUploadDefaultRetryer();

    private ImagexService() {
        super();
    }

    private ImagexService(ServiceInfo serviceInfo) {
        super(serviceInfo);
    }

    static public ImagexService getInstance() {
        return new ImagexService();
    }

    static public ImagexService getInstance(String region) throws Exception {
        ServiceInfo serviceInfo = ImagexConfig.serviceInfoMap.get(region);
        if (serviceInfo == null) {
            throw new Exception("Imagex not support region " + region);
        }
        return new ImagexService(serviceInfo);
    }

    static private <R> Retryer<R> createUploadDefaultRetryer() {
        return RetryerBuilder.<R>newBuilder().retryIfException().retryIfResult(it -> Objects.equals(it, false)).retryIfResult(Objects::isNull).withWaitStrategy(WaitStrategies.exponentialWait()).withStopStrategy(StopStrategies.stopAfterAttempt(3)).build();
    }


    public ApplyImageUploadResponse applyImageUpload(ApplyImageUploadRequest req) throws Exception {
        RawResponse response = query("ApplyImageUpload", Utils.paramsToPair(req));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ApplyImageUploadResponse res = JSON.parseObject(response.getData(), ApplyImageUploadResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + " error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("ImageX");
        return res;
    }


    public CommitImageUploadResponse commitImageUpload(CommitImageUploadRequest req) throws Exception {
        Map<String, String> params = new HashMap<>();
        params.put("ServiceId", req.getServiceId());
        Boolean skipMeta = req.getSkipMeta();
        if (Objects.equals(skipMeta, Boolean.TRUE)) {
            params.put("SkipMeta", "true");
        } else if (Objects.equals(skipMeta, Boolean.FALSE)) {
            params.put("SkipMeta", "false");
        }
        CommitImageUploadRequestBody reqBody = new CommitImageUploadRequestBody();
        reqBody.setSessionKey(req.getSessionKey());
        reqBody.setOptionInfos(req.getOptionInfos());

        RawResponse response = json("CommitImageUpload", Utils.mapToPairList(params), JSON.toJSONString(reqBody));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        CommitImageUploadResponse res = JSON.parseObject(response.getData(), CommitImageUploadResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + " error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("ImageX");
        return res;
    }

    private void doUpload(String host, ApplyImageUploadResponse.StoreInfosBean storeInfo, InputStream imageData) throws Exception {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        int nRead;
        byte[] data = new byte[16384];
        while ((nRead = imageData.read(data, 0, data.length)) != -1) {
            buffer.write(data, 0, nRead);
        }
        doUpload(host, storeInfo, buffer.toByteArray());
    }

    private boolean putImageXData(String url, byte[] data, Map<String, String> headers) {
        HttpResponse response = putDataWithResponse(url, data, headers);
        if (response == null) {
            LOG.log(Level.WARNING, "upload " + url + " error, response is empty");
            return false;
        }
        if (response.getStatusLine().getStatusCode() != 200) {
            String bodyStr = "";
            try {
                bodyStr = EntityUtils.toString(response.getEntity());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            LOG.log(Level.WARNING, "upload " + url + " error, msg is " + response.getStatusLine().getStatusCode() + ", body is " + bodyStr);
            return false;
        }
        return true;
    }

    private void doUpload(String host, ApplyImageUploadResponse.StoreInfosBean storeInfo, byte[] imageData) throws Exception {
        long crc32 = Utils.crc32(imageData);
        String checkSum = String.format("%08x", crc32);
        String url = String.format("https://%s/%s", host, storeInfo.getStoreUri());
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-CRC32", checkSum);
        headers.put("Authorization", storeInfo.getAuth());

        long startTime = System.currentTimeMillis();
        uploadRetryer.call(() -> putImageXData(url, imageData, headers));
        long endTime = System.currentTimeMillis();
        long cost = endTime - startTime;
        float avgSpeed = (float) imageData.length / (float) cost;
        System.out.printf("upload image cost {%d} ms, avgSpeed: {%f} KB/s%n", cost, avgSpeed);
    }

    private void chunkUpload(String host, ApplyImageUploadResponse.StoreInfosBean storeInfo, InputStream content, Long size, boolean isLargeFile) throws Exception {
        String uploadID = initUploadPart(host, storeInfo, isLargeFile);
        byte[] data = new byte[MIN_CHUNK_SIZE];
        List<String> parts = new ArrayList<>();
        long num = size / MIN_CHUNK_SIZE;
        long lastNum = num - 1;
        long partNumber;
        try (BufferedInputStream bis = new BufferedInputStream(content)) {
            for (long i = 0; i < lastNum; i++) {
                int readSize = bis.read(data);
                if (readSize != MIN_CHUNK_SIZE) {
                    throw new IllegalStateException(String.format("can not read a full chunk from content, %s expected but %s read", MIN_CHUNK_SIZE, readSize));
                }
                partNumber = isLargeFile ? i + 1 : i;
                parts.add(uploadPart(host, storeInfo, uploadID, partNumber, data, isLargeFile));
            }
            long readCount = (long) MIN_CHUNK_SIZE * lastNum;
            int len = (int) (size - readCount);
            byte[] lastPart = new byte[len];
            int readSize = bis.read(lastPart);
            if (readSize != len) {
                throw new IllegalStateException(String.format("can not read a full chunk from content, %s expected but %s read", len, readSize));
            }
            partNumber = isLargeFile ? lastNum + 1 : lastNum;
            parts.add(uploadPart(host, storeInfo, uploadID, partNumber, lastPart, isLargeFile));
        }
        uploadMergePart(host, storeInfo, uploadID, parts.toArray(new String[0]), isLargeFile);
    }

    private String initUploadPart(String host, ApplyImageUploadResponse.StoreInfosBean storeInfo, boolean isLargeFile) throws Exception {
        String url = new URI("https", null, host, -1, "/" + storeInfo.getStoreUri(), "uploads", null).toASCIIString();
        Map<String, String> headers = new HashMap<>();
        headers.put("Authorization", storeInfo.getAuth());
        if (isLargeFile) {
            headers.put("X-Storage-Mode", "gateway");
        }
        HttpResponse httpResponse = httpRetryer.call(() -> putDataWithResponse(url, new byte[]{}, headers));
        if (httpResponse == null) {
            throw new RuntimeException("init part error, response is empty");
        }
        //noinspection DuplicatedCode
        if (httpResponse.getStatusLine().getStatusCode() != 200) {
            throw new RuntimeException("http code is " + httpResponse.getStatusLine().getStatusCode());
        }
        String entity = EntityUtils.toString(httpResponse.getEntity());
        JSONObject result = JSONObject.parseObject(entity);
        return result.getJSONObject("payload").getInnerMap().get("uploadID").toString();
    }

    private String uploadPart(String host, ApplyImageUploadResponse.StoreInfosBean storeInfo, String uploadID, long partNumber, byte[] data, boolean isLargeFile) throws Exception {
        String query = String.format("partNumber=%d&uploadID=%s", partNumber, uploadID);
        String url = new URI("https", null, host, -1, "/" + storeInfo.getStoreUri(), query, null).toASCIIString();
        Map<String, String> headers = new HashMap<>();
        headers.put("Authorization", storeInfo.getAuth());
        long crc32 = Utils.crc32(data);
        String checkSum = String.format("%08x", crc32);
        headers.put("Content-CRC32", checkSum);
        if (isLargeFile) {
            headers.put("X-Storage-Mode", "gateway");
        }
        uploadRetryer.call(() -> putImageXData(url, data, headers));
        return checkSum;
    }

    private void uploadMergePart(String host, ApplyImageUploadResponse.StoreInfosBean storeInfo, String uploadID, String[] checkSum, boolean isLargeFile) throws Exception {
        String query = String.format("uploadID=%s", uploadID);
        String url = new URI("https", null, host, -1, "/" + storeInfo.getStoreUri(), query, null).toASCIIString();
        String body = IntStream.range(0, checkSum.length).mapToObj(i -> String.format("%d:%s", i, checkSum[i])).collect(Collectors.joining(",", "", ""));
        Map<String, String> headers = new HashMap<>();
        headers.put("Authorization", storeInfo.getAuth());
        if (isLargeFile) {
            headers.put("X-Storage-Mode", "gateway");
        }
        uploadRetryer.call(() -> putImageXData(url, body.getBytes(), headers));
    }


    private CommitImageUploadResponse generateSkipCommitResponse(List<ApplyImageUploadResponse.StoreInfosBean> storeInfos, List<String> successOids) {
        List<CommitImageUploadResponse.UploadImageResultBean> imageResults = new ArrayList<CommitImageUploadResponse.UploadImageResultBean>();
        for (ApplyImageUploadResponse.StoreInfosBean item : storeInfos) {
            CommitImageUploadResponse.UploadImageResultBean itemResult = new CommitImageUploadResponse.UploadImageResultBean();
            itemResult.setUri(item.getStoreUri());
            if (successOids.stream().anyMatch(it -> it.equals(item.getStoreUri()))) {
                itemResult.setUriStatus(2000);
            } else {
                itemResult.setUriStatus(2001);
            }
            imageResults.add(itemResult);
        }
        CommitImageUploadResponse.CommitImageUploadResultBean result = new CommitImageUploadResponse.CommitImageUploadResultBean();
        result.setResults(imageResults);
        CommitImageUploadResponse ret = new CommitImageUploadResponse();
        ret.setResponseMetadata(new ResponseMetadata());
        ret.setResult(result);
        return ret;
    }


    public CommitImageUploadResponse uploadImages(ApplyImageUploadRequest request, List<byte[]> imageDatas) throws Exception {
        if (imageDatas.size() == 0) {
            throw new Exception("empty image data");
        }
        request.setUploadNum(imageDatas.size());

        // apply upload
        ApplyImageUploadResponse applyResp = applyImageUpload(request);
        applyRespGuard(applyResp, imageDatas.size());
        ApplyImageUploadResponse.UploadAddressBean uploadAddr = applyResp.getResult().getUploadAddress();
        List<ApplyImageUploadResponse.StoreInfosBean> storeInfos = uploadAddr.getStoreInfos();

        String uploadHost = uploadAddr.getUploadHosts().get(0);
        String sessionKey = uploadAddr.getSessionKey();

        // upload
        List<String> successOids = new ArrayList<String>();
        for (int i = 0; i < imageDatas.size(); i++) {
            try {
                ApplyImageUploadResponse.StoreInfosBean storeInfo = storeInfos.get(i);
                doUpload(uploadHost, storeInfo, imageDatas.get(i));
                successOids.add(storeInfo.getStoreUri());
            } catch (Exception e) {
                LOG.log(Level.WARNING, e, e::getMessage);
            }
        }

        // commit upload
        if (Objects.equals(Boolean.TRUE, request.getSkipCommit())) {
            return generateSkipCommitResponse(storeInfos, successOids);
        }
        CommitImageUploadRequest commitRequest = new CommitImageUploadRequest();
        commitRequest.setServiceId(request.getServiceId());
        commitRequest.setSessionKey(sessionKey);
        commitRequest.setSuccessOids(successOids);
        commitRequest.setSkipMeta(request.getSkipMeta());
        if (request.getCommitParam() != null) {
            commitRequest.setFunctions(request.getCommitParam().getFunctions());
            commitRequest.setOptionInfos(request.getCommitParam().getOptionInfos());
        }
        return commitImageUpload(commitRequest);
    }

    public CommitImageUploadResponse uploadImages(ApplyImageUploadRequest request, List<InputStream> content, List<Long> size) throws Exception {
        if (size.size() != content.size()) {
            throw new IllegalArgumentException(String.format("expect size.size() == content.size() but  size.size() = %d, content.size() = %d", size.size(), content.size()));
        }

        request.setUploadNum(size.size());

        if (size.stream().anyMatch(it -> it == null || it <= 0)) {
            throw new IllegalArgumentException("please ensure all elements in `size` is greater than 0");
        }

        if (content.stream().anyMatch(Objects::isNull)) {
            throw new IllegalArgumentException("please ensure all elements in `content` not null");
        }

        // apply upload
        ApplyImageUploadResponse applyResp = applyImageUpload(request);
        applyRespGuard(applyResp, size.size());
        ApplyImageUploadResponse.UploadAddressBean uploadAddr = applyResp.getResult().getUploadAddress();
        List<ApplyImageUploadResponse.StoreInfosBean> storeInfos = uploadAddr.getStoreInfos();

        String uploadHost = uploadAddr.getUploadHosts().get(0);
        String sessionKey = uploadAddr.getSessionKey();

        // upload
        List<String> successOids = new ArrayList<String>();
        for (int i = 0; i < size.size(); i++) {
            long fileSize = size.get(i);
            InputStream fileContent = content.get(i);
            ApplyImageUploadResponse.StoreInfosBean storeInfo = storeInfos.get(i);
            try {
                if (fileSize <= MIN_CHUNK_SIZE) {
                    doUpload(uploadHost, storeInfo, fileContent);
                } else {
                    boolean isLargeFile = fileSize > LARGE_FILE_SIZE;
                    chunkUpload(uploadHost, storeInfo, fileContent, fileSize, isLargeFile);
                }
                successOids.add(storeInfo.getStoreUri());
            } catch (Exception e) {
                LOG.log(Level.WARNING, e, e::getMessage);
            }
        }

        // commit upload
        if (Objects.equals(Boolean.TRUE, request.getSkipCommit())) {
            return generateSkipCommitResponse(storeInfos, successOids);
        }
        CommitImageUploadRequest commitRequest = new CommitImageUploadRequest();
        commitRequest.setServiceId(request.getServiceId());
        commitRequest.setSessionKey(sessionKey);
        commitRequest.setSuccessOids(successOids);
        commitRequest.setSkipMeta(request.getSkipMeta());
        if (request.getCommitParam() != null) {
            commitRequest.setFunctions(request.getCommitParam().getFunctions());
            commitRequest.setOptionInfos(request.getCommitParam().getOptionInfos());
        }
        return commitImageUpload(commitRequest);
    }

    private void applyRespGuard(ApplyImageUploadResponse applyResp, int expectSize) {
        if (applyResp.getResult() == null) {
            throw new IllegalStateException("apply upload result is null");
        }
        ApplyImageUploadResponse.UploadAddressBean uploadAddr = applyResp.getResult().getUploadAddress();
        if (uploadAddr == null || uploadAddr.getUploadHosts() == null || uploadAddr.getUploadHosts().size() == 0) {
            throw new IllegalStateException("apply upload address is null");
        }
        List<ApplyImageUploadResponse.StoreInfosBean> storeInfos = uploadAddr.getStoreInfos();
        if (storeInfos.size() != expectSize) {
            throw new IllegalStateException("apply upload get wrong store infos");
        }
    }


    public String getUploadToken(Map<String, String> params) throws Exception {
        Map<String, String> ret = new HashMap<>();
        ret.put("Version", "v1");

        List<NameValuePair> pairs = Utils.mapToPairList(params);
        String applyUploadToken = getSignUrl("ApplyImageUpload", pairs);
        ret.put("ApplyUploadToken", applyUploadToken);
        String commitUploadToken = getSignUrl("CommitImageUpload", pairs);
        ret.put("CommitUploadToken", commitUploadToken);

        String retStr = JSON.toJSONString(ret);
        Base64.Encoder encoder = Base64.getEncoder();
        return encoder.encodeToString(retStr.getBytes());
    }


    public SecurityToken2 getUploadSts2(List<String> serviceIds, Map<String, String> tag) throws Exception {
        return getUploadSts2WithKeyPtn(serviceIds, Time.Hour, "", tag);
    }


    public SecurityToken2 getUploadSts2(List<String> serviceIds) throws Exception {
        return getUploadSts2WithKeyPtn(serviceIds, Time.Hour, "", null);
    }


    public SecurityToken2 getUploadSts2WithExpire(List<String> serviceIds, long expire) throws Exception {
        return getUploadSts2WithKeyPtn(serviceIds, expire, "", null);
    }


    // tag 可如下配置
//    Map<String, String> tag = new HashMap<>();
//    Map<String, Object> policy = new HashMap<>();
//        policy.put("FileSizeUpLimit","xxx");
//        policy.put("FileSizeBottomLimit","xxx");
//        policy.put("ContentTypeBlackList",new ArrayList<String>(){
//        {
//            add("xxx");
//            add("yyy");
//        }
//    });
//        policy.put("ContentTypeWhiteList",new ArrayList<String>(){
//        {
//            add("xxx");
//            add("yyy");
//        }
//    });
//        tag.put("UploadPolicy",JSON.toJSONString(policy));
//        tag.put("UploadOverwrite","True");
    public SecurityToken2 getUploadSts2WithKeyPtn(List<String> serviceIds, long expire, String keyPtn, Map<String, String> tag) throws Exception {
        List<String> applyRes = new ArrayList<>();
        List<String> commitRes = new ArrayList<>();
        if (serviceIds.size() == 0) {
            applyRes.add(String.format(RESOURCE_SERVICE_ID_FORMAT, "*"));
            commitRes.add(String.format(RESOURCE_SERVICE_ID_FORMAT, "*"));
        } else {
            for (String serviceId : serviceIds) {
                applyRes.add(String.format(RESOURCE_SERVICE_ID_FORMAT, serviceId));
                commitRes.add(String.format(RESOURCE_SERVICE_ID_FORMAT, serviceId));
            }
        }
        applyRes.add(String.format(RESOURCE_STORE_KEY_FORMAT, keyPtn));

        Policy inlinePolicy = new Policy();
        Statement applyStatement = Sts2Utils.newAllowStatement(Collections.singletonList("ImageX:ApplyImageUpload"), applyRes);
        Statement commitStatement = Sts2Utils.newAllowStatement(Collections.singletonList("ImageX:CommitImageUpload"), commitRes);
        inlinePolicy.addStatement(applyStatement);
        inlinePolicy.addStatement(commitStatement);
        if (tag != null) {
            for (Map.Entry<String, String> entry : tag.entrySet()) {
                inlinePolicy.addStatement(Sts2Utils.newAllowStatement(Collections.singletonList(entry.getKey()), Collections.singletonList(entry.getValue())));
            }
        }
        return signSts2(inlinePolicy, expire);
    }

}
