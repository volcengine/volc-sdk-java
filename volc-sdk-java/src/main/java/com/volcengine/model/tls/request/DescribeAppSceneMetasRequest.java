package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class DescribeAppSceneMetasRequest {
    @JSONField(name = PAGE_NUMBER)
    private Integer pageNumber;
    @JSONField(name = PAGE_SIZE)
    private Integer pageSize;
    @JSONField(name = APP_INSTANCE_ID)
    private String instanceId;
    @JSONField(name = META_ID_KEY)
    private String id;
    @JSONField(name = META_NAME)
    private String metaName;
    @JSONField(name = DESCRIBE_APP_META_TYPE)
    private String appMetaType;
    @JSONField(name = PAGE_CONTEXT)
    private String pageContext;

    public String getDescribeAPPMetaType() {
        return appMetaType;
    }

    public void setDescribeAPPMetaType(String describeAPPMetaType) {
        this.appMetaType = describeAPPMetaType;
    }

    public boolean CheckValidation() {
        if (instanceId == null || instanceId.isEmpty()) {
            return false;
        }
        if (appMetaType == null || appMetaType.isEmpty()) {
            return false;
        }
        return true;
    }
}
