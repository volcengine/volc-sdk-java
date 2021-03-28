package com.volcengine.service.translate.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.model.request.LangDetectRequest;
import com.volcengine.model.request.TranslateTextRequest;
import com.volcengine.model.response.LangDetectResponse;
import com.volcengine.model.response.RawResponse;
import com.volcengine.model.response.TranslateTextResponse;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.translate.ITranslateService;
import com.volcengine.service.translate.TranslateConfig;


public class TranslateServiceImpl extends BaseServiceImpl implements ITranslateService {

    private TranslateServiceImpl() {
        super(TranslateConfig.serviceInfo, TranslateConfig.apiInfoList);
    }

    public static ITranslateService getInstance() {
        return new TranslateServiceImpl();
    }


    /**
     * @param langDetectRequest LangDetectRequest
     * @return LangDetectResponse
     * @throws Exception the exception
     */
    @Override
    public LangDetectResponse langDetect(LangDetectRequest langDetectRequest) throws Exception {
        RawResponse response = json(Const.LangDetect, null, JSON.toJSONString(langDetectRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), LangDetectResponse.class);
    }

    /**
     * @param translateTextRequest TranslateTextRequest
     * @return TranslateTextResponse
     * @throws Exception the exception
     */
    @Override
    public TranslateTextResponse translateText(TranslateTextRequest translateTextRequest) throws Exception {
        RawResponse response = json(Const.TranslateText, null, JSON.toJSONString(translateTextRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), TranslateTextResponse.class);
    }
}
