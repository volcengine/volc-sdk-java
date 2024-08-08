package com.volcengine.service.visual;

import com.alibaba.fastjson.JSONObject;
import com.volcengine.service.IBaseService;
import com.volcengine.service.visual.model.request.*;
import com.volcengine.service.visual.model.response.*;

public interface IVisualService extends IBaseService {

    /**
     * 天空分割
     * @param request
     * @return
     * @throws Exception
     */
    VisualSkySegmentResponse skySegment(VisualSkySegmentRequest request) throws Exception;

    /**
     * 人像抠图
     * @param request
     * @return
     * @throws Exception
     */
    VisualHumanSegmentResponse humanSegment(VisualHumanSegmentRequest request) throws Exception;

    /**
     * 通用分割
     * @param request
     * @return
     * @throws Exception
     */
    VisualGeneralSegmentResponse generalSegment(VisualGeneralSegmentRequest request) throws Exception;

    /**
     * 车辆检测
     * @param request
     * @return
     * @throws Exception
     */
    VisualCarDetectionResponse carDetection(VisualCarDetectionRequest request) throws Exception;

    /**
     * 车辆分割
     * @param request
     * @return
     * @throws Exception
     */
    VisualCarSegmentResponse carSegment(VisualCarSegmentRequest request) throws Exception;

    /**
     * 车牌检测
     * @param request
     * @return
     * @throws Exception
     */
    VisualCarPlateDetectionResponse carPlateDetection(VisualCarPlateDetectionRequest request) throws Exception;

    /**
     * 图片配文
     * @param request
     * @return
     * @throws Exception
     */
    VisualPoemMaterialResponse poemMaterial(VisualPoemMaterialRequest request) throws Exception;

    /**
     * 图片流动
     * @param request
     * @return
     * @throws Exception
     */
    VisualImageFlowResponse imageFlow(VisualImageFlowRequest request) throws Exception;

    /**
     * 图片评分
     * @param request
     * @return
     * @throws Exception
     */
    VisualImageScoreResponse imageScore(VisualImageScoreRequest request) throws Exception;

    /**
     * 人像融合
     * @param request
     * @return
     * @throws Exception
     */
    VisualFaceSwapResponse faceSwap(VisualFaceSwapRequest request) throws Exception;

    /**
     * 人像融合 V3.0/V3.3
     * @param request
     * @return
     * @throws Exception
     */
    VisualFaceSwapV2Response faceSwapV2(VisualFaceSwapV2Request request) throws Exception;

    /**
     * Ai写真
     * @param request
     * @return
     * @throws Exception
     */
    VisualFaceSwapAIResponse faceSwapAI(VisualFaceSwapAIRequest request) throws Exception;

    /**
     * 人像漫画风
     * @param request
     * @return
     * @throws Exception
     */
    VisualJPCartoonResponse jpCartoon(VisualJPCartoonRequest request) throws Exception;

    /**
     * 闭眼转睁眼
     * @param request
     * @return
     * @throws Exception
     */
    VisualEyeClose2OpenResponse eyeClose2Open(VisualEyeClose2OpenRequest request) throws Exception;

    /**
     * 表情编辑
     * @param request
     * @return
     * @throws Exception
     */
    VisualEmoticonEditResponse emotionEdit(VisualEmoticonEditRequest request) throws Exception;

    /**
     * 图片拉伸修复
     * @param request
     * @return
     * @throws Exception
     */
    VisualStretchRecoveryResponse stretchRecovery(VisualStretchRecoveryRequest request) throws Exception;

    /**
     * 人像畸变矫正
     * @param request
     * @return
     * @throws Exception
     */
    VisualDistortionFreeResponse distortionFree(VisualDistortionFreeRequest request) throws Exception;

    /**
     * 图像增强
     * @param request
     * @return
     * @throws Exception
     */
    VisualEnhancePhotoResponse enhancePhoto(VisualEnhancePhotoRequest request) throws Exception;

    /**
     * 老照片修复
     * @param request
     * @return
     * @throws Exception
     */
    VisualConvertPhotoResponse convertPhoto(VisualConvertPhotoRequest request) throws Exception;

    /**
     * 人像特效
     * @param request
     * @return
     * @throws Exception
     */
    VisualPotraitEffectResponse potraitEffect(VisualPotraitEffectRequest request) throws Exception;

    /**
     * 希区柯克V1版本
     * @param request
     * @return
     * @throws Exception
     */
    VisualDollyZoomResponse dollyZoom(VisualDollyZoomRequest request) throws Exception;

    /**
     * 图片裁剪
     * @param request
     * @return
     * @throws Exception
     */
    VisualImageCutResponse imageCut(VisualImageCutRequest request) throws Exception;

    /**
     * 智能变美
     * @param request
     * @return
     * @throws Exception
     */
    VisualFacePrettyResponse facePretty(VisualFacePrettyRequest request) throws Exception;

    /**
     * 发型编辑
     * @param request
     * @return
     * @throws Exception
     */
    VisualHairStyleResponse hairStyle(VisualHairStyleRequest request) throws Exception;

    /**
     * 活照片
     * @param request
     * @return
     * @throws Exception
     */
    VisualImageAnimationResponse imageAnimation(VisualImageAnimationRequest request) throws Exception;

    /**
     * 身份认证Token服务
     * @param request
     * @return
     * @throws Exception
     */
    VisualCertTokenResponse certToken(VisualCertTokenRequest request) throws Exception;
    /**
     * 身份认证Token服务V2
     * @param request
     * @return
     * @throws Exception
     */
    Object certTokenV2(VisualCertTokenRequest request) ;
    /**
     * 身份认证Query服务
     * @param request
     * @return
     * @throws Exception
     */
    VisualCertVerifyQueryResponse certVerifyQuery(VisualCertVerifyQueryRequest request) throws Exception;
    /**
     * 身份认证Query服务V2
     * @param request
     * @return
     * @throws Exception
     */
    Object certVerifyQueryV2(VisualCertVerifyQueryRequest request) ;
    /**
     * 身份认证ConfigInit服务
     * @param request
     * @return
     * @throws Exception
     */
    VisualCertConfigInitResponse certConfigInit(VisualCertConfigInitRequest request) throws Exception;
    /**
     * 身份认证ConfigInit服务V2
     * @param request
     * @return
     * @throws Exception
     */
    Object certConfigInitV2(VisualCertConfigInitRequest request) ;
    /**
     * 身份认证ConfigGet服务
     * @param request
     * @return
     * @throws Exception
     */
    VisualCertConfigGetResponse certConfigGet(VisualCertConfigGetRequest request) throws Exception;
    /**
     * 身份认证ConfigGet服务V2
     * @param request
     * @return
     * @throws Exception
     */
    Object certConfigGetV2(VisualCertConfigGetRequest request) ;

    /**
     * 身份认证TokenPro服务
     * @param request
     * @return
     * @throws Exception
     */
    VisualCertTokenProResponse certTokenPro(VisualCertTokenProRequest request) throws Exception;
    /**
     * 身份认证TokenPro服务V2
     * @param request
     * @return
     * @throws Exception
     */
    Object certTokenProV2(VisualCertTokenProRequest request) ;
    /**
     * 身份认证VerifyPro服务
     * @param request
     * @return
     * @throws Exception
     */
    VisualCertVerifyProResponse certVerifyPro(VisualCertVerifyProRequest request) throws Exception;
    /**
     * 身份认证VerifyPro服务V2
     * @param request
     * @return
     * @throws Exception
     */
    Object certVerifyProV2(VisualCertVerifyProRequest request) ;
    /**
     * 身份认证QueryPro服务
     * @param request
     * @return
     * @throws Exception
     */
    VisualCertQueryProResponse certQueryPro(VisualCertQueryProRequest request) throws Exception;
    /**
     * 身份认证QueryPro服务V2
     * @param request
     * @return
     * @throws Exception
     */
    Object certQueryProV2(VisualCertQueryProRequest request) ;
    /**
     * 希区柯克V2(3D运镜)
     * @param request
     * @return
     * @throws Exception
     */
    VisualImg2Video3DResponse img2Video3D(VisualImg2Video3DRequest request) throws Exception;

    /**
     * 智能绘图（文本转图片通用版）
     * @param request
     * @return
     * @throws Exception
     */
    VisualT2ILDMResponse t2ILDM(VisualT2ILDMRequest request) throws Exception;

    /**
     * 智能绘图（名画版）
     * @param request
     * @return
     * @throws Exception
     */
    VisualImg2ImgStyleResponse img2ImgStyle(VisualImg2ImgStyleRequest request) throws Exception;

    /**
     * 智能绘图（漫画版）
     * @param request
     * @return
     * @throws Exception
     */
    VisualImg2ImgAnimeResponse img2ImgAnime(VisualImg2ImgAnimeRequest request) throws Exception;

    /**
     * 视频人脸融合-提交任务
     * @param request
     * @return
     * @throws Exception
     */
    VisualFaceFusionMovieSubmitTaskResponse faceFusionMovieSubmitTask(VisualFaceFusionMovieSubmitTaskRequest request) throws Exception;
    /**
     * 视频人脸融合-查询任务
     * @param request
     * @return
     * @throws Exception
     */
    VisualFaceFusionMovieGetResultResponse faceFusionMovieGetResult(VisualFaceFusionMovieGetResultRequest request) throws Exception;

    /**
     * 视频人脸融合-同步
     * @param request
     * @return
     * @throws Exception
     */
    VisualFaceFusionMovieSyncResponse faceFusionMovieSync(VisualFaceFusionMovieSyncRequest request) throws Exception;

    /**
     * 图像增强V2版本
     * @param request
     * @return
     * @throws Exception
     */
    VisualEnhancePhotoV2Response enhancePhotoV2(VisualEnhancePhotoV2Request request) throws Exception;

    /**
     * 人像年龄变换
     * @param request
     * @return
     * @throws Exception
     */
    VisualAllAgeGenerationResponse allAgeGeneration(VisualAllAgeGenerationRequest request) throws Exception;

    /**
     * 老照片修复V2
     * @param request
     * @return
     * @throws Exception
     */
    VisualConvertPhotoV2Response convertPhotoV2(VisualConvertPhotoV2Request request) throws Exception;

    /**
     * AI仙侠
     * @param request
     * @return
     * @throws Exception
     */
    VisualAIGufengResponse aiGufeng(VisualAIGufengRequest request) throws Exception;

    /**
     * 视频画质评分V2-提交
     * @param request
     * @return
     * @throws Exception
     */
    VisualLensVidaVideoSubmitTaskV2Response lensVidaVideoSubmitTaskV2(VisualLensVidaVideoSubmitTaskV2Request request) throws Exception;

    /**
     * 视频画质评分V2-查询
     * @param request
     * @return
     * @throws Exception
     */
    VisualLensVidaVideoGetResultV2Response lensVidaVideoGetResultV2(VisualLensVidaVideoGetResultV2Request request) throws Exception;

    /**
     * 视频超分辨率-提交任务
     * @param request
     * @return
     * @throws Exception
     */
    VisualVideoOverResolutionSubmitTaskV2Response videoOverResolutionSubmitTaskV2(VisualVideoOverResolutionSubmitTaskV2Request request) throws Exception;
    /**
     * 视频超分辨率-查询任务
     * @param request
     * @return
     * @throws Exception
     */
    VisualVideoOverResolutionQueryTaskV2Response videoOverResolutionQueryTaskV2(VisualVideoOverResolutionQueryTaskV2Request request) throws Exception;

    /**
     * 通用文字识别
     * @param request
     * @return
     * @throws Exception
     */
    OCRNormalResponse ocrNormal(OCRNormalRequest request) throws Exception;

    /**
     * 银行卡V1
     * @param request
     * @return
     * @throws Exception
     */
    OCRBankCardV1Response bankCardV1(OCRBankCardRequest request) throws Exception;

    /**
     * 银行卡V2
     * @param request
     * @return
     * @throws Exception
     */
    OCRBankCardV2Response bankCardV2(OCRBankCardRequest request) throws Exception;

    /**
     * 身份证
     * @param request
     * @return
     * @throws Exception
     */
    OCRIDCardResponse idCard(OCRIDCardRequest request) throws Exception;

    /**
     * 驾驶证
     * @param request
     * @return
     * @throws Exception
     */
    OCRDrivingLicenseResponse drivingLicense(OCRDrivingLicenseRequest request) throws Exception;

    /**
     * 行驶证
     * @param request
     * @return
     * @throws Exception
     */
    OCRVehicleLicenseResponse vehicleLicense(OCRVehicleLicenseRequest request) throws Exception;

    /**
     * 增值税
     * @param request
     * @return
     * @throws Exception
     */
    OCRVatInvoiceResponse vatInvoice(OCRVatInvoiceRequest request) throws Exception;

    /**
     * 多语种OCR
     * @param request
     * @return
     * @throws Exception
     */
    MultilangOCRResponse multilangOCR(MultilangOCRRequest request) throws Exception;

    /**
     * 通用的实现
     * @param actionName: 每个能力的Action取值
     * @param jsonObject: 入参JSON对象
     * @return
     * @throws Exception
     */
    String ocrApi(String actionName, JSONObject jsonObject) throws Exception;

    String ocrAsyncApi(String actionName, JSONObject jsonObject) throws Exception;


    /**
     * 图像风格转换
     * @param request
     * @return
     * @throws Exception
     */
    ImageStyleConversionResponse imageStyleConversion(ImageStyleConversionRequest request) throws Exception;

    /**
     * 人脸三要素，纯API接入
     * @param request
     * @return
     * @throws Exception
     */
    CertSrcFaceCompResponse certSrcFaceComp(CertSrcFaceCompRequest request) throws Exception;

    /**
     * 人脸三要素，纯API接入V2（直接返回response）
     * @param request
     * @return
     * @throws Exception
     */
    Object certSrcFaceCompV2(CertSrcFaceCompRequest request) ;

    /**
     * 面部对比
     * @param request
     * @return
     * @throws Exception
     */
    FaceCompareResponse faceCompare(FaceCompareRequest request) throws Exception;

    /**
     * 静默活体检测
     * @param request
     * @return
     * @throws Exception
     */
    StillLivenessImgResponse stillLivenessImg(StillLivenessImgRequest request) throws Exception;

    /**
     * 静默活体检测V2
     * @param request
     * @return
     * @throws Exception
     */
    Object stillLivenessImgV2(StillLivenessImgRequest request) ;
    /**
     * 图片超分辨率
     * @param request
     * @return
     * @throws Exception
     */
    OverResolutionV2Response OverResolutionV2(OverResolutionV2Request request)throws Exception;
    /**
     * 卡通脸
     * @param request
     * @return
     * @throws Exception
     */
    TupoCartoonResponse tupoCartoon(TupoCartoonRequest request)throws Exception;
    /**
     * 身份认证H5Token服务
     * @param request
     * @return
     * @throws Exception
     */
    VisualH5TokenResponse certH5Token(VisualH5TokenRequest request) throws Exception;

    /**
     * 身份认证H5ConfigInit服务
     * @param request
     * @return
     * @throws Exception
     */
    VisualH5CertConfigInitResponse certH5ConfigInit(VisualCertH5ConfigInitRequest request) throws Exception;

    /**
     * 智能绘图
     * @param request
     * @return
     * @throws Exception
     */
    VisualHighAesSmartDrawingResponse visualHighAesSmartDrawing(Object request) throws Exception;

    /**
     * 涂抹消除
     * @param request
     * @return
     * @throws Exception
     */
    VisualImg2ImgInpaintingResponse  img2ImgInpainting(VisualImg2ImgInpaintingRequest request) throws Exception;

    /**
     * 涂抹编辑
     * @param request
     * @return
     * @throws Exception
     */
    VisualImg2ImgInpaintingEditResponse  imgInpaintingEdit(VisualImg2ImgInpaintingEditRequest request) throws Exception;

    /**
     * 智能扩图outpainting
     * @param request
     * @return
     * @throws Exception
     */
    VisualImg2ImgOutpaintingResponse  Img2ImgOutpainting(VisualImg2ImgOutpaintingRequest request) throws Exception;

    /**
     * 提交【分身生成】任务
     * @param request
     * @return
     * @throws Exception
     */
    MultiPhotoPortraitSubmitTaskCreateAIModelResponse multiPhotoPortraitSubmitTaskCreateAIModel(MultiPhotoPortraitSubmitTaskCreateAIModelRequest request) throws Exception;

    /**
     * 提交【图片生成】任务
     * @param request
     * @return
     * @throws Exception
     */
    MultiPhotoPortraitSubmitTaskGenerateImageResponse multiPhotoPortraitSubmitTaskGenerateImage(MultiPhotoPortraitSubmitTaskGenerateImageRequest request) throws Exception;

    /**
     * 查询任务
     * @param request
     * @return
     * @throws Exception
     */
    MultiPhotoPortraitGetTaskResultResponse multiPhotoPortraitGetTaskResult(MultiPhotoPortraitGetTaskResultRequest request) throws Exception;

    /**
     * 管理任务
     * @param request
     * @return
     * @throws Exception
     */
    MultiPhotoPortraitManageTaskResponse multiPhotoPortraitManageTask(MultiPhotoPortraitManageTaskRequest request) throws Exception;

    /**
     * 人像保持
     * @param request
     * @return
     * @throws Exception
     */
    Img2ImgAnimeAcceleratedMaintainIDResponse img2ImgAnimeAcceleratedMaintainID(Object request) throws Exception;

    /**
     * 智能分割
     * @param request
     * @return
     * @throws Exception
     */
    VisualEntitySegmentResponse entitySegment(VisualEntitySegmentRequest request) throws Exception;

    /**
     * 智能绘图（漫画版）
     * @param request
     * @return
     * @throws Exception
     */
    Img2ImgAnimeAcceleratedMaintainIDForSmartDrawingAnimeResponse  Img2ImgAnimeAcceleratedMaintainIDForSmartDrawingAnime(Object request) throws Exception;

    /**
     * 通用请求Json类型
     * @param request
     * @return
     * @throws Exception
     */
    Object visualCommonRequestForJson(Object request,String action,String version) throws Exception;

    /**
     * 通用请求form类型
     * @param request
     * @return
     * @throws Exception
     */
    Object visualCommonRequestForForm(Object request,String action,String version) throws Exception;
}