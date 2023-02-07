package com.volcengine.example.translate;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.translate.GlossaryPublishRequest;
import com.volcengine.model.response.translate.GlossaryPublishResponse;
import com.volcengine.service.translate.ITranslateService;
import com.volcengine.service.translate.impl.TranslateServiceImpl;

import java.util.Map;

public class GlossaryDemo {
    public static void main(String[] args) {
        ITranslateService translateService = TranslateServiceImpl.getInstance();

        translateService.setAccessKey("ak");
        translateService.setSecretKey("sk");

        try {
            GlossaryPublishRequest req = new GlossaryPublishRequest();
            req.setName("apple");
            req.setSourceLanguage("zh");
            req.setTargetLanguage("en");
            Map<String, String> entries = new java.util.HashMap<>();
            entries.put("苹果", "Apple");
            req.setEntries(entries);
            GlossaryPublishResponse resp = translateService.glossaryPublish(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
