package com.volcengine.service.contentSecurity;

import com.volcengine.model.request.*;
import com.volcengine.model.response.*;
import com.volcengine.service.IBaseService;

import java.util.stream.Stream;

public interface SecuritySourceService extends IBaseService {


    /**
     * get security source
     * @param securitySourceRequest security source request
     * @return security source response
     * @throws Exception the exception
     */
    SecuritySourceResponse getSecuritySource(SecuritySourceRequest securitySourceRequest) throws Exception;


    /**
     * get security source stream
     * @param securitySourceRequest security source request
     * @return security source response
     * @throws SecuritySourceException the exception
     */
    Stream<SecuritySourceResponse> getSecuritySourceStream(SecuritySourceRequest securitySourceRequest) throws SecuritySourceException;

    /**
     * textModeration
     * @param rcLlmRequest rcLlmRequest
     * @return rc textModeration response
     * @throws Exception the exception
     */
    RcTextModerationSyncResponse textModeration(RcLlmRequest rcLlmRequest) throws Exception;

    /**
     * asyncTextModeration
     * @param rcLlmRequest rcLlmRequest
     * @return AsyncRiskDetectionResponse
     * @throws Exception the exception
     */
    AsyncRiskDetectionResponse asyncTextModeration(RcLlmRequest rcLlmRequest) throws Exception;

    /**
     * textModerationResult
     * @param rcLlmResultRequest rcLlmResultRequest
     * @return RcTextModerationResponse
     * @throws Exception the exception
     */
    RcTextModerationAsyncResponse textModerationResult(RcLlmResultRequest rcLlmResultRequest) throws Exception;

    /**
     * multiModeration
     * @param rcLlmRequest rcLlmRequest
     * @return rc multiModeration response
     * @throws Exception the exception
     */
    RcMultiModerationSyncResponse multiModeration(RcLlmRequest rcLlmRequest) throws Exception;

    /**
     * asyncMultiModeration
     * @param rcLlmRequest rcLlmRequest
     * @return AsyncRiskDetectionResponse
     * @throws Exception the exception
     */
    AsyncRiskDetectionResponse asyncMultiModeration(RcLlmRequest rcLlmRequest) throws Exception;

    /**
     * multiModerationResult
     * @param rcLlmResultRequest rcLlmResultRequest
     * @return RcTextModerationResponse
     * @throws Exception the exception
     */
    RcMultiModerationAsyncResponse multiModerationResult(RcLlmResultRequest rcLlmResultRequest) throws Exception;

    /**
     * customRisk
     * @param rcLlmRequest rcLlmRequest
     * @return RcCustomRiskSyncResponse
     * @throws Exception the exception
     */
    RcCustomRiskSyncResponse customRisk(RcLlmRequest rcLlmRequest) throws Exception;

    /**
     * asyncCustomRisk
     * @param rcLlmRequest rcLlmRequest
     * @return AsyncRiskDetectionResponse
     * @throws Exception the exception
     */
    AsyncRiskDetectionResponse asyncCustomRisk(RcLlmRequest rcLlmRequest) throws Exception;

    /**
     * customRiskResult
     * @param rcLlmResultRequest rcLlmResultRequest
     * @return RcCustomRiskAsyncResponse
     * @throws Exception the exception
     */
    RcCustomRiskAsyncResponse customRiskResult(RcLlmResultRequest rcLlmResultRequest) throws Exception;

    /**
     *
     * @param rcLlmRequest
     * @return
     * @throws Exception
     */
    RcImageTextLiteModerationSyncResponse imageTextLiteModeration(RcLlmRequest rcLlmRequest) throws Exception;

    /**
     * Async Audio Risk Detection.
     *
     * @param riskDetectionRequest audip risk detection request
     * @return async audio risk detection response
     * @throws Exception the exception
     */
    AsyncRiskDetectionResponse AsyncAudioLiteModeration(RiskDetectionRequest riskDetectionRequest) throws Exception;

    /**
     * Audio Risk Result.
     *
     * @param audioRiskResultRequest video risk detection request
     * @return async video risk detection response
     * @throws Exception the exception
     */
    GetAudioRiskResponse AudioLiteModerationResult(ImageRiskResultRequest audioRiskResultRequest) throws Exception;

    /**
     * Async Video Risk Detection.
     *
     * @param riskDetectionRequest video risk detection request
     * @return async video risk detection response
     * @throws Exception the exception
     */
    AsyncRiskDetectionResponse AsyncVideoLiteModeration(RiskDetectionRequest riskDetectionRequest) throws Exception;

    /**
     * Video Risk Result.
     *
     * @param videoRiskResultRequest video risk detection request
     * @return async video risk detection response
     * @throws Exception the exception
     */
    VideoRiskResultResponse VideoLiteModerationResult(ImageRiskResultRequest videoRiskResultRequest) throws Exception;

    /**
     * Sync Audio Risk Detection.
     *
     * @param riskDetectionRequest audip risk detection request
     * @return async audio risk detection response
     * @throws Exception the exception
     */
    GetAudioRiskResponse AudioLiteModeration(RiskDetectionRequest riskDetectionRequest) throws Exception;
}
