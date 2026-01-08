package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.TagInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.volcengine.model.tls.Const.RESOURCES_LIST;
import static com.volcengine.model.tls.Const.RESOURCE_TYPE;
import static com.volcengine.model.tls.Const.TAGS;

/**
 * Request for adding tags to TLS resources.
 */
@Data
@NoArgsConstructor
public final class AddTagsToResourceRequest {

    /**
     * Resource type to tag.
     */
    @JSONField(name = RESOURCE_TYPE)
    private String resourceType;

    /**
     * List of resource identifiers to tag.
     */
    @JSONField(name = RESOURCES_LIST)
    private List<String> resourcesList;

    /**
     * Tags to bind to the resources.
     */
    @JSONField(name = TAGS)
    private List<TagInfo> tags;

    /**
     * Validate required fields.
     *
     * @return {@code true} if all required fields are non-null and non-empty;
     *     {@code false} otherwise
     */
    public boolean checkValidation() {
        return resourceType != null && !resourceType.isEmpty()
                && resourcesList != null && !resourcesList.isEmpty()
                && tags != null && !tags.isEmpty();
    }
}
