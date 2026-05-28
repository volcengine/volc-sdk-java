package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.AppSceneMetaInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class CreateAppSceneMetaRequest {
    @JSONField(name = APP_INSTANCE_ID)
    private String instanceId;
    @JSONField(name = CREATE_APP_META_TYPE)
    private String createAPPMetaType;
    @JSONField(name = META_ID_KEY)
    private String id;
    @JSONField(name = META_RECORD)
    private AppSceneMetaInfo.MetaRecord record;

    public boolean CheckValidation() {
        if (instanceId == null || instanceId.isEmpty()) {
            return false;
        }
        if (createAPPMetaType == null || createAPPMetaType.isEmpty()) {
            return false;
        }
        return true;
    }
}
