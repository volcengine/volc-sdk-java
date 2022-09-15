package com.volcengine.service.visual;

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


}