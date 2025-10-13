package com.volcengine.service.contentSecurity;

import com.volcengine.model.request.RcLlmRequest;
import com.volcengine.model.request.RcLlmResultRequest;
import com.volcengine.model.request.SecuritySourceRequest;
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
    RcTextModerationResponse textModeration(RcLlmRequest rcLlmRequest) throws Exception;

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
    RcTextModerationResponse textModerationResult(RcLlmResultRequest rcLlmResultRequest) throws Exception;

    /**
     * multiModeration
     * @param rcLlmRequest rcLlmRequest
     * @return rc multiModeration response
     * @throws Exception the exception
     */
    RcMultiModerationResponse multiModeration(RcLlmRequest rcLlmRequest) throws Exception;

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
    RcMultiModerationResponse multiModerationResult(RcLlmResultRequest rcLlmResultRequest) throws Exception;

    /**
     * customRisk
     * @param rcLlmRequest rcLlmRequest
     * @return rc customRisk response
     * @throws Exception the exception
     */
    RcCustomRiskResponse customRisk(RcLlmRequest rcLlmRequest) throws Exception;

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
     * @return RcCustomRiskResponse
     * @throws Exception the exception
     */
    RcCustomRiskResponse customRiskResult(RcLlmResultRequest rcLlmResultRequest) throws Exception;
}
