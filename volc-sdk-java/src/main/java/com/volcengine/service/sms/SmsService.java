package com.volcengine.service.sms;

import com.volcengine.model.request.*;
import com.volcengine.model.response.*;
import com.volcengine.service.IBaseService;

public interface SmsService extends IBaseService {
    /**
     * SmsSend.
     *
     * @param smsSendRequest the list users request
     * @return the list users response
     * @throws Exception the exception
     */
    SmsSendResponse send(SmsSendRequest smsSendRequest) throws Exception;

    SmsSendResponse sendV2(SmsSendRequest smsSendRequest) throws Exception;

    SmsSendResponse sendVms(SmsSendRequest smsSendRequest) throws Exception;


    /**
     * SmsBatchSend.
     *
     * @param smsBatchSendRequest the list users request
     * @return the list users response
     * @throws Exception the exception
     */
    SmsSendResponse batchSend(SmsBatchSendRequest smsBatchSendRequest) throws Exception;

    SmsSendResponse batchSendV2(SmsBatchSendRequest smsBatchSendRequest) throws Exception;


    /**
     * SmsSendVerifyCode.
     *
     * @param smsSendVerifyCodeRequest the list users request
     * @return the list users response
     * @throws Exception the exception
     */
    SmsSendResponse sendVerifyCode(SmsSendVerifyCodeRequest smsSendVerifyCodeRequest) throws Exception;

    SmsSendResponse sendVerifyCodeV2(SmsSendVerifyCodeRequest smsSendVerifyCodeRequest) throws Exception;

    /**
     * SmsSendVerifyCode.
     *
     * @param smsCheckVerifyCodeRequest the list users request
     * @return the list users response
     * @throws Exception the exception
     */
    SmsCheckVerifyCodeResponse checkVerifyCode(SmsCheckVerifyCodeRequest smsCheckVerifyCodeRequest) throws Exception;

    /**
     * Conversion
     *
     * @param conversionRequest
     * @return
     * @throws Exception
     */
    ConversionResponse conversion(ConversionRequest conversionRequest) throws Exception;

    /**
     * GetSubAccountList
     *
     * @param getSubAccountListRequest
     * @return
     * @throws Exception
     */
    GetSubAccountListResponse getSubAccountList(GetSubAccountListRequest getSubAccountListRequest) throws Exception;

    /**
     * GetSubAccountDetail
     *
     * @param subAccountRequest
     * @return
     * @throws Exception
     */
    GetSubAccountDetailResponse getSubAccountDetail(SubAccountRequest subAccountRequest) throws Exception;

    /**
     * GetSmsTemplateAndOrderList
     *
     * @param getSmsTemplateAndOrderListRequest
     * @return
     * @throws Exception
     */
    GetSmsTemplateAndOrderListResponse getSmsTemplateAndOrderList(GetSmsTemplateAndOrderListRequest getSmsTemplateAndOrderListRequest) throws Exception;

    /**
     * ApplySmsTemplate
     *
     * @param applySmsTemplateRequest
     * @return
     * @throws Exception
     */
    ApplySmsTemplateResponse applySmsTemplate(ApplySmsTemplateRequest applySmsTemplateRequest) throws Exception;

    ApplySmsTemplateResponse ApplyVmsTemplate(ApplyVmsTemplateRequest applyVmsTemplateRequest) throws Exception;


    ApplySmsTemplateResponse GetVmsTemplateStatus(GetVmsTemplateStatusRequest applyVmsTemplateRequest) throws Exception;


    /**
     * DeleteSmsTemplate
     *
     * @param deleteSmsTemplateRequest
     * @return
     * @throws Exception
     */
    DeleteSmsTemplateResponse deleteSmsTemplate(DeleteSmsTemplateRequest deleteSmsTemplateRequest) throws Exception;

    /**
     * GetSmsSignatureAndOrderList
     *
     * @param getSignatureAndOrderListRequest
     * @return
     * @throws Exception
     */
    GetSignatureAndOrderListResponse getSmsSignatureAndOrderList(GetSignatureAndOrderListRequest getSignatureAndOrderListRequest) throws Exception;

    /**
     * ApplySmsSignature
     *
     * @param applySmsSignatureRequest
     * @return
     * @throws Exception
     */
    ApplySmsSignatureResponse applySmsSignature(ApplySmsSignatureRequest applySmsSignatureRequest) throws Exception;

    /**
     * DeleteSmsSignature
     *
     * @param deleteSignatureRequest
     * @return
     * @throws Exception
     */
    DeleteSignatureResponse deleteSmsSignature(DeleteSignatureRequest deleteSignatureRequest) throws Exception;


}
