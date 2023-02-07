package com.volcengine.service.translate;

import com.volcengine.model.request.translate.*;
import com.volcengine.model.response.translate.*;
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

    /**
     *
     * @param translateAudioSubmitRequest translateAudioSubmitRequest
     * @return TranslateAudioSubmitResponse
     * @throws Exception the exception
     */
    TranslateAudioSubmitResponse translateAudioSubmit(TranslateAudioSubmitRequest translateAudioSubmitRequest) throws Exception;

    /**
     *
     * @param translateAudioQueryRequest translateAudioQueryRequest
     * @return TranslateAudioQueryResponse
     * @throws Exception the exception
     */
    TranslateAudioQueryResponse translateAudioQuery(TranslateAudioQueryRequest translateAudioQueryRequest) throws Exception;

    /**
     *
     * @param GlossaryPublishRequest glossaryPublish
     * @return GlossaryPublishResponse
     * @throws Exception the exception
     */
    GlossaryPublishResponse glossaryPublish(GlossaryPublishRequest glossaryPublishRequest) throws Exception;
}
