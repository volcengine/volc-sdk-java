package com.volcengine.example.translate;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.LangDetectRequest;
import com.volcengine.model.request.TranslateTextRequest;
import com.volcengine.model.response.LangDetectResponse;
import com.volcengine.model.response.TranslateTextResponse;
import com.volcengine.service.translate.ITranslateService;
import com.volcengine.service.translate.impl.TranslateServiceImpl;

import java.util.Arrays;

public class TranslateDemo {
    public static void main(String[] args) {
        ITranslateService translateService = TranslateServiceImpl.getInstance();
        // call below method if you dont set ak and sk in ～/.volc/config

        translateService.setAccessKey("ak");
        translateService.setSecretKey("sk");

        // lang detect
        try {
            LangDetectRequest langDetectRequest = new LangDetectRequest();
            langDetectRequest.setTextList(Arrays.asList("hello world", "how are you"));

            LangDetectResponse langDetectResponse = translateService.langDetect(langDetectRequest);
            System.out.println(JSON.toJSONString(langDetectResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // translate text
        try {
            TranslateTextRequest translateTextRequest = new TranslateTextRequest();
            // translateTextRequest.setSourceLanguage("en"); // 不设置表示自动检测
            translateTextRequest.setTargetLanguage("zh");
            translateTextRequest.setTextList(Arrays.asList("hello world", "how are you"));

            TranslateTextResponse translateText = translateService.translateText(translateTextRequest);
            System.out.println(JSON.toJSONString(translateText));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
