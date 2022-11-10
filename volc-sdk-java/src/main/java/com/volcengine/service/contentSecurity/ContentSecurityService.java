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
     * @param  riskDetectionRequest image risk detection request
     * @return image risk detection response
     * @throws Exception the exception
     */
    ImageRiskDetectionResponse ImageRiskDetection(RiskDetectionRequest riskDetectionRequest) throws Exception;

    /**
     * Async Image Risk Detection.
     *
     * @param  riskDetectionRequest image risk detection request
     * @return async image risk detection response
     * @throws Exception the exception
     */
    AsyncRiskDetectionResponse AsyncImageRisk(RiskDetectionRequest riskDetectionRequest) throws Exception;

    /**
     * Image Risk Result.
     *
     * @param  imageRiskResultRequest image risk result request
     * @return image risk result response
     * @throws Exception the exception
     */
    ImageRiskDetectionResponse ImageRiskResult(ImageRiskResultRequest imageRiskResultRequest) throws Exception;

    /**
     * Async Video Risk Detection.
     *
     * @param  riskDetectionRequest video risk detection request
     * @return async video risk detection response
     * @throws Exception the exception
     */
    AsyncRiskDetectionResponse AsyncVideoRisk(RiskDetectionRequest riskDetectionRequest) throws Exception;

    /**
     * Video Risk Result.
     *
     * @param  videoRiskResultRequest video risk detection request
     * @return async video risk detection response
     * @throws Exception the exception
     */
    VideoRiskResultResponse VideoResult(ImageRiskResultRequest videoRiskResultRequest) throws Exception;

    /**
     * Text Risk Result.
     *
     * @param  riskDetectionRequest video risk detection request
     * @return text risk detection response
     * @throws Exception the exception
     */
    TextRiskResponse TextRisk(RiskDetectionRequest riskDetectionRequest) throws Exception;

    /**
     * Create Custom Contents
     * @param  request create custom contents request
     * @return create custom contents response
     * @throws Exception the exception
     */
    AsyncRiskDetectionResponse CreateCustomContents(CreateCustomContentsRequest request) throws Exception;

    /**
     * Upload Custom Contents
     * @param  request upload custom contents request
     * @return upload custom contents response
     * @throws Exception the exception
     */
    AsyncRiskDetectionResponse UploadCustomContents(UploadCustomContentsRequest request) throws Exception;

    /**
     * Async Audio Risk Detection.
     *
     * @param  riskDetectionRequest audip risk detection request
     * @return async audio risk detection response
     * @throws Exception the exception
     */
    AsyncRiskDetectionResponse AsyncAudioRisk(RiskDetectionRequest riskDetectionRequest) throws Exception;

    /**
     * Audio Risk Result.
     *
     * @param  audioRiskResultRequest video risk detection request
     * @return async video risk detection response
     * @throws Exception the exception
     */
    GetAudioRiskResponse AudioResult(ImageRiskResultRequest audioRiskResultRequest) throws Exception;

    /**
     * Async Video live Risk Detection.
     *
     * @param  riskDetectionRequest video risk detection request
     * @return async video risk detection response
     * @throws Exception the exception
     */
    AsyncRiskDetectionResponse AsyncLiveVideoRisk(RiskDetectionRequest riskDetectionRequest) throws Exception;

    /**
     * Video Live Risk Result.
     *
     * @param  videoRiskResultRequest video risk detection request
     * @return async video risk detection response
     * @throws Exception the exception
     */
    VideoRiskResultResponse VideoLiveResult(ImageRiskResultRequest videoRiskResultRequest) throws Exception;

    /**
     * Async Audio Live Risk Detection.
     *
     * @param  riskDetectionRequest audip risk detection request
     * @return async audio risk detection response
     * @throws Exception the exception
     */
    AsyncRiskDetectionResponse AsyncLiveAudioRisk(RiskDetectionRequest riskDetectionRequest) throws Exception;

    /**
     * Audio Live Risk Result.
     *
     * @param  audioRiskResultRequest video risk detection request
     * @return async video risk detection response
     * @throws Exception the exception
     */
    GetAudioRiskResponse AudioLiveResult(ImageRiskResultRequest audioRiskResultRequest) throws Exception;

    /**
     * Text Slice Risk.
     *
     * @param  riskDetectionRequest text risk detection request
     * @return text risk detection response
     * @throws Exception the exception
     */
    TextSliceRiskResponse TextSliceRisk(RiskDetectionRequest riskDetectionRequest) throws Exception;
}
