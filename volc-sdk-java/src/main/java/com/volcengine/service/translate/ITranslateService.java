package com.volcengine.service.translate;

import com.volcengine.model.request.LangDetectRequest;
import com.volcengine.model.request.TranslateImageRequest;
import com.volcengine.model.request.TranslateTextRequest;
import com.volcengine.model.response.LangDetectResponse;
import com.volcengine.model.response.TranslateImageResponse;
import com.volcengine.model.response.TranslateTextResponse;
import com.volcengine.service.IBaseService;

/**
 * The interface Translate service.
 */
public interface ITranslateService extends IBaseService {
    /**
     * @param langDetectRequest LangDetectRequest
     * @return LangDetectResponse
     * @throws Exception the exception
     */
    LangDetectResponse langDetect(LangDetectRequest langDetectRequest) throws Exception;

    /**
     * @param langDetectRequest TranslateTextRequest
     * @return TranslateTextResponse
     * @throws Exception the exception
     */
    TranslateTextResponse translateText(TranslateTextRequest langDetectRequest) throws Exception;

    /**
     *
     * @param translateImageRequest translateImageRequest
     * @return TranslateImageResponse
     * @throws Exception the exception
     */
    TranslateImageResponse translateImage(TranslateImageRequest translateImageRequest) throws Exception;
}
