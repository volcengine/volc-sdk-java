package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.ResourceTag;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import java.util.List;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class ListTagsForResourcesResponse extends CommonResponse {
    @JSONField(name = "ResourceTags")
    private List<ResourceTag> resourceTags;
    
    @JSONField(name = "NextToken")
    private String nextToken;

    public ListTagsForResourcesResponse(Header[] headers) throws LogException {
        super(headers);
    }

    @Override
    public ListTagsForResourcesResponse deSerialize(byte[] data, Class clazz) throws LogException {
        ListTagsForResourcesResponse response = (ListTagsForResourcesResponse) super.deSerialize(data, clazz);
        this.setResourceTags(response.getResourceTags());
        this.setNextToken(response.getNextToken());
        return this;
    }
}
