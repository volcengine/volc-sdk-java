package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class DeleteAppSceneMetaRequest {
    @JSONField(name = APP_INSTANCE_ID)
    private String instanceId;
    @JSONField(name = META_ID_FIELD)
    private String metaId;
    @JSONField(name = DELETE_APP_META_TYPE)
    private String deleteAPPMetaType;
    @JSONField(name = META_IDS)
    private List<String> ids;

    public boolean CheckValidation() {
        if (instanceId == null || instanceId.isEmpty()) {
            return false;
        }
        if (deleteAPPMetaType == null || deleteAPPMetaType.isEmpty()) {
            return false;
        }
        return true;
    }
}
