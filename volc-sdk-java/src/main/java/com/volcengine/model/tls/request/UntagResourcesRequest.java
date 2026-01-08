package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.volcengine.model.tls.Const.RESOURCE_TYPE;
import static com.volcengine.model.tls.Const.RESOURCE_LIST;

/**
 * Request for unbinding tags from TLS resources.
 */
@Data
@NoArgsConstructor
public final class UntagResourcesRequest {

    /**
     * Resource type to unbind tags from.
     */
    @JSONField(name = RESOURCE_TYPE)
    private String resourceType;

    /**
     * Resource identifiers to operate on.
     */
    @JSONField(name = RESOURCE_LIST)
    private List<String> resourcesIds;

    /**
     * Tag keys to unbind.
     */
    @JSONField(name = "TagKeys")
    private List<String> tagKeys;

    /**
     * Create a request with all required fields.
     *
     * @param resourceTypeValue   resource type
     * @param resourcesIdsValue   resource identifiers
     * @param tagKeysValue        tag keys to unbind
     */
    public UntagResourcesRequest(
            final String resourceTypeValue,
            final List<String> resourcesIdsValue,
            final List<String> tagKeysValue) {
        this.resourceType = resourceTypeValue;
        this.resourcesIds = resourcesIdsValue;
        this.tagKeys = tagKeysValue;
    }

    /**
     * Validate required fields.
     *
     * @return {@code true} if all required fields are non-null and non-empty;
     *     {@code false} otherwise
     */
    public boolean checkValidation() {
        return resourceType != null && !resourceType.isEmpty()
                && resourcesIds != null && !resourcesIds.isEmpty()
                && tagKeys != null && !tagKeys.isEmpty();
    }
}
