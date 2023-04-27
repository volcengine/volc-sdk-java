package com.volcengine.service.imagex.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import com.github.rholder.retry.Retryer;
import com.github.rholder.retry.RetryerBuilder;
import com.github.rholder.retry.StopStrategies;
import com.github.rholder.retry.WaitStrategies;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.helper.Utils;
import com.volcengine.model.ServiceInfo;
import com.volcengine.model.imagex.*;
import com.volcengine.model.imagex.data.*;
import com.volcengine.model.request.*;
import com.volcengine.model.response.*;
import com.volcengine.model.sts2.Policy;
import com.volcengine.model.sts2.SecurityToken2;
import com.volcengine.model.sts2.Statement;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.ImageXConfig;
import com.volcengine.util.Sts2Utils;
import com.volcengine.util.Time;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class ImageXServiceImpl extends BaseServiceImpl implements IImageXService {
    public final static Map<String, String> EMPTY_STRING_STRING_MAP = Collections.emptyMap();

    private final Retryer<Boolean> uploadRetryer = createUploadDefaultRetryer();
    private final Retryer<HttpResponse> httpRetryer = createUploadDefaultRetryer();

    private ImageXServiceImpl() {
        super(ImageXConfig.serviceInfoMap.get(Const.REGION_CN_NORTH_1), ImageXConfig.apiInfoList);
    }

    private ImageXServiceImpl(ServiceInfo serviceInfo) {
        super(serviceInfo, ImageXConfig.apiInfoList);
    }

    static public IImageXService getInstance() {
        return new ImageXServiceImpl();
    }

    static public IImageXService getInstance(String region) throws Exception {
        ServiceInfo serviceInfo = ImageXConfig.serviceInfoMap.get(region);
        if (serviceInfo == null) {
            throw new Exception("ImageX not support region " + region);
        }
        return new ImageXServiceImpl(serviceInfo);
    }

    static private <R> Retryer<R> createUploadDefaultRetryer() {
        return RetryerBuilder.<R>newBuilder().retryIfException().retryIfResult(it -> Objects.equals(it, false)).retryIfResult(Objects::isNull).withWaitStrategy(WaitStrategies.exponentialWait()).withStopStrategy(StopStrategies.stopAfterAttempt(3)).build();
    }


    @Override
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

    @Override
    public CommitImageUploadResponse commitImageUpload(CommitImageUploadRequest req) throws Exception {
        Map<String, String> params = new HashMap<>();
        params.put("ServiceId", req.getServiceId());
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

    private void doUpload(String host, ApplyImageUploadResponse.StoreInfosBean storeInfo, byte[] imageData) throws Exception {
        long crc32 = Utils.crc32(imageData);
        String checkSum = String.format("%08x", crc32);
        String url = String.format("https://%s/%s", host, storeInfo.getStoreUri());
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-CRC32", checkSum);
        headers.put("Authorization", storeInfo.getAuth());

        long startTime = System.currentTimeMillis();
        uploadRetryer.call(() -> putData(url, imageData, headers));
        long endTime = System.currentTimeMillis();
        long cost = endTime - startTime;
        float avgSpeed = (float) imageData.length / (float) cost;
        System.out.printf("upload image cost {%d} ms, avgSpeed: {%f} KB/s%n", cost, avgSpeed);
    }

    private void chunkUpload(String host, ApplyImageUploadResponse.StoreInfosBean storeInfo, InputStream content, Long size, boolean isLargeFile) throws Exception {
        String uploadID = initUploadPart(host, storeInfo, isLargeFile);
        byte[] data = new byte[ImageXConfig.MIN_CHUNK_SIZE];
        List<String> parts = new ArrayList<>();
        long num = size / ImageXConfig.MIN_CHUNK_SIZE;
        long lastNum = num - 1;
        long partNumber;
        try (BufferedInputStream bis = new BufferedInputStream(content)) {
            for (long i = 0; i < lastNum; i++) {
                int readSize = bis.read(data);
                if (readSize != ImageXConfig.MIN_CHUNK_SIZE) {
                    throw new IllegalStateException(String.format("can not read a full chunk from content, %s expected but %s read", ImageXConfig.MIN_CHUNK_SIZE, readSize));
                }
                partNumber = isLargeFile ? i + 1 : i;
                parts.add(uploadPart(host, storeInfo, uploadID, partNumber, data, isLargeFile));
            }
            long readCount = (long) ImageXConfig.MIN_CHUNK_SIZE * lastNum;
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
        uploadRetryer.call(() -> putData(url, data, headers));
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
        uploadRetryer.call(() -> putData(url, body.getBytes(), headers));
    }

    @Override
    public CommitImageUploadResponse uploadImages(ApplyImageUploadRequest request, List<byte[]> imageDatas) throws Exception {
        if (imageDatas.size() == 0) {
            throw new Exception("empty image data");
        }
        request.setUploadNum(imageDatas.size());

        // apply upload
        //noinspection DuplicatedCode
        ApplyImageUploadResponse applyResp = applyImageUpload(request);
        applyRespGuard(applyResp, imageDatas.size());
        ApplyImageUploadResponse.UploadAddressBean uploadAddr = applyResp.getResult().getUploadAddress();
        List<ApplyImageUploadResponse.StoreInfosBean> storeInfos = uploadAddr.getStoreInfos();

        String uploadHost = uploadAddr.getUploadHosts().get(0);
        String sessionKey = uploadAddr.getSessionKey();

        // upload
        for (int i = 0; i < imageDatas.size(); i++) {
            doUpload(uploadHost, storeInfos.get(i), imageDatas.get(i));
        }

        // commit upload
        //noinspection DuplicatedCode
        CommitImageUploadRequest commitRequest = new CommitImageUploadRequest();
        commitRequest.setServiceId(request.getServiceId());
        commitRequest.setSessionKey(sessionKey);
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
        //noinspection DuplicatedCode
        ApplyImageUploadResponse applyResp = applyImageUpload(request);
        applyRespGuard(applyResp, size.size());
        ApplyImageUploadResponse.UploadAddressBean uploadAddr = applyResp.getResult().getUploadAddress();
        List<ApplyImageUploadResponse.StoreInfosBean> storeInfos = uploadAddr.getStoreInfos();

        String uploadHost = uploadAddr.getUploadHosts().get(0);
        String sessionKey = uploadAddr.getSessionKey();

        // upload
        for (int i = 0; i < size.size(); i++) {
            long fileSize = size.get(i);
            InputStream fileContent = content.get(i);
            ApplyImageUploadResponse.StoreInfosBean storeInfo = storeInfos.get(i);

            if (fileSize <= ImageXConfig.MIN_CHUNK_SIZE) {
                doUpload(uploadHost, storeInfo, fileContent);
            } else {
                boolean isLargeFile = fileSize > ImageXConfig.LARGE_FILE_SIZE;
                chunkUpload(uploadHost, storeInfo, fileContent, fileSize, isLargeFile);
            }
        }

        // commit upload
        //noinspection DuplicatedCode
        CommitImageUploadRequest commitRequest = new CommitImageUploadRequest();
        commitRequest.setServiceId(request.getServiceId());
        commitRequest.setSessionKey(sessionKey);
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

    @Override
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

    @Override
    public SecurityToken2 getUploadSts2(List<String> serviceIds) throws Exception {
        return getUploadSts2WithKeyPtn(serviceIds, Time.Hour, "");
    }

    @Override
    public SecurityToken2 getUploadSts2WithExpire(List<String> serviceIds, long expire) throws Exception {
        return getUploadSts2WithKeyPtn(serviceIds, expire, "");
    }

    @Override
    public SecurityToken2 getUploadSts2WithKeyPtn(List<String> serviceIds, long expire, String keyPtn) throws Exception {
        List<String> applyRes = new ArrayList<>();
        List<String> commitRes = new ArrayList<>();
        if (serviceIds.size() == 0) {
            applyRes.add(String.format(ImageXConfig.RESOURCE_SERVICE_ID_FORMAT, "*"));
            commitRes.add(String.format(ImageXConfig.RESOURCE_SERVICE_ID_FORMAT, "*"));
        } else {
            for (String serviceId : serviceIds) {
                applyRes.add(String.format(ImageXConfig.RESOURCE_SERVICE_ID_FORMAT, serviceId));
                commitRes.add(String.format(ImageXConfig.RESOURCE_SERVICE_ID_FORMAT, serviceId));
            }
        }
        applyRes.add(String.format(ImageXConfig.RESOURCE_STORE_KEY_FORMAT, keyPtn));

        Policy inlinePolicy = new Policy();
        Statement applyStatement = Sts2Utils.newAllowStatement(Collections.singletonList("ImageX:ApplyImageUpload"), applyRes);
        Statement commitStatement = Sts2Utils.newAllowStatement(Collections.singletonList("ImageX:CommitImageUpload"), commitRes);
        inlinePolicy.addStatement(applyStatement);
        inlinePolicy.addStatement(commitStatement);
        return signSts2(inlinePolicy, expire);
    }

    @Override
    public DeleteImageResp deleteImages(DeleteImageReq req) throws Exception {
        Map<String, String> params = new HashMap<>();
        params.put("ServiceId", req.getServiceId());

        RawResponse response = json("DeleteImageUploadFiles", Utils.mapToPairList(params), JSON.toJSONString(req));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        DeleteImageResp res = JSON.parseObject(response.getData(), DeleteImageResp.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + " error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("ImageX");
        return res;
    }

    @Override
    public GetImageUploadFileResponse getImageUploadFile(GetImageUploadFileRequest req) throws Exception {
        RawResponse response = query("GetImageUploadFile", Utils.paramsToPair(req));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetImageUploadFileResponse res = JSON.parseObject(response.getData(), GetImageUploadFileResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + " error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("ImageX");
        return res;
    }

    @Override
    public GetImageUploadFilesResponse getImageUploadFiles(GetImageUploadFilesRequest req) throws Exception {
        RawResponse response = query("GetImageUploadFiles", Utils.paramsToPair(req));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetImageUploadFilesResponse res = JSON.parseObject(response.getData(), GetImageUploadFilesResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + " error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("ImageX");
        return res;
    }

    @Override
    public CreateImageContentTaskResp createImageContentTask(CreateImageContentTaskReq req) throws Exception {
        return postImageX("CreateImageContentTask", Collections.singletonMap("ServiceId", req.getServiceId()), req, CreateImageContentTaskResp.class).getResult();
    }

    @Override
    public GetImageContentTaskDetailResp getImageContentTaskDetail(GetImageContentTaskDetailReq req) throws Exception {
        return postImageX("GetImageContentTaskDetail", Collections.singletonMap("ServiceId", req.getServiceId()), req, GetImageContentTaskDetailResp.class).getResult();
    }

    @Override
    public GetImageContentBlockListResp getImageContentBlockList(GetImageContentBlockListReq req) throws Exception {
        return postImageX("GetImageContentBlockList", Collections.singletonMap("ServiceId", req.getServiceId()), req, GetImageContentBlockListResp.class).getResult();
    }

    @Override
    public CommonResponse getImageX(String action, Map<String, String> param) throws Exception {
        RawResponse response = query(action, Utils.mapToPairList(param));
        return parseRawRes(response);
    }

    @Override
    public CommonResponse postImageX(String action, Map<String, String> param, Object req) throws Exception {
        RawResponse response = json(action, Utils.mapToPairList(param), JSON.toJSONString(req));
        return parseRawRes(response);
    }

    private CommonResponse parseRawRes(RawResponse response) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        CommonResponse res = JSON.parseObject(response.getData(), CommonResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + " error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("ImageX");
        return res;
    }

    @Override
    public <T> GenericCommonResponse<T> getImageX(String action, Map<String, String> param, Class<T> respType) throws Exception {
        RawResponse response = query(action, Utils.mapToPairList(param));
        return parseRawResToGeneric(response, respType);
    }

    @Override
    public <T> GenericCommonResponse<T> postImageX(String action, Map<String, String> param, Object req, Class<T> respType) throws Exception {
        RawResponse response = json(action, Utils.mapToPairList(param), JSON.toJSONString(req));
        return parseRawResToGeneric(response, respType);
    }

    private <T> GenericCommonResponse<T> parseRawResToGeneric(RawResponse response, Class<T> respType) throws Exception {
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        ParameterizedType type = new ParameterizedTypeImpl(new Type[]{respType}, null, GenericCommonResponse.class);
        GenericCommonResponse<T> res = JSON.parseObject(response.getData(), type);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + " error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("ImageX");
        return res;
    }

    @Override
    public FetchImageUrlResponse fetchImageUrl(FetchImageUrlRequest request) throws Exception {
        RawResponse response = json("FetchImageUrl", null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        FetchImageUrlResponse res = JSON.parseObject(response.getData(), FetchImageUrlResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + " error: " + meta.getError().getMessage());
        }
        return res;
    }

    @Override
    public GetUrlFetchTaskResponse getUrlFetchTask(GetUrlFetchTaskRequest req) throws Exception {
        return this.getImageX("GetUrlFetchTask", Utils.paramsToMap(req), GetUrlFetchTaskResponse.class).getResult();
    }

    @Override
    public GetImageOCRResponse<?> getImageOCR(GetImageOCRRequest param) throws Exception {
        Class<?> type;
        if (param.getScene().equals("license")) {
            type = GetImageOCRLicenseResponse.class;
        } else if (param.getScene().equals("general")) {
            type = GetImageOCRGeneralResponse.class;
        } else {
            throw new IllegalArgumentException("scene now acceptable");
        }

        RawResponse response = json("GetImageOCR", Utils.paramsToPair(param), JSON.toJSONString(param));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        GetImageOCRResponse<?> res = JSON.parseObject(response.getData(), type);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + " error: " + meta.getError().getMessage());
        }
        return res;
    }

    @Override
    public EmbedImageHmResponse embedImageHm(EmbedImageHmRequest req) throws Exception {
        RawResponse response = json("CreateImageHmEmbed", null, JSON.toJSONString(req));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        EmbedImageHmResponse res = JSON.parseObject(response.getData(), EmbedImageHmResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + " error: " + meta.getError().getMessage());
        }
        return res;
    }

    @Override
    public ExtractImageHmResponse extractImageHm(ExtractImageHmRequest req) throws Exception {
        Map<String, String> params = new HashMap<>();
        params.put("ServiceId", req.getServiceId());
        params.put("StoreUri", req.getStoreUri());
        params.put("Algorithm", req.getAlgorithm());
        RawResponse response = query("CreateImageHmExtract", Utils.mapToPairList(params));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ExtractImageHmResponse res = JSON.parseObject(response.getData(), ExtractImageHmResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + " error: " + meta.getError().getMessage());
        }
        return res;
    }

    @Override
    public GetImageSegmentResponse getImageSegment(GetImageSegmentRequest req) throws Exception {
        Map<String, String> params = new HashMap<>();
        params.put("ServiceId", req.getServiceId());

        RawResponse response = json("GetSegmentImage", Utils.mapToPairList(params), JSON.toJSONString(req));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetImageSegmentResponse res = JSON.parseObject(response.getData(), GetImageSegmentResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + " error: " + meta.getError().getMessage());
        }
        return res;
    }

    @Override
    public GetImageEraseModelsResponse getImageEraseModels(GetImageEraseModelsRequest req) throws Exception {
        RawResponse response = query("GetImageEraseModels", Utils.paramsToPair(req));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetImageEraseModelsResponse res = JSON.parseObject(response.getData(), GetImageEraseModelsResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + " error: " + meta.getError().getMessage());
        }
        return res;
    }

    @Override
    public GetImageEraseResultResponse getImageEraseResult(GetImageEraseResultRequest req) throws Exception {
        RawResponse response = json("GetImageEraseResult", null, JSON.toJSONString(req));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetImageEraseResultResponse res = JSON.parseObject(response.getData(), GetImageEraseResultResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + " error: " + meta.getError().getMessage());
        }
        return res;
    }

    @Override
    public GetImageQualityResponse getImageQuality(GetImageQualityRequest req) throws Exception {
        Map<String, String> params = new HashMap<>();
        params.put("ServiceId", req.getServiceId());
        RawResponse response = json("GetImageQuality", Utils.mapToPairList(params), JSON.toJSONString(req));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetImageQualityResponse res = JSON.parseObject(response.getData(), GetImageQualityResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + " error: " + meta.getError().getMessage());
        }
        return res;
    }

    @Override
    public GetImageBgFillResultResponse getImageBgFillResult(GetImageBgFillResultRequest req) throws Exception {
        //noinspection unchecked
        RawResponse response = json("GetImageBgFillResult", Collections.EMPTY_LIST, JSON.toJSONString(req));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetImageBgFillResultResponse res = JSON.parseObject(response.getData(), GetImageBgFillResultResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + " error: " + meta.getError().getMessage());
        }
        return res;
    }

    @Override
    public GetImageDuplicateDetectionSyncResponse getImageDuplicateDetectionSync(GetImageDuplicateDetectionSyncRequest req) throws Exception {
        //noinspection DuplicatedCode
        Map<String, String> params = new HashMap<>();
        params.put("ServiceId", req.getServiceId());
        RawResponse response = json("GetImageDuplicateDetection", Utils.mapToPairList(params), JSON.toJSONString(req));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetImageDuplicateDetectionSyncResponse res = JSON.parseObject(response.getData(), GetImageDuplicateDetectionSyncResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + " error: " + meta.getError().getMessage());
        }
        return res;
    }

    @Override
    public GetImageDuplicateDetectionAsyncResponse getImageDuplicateDetectionAsync(GetImageDuplicateDetectionAsyncRequest req) throws Exception {
        //noinspection DuplicatedCode
        Map<String, String> params = new HashMap<>();
        params.put("ServiceId", req.getServiceId());
        RawResponse response = json("GetImageDuplicateDetection", Utils.mapToPairList(params), JSON.toJSONString(req));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetImageDuplicateDetectionAsyncResponse res = JSON.parseObject(response.getData(), GetImageDuplicateDetectionAsyncResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + " error: " + meta.getError().getMessage());
        }
        return res;
    }

    @Override
    public GetDeduplicateTaskStatusResponse getDeduplicateTaskStatus(GetDeduplicateTaskStatusRequest req) throws Exception {
        RawResponse response = query("GetDedupTaskStatus", Utils.paramsToPair(req));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetDeduplicateTaskStatusResponse res = JSON.parseObject(response.getData(), GetDeduplicateTaskStatusResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + " error: " + meta.getError().getMessage());
        }
        return res;
    }

    @Override
    public GetDenoisingImageResponse getDenoisingImage(GetDenoisingImageRequest req) throws Exception {
        Map<String, String> params = new HashMap<>();
        params.put("ServiceId", req.getServiceId());
        RawResponse response = json("GetDenoisingImage", Utils.mapToPairList(params), JSON.toJSONString(req));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetDenoisingImageResponse res = JSON.parseObject(response.getData(), GetDenoisingImageResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + " error: " + meta.getError().getMessage());
        }
        return res;
    }

    @Override
    public GetImageComicResultResponse getImageComicResult(GetImageComicResultRequest req) throws Exception {
        //noinspection unchecked
        RawResponse response = json("GetImageComicResult", Collections.EMPTY_LIST, JSON.toJSONString(req));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetImageComicResultResponse res = JSON.parseObject(response.getData(), GetImageComicResultResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + " error: " + meta.getError().getMessage());
        }
        return res;
    }

    @Override
    public GetImageSuperResolutionResultResponse getImageSuperResolutionResult(GetImageSuperResolutionResultRequest req) throws Exception {
        //noinspection unchecked
        RawResponse response = json("GetImageSuperResolutionResult", Collections.EMPTY_LIST, JSON.toJSONString(req));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetImageSuperResolutionResultResponse res = JSON.parseObject(response.getData(), GetImageSuperResolutionResultResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + " error: " + meta.getError().getMessage());
        }
        return res;
    }

    @Override
    public GetImageSmartCropResultResponse getImageSmartCropResult(GetImageSmartCropResultRequest req) throws Exception {
        //noinspection unchecked
        RawResponse response = json("GetImageSmartCropResult", Collections.EMPTY_LIST, JSON.toJSONString(req));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetImageSmartCropResultResponse res = JSON.parseObject(response.getData(), GetImageSmartCropResultResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + " error: " + meta.getError().getMessage());
        }
        return res;
    }

    @Override
    public GetLicensePlateDetectionResponse getLicensePlateDetection(GetLicensePlateDetectionRequest req) throws Exception {
        Map<String, String> params = new HashMap<>();
        params.put("ServiceId", req.getServiceId());
        RawResponse response = json("GetLicensePlateDetection", Utils.mapToPairList(params), JSON.toJSONString(req));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetLicensePlateDetectionResponse res = JSON.parseObject(response.getData(), GetLicensePlateDetectionResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + " error: " + meta.getError().getMessage());
        }
        return res;
    }

    @Override
    public GetImagePSDetectionResponse getImagePSDetection(GetImagePSDetectionRequest req) throws Exception {
        Map<String, String> params = new HashMap<>();
        params.put("ServiceId", req.getServiceId());
        RawResponse response = json("GetImagePSDetection", Utils.mapToPairList(params), JSON.toJSONString(req));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetImagePSDetectionResponse res = JSON.parseObject(response.getData(), GetImagePSDetectionResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + " error: " + meta.getError().getMessage());
        }
        return res;
    }

    @Override
    public GetPrivateImageTypeResponse getPrivateImageType(GetPrivateImageTypeRequest req) throws Exception {
        Map<String, String> params = new HashMap<>();
        params.put("ServiceId", req.getServiceId());
        RawResponse response = json("GetPrivateImageType", Utils.mapToPairList(params), JSON.toJSONString(req));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetPrivateImageTypeResponse res = JSON.parseObject(response.getData(), GetPrivateImageTypeResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + " error: " + meta.getError().getMessage());
        }
        return res;
    }

    @Override
    public GetImageEnhanceResultResponse getImageEnhanceResult(GetImageEnhanceResultRequest req) throws Exception {
        //noinspection unchecked
        RawResponse response = json("GetImageEnhanceResult", Collections.EMPTY_LIST, JSON.toJSONString(req));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetImageEnhanceResultResponse res = JSON.parseObject(response.getData(), GetImageEnhanceResultResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + " error: " + meta.getError().getMessage());
        }
        return res;
    }

    @Override
    public GetImageStyleResultResponse getImageStyleResult(GetImageStyleResultRequest req) throws Exception {
        Map<String, String> params = new HashMap<>();
        params.put("ServiceId", req.getServiceId());
        RawResponse response = json("GetImageStyleResult", Utils.mapToPairList(params), JSON.toJSONString(req));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetImageStyleResultResponse res = JSON.parseObject(response.getData(), GetImageStyleResultResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + " error: " + meta.getError().getMessage());
        }
        return res;
    }


    @Override
    public DescribeImageXDomainTrafficDataResp describeImageXDomainTrafficData(DescribeImageXDomainTrafficDataReq req) throws Exception {
        return this.getImageX("DescribeImageXDomainTrafficData", Utils.paramsToMap(req), DescribeImageXDomainTrafficDataResp.class).getResult();
    }

    @Override
    public DescribeImageXDomainBandwidthDataResp describeImageXDomainBandwidthData(DescribeImageXDomainBandwidthDataReq req) throws Exception {
        return this.getImageX("DescribeImageXDomainBandwidthData", Utils.paramsToMap(req), DescribeImageXDomainBandwidthDataResp.class).getResult();
    }

    @Override
    public DescribeImageXBucketUsageResp describeImageXBucketUsage(DescribeImageXBucketUsageReq req) throws Exception {
        return this.getImageX("DescribeImageXBucketUsage", Utils.paramsToMap(req), DescribeImageXBucketUsageResp.class).getResult();
    }

    @Override
    public DescribeImageXRequestCntUsageResp describeImageXRequestCntUsage(DescribeImageXRequestCntUsageReq req) throws Exception {
        return this.getImageX("DescribeImageXRequestCntUsage", Utils.paramsToMap(req), DescribeImageXRequestCntUsageResp.class).getResult();
    }

    @Override
    public DescribeImageXBaseOpUsageResp describeImageXBaseOpUsage(DescribeImageXBaseOpUsageReq req) throws Exception {
        return this.getImageX("DescribeImageXBaseOpUsage", Utils.paramsToMap(req), DescribeImageXBaseOpUsageResp.class).getResult();
    }

    @Override
    public DescribeImageXCompressUsageResp describeImageXCompressUsage(DescribeImageXCompressUsageReq req) throws Exception {
        return this.getImageX("DescribeImageXCompressUsage", Utils.paramsToMap(req), DescribeImageXCompressUsageResp.class).getResult();
    }

    @Override
    public DescribeImageXEdgeRequestResp describeImageXEdgeRequest(DescribeImageXEdgeRequestReq req) throws Exception {
        return this.getImageX("DescribeImageXEdgeRequest", Utils.paramsToMap(req), DescribeImageXEdgeRequestResp.class).getResult();
    }

    @Override
    public DescribeImageXHitRateTrafficDataResp describeImageXHitRateTrafficData(DescribeImageXHitRateTrafficDataReq req) throws Exception {
        return this.getImageX("DescribeImageXHitRateTrafficData", Utils.paramsToMap(req), DescribeImageXHitRateTrafficDataResp.class).getResult();
    }

    @Override
    public DescribeImageXHitRateRequestDataResp describeImageXHitRateRequestData(DescribeImageXHitRateRequestDataReq req) throws Exception {
        return this.getImageX("DescribeImageXHitRateRequestData", Utils.paramsToMap(req), DescribeImageXHitRateRequestDataResp.class).getResult();
    }

    @Override
    public DescribeImageXCDNTopRequestDataResp describeImageXCDNTopRequestData(DescribeImageXCDNTopRequestDataReq req) throws Exception {
        return this.getImageX("DescribeImageXCDNTopRequestData", Utils.paramsToMap(req), DescribeImageXCDNTopRequestDataResp.class).getResult();
    }

    @Override
    public DescribeImageXSummaryResp describeImageXSummary(DescribeImageXSummaryReq req) throws Exception {
        return this.getImageX("DescribeImageXSummary", Utils.paramsToMap(req), DescribeImageXSummaryResp.class).getResult();
    }

    @Override
    public DescribeImageXEdgeRequestBandwidthResp describeImageXEdgeRequestBandwidth(DescribeImageXEdgeRequestBandwidthReq req) throws Exception {
        return this.getImageX("DescribeImageXEdgeRequestBandwidth", Utils.paramsToMap(req), DescribeImageXEdgeRequestBandwidthResp.class).getResult();
    }

    @Override
    public DescribeImageXEdgeRequestTrafficResp describeImageXEdgeRequestTraffic(DescribeImageXEdgeRequestTrafficReq req) throws Exception {
        return this.getImageX("DescribeImageXEdgeRequestTraffic", Utils.paramsToMap(req), DescribeImageXEdgeRequestTrafficResp.class).getResult();
    }

    @Override
    public DescribeImageXEdgeRequestRegionsResp describeImageXEdgeRequestRegions(DescribeImageXEdgeRequestRegionsReq req) throws Exception {
        return this.getImageX("DescribeImageXEdgeRequestRegions", Utils.paramsToMap(req), DescribeImageXEdgeRequestRegionsResp.class).getResult();
    }

    @Override
    public DescribeImageXServiceQualityResp describeImageXServiceQuality(DescribeImageXServiceQualityReq req) throws Exception {
        return this.getImageX("DescribeImageXServiceQuality", Utils.paramsToMap(req), DescribeImageXServiceQualityResp.class).getResult();
    }

    @Override
    public GetImageXQueryAppsResp getImageXQueryApps(GetImageXQueryAppsReq req) throws Exception {
        return this.getImageX("GetImageXQueryApps", Utils.paramsToMap(req), GetImageXQueryAppsResp.class).getResult();
    }

    @Override
    public GetImageXQueryRegionsResp getImageXQueryRegions(GetImageXQueryRegionsReq req) throws Exception {
        return this.getImageX("GetImageXQueryRegions", Utils.paramsToMap(req), GetImageXQueryRegionsResp.class).getResult();
    }

    @Override
    public GetImageXQueryDimsResp getImageXQueryDims(GetImageXQueryDimsReq req) throws Exception {
        return this.getImageX("GetImageXQueryDims", Utils.paramsToMap(req), GetImageXQueryDimsResp.class).getResult();
    }

    @Override
    public GetImageXQueryValsResp getImageXQueryVals(GetImageXQueryValsReq req) throws Exception {
        return this.getImageX("GetImageXQueryVals", Utils.paramsToMap(req), GetImageXQueryValsResp.class).getResult();
    }

    @Override
    public DescribeImageXMirrorRequestTrafficResp describeImageXMirrorRequestTraffic(DescribeImageXMirrorRequestTrafficReq req) throws Exception {
        return this.postImageX("DescribeImageXMirrorRequestTraffic", EMPTY_STRING_STRING_MAP, req, DescribeImageXMirrorRequestTrafficResp.class).getResult();
    }

    @Override
    public DescribeImageXMirrorRequestBandwidthResp describeImageXMirrorRequestBandwidth(DescribeImageXMirrorRequestBandwidthReq req) throws Exception {
        return this.postImageX("DescribeImageXMirrorRequestBandwidth", EMPTY_STRING_STRING_MAP, req, DescribeImageXMirrorRequestBandwidthResp.class).getResult();
    }

    @Override
    public DescribeImageXMirrorRequestHttpCodeByTimeResp describeImageXMirrorRequestHttpCodeByTime(DescribeImageXMirrorRequestHttpCodeByTimeReq req) throws Exception {
        return this.postImageX("DescribeImageXMirrorRequestHttpCodeByTime", EMPTY_STRING_STRING_MAP, req, DescribeImageXMirrorRequestHttpCodeByTimeResp.class).getResult();
    }

    @Override
    public DescribeImageXMirrorRequestHttpCodeOverviewResp describeImageXMirrorRequestHttpCodeOverview(DescribeImageXMirrorRequestHttpCodeOverviewReq req) throws Exception {
        return this.postImageX("DescribeImageXMirrorRequestHttpCodeOverview", EMPTY_STRING_STRING_MAP, req, DescribeImageXMirrorRequestHttpCodeOverviewResp.class).getResult();
    }

    @Override
    public DescribeImageXUploadSuccessRateByTimeResp describeImageXUploadSuccessRateByTime(DescribeImageXUploadSuccessRateByTimeReq req) throws Exception {
        return this.postImageX("DescribeImageXUploadSuccessRateByTime", EMPTY_STRING_STRING_MAP, req, DescribeImageXUploadSuccessRateByTimeResp.class).getResult();
    }

    @Override
    public DescribeImageXUploadErrorCodeAllResp describeImageXUploadErrorCodeAll(DescribeImageXUploadErrorCodeAllReq req) throws Exception {
        return this.postImageX("DescribeImageXUploadErrorCodeAll", EMPTY_STRING_STRING_MAP, req, DescribeImageXUploadErrorCodeAllResp.class).getResult();
    }

    @Override
    public DescribeImageXUploadErrorCodeByTimeResp describeImageXUploadErrorCodeByTime(DescribeImageXUploadErrorCodeByTimeReq req) throws Exception {
        return this.postImageX("DescribeImageXUploadErrorCodeByTime", EMPTY_STRING_STRING_MAP, req, DescribeImageXUploadErrorCodeByTimeResp.class).getResult();
    }

    @Override
    public DescribeImageXUploadCountByTimeResp describeImageXUploadCountByTime(DescribeImageXUploadCountByTimeReq req) throws Exception {
        return this.postImageX("DescribeImageXUploadCountByTime", EMPTY_STRING_STRING_MAP, req, DescribeImageXUploadCountByTimeResp.class).getResult();
    }

    @Override
    public DescribeImageXUploadFileSizeResp describeImageXUploadFileSize(DescribeImageXUploadFileSizeReq req) throws Exception {
        return this.postImageX("DescribeImageXUploadFileSize", EMPTY_STRING_STRING_MAP, req, DescribeImageXUploadFileSizeResp.class).getResult();
    }

    @Override
    public DescribeImageXUploadSpeedResp describeImageXUploadSpeed(DescribeImageXUploadSpeedReq req) throws Exception {
        return this.postImageX("DescribeImageXUploadSpeed", EMPTY_STRING_STRING_MAP, req, DescribeImageXUploadSpeedResp.class).getResult();
    }

    @Override
    public DescribeImageXUploadDurationResp describeImageXUploadDuration(DescribeImageXUploadDurationReq req) throws Exception {
        return this.postImageX("DescribeImageXUploadDuration", EMPTY_STRING_STRING_MAP, req, DescribeImageXUploadDurationResp.class).getResult();
    }

    @Override
    public DescribeImageXUploadSegmentSpeedByTimeResp describeImageXUploadSegmentSpeedByTime(DescribeImageXUploadSegmentSpeedByTimeReq req) throws Exception {
        return this.postImageX("DescribeImageXUploadSegmentSpeedByTime", EMPTY_STRING_STRING_MAP, req, DescribeImageXUploadSegmentSpeedByTimeResp.class).getResult();
    }

    @Override
    public DescribeImageXCdnSuccessRateByTimeResp describeImageXCdnSuccessRateByTime(DescribeImageXCdnSuccessRateByTimeReq req) throws Exception {
        return this.postImageX("DescribeImageXCdnSuccessRateByTime", EMPTY_STRING_STRING_MAP, req, DescribeImageXCdnSuccessRateByTimeResp.class).getResult();
    }

    @Override
    public DescribeImageXCdnSuccessRateAllResp describeImageXCdnSuccessRateAll(DescribeImageXCdnSuccessRateAllReq req) throws Exception {
        return this.postImageX("DescribeImageXCdnSuccessRateAll", EMPTY_STRING_STRING_MAP, req, DescribeImageXCdnSuccessRateAllResp.class).getResult();
    }

    @Override
    public DescribeImageXCdnErrorCodeByTimeResp describeImageXCdnErrorCodeByTime(DescribeImageXCdnErrorCodeByTimeReq req) throws Exception {
        return this.postImageX("DescribeImageXCdnErrorCodeByTime", EMPTY_STRING_STRING_MAP, req, DescribeImageXCdnErrorCodeByTimeResp.class).getResult();
    }

    @Override
    public DescribeImageXCdnErrorCodeAllResp describeImageXCdnErrorCodeAll(DescribeImageXCdnErrorCodeAllReq req) throws Exception {
        return this.postImageX("DescribeImageXCdnErrorCodeAll", EMPTY_STRING_STRING_MAP, req, DescribeImageXCdnErrorCodeAllResp.class).getResult();
    }

    @Override
    public DescribeImageXCdnDurationDetailByTimeResp describeImageXCdnDurationDetailByTime(DescribeImageXCdnDurationDetailByTimeReq req) throws Exception {
        return this.postImageX("DescribeImageXCdnDurationDetailByTime", EMPTY_STRING_STRING_MAP, req, DescribeImageXCdnDurationDetailByTimeResp.class).getResult();
    }

    @Override
    public DescribeImageXCdnDurationAllResp describeImageXCdnDurationAll(DescribeImageXCdnDurationAllReq req) throws Exception {
        return this.postImageX("DescribeImageXCdnDurationAll", EMPTY_STRING_STRING_MAP, req, DescribeImageXCdnDurationAllResp.class).getResult();
    }

    @Override
    public DescribeImageXCdnReuseRateByTimeResp describeImageXCdnReuseRateByTime(DescribeImageXCdnReuseRateByTimeReq req) throws Exception {
        return this.postImageX("DescribeImageXCdnReuseRateByTime", EMPTY_STRING_STRING_MAP, req, DescribeImageXCdnReuseRateByTimeResp.class).getResult();
    }

    @Override
    public DescribeImageXCdnReuseRateAllResp describeImageXCdnReuseRateAll(DescribeImageXCdnReuseRateAllReq req) throws Exception {
        return this.postImageX("DescribeImageXCdnReuseRateAll", EMPTY_STRING_STRING_MAP, req, DescribeImageXCdnReuseRateAllResp.class).getResult();
    }

    @Override
    public DescribeImageXCdnProtocolRateByTimeResp describeImageXCdnProtocolRateByTime(DescribeImageXCdnProtocolRateByTimeReq req) throws Exception {
        return this.postImageX("DescribeImageXCdnProtocolRateByTime", EMPTY_STRING_STRING_MAP, req, DescribeImageXCdnProtocolRateByTimeResp.class).getResult();
    }

    @Override
    public DescribeImageXClientErrorCodeAllResp describeImageXClientErrorCodeAll(DescribeImageXClientErrorCodeAllReq req) throws Exception {
        return this.postImageX("DescribeImageXClientErrorCodeAll", EMPTY_STRING_STRING_MAP, req, DescribeImageXClientErrorCodeAllResp.class).getResult();
    }

    @Override
    public DescribeImageXClientErrorCodeByTimeResp describeImageXClientErrorCodeByTime(DescribeImageXClientErrorCodeByTimeReq req) throws Exception {
        return this.postImageX("DescribeImageXClientErrorCodeByTime", EMPTY_STRING_STRING_MAP, req, DescribeImageXClientErrorCodeByTimeResp.class).getResult();
    }

    @Override
    public DescribeImageXClientDecodeSuccessRateByTimeResp describeImageXClientDecodeSuccessRateByTime(DescribeImageXClientDecodeSuccessRateByTimeReq req) throws Exception {
        return this.postImageX("DescribeImageXClientDecodeSuccessRateByTime", EMPTY_STRING_STRING_MAP, req, DescribeImageXClientDecodeSuccessRateByTimeResp.class).getResult();
    }

    @Override
    public DescribeImageXClientDecodeDurationByTimeResp describeImageXClientDecodeDurationByTime(DescribeImageXClientDecodeDurationByTimeReq req) throws Exception {
        return this.postImageX("DescribeImageXClientDecodeDurationByTime", EMPTY_STRING_STRING_MAP, req, DescribeImageXClientDecodeDurationByTimeResp.class).getResult();
    }

    @Override
    public DescribeImageXClientQueueDurationByTimeResp describeImageXClientQueueDurationByTime(DescribeImageXClientQueueDurationByTimeReq req) throws Exception {
        return this.postImageX("DescribeImageXClientQueueDurationByTime", EMPTY_STRING_STRING_MAP, req, DescribeImageXClientQueueDurationByTimeResp.class).getResult();
    }

    @Override
    public DescribeImageXClientLoadDurationAllResp describeImageXClientLoadDurationAll(DescribeImageXClientLoadDurationAllReq req) throws Exception {
        return this.postImageX("DescribeImageXClientLoadDurationAll", EMPTY_STRING_STRING_MAP, req, DescribeImageXClientLoadDurationAllResp.class).getResult();
    }

    @Override
    public DescribeImageXClientLoadDurationResp describeImageXClientLoadDuration(DescribeImageXClientLoadDurationReq req) throws Exception {
        return this.postImageX("DescribeImageXClientLoadDuration", EMPTY_STRING_STRING_MAP, req, DescribeImageXClientLoadDurationResp.class).getResult();
    }

    @Override
    public DescribeImageXClientFailureRateResp describeImageXClientFailureRate(DescribeImageXClientFailureRateReq req) throws Exception {
        return this.postImageX("DescribeImageXClientFailureRate", EMPTY_STRING_STRING_MAP, req, DescribeImageXClientFailureRateResp.class).getResult();
    }

    @Override
    public DescribeImageXClientSdkVerByTimeResp describeImageXClientSdkVerByTime(DescribeImageXClientSdkVerByTimeReq req) throws Exception {
        return this.postImageX("DescribeImageXClientSdkVerByTime", EMPTY_STRING_STRING_MAP, req, DescribeImageXClientSdkVerByTimeResp.class).getResult();
    }

    @Override
    public DescribeImageXClientFileSizeResp describeImageXClientFileSize(DescribeImageXClientFileSizeReq req) throws Exception {
        return this.postImageX("DescribeImageXClientFileSize", EMPTY_STRING_STRING_MAP, req, DescribeImageXClientFileSizeResp.class).getResult();
    }

    @Override
    public DescribeImageXClientTopFileSizeResp describeImageXClientTopFileSize(DescribeImageXClientTopFileSizeReq req) throws Exception {
        return this.postImageX("DescribeImageXClientTopFileSize", EMPTY_STRING_STRING_MAP, req, DescribeImageXClientTopFileSizeResp.class).getResult();
    }

    @Override
    public DescribeImageXClientCountByTimeResp describeImageXClientCountByTime(DescribeImageXClientCountByTimeReq req) throws Exception {
        return this.postImageX("DescribeImageXClientCountByTime", EMPTY_STRING_STRING_MAP, req, DescribeImageXClientCountByTimeResp.class).getResult();
    }

    @Override
    public DescribeImageXClientScoreByTimeResp describeImageXClientScoreByTime(DescribeImageXClientScoreByTimeReq req) throws Exception {
        return this.postImageX("DescribeImageXClientScoreByTime", EMPTY_STRING_STRING_MAP, req, DescribeImageXClientScoreByTimeResp.class).getResult();
    }

    @Override
    public DescribeImageXClientDemotionRateByTimeResp describeImageXClientDemotionRateByTime(DescribeImageXClientDemotionRateByTimeReq req) throws Exception {
        return this.postImageX("DescribeImageXClientDemotionRateByTime", EMPTY_STRING_STRING_MAP, req, DescribeImageXClientDemotionRateByTimeResp.class).getResult();
    }

    @Override
    public DescribeImageXClientTopDemotionURLResp describeImageXClientTopDemotionURL(DescribeImageXClientTopDemotionURLReq req) throws Exception {
        return this.postImageX("DescribeImageXClientTopDemotionURL", EMPTY_STRING_STRING_MAP, req, DescribeImageXClientTopDemotionURLResp.class).getResult();
    }

    @Override
    public DescribeImageXClientQualityRateByTimeResp describeImageXClientQualityRateByTime(DescribeImageXClientQualityRateByTimeReq req) throws Exception {
        return this.postImageX("DescribeImageXClientQualityRateByTime", EMPTY_STRING_STRING_MAP, req, DescribeImageXClientQualityRateByTimeResp.class).getResult();
    }

    @Override
    public DescribeImageXClientTopQualityURLResp describeImageXClientTopQualityURL(DescribeImageXClientTopQualityURLReq req) throws Exception {
        return this.postImageX("DescribeImageXClientTopQualityURL", EMPTY_STRING_STRING_MAP, req, DescribeImageXClientTopQualityURLResp.class).getResult();
    }

    @Override
    public DescribeImageXSensibleCountByTimeResp describeImageXSensibleCountByTime(DescribeImageXSensibleCountByTimeReq req) throws Exception {
        return this.postImageX("DescribeImageXSensibleCountByTime", EMPTY_STRING_STRING_MAP, req, DescribeImageXSensibleCountByTimeResp.class).getResult();
    }

    @Override
    public DescribeImageXSensibleCacheHitRateByTimeResp describeImageXSensibleCacheHitRateByTime(DescribeImageXSensibleCacheHitRateByTimeReq req) throws Exception {
        return this.postImageX("DescribeImageXSensibleCacheHitRateByTime", EMPTY_STRING_STRING_MAP, req, DescribeImageXSensibleCacheHitRateByTimeResp.class).getResult();
    }

    @Override
    public DescribeImageXSensibleTopSizeURLResp describeImageXSensibleTopSizeURL(DescribeImageXSensibleTopSizeURLReq req) throws Exception {
        return this.postImageX("DescribeImageXSensibleTopSizeURL", EMPTY_STRING_STRING_MAP, req, DescribeImageXSensibleTopSizeURLResp.class).getResult();
    }

    @Override
    public DescribeImageXSensibleTopRamURLResp describeImageXSensibleTopRamURL(DescribeImageXSensibleTopRamURLReq req) throws Exception {
        return this.postImageX("DescribeImageXSensibleTopRamURL", EMPTY_STRING_STRING_MAP, req, DescribeImageXSensibleTopRamURLResp.class).getResult();
    }

    @Override
    public DescribeImageXSensibleTopResolutionURLResp describeImageXSensibleTopResolutionURL(DescribeImageXSensibleTopResolutionURLReq req) throws Exception {
        return this.postImageX("DescribeImageXSensibleTopResolutionURL", EMPTY_STRING_STRING_MAP, req, DescribeImageXSensibleTopResolutionURLResp.class).getResult();
    }

    @Override
    public DescribeImageXSensibleTopUnknownURLResp describeImageXSensibleTopUnknownURL(DescribeImageXSensibleTopUnknownURLReq req) throws Exception {
        return this.postImageX("DescribeImageXSensibleTopUnknownURL", EMPTY_STRING_STRING_MAP, req, DescribeImageXSensibleTopUnknownURLResp.class).getResult();
    }

    @Override
    public DescribeImageVolcCdnAccessLogResp describeImageVolcCdnAccessLog(DescribeImageVolcCdnAccessLogReq req) throws Exception {
        return this.postImageX("DescribeImageVolcCdnAccessLog", Utils.paramsToMap(req), req, DescribeImageVolcCdnAccessLogResp.class).getResult();
    }
}
