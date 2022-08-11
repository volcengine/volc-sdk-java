package com.volcengine.service.imagex.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.helper.Utils;
import com.volcengine.model.ServiceInfo;
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
import org.apache.http.NameValuePair;

import java.util.*;


public class ImageXServiceImpl extends BaseServiceImpl implements IImageXService {

    private ImageXServiceImpl() {
        super(ImageXConfig.serviceInfoMap.get(Const.REGION_CN_NORTH_1), ImageXConfig.apiInfoList);
    }

    private ImageXServiceImpl(ServiceInfo serviceInfo) {
        super(serviceInfo, ImageXConfig.apiInfoList);
    }

    public static IImageXService getInstance() {
        return new ImageXServiceImpl();
    }

    public static IImageXService getInstance(String region) throws Exception {
        ServiceInfo serviceInfo = ImageXConfig.serviceInfoMap.get(region);
        if (serviceInfo == null) {
            throw new Exception("ImageX not support region " + region);
        }
        return new ImageXServiceImpl(serviceInfo);
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
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
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
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("ImageX");
        return res;
    }

    private void doUpload(String host, ApplyImageUploadResponse.StoreInfosBean storeInfo, byte[] imageData) throws Exception {
        long crc32 = com.volcengine.helper.Utils.crc32(imageData);
        String checkSum = String.format("%08x", crc32);
        String url = String.format("https://%s/%s", host, storeInfo.getStoreUri());
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-CRC32", checkSum);
        headers.put("Authorization", storeInfo.getAuth());

        long startTime = System.currentTimeMillis();
        boolean uploadStatus = false;
        for (int i = 0; i < 3; i++) {
            uploadStatus = putData(url, imageData, headers);
            if (uploadStatus) {
                break;
            }
        }
        if (!uploadStatus) {
            throw new Exception(String.format("upload image %s msg %s", url, SdkError.getErrorDesc(SdkError.EUPLOAD)));
        }
        long endTime = System.currentTimeMillis();
        long cost = endTime - startTime;
        float avgSpeed = (float) imageData.length / (float) cost;
        System.out.println(String.format("upload image cost {%d} ms, avgSpeed: {%f} KB/s", cost, avgSpeed));
    }

    @Override
    public CommitImageUploadResponse uploadImages(ApplyImageUploadRequest request, List<byte[]> imageDatas) throws Exception {
        if (imageDatas.size() == 0) {
            throw new Exception("empty image data");
        }
        request.setUploadNum(imageDatas.size());

        // apply upload
        ApplyImageUploadResponse applyResp = applyImageUpload(request);
        if (applyResp.getResult() == null) {
            throw new Exception("apply upload result is null");
        }
        ApplyImageUploadResponse.UploadAddressBean uploadAddr = applyResp.getResult().getUploadAddress();
        if (uploadAddr == null || uploadAddr.getUploadHosts() == null || uploadAddr.getUploadHosts().size() == 0) {
            throw new Exception("apply upload address is null");
        }
        List<ApplyImageUploadResponse.StoreInfosBean> storeInfos = uploadAddr.getStoreInfos();
        if (storeInfos.size() != imageDatas.size()) {
            throw new Exception("apply upload get wrong store infos");
        }
        String uploadHost = uploadAddr.getUploadHosts().get(0);
        String sessionKey = uploadAddr.getSessionKey();

        // upload
        for (int i = 0; i < imageDatas.size(); i++) {
            doUpload(uploadHost, storeInfos.get(i), imageDatas.get(i));
        }

        // commit upload
        CommitImageUploadRequest commitRequest = new CommitImageUploadRequest();
        commitRequest.setServiceId(request.getServiceId());
        commitRequest.setSessionKey(sessionKey);
        if (request.getCommitParam() != null) {
            commitRequest.setFunctions(request.getCommitParam().getFunctions());
            commitRequest.setOptionInfos(request.getCommitParam().getOptionInfos());
        }
        return commitImageUpload(commitRequest);
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
        Statement applyStatement = Sts2Utils.newAllowStatement(Arrays.asList("ImageX:ApplyImageUpload"), applyRes);
        Statement commitStatement = Sts2Utils.newAllowStatement(Arrays.asList("ImageX:CommitImageUpload"), commitRes);
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
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("ImageX");
        return res;
    }

    @Override
    public UpdateImageFilesResponse updateImageUrls(UpdateImageFilesRequest req) throws Exception {
        Map<String, String> params = new HashMap<>();
        params.put("ServiceId", req.getServiceId());

        RawResponse response = json("UpdateImageUploadFiles", Utils.mapToPairList(params), JSON.toJSONString(req));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        UpdateImageFilesResponse res = JSON.parseObject(response.getData(), UpdateImageFilesResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("ImageX");
        return res;
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
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        res.getResponseMetadata().setService("ImageX");
        return res;
    }

    @Override
    public GetImageOCRResponse getImageOCR(Map<String, String> param) throws Exception {
        RawResponse response = query("GetImageOCR", Utils.mapToPairList(param));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetImageOCRResponse res = JSON.parseObject(response.getData(), GetImageOCRResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        return res;
    }

    @Override
    public EmbedImageHmResponse embedImageHm(EmbedImageHmRequest req) throws Exception {
        RawResponse response = json("CreateImageHmEmbed",null, JSON.toJSONString(req));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        EmbedImageHmResponse res = JSON.parseObject(response.getData(), EmbedImageHmResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        return res;
    }

    @Override
    public ExtractImageHmResponse extractImageHm(ExtractImageHmRequest req) throws Exception {
        Map<String, String> params = new HashMap<>();
        params.put("ServiceId", req.getServiceId());
        params.put("StoreUri", req.getStoreUri());
        params.put("Strength", Integer.toString(req.getStrength()));
        RawResponse response = query("CreateImageHmExtract", Utils.mapToPairList(params));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        ExtractImageHmResponse res = JSON.parseObject(response.getData(), ExtractImageHmResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        return res;
    }

    @Override
    public GetImageSegmentResponse getImageSegment(Map<String, String> param, GetImageSegmentRequest req) throws Exception {
        RawResponse response = json("GetSegmentImage", Utils.mapToPairList(param), JSON.toJSONString(req));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetImageSegmentResponse res = JSON.parseObject(response.getData(), GetImageSegmentResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        return res;
    }

    @Override
    public GetImageEraseModelsResponse getImageEraseModels(GetImageEraseModelsRequest req)throws Exception{
        RawResponse response = query("GetImageEraseModels", Utils.paramsToPair(req));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetImageEraseModelsResponse res = JSON.parseObject(response.getData(), GetImageEraseModelsResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        return res;
    }

    @Override
    public GetImageEraseResultResponse getImageEraseResult(GetImageEraseResultRequest req)throws Exception{
        RawResponse response = json("GetImageEraseResult",null, JSON.toJSONString(req));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        GetImageEraseResultResponse res = JSON.parseObject(response.getData(), GetImageEraseResultResponse.class);
        if (res.getResponseMetadata().getError() != null) {
            ResponseMetadata meta = res.getResponseMetadata();
            throw new Exception(meta.getRequestId() + "error: " + meta.getError().getMessage());
        }
        return res;
    }
}
