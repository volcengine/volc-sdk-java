package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * 音视频翻译-提交任务请求
 *
 * {
 *     "SourceLanguage": "en",
 *     "TargetLanguage": "zh",
 *     "Uri": "http://xx/xx.mp4"
 * }
 */
@Data
public class TranslateAudioSubmitRequest {
    @JSONField(name = "SourceLanguage")
    String sourceLanguage;

    @JSONField(name = "TargetLanguage")
    String targetLanguage;

    @JSONField(name = "Uri")
    String uri;
}
