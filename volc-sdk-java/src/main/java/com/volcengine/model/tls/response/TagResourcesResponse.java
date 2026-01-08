package com.volcengine.model.tls.response;

import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class TagResourcesResponse extends CommonResponse {
    public TagResourcesResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public TagResourcesResponse deSerialize(byte[] data, Class clazz) throws LogException {
        TagResourcesResponse response = (TagResourcesResponse) super.deSerialize(data, clazz);
        this.setRequestId(response.getRequestId());
        this.setHeaders(response.getHeaders());
        return this;
    }
}
