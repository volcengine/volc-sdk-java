package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class DescribeAppSceneMetaRequest {
    @JSONField(name = APP_INSTANCE_ID)
    private String instanceId;
    @JSONField(name = META_ID_KEY)
    private String id;
    @JSONField(name = META_NAME)
    private String metaName;
    @JSONField(name = APP_META_TYPE)
    private String appMetaType;

    public String getName() {
        return metaName;
    }

    public void setName(String name) {
        this.metaName = name;
    }

    public String getAPPMetaType() {
        return appMetaType;
    }

    public void setAPPMetaType(String APPMetaType) {
        this.appMetaType = APPMetaType;
    }

    public String getAppMetaType() {
        return appMetaType;
    }

    public void setAppMetaType(String appMetaType) {
        this.appMetaType = appMetaType;
    }

    public boolean CheckValidation() {
        if (instanceId == null || instanceId.isEmpty()) {
            return false;
        }
        if (id == null || id.isEmpty()) {
            return false;
        }
        if (appMetaType == null || appMetaType.isEmpty()) {
            return false;
        }
        return true;
    }
}
