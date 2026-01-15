package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collections;
import java.util.List;

import static com.volcengine.model.tls.Const.RESOURCE_TYPE;
import static com.volcengine.model.tls.Const.RESOURCES_LIST;
import static com.volcengine.model.tls.Const.TAG_KEYS;

@Data
@NoArgsConstructor
public class RemoveTagsFromResourceRequest {

    @JSONField(name = RESOURCE_TYPE)
    private String resourceType;

    @JSONField(name = RESOURCES_LIST)
    private List<String> resourcesList;

    @JSONField(name = TAG_KEYS)
    private List<String> tagKeys;

    public RemoveTagsFromResourceRequest(String resourceType, List<String> resourcesList, List<String> tagKeys) {
        this.resourceType = resourceType;
        this.resourcesList = resourcesList;
        this.tagKeys = tagKeys;
    }

    public RemoveTagsFromResourceRequest(String resourceType, String resourceId, List<String> tagKeys) {
        this(resourceType, resourceId == null ? null : Collections.singletonList(resourceId), tagKeys);
    }

    /**
     * 兼容单资源场景的便捷访问方法，沿用原有 ResourceId 命名。
     */
    @JSONField(serialize = false, deserialize = false)
    public String getResourceId() {
        if (resourcesList == null || resourcesList.isEmpty()) {
            return null;
        }
        return resourcesList.get(0);
    }

    /**
     * 兼容原有 setResourceId 调用，将单个资源 ID 包装为列表。
     */
    @JSONField(serialize = false, deserialize = false)
    public void setResourceId(String resourceId) {
        if (resourceId == null) {
            this.resourcesList = null;
        } else {
            this.resourcesList = Collections.singletonList(resourceId);
        }
    }

    public boolean CheckValidation() {
        return resourceType != null && !resourceType.isEmpty()
                && resourcesList != null && !resourcesList.isEmpty()
                && tagKeys != null && !tagKeys.isEmpty();
    }
}
