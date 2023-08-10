package com.volcengine.service.contentSecurity;

import com.volcengine.model.request.CreateCustomContentsRequest;
import com.volcengine.model.request.ImageRiskResultRequest;
import com.volcengine.model.request.RiskDetectionRequest;
import com.volcengine.model.request.UploadCustomContentsRequest;
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
     * @param imageRiskResultRequest image risk result request
     * @return image risk result response
     * @throws Exception the exception
     */
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
     * @param riskDetectionRequest video risk detection request
     * @return text risk detection response
     * @throws Exception the exception
     */
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
    VideoRiskResultResponse VideoLiveResult(ImageRiskResultRequest videoRiskResultRequest) throws Exception;

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
    GetAudioRiskResponse AudioLiveResult(ImageRiskResultRequest audioRiskResultRequest) throws Exception;

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
}
