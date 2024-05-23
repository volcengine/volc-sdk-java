package com.volcengine.service.contentSecurity;

import com.volcengine.model.request.*;
import com.volcengine.model.response.*;
import com.volcengine.service.IBaseService;

/**
 * The interface business security service.
 */
public interface ContentSecurityService extends IBaseService {
    /**
     * Image Risk Detection.
     *
     * @param riskDetectionRequest image risk detection request
     * @return image risk detection response
     * @throws Exception the exception
     */
    ImageRiskDetectionResponse ImageRiskDetection(RiskDetectionRequest riskDetectionRequest) throws Exception;

    /**
     * Image Risk Detection V3.
     *
     * @param riskDetectionRequest image risk detection request
     * @return image risk detection response
     * @throws Exception the exception
     */
    ImageRiskDetectionResponse ImageRiskDetectionV2(RiskDetectionRequest riskDetectionRequest) throws Exception;

    /**
     * Async Image Risk Detection.
     *
     * @param riskDetectionRequest image risk detection request
     * @return async image risk detection response
     * @throws Exception the exception
     */
    AsyncRiskDetectionResponse AsyncImageRisk(RiskDetectionRequest riskDetectionRequest) throws Exception;

    /**
     * Async Image Risk Detection.
     *
     * @param riskDetectionRequest image risk detection request
     * @return async image risk detection response
     * @throws Exception the exception
     */
    AsyncRiskDetectionResponse AsyncImageRiskV2(RiskDetectionRequest riskDetectionRequest) throws Exception;


    /**
     * Image Risk Result.
     *
     * @deprecated 已经废弃请使用ImageRiskResultV2
     */
    @Deprecated
    ImageRiskDetectionResponse ImageRiskResult(ImageRiskResultRequest imageRiskResultRequest) throws Exception;

    /**
     * Image Risk Result.
     *
     * @param imageRiskResultRequest image risk result request
     * @return image risk result response
     * @throws Exception the exception
     */
    ImageRiskDetectionResponse ImageRiskResultV2(ImageRiskResultRequest imageRiskResultRequest) throws Exception;


    /**
     * Async Video Risk Detection.
     *
     * @param riskDetectionRequest video risk detection request
     * @return async video risk detection response
     * @throws Exception the exception
     */
    AsyncRiskDetectionResponse AsyncVideoRisk(RiskDetectionRequest riskDetectionRequest) throws Exception;

    /**
     * Video Risk Result.
     *
     * @param videoRiskResultRequest video risk detection request
     * @return async video risk detection response
     * @throws Exception the exception
     */
    VideoRiskResultResponse VideoResult(ImageRiskResultRequest videoRiskResultRequest) throws Exception;

    /**
     * Text Risk Result.
     *
     * @deprecated 已经废弃请使用TextSliceRisk
     */
    @Deprecated
    TextRiskResponse TextRisk(RiskDetectionRequest riskDetectionRequest) throws Exception;

    /**
     * Create Custom Contents
     *
     * @param request create custom contents request
     * @return create custom contents response
     * @throws Exception the exception
     */
    AsyncRiskDetectionResponse CreateCustomContents(CreateCustomContentsRequest request) throws Exception;

    /**
     * Upload Custom Contents
     *
     * @param request upload custom contents request
     * @return upload custom contents response
     * @throws Exception the exception
     */
    AsyncRiskDetectionResponse UploadCustomContents(UploadCustomContentsRequest request) throws Exception;

    /**
     * Delete Custom Contents
     *
     * @param request delete custom contents request
     * @return delete custom contents response
     * @throws Exception the exception
     */
    AsyncRiskDetectionResponse DeleteCustomContents(UploadCustomContentsRequest request) throws Exception;

    /**
     * Async Audio Risk Detection.
     *
     * @param riskDetectionRequest audip risk detection request
     * @return async audio risk detection response
     * @throws Exception the exception
     */
    AsyncRiskDetectionResponse AsyncAudioRisk(RiskDetectionRequest riskDetectionRequest) throws Exception;

    /**
     * Audio Risk Result.
     *
     * @param audioRiskResultRequest video risk detection request
     * @return async video risk detection response
     * @throws Exception the exception
     */
    GetAudioRiskResponse AudioResult(ImageRiskResultRequest audioRiskResultRequest) throws Exception;

    /**
     * Sync Audio Risk Detection.
     *
     * @param riskDetectionRequest audip risk detection request
     * @return async audio risk detection response
     * @throws Exception the exception
     */
    GetAudioRiskResponse AudioRisk(RiskDetectionRequest riskDetectionRequest) throws Exception;


    /**
     * Async Video live Risk Detection.
     *
     * @param riskDetectionRequest video risk detection request
     * @return async video risk detection response
     * @throws Exception the exception
     */
    AsyncRiskDetectionResponse AsyncLiveVideoRisk(RiskDetectionRequest riskDetectionRequest) throws Exception;

    /**
     * Video Live Risk Result.
     *
     * @param videoRiskResultRequest video risk detection request
     * @return async video risk detection response
     * @throws Exception the exception
     */
    GetVideoLiveRiskResultResponse VideoLiveResult(ImageRiskResultRequest videoRiskResultRequest) throws Exception;

    /**
     * Async Audio Live Risk Detection.
     *
     * @param riskDetectionRequest audip risk detection request
     * @return async audio risk detection response
     * @throws Exception the exception
     */
    AsyncRiskDetectionResponse AsyncLiveAudioRisk(RiskDetectionRequest riskDetectionRequest) throws Exception;

    /**
     * Audio Live Risk Result.
     *
     * @param audioRiskResultRequest video risk detection request
     * @return async video risk detection response
     * @throws Exception the exception
     */
    GetAudioLiveRiskResponse AudioLiveResult(ImageRiskResultRequest audioRiskResultRequest) throws Exception;

    /**
     * Text Slice Risk.
     *
     * @param riskDetectionRequest text risk detection request
     * @return text risk detection response
     * @throws Exception the exception
     */
    TextSliceRiskResponse TextSliceRisk(RiskDetectionRequest riskDetectionRequest) throws Exception;

    /**
     * Close Audio Live
     *
     * @param closeAudioLiveRequest text risk detection request
     * @return code response
     * @throws Exception the exception
     */
    AsyncRiskDetectionResponse CloseAudioLiveRisk(ImageRiskResultRequest closeAudioLiveRequest) throws Exception;

    /**
     * Close Video Live
     *
     * @param closeVideoLiveRequest text risk detection request
     * @return code response
     * @throws Exception the exception
     */
    AsyncRiskDetectionResponse CloseVideoLiveRisk(ImageRiskResultRequest closeVideoLiveRequest) throws Exception;

    /**
     * Create Custom Lib
     * @param request create custom lib request
     * @return  create custom lib response
     * @throws Exception the exception
     */
    ContentSecurityCustomLibCreateResponse CreateCustomLib(CreateContentSecurityCustomLibRequest request) throws Exception;

    /**
     * Update Custom Lib
     * @param request update custom lib request
     * @return update custom lib response
     * @throws Exception the exception
     */
    ContentSecurityCommonResponse UpdateCustomLib(UpdateContentSecurityCustomLibRequest request) throws Exception;

    /**
     * Update Custom Lib
     * @param request update custom lib request
     * @return update custom lib response
     * @throws Exception the exception
     */
    ContentSecurityCommonResponse ChangeCustomLibStatus(ChangeContentSecurityCustomLibStatusRequest request) throws Exception;

    /**
     * Delete Custom Lib
     * @param request delete custom lib request
     * @return delete custom lib response
     * @throws Exception the exception
     */
    ContentSecurityCommonResponse DeleteCustomLib(DeleteContentSecurityCustomLibRequest request) throws Exception;

    /**
     * Get Custom Lib
     * @param request get custom lib request
     * @return get custom lib response
     * @throws Exception the exception
     */
    ContentSecurityCustomLibListResponse GetCustomLib(GetContentSecurityCustomLibRequest request) throws Exception;

    /**
     * Create Access Config
     * @param request create access config request
     * @return  create access config response
     * @throws Exception the exception
     */
    ContentSecurityAccessConfigCreateResponse CreateAccessConfig(CreateContentSecurityAccessConfigRequest request) throws Exception;

    /**
     * Update Access Config
     * @param request update access config request
     * @return update access config response
     * @throws Exception the exception
     */
    ContentSecurityCommonResponse UpdateAccessConfig(UpdateContentSecurityAccessConfigRequest request) throws Exception;

    /**
     * Update Access Config Status
     * @param request update access config status request
     * @return update access config status response
     * @throws Exception the exception
     */
    ContentSecurityCommonResponse UpdateAccessConfigStatus(UpdateContentSecurityAccessConfigStatusRequest request) throws Exception;

    /**
     * Get Access Config
     * @param request get access config request
     * @return get access config response
     * @throws Exception the exception
     */
    ContentSecurityAccessConfigListResponse GetAccessConfig(GetContentSecurityAccessConfigRequest request) throws Exception;

    /**
     * Get Custom Text Lib
     * @param request get custom text lib request
     * @return get custom text lib response
     * @throws Exception the exception
     */
    ContentSecurityCustTextLibListResponse GetTextLibContent(GetContentSecurityCustTextLibRequest request) throws Exception;

    /**
     * Delete Custom Text Lib
     * @param request delete custom text lib request
     * @return delete custom text lib response
     * @throws Exception the exception
     */
    ContentSecurityCommonResponse DeleteTextLibContent(DeleteContentSecurityCustTextLibRequest request) throws Exception;

    /**
     * Upload Custom Text Lib
     * @param request upload custom text lib request
     * @return upload custom text lib response
     * @throws Exception the exception
     */
    ContentSecurityCommonResponse UploadCustTextLibContent(UploadContentSecurityCustTextLibRequest request) throws Exception;

    /**
     * Get Custom Img Lib
     * @param request get custom img lib request
     * @return get custom img lib response
     * @throws Exception the exception
     */
    ContentSecurityCustImgLibListResponse GetCustImgLibContent(GetContentSecurityCustImgLibRequest request) throws Exception;

    /**
     * Delete Custom img Lib
     * @param request delete custom img lib request
     * @return delete custom img lib response
     * @throws Exception the exception
     */
    ContentSecurityCommonResponse DeleteCustImgLibContent(DeleteContentSecurityCustImgLibRequest request) throws Exception;

    /**
     * Upload Custom Img Lib
     * @param request upload custom img lib request
     * @return upload custom img lib response
     * @throws Exception the exception
     */
    ContentSecurityUploadImgResponse UploadCustImgLibContent(UploadContentSecurityCustImgLibRequest request) throws Exception;

}
