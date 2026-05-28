package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.AppSceneMetaInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class ModifyAppSceneMetaRequest {
    @JSONField(name = APP_INSTANCE_ID)
    private String instanceId;
    @JSONField(name = MODIFY_APP_META_TYPE)
    private String modifyAPPMetaType;
    @JSONField(name = META_ID_KEY)
    private String id;
    @JSONField(name = META_RECORD)
    private AppSceneMetaInfo.MetaRecord record;

    public boolean CheckValidation() {
        if (instanceId == null || instanceId.isEmpty()) {
            return false;
        }
        if (modifyAPPMetaType == null || modifyAPPMetaType.isEmpty()) {
            return false;
        }
        if (record == null) {
            return false;
        }
        return true;
    }
}
