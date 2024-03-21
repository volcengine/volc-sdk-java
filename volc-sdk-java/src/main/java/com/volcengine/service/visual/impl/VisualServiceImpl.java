package com.volcengine.service.visual.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.model.ServiceInfo;
import com.volcengine.model.response.RawResponse;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.visual.IVisualService;
import com.volcengine.service.visual.VisualConfig;
import com.volcengine.service.visual.model.request.*;
import com.volcengine.service.visual.model.response.*;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

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
    public VisualFaceSwapV2Response faceSwapV2(VisualFaceSwapV2Request request) throws Exception {
        RawResponse response = json(Const.FaceSwapV2, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualFaceSwapV2Response.class);
    }

    @Override
    public VisualFaceSwapAIResponse faceSwapAI(VisualFaceSwapAIRequest request) throws Exception {
        RawResponse response = json(Const.FaceswapAI, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualFaceSwapAIResponse.class);
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
    public VisualPotraitEffectResponse potraitEffect(VisualPotraitEffectRequest request) throws Exception {
        RawResponse response = post(Const.PotraitEffect, null, convertNameValuePair(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualPotraitEffectResponse.class);
    }

    @Override
    public VisualDollyZoomResponse dollyZoom(VisualDollyZoomRequest request) throws Exception {
        RawResponse response = post(Const.DollyZoom, null, convertNameValuePair(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualDollyZoomResponse.class);
    }

    @Override
    public VisualImageCutResponse imageCut(VisualImageCutRequest request) throws Exception {
        RawResponse response = post(Const.ImageCut, null, convertNameValuePair(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualImageCutResponse.class);
    }

    @Override
    public VisualFacePrettyResponse facePretty(VisualFacePrettyRequest request) throws Exception {
        RawResponse response = post(Const.FacePretty, null, convertNameValuePair(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualFacePrettyResponse.class);
    }

    @Override
    public VisualHairStyleResponse hairStyle(VisualHairStyleRequest request) throws Exception {
        RawResponse response = post(Const.HairStyle, null, convertNameValuePair(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualHairStyleResponse.class);
    }

    @Override
    public VisualImageAnimationResponse imageAnimation(VisualImageAnimationRequest request) throws Exception {
        RawResponse response = post(Const.ImageAnimation, null, convertNameValuePair(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualImageAnimationResponse.class);
    }

    @Override
    public VisualCertTokenResponse certToken(VisualCertTokenRequest request) throws Exception {
        RawResponse response = json(Const.CertToken, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualCertTokenResponse.class);
    }

    @Override
    public Object certTokenV2(VisualCertTokenRequest request) {
        RawResponse response = json(Const.CertToken, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            return JSONObject.parseObject(response.getException().getMessage());
        }
        try {
            return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualCertTokenResponse.class);
        } catch (UnsupportedEncodingException e) {
            return JSON.parseObject(new String(response.getData()));
        }
    }

    @Override
    public VisualCertVerifyQueryResponse certVerifyQuery(VisualCertVerifyQueryRequest request) throws Exception {
        RawResponse response = json(Const.CertVerifyQuery, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualCertVerifyQueryResponse.class);
    }

    @Override
    public Object certVerifyQueryV2(VisualCertVerifyQueryRequest request)  {
        RawResponse response = json(Const.CertVerifyQuery, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            return JSONObject.parseObject(response.getException().getMessage());
        }
        try {
            return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualCertTokenResponse.class);
        } catch (UnsupportedEncodingException e) {
            return JSON.parseObject(new String(response.getData()));
        }
    }

    @Override
    public VisualCertConfigInitResponse certConfigInit(VisualCertConfigInitRequest request) throws Exception {
        RawResponse response = json(Const.CertConfigInit, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualCertConfigInitResponse.class);
    }

    @Override
    public Object certConfigInitV2(VisualCertConfigInitRequest request) {
        RawResponse response = json(Const.CertConfigInit, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            return JSONObject.parseObject(response.getException().getMessage());
        }
        try {
            return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualCertConfigInitResponse.class);
        } catch (UnsupportedEncodingException e) {
            return JSON.parseObject(new String(response.getData()));
        }
    }

    @Override
    public VisualCertConfigGetResponse certConfigGet(VisualCertConfigGetRequest request) throws Exception {
        RawResponse response = json(Const.CertConfigGet, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualCertConfigGetResponse.class);
    }

    @Override
    public Object certConfigGetV2(VisualCertConfigGetRequest request) {
        RawResponse response = json(Const.CertConfigGet, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            return JSONObject.parseObject(response.getException().getMessage());
        }
        try {
            return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualCertConfigGetResponse.class);
        } catch (UnsupportedEncodingException e) {
            return JSON.parseObject(new String(response.getData()));
        }
    }

    @Override
    public VisualCertTokenProResponse certTokenPro(VisualCertTokenProRequest request) throws Exception {
        RawResponse response = json(Const.CertToken, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualCertTokenProResponse.class);
    }

    @Override
    public Object certTokenProV2(VisualCertTokenProRequest request) {
        RawResponse response = json(Const.CertToken, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            return JSONObject.parseObject(response.getException().getMessage());
        }
        try {
            return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualCertTokenProResponse.class);
        } catch (UnsupportedEncodingException e) {
            return JSON.parseObject(new String(response.getData()));
        }
    }

    @Override
    public VisualCertVerifyProResponse certVerifyPro(VisualCertVerifyProRequest request) throws Exception {
        RawResponse response = json(Const.CertVerifyPro, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualCertVerifyProResponse.class);
    }
    @Override
    public Object certVerifyProV2(VisualCertVerifyProRequest request) {
        RawResponse response = json(Const.CertVerifyPro, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            return JSONObject.parseObject(response.getException().getMessage());
        }
        try {
            return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualCertVerifyProResponse.class);
        } catch (UnsupportedEncodingException e) {
            return JSON.parseObject(new String(response.getData()));
        }
    }
    @Override
    public VisualCertQueryProResponse certQueryPro(VisualCertQueryProRequest request) throws Exception {
        RawResponse response = json(Const.CertVerifyQuery, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualCertQueryProResponse.class);
    }

    @Override
    public Object certQueryProV2(VisualCertQueryProRequest request) {
        RawResponse response = json(Const.CertVerifyQuery, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            return JSONObject.parseObject(response.getException().getMessage());
        }
        try {
            return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualCertQueryProResponse.class);
        } catch (UnsupportedEncodingException e) {
            return JSON.parseObject(new String(response.getData()));
        }
    }


    @Override
    public VisualImg2Video3DResponse img2Video3D(VisualImg2Video3DRequest request) throws Exception {
        RawResponse response = json(Const.Img2Video3D, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualImg2Video3DResponse.class);
    }

    @Override
    public VisualT2ILDMResponse t2ILDM(VisualT2ILDMRequest request) throws Exception {
        RawResponse response = json(Const.T2ILDM, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualT2ILDMResponse.class);
    }

    @Override
    public VisualImg2ImgStyleResponse img2ImgStyle(VisualImg2ImgStyleRequest request) throws Exception {
        RawResponse response = json(Const.Img2ImgStyle, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualImg2ImgStyleResponse.class);
    }

    @Override
    public VisualImg2ImgAnimeResponse img2ImgAnime(VisualImg2ImgAnimeRequest request) throws Exception {
        RawResponse response = json(Const.Img2Video3D, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualImg2ImgAnimeResponse.class);
    }

    @Override
    public VisualFaceFusionMovieSubmitTaskResponse faceFusionMovieSubmitTask(VisualFaceFusionMovieSubmitTaskRequest request) throws Exception {
        RawResponse response = json(Const.FaceFusionMovieSubmitTask, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualFaceFusionMovieSubmitTaskResponse.class);
    }

    @Override
    public VisualFaceFusionMovieGetResultResponse faceFusionMovieGetResult(VisualFaceFusionMovieGetResultRequest request) throws Exception {
        RawResponse response = json(Const.FaceFusionMovieGetResult, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualFaceFusionMovieGetResultResponse.class);
    }

    @Override
    public VisualFaceFusionMovieSyncResponse faceFusionMovieSync(VisualFaceFusionMovieSyncRequest request) throws Exception {
        RawResponse response = json(Const.FaceFusionMovieSync, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualFaceFusionMovieSyncResponse.class);
    }

    @Override
    public VisualEnhancePhotoV2Response enhancePhotoV2(VisualEnhancePhotoV2Request request) throws Exception {
        RawResponse response = json(Const.EnhancePhotoV2, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualEnhancePhotoV2Response.class);
    }

    @Override
    public VisualAllAgeGenerationResponse allAgeGeneration(VisualAllAgeGenerationRequest request) throws Exception {
        RawResponse response = json(Const.AllAgeGeneration, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualAllAgeGenerationResponse.class);
    }

    @Override
    public VisualConvertPhotoV2Response convertPhotoV2(VisualConvertPhotoV2Request request) throws Exception {
        RawResponse response = json(Const.ConvertPhotoV2, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualConvertPhotoV2Response.class);
    }

    @Override
    public VisualAIGufengResponse aiGufeng(VisualAIGufengRequest request) throws Exception {
        RawResponse response = json(Const.AIGufeng, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualAIGufengResponse.class);
    }

    @Override
    public VisualLensVidaVideoSubmitTaskV2Response lensVidaVideoSubmitTaskV2(VisualLensVidaVideoSubmitTaskV2Request request) throws Exception {
        RawResponse response = json(Const.LensVidaVideoSubmitTaskV2, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualLensVidaVideoSubmitTaskV2Response.class);
    }

    @Override
    public VisualLensVidaVideoGetResultV2Response lensVidaVideoGetResultV2(VisualLensVidaVideoGetResultV2Request request) throws Exception {
        RawResponse response = json(Const.LensVidaVideoGetResultV2, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualLensVidaVideoGetResultV2Response.class);
    }

    @Override
    public VisualVideoOverResolutionSubmitTaskV2Response videoOverResolutionSubmitTaskV2(VisualVideoOverResolutionSubmitTaskV2Request request) throws Exception {
        RawResponse response = json(Const.FaceFusionMovieSubmitTask, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualVideoOverResolutionSubmitTaskV2Response.class);
    }

    @Override
    public VisualVideoOverResolutionQueryTaskV2Response videoOverResolutionQueryTaskV2(VisualVideoOverResolutionQueryTaskV2Request request) throws Exception {
        RawResponse response = json(Const.FaceFusionMovieGetResult, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualVideoOverResolutionQueryTaskV2Response.class);
    }

    @Override
    public OCRNormalResponse ocrNormal(OCRNormalRequest request) throws Exception {
        RawResponse response = post(Const.OCRNormal, null, convertNameValuePair(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
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
        RawResponse response = post(Const.OcrVatInvoice, null, convertNameValuePair(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), OCRVatInvoiceResponse.class);
    }

    @Override
    public MultilangOCRResponse multilangOCR(MultilangOCRRequest request) throws Exception {
        RawResponse response = post(Const.MultilangOCR, null, convertNameValuePair(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), MultilangOCRResponse.class);
    }

    @Override
    public String ocrApi(String actionName, JSONObject jsonObject) throws Exception {
        List<NameValuePair> list = new ArrayList<NameValuePair>();
        for (String key : jsonObject.keySet()) {
            NameValuePair nameValuePair = new BasicNameValuePair(key, jsonObject.get(key).toString());
            list.add(nameValuePair);
        }

        RawResponse response = post(actionName, null, list);
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return new String(response.getData(), "UTF-8");
    }


    @Override
    public String ocrAsyncApi(String actionName, JSONObject jsonObject) throws Exception {
        RawResponse response = json(actionName, null, JSON.toJSONString(jsonObject));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return new String(response.getData(), "UTF-8");
    }

    private List<NameValuePair> convertNameValuePair(Object obj)
            throws IllegalArgumentException, IllegalAccessException {
        JSONObject jsonObject = (JSONObject) JSON.toJSON(obj);
        List<NameValuePair> list = new ArrayList<NameValuePair>();
        for (String key : jsonObject.keySet()) {
            NameValuePair nameValuePair = new BasicNameValuePair(key, String.valueOf(jsonObject.get(key)));
            list.add(nameValuePair);
        }
        return list;
    }
    @Override
    public ImageStyleConversionResponse imageStyleConversion(ImageStyleConversionRequest request) throws Exception {
        RawResponse response = post(Const.ImageStyleConversion, null, convertNameValuePair(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), ImageStyleConversionResponse.class);
    }

    @Override
    public CertSrcFaceCompResponse certSrcFaceComp(CertSrcFaceCompRequest request) throws Exception {
        //设置socketTimeout 为5s
        VisualConfig.serviceInfoMap.get(Const.REGION_CN_NORTH_1).setSocketTimeout(5000);
        RawResponse response = json(Const.CertSrcFaceComp, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), CertSrcFaceCompResponse.class);

    }

    @Override
    public Object certSrcFaceCompV2(CertSrcFaceCompRequest request) {
        //设置socketTimeout 为5s
        VisualConfig.serviceInfoMap.get(Const.REGION_CN_NORTH_1).setSocketTimeout(5000);
        RawResponse response = json(Const.CertSrcFaceComp, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            return JSONObject.parseObject(response.getException().getMessage());
        }
        try {
            return JSON.parseObject(new String(response.getData(), "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            return JSON.parseObject(new String(response.getData()));
        }
    }


    @Override
    public FaceCompareResponse faceCompare(FaceCompareRequest request) throws Exception {
        RawResponse response = json(Const.FaceCompare, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), FaceCompareResponse.class);

    }

    @Override
    public StillLivenessImgResponse stillLivenessImg(StillLivenessImgRequest request) throws Exception {
        RawResponse response = json(Const.StillLivenessImg, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), StillLivenessImgResponse.class);

    }

    @Override
    public Object stillLivenessImgV2(StillLivenessImgRequest request)  {
        RawResponse response = json(Const.StillLivenessImg, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            return JSONObject.parseObject(response.getException().getMessage());
        }
        try {
            return JSON.parseObject(new String(response.getData(), "UTF-8"), StillLivenessImgResponse.class);
        } catch (UnsupportedEncodingException e) {
            return JSON.parseObject(new String(response.getData()));
        }
    }

    @Override
    public OverResolutionV2Response OverResolutionV2(OverResolutionV2Request request) throws Exception{
        RawResponse response = json(Const.OverResolutionV2, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), OverResolutionV2Response.class);
    }

    @Override
    public TupoCartoonResponse tupoCartoon(TupoCartoonRequest request) throws Exception {
        RawResponse response = json(Const.TupoCartoon, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), TupoCartoonResponse.class);
    }
    @Override
    public VisualH5TokenResponse certH5Token(VisualH5TokenRequest request) throws Exception {
        RawResponse response = json(Const.CertH5Token, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualH5TokenResponse.class);

    }

    @Override
    public VisualH5CertConfigInitResponse certH5ConfigInit(VisualCertH5ConfigInitRequest request) throws Exception {
        RawResponse response = json(Const.CertH5ConfigInit, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualH5CertConfigInitResponse.class);
    }
    @Override
    public VisualHighAesSmartDrawingResponse visualHighAesSmartDrawing(Object request) throws Exception {
        RawResponse response = json(Const.HighAesSmartDrawing, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualHighAesSmartDrawingResponse.class);
    }
    @Override
    public  VisualImg2ImgInpaintingResponse  img2ImgInpainting(VisualImg2ImgInpaintingRequest request)  throws Exception {
        RawResponse response = json(Const.Img2ImgInpainting, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualImg2ImgInpaintingResponse.class);
    }
    @Override
    public  VisualImg2ImgInpaintingEditResponse  imgInpaintingEdit(VisualImg2ImgInpaintingEditRequest request)  throws Exception {
        RawResponse response = json(Const.Img2ImgInpaintingEdit, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualImg2ImgInpaintingEditResponse.class);
    }
    @Override
    public VisualImg2ImgOutpaintingResponse  Img2ImgOutpainting(VisualImg2ImgOutpaintingRequest request)  throws Exception {
        RawResponse response = json(Const.Img2ImgOutpainting, null, JSON.toJSONString(request));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(new String(response.getData(), "UTF-8"), VisualImg2ImgOutpaintingResponse.class);
    }
}

