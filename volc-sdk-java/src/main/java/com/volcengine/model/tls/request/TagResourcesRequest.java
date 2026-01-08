package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.TagInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class TagResourcesRequest {
    @JSONField(name = RESOURCE_TYPE)
    private String resourceType;
    @JSONField(name = RESOURCE_LIST)
    private List<String> resourceList;
    @JSONField(name = TAGS)
    private List<TagInfo> tags;

    public boolean CheckValidation() {
        return this.resourceType != null && !this.resourceType.isEmpty() && this.resourceList != null && !this.resourceList.isEmpty() && 
               this.tags != null && !this.tags.isEmpty();
    }
}