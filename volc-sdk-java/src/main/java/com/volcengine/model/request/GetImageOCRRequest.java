package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetImageOCRRequest {
    @JSONField(name = "ServiceId")
    String serviceId;

    @JSONField(name = "StoreUri")
    String storeUri;

    @JSONField(name = "Scene")
    String scene;

    public void setScene(String scene) {
        this.scene = scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene.getValue();
    }

    public enum Scene {
        GENERAL("general"),
        LICENSE("license"),
        ;

        private final String value;

        Scene(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}
