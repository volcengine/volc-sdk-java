package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class EmbedImageHmRequest {
    @JSONField(name = "ServiceId")
    String serviceId;
    @JSONField(name = "StoreUri")
    String storeUri;
    @JSONField(name = "Algorithm")
    String algorithm;
    @JSONField(name = "Info")
    String info;
    @JSONField(name = "OutFormat")
    String outFormat;
    @JSONField(name = "OutQuality")
    Integer outQuality;
    @JSONField(name = "StrengthLevel")
    String StrengthLevel;
    @JSONField(name = "ImageUrl")
    String ImageUrl;

    public void setStrengthLevel(String strengthLevel) {
        StrengthLevel = strengthLevel;
    }

    public void setStrengthLevel(StrengthLevel strengthLevel) {
        StrengthLevel = strengthLevel.value;
    }

    public enum StrengthLevel {
        LOW("low"),
        MEDIUM("medium"),
        STRONG("strong"),
        ;

        private final String value;

        StrengthLevel(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}
