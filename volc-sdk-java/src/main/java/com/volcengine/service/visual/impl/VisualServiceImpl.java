package com.volcengine.service.visual.impl;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.model.ServiceInfo;
import com.volcengine.model.response.RawResponse;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.VisualConfig;
import com.volcengine.service.visual.model.request.VisualCarDetectionRequest;
import com.volcengine.service.visual.model.request.VisualCarPlateDetectionRequest;
import com.volcengine.service.visual.model.request.VisualCarSegmentRequest;
import com.volcengine.service.visual.model.request.VisualConvertPhotoRequest;
import com.volcengine.service.visual.model.request.VisualDistortionFreeRequest;
import com.volcengine.service.visual.model.request.VisualEmoticonEditRequest;
import com.volcengine.service.visual.model.request.VisualEnhancePhotoRequest;
import com.volcengine.service.visual.model.request.VisualEyeClose2OpenRequest;
import com.volcengine.service.visual.model.request.VisualFaceSwapRequest;
import com.volcengine.service.visual.model.request.VisualGeneralSegmentRequest;
import com.volcengine.service.visual.model.request.VisualHumanSegmentRequest;
import com.volcengine.service.visual.model.request.VisualImageFlowRequest;
import com.volcengine.service.visual.model.request.VisualImageScoreRequest;
import com.volcengine.service.visual.model.request.VisualJPCartoonRequest;
import com.volcengine.service.visual.model.request.VisualPoemMaterialRequest;
import com.volcengine.service.visual.model.request.VisualSkySegmentRequest;
import com.volcengine.service.visual.model.request.VisualStretchRecoveryRequest;
import com.volcengine.service.visual.model.request.*;
import com.volcengine.service.visual.model.response.VisualCarDetectionResponse;
import com.volcengine.service.visual.model.response.VisualCarPlateDetectionResponse;
import com.volcengine.service.visual.model.response.VisualCarSegmentResponse;
import com.volcengine.service.visual.model.response.VisualConvertPhotoResponse;
import com.volcengine.service.visual.model.response.VisualDistortionFreeResponse;
import com.volcengine.service.visual.model.response.VisualEmoticonEditResponse;
import com.volcengine.service.visual.model.response.VisualEnhancePhotoResponse;
import com.volcengine.service.visual.model.response.VisualEyeClose2OpenResponse;
import com.volcengine.service.visual.model.response.VisualFaceSwapResponse;
import com.volcengine.service.visual.model.response.VisualGeneralSegmentResponse;
import com.volcengine.service.visual.model.response.VisualHumanSegmentResponse;
import com.volcengine.service.visual.model.response.VisualImageFlowResponse;
import com.volcengine.service.visual.model.response.VisualImageScoreResponse;
import com.volcengine.service.visual.model.response.VisualJPCartoonResponse;
import com.volcengine.service.visual.model.response.VisualPoemMaterialResponse;
import com.volcengine.service.visual.model.response.VisualSkySegmentResponse;
import com.volcengine.service.visual.model.response.VisualStretchRecoveryResponse;
import com.volcengine.service.visual.model.response.*;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

public class VisualServiceImpl extends BaseServiceImpl implements IVisualService {

    private VisualServiceImpl() {
        super(VisualConfig.serviceInfoMap.get(Const.REGION_CN_NORTH_1), VisualConfig.apiInfoList);
    }

    private VisualServiceImpl(ServiceInfo serviceInfo) {
        super(serviceInfo, VisualConfig.apiInfoList);
    }

    public static IVisualService getInstance() {
        return new VisualServiceImpl();
    }

    public static IVisualService getInstance(String region) throws Exception {
        ServiceInfo serviceInfo = VisualConfig.serviceInfoMap.get(region);
        if (serviceInfo == null) {
            throw new Exception("Edit not support region " + region);
        }
        return new VisualServiceImpl(serviceInfo);
    }

    @Override
    public VisualSkySegmentResponse skySegment(VisualSkySegmentRequest request) throws Exception {
        RawResponse response = post(Const.SkySegment, null, convertNameValuePair(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualSkySegmentResponse.class);
    }

    @Override
    public VisualHumanSegmentResponse humanSegment(VisualHumanSegmentRequest request) throws Exception {
        RawResponse response = post(Const.HumanSegment, null, convertNameValuePair(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualHumanSegmentResponse.class);
    }

    @Override
    public VisualGeneralSegmentResponse generalSegment(VisualGeneralSegmentRequest request) throws Exception {
        RawResponse response = post(Const.GeneralSegment, null, convertNameValuePair(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualGeneralSegmentResponse.class);
    }

    @Override
    public VisualCarDetectionResponse carDetection(VisualCarDetectionRequest request) throws Exception {
        RawResponse response = post(Const.CarDetection, null, convertNameValuePair(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualCarDetectionResponse.class);
    }

    @Override
    public VisualCarSegmentResponse carSegment(VisualCarSegmentRequest request) throws Exception {
        RawResponse response = post(Const.CarSegment, null, convertNameValuePair(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualCarSegmentResponse.class);
    }

    @Override
    public VisualCarPlateDetectionResponse carPlateDetection(VisualCarPlateDetectionRequest request) throws Exception {
        RawResponse response = post(Const.CarPlateDetection, null, convertNameValuePair(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualCarPlateDetectionResponse.class);
    }

    @Override
    public VisualPoemMaterialResponse poemMaterial(VisualPoemMaterialRequest request) throws Exception {
        RawResponse response = post(Const.PoemMaterial, null, convertNameValuePair(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualPoemMaterialResponse.class);
    }

    @Override
    public VisualImageFlowResponse imageFlow(VisualImageFlowRequest request) throws Exception {
        RawResponse response = post(Const.ImageFlow, null, convertNameValuePair(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualImageFlowResponse.class);
    }

    @Override
    public VisualImageScoreResponse imageScore(VisualImageScoreRequest request) throws Exception {
        RawResponse response = post(Const.ImageScore, null, convertNameValuePair(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualImageScoreResponse.class);
    }

    @Override
    public VisualFaceSwapResponse faceSwap(VisualFaceSwapRequest request) throws Exception {
        RawResponse response = post(Const.FaceSwap, null, convertNameValuePair(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualFaceSwapResponse.class);
    }

    @Override
    public VisualJPCartoonResponse jpCartoon(VisualJPCartoonRequest request) throws Exception {
        RawResponse response = post(Const.JPCartoon, null, convertNameValuePair(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualJPCartoonResponse.class);
    }

    @Override
    public VisualEyeClose2OpenResponse eyeClose2Open(VisualEyeClose2OpenRequest request) throws Exception {
        RawResponse response = post(Const.EyeClose2Open, null, convertNameValuePair(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualEyeClose2OpenResponse.class);
    }

    @Override
    public VisualEmoticonEditResponse emotionEdit(VisualEmoticonEditRequest request) throws Exception {
        RawResponse response = post(Const.EmoticonEdit, null, convertNameValuePair(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualEmoticonEditResponse.class);
    }

    @Override
    public VisualStretchRecoveryResponse stretchRecovery(VisualStretchRecoveryRequest request) throws Exception {
        RawResponse response = post(Const.StretchRecovery, null, convertNameValuePair(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualStretchRecoveryResponse.class);
    }

    @Override
    public VisualDistortionFreeResponse distortionFree(VisualDistortionFreeRequest request) throws Exception {
        RawResponse response = post(Const.DistortionFree, null, convertNameValuePair(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualDistortionFreeResponse.class);
    }

    @Override
    public VisualEnhancePhotoResponse enhancePhoto(VisualEnhancePhotoRequest request) throws Exception {
        RawResponse response = post(Const.EnhancePhoto, null, convertNameValuePair(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualEnhancePhotoResponse.class);
    }

    @Override
    public VisualConvertPhotoResponse convertPhoto(VisualConvertPhotoRequest request) throws Exception {
        RawResponse response = post(Const.ConvertPhoto, null, convertNameValuePair(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualConvertPhotoResponse.class);
    }

    @Override
    public OCRNormalResponse ocrNormal(OCRNormalRequest request) throws Exception {
        RawResponse response = post(Const.OCRNormal, null, convertNameValuePair(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        System.out.println(new String(response.getData(), "UTF-8"));
        return JSON.parseObject(new String(response.getData(), "UTF-8"), OCRNormalResponse.class);
    }

    @Override
    public OCRBankCardV1Response bankCardV1(OCRBankCardRequest request) throws Exception {
        RawResponse response = post(Const.BankCard, null, convertNameValuePair(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), OCRBankCardV1Response.class);
    }

    @Override
    public OCRBankCardV2Response bankCardV2(OCRBankCardRequest request) throws Exception {
        RawResponse response = post(Const.BankCard, null, convertNameValuePair(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), OCRBankCardV2Response.class);
    }

    @Override
    public OCRIDCardResponse idCard(OCRIDCardRequest request) throws Exception {
        RawResponse response = post(Const.IDCard, null, convertNameValuePair(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), OCRIDCardResponse.class);
    }

    @Override
    public OCRDrivingLicenseResponse drivingLicense(OCRDrivingLicenseRequest request) throws Exception {
        RawResponse response = post(Const.DrivingLicense, null, convertNameValuePair(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), OCRDrivingLicenseResponse.class);
    }

    @Override
    public OCRVehicleLicenseResponse vehicleLicense(OCRVehicleLicenseRequest request) throws Exception {
        RawResponse response = post(Const.VehicleLicense, null, convertNameValuePair(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), OCRVehicleLicenseResponse.class);
    }

    @Override
    public OCRVatInvoiceResponse vatInvoice(OCRVatInvoiceRequest request) throws Exception {
        RawResponse response = post(Const.VatInvoice, null, convertNameValuePair(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), OCRVatInvoiceResponse.class);
    }

    private List<NameValuePair> convertNameValuePair(Object obj)
            throws IllegalArgumentException, IllegalAccessException {
        JSONObject jsonObject = (JSONObject) JSON.toJSON(obj);
        List<NameValuePair> list = new ArrayList<NameValuePair>();
        for (String key : jsonObject.keySet()) {
            NameValuePair nameValuePair = new BasicNameValuePair(key, jsonObject.get(key).toString());
            list.add(nameValuePair);
        }
        return list;
    }
}