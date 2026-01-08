package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Request for listing tags bound to TLS resources.
 */
@Data
@NoArgsConstructor
public final class ListTagsForResourcesRequest {

    /**
     * Maximum number of results to return.
     */
    @JSONField(name = "MaxResults")
    private Integer maxResults;

    /**
     * Pagination token from a previous response.
     */
    @JSONField(name = "NextToken")
    private String nextToken;

    /**
     * Resource type to query.
     */
    @JSONField(name = "ResourceType")
    private String resourceType;

    /**
     * Resource identifiers to query.
     */
    @JSONField(name = "ResourcesIds")
    private List<String> resourcesIds;

    /**
     * Tag filters for the query.
     */
    @JSONField(name = "TagFilters")
    private List<FilterTag> tagFilters;

    /**
     * Validate required fields.
     *
     * @return {@code true} if the resource type is set; {@code false} otherwise
     */
    public boolean checkValidation() {
        return resourceType != null && !resourceType.isEmpty();
    }
}
