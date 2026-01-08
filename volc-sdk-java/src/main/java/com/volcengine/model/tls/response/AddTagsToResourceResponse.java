package com.volcengine.model.tls.response;

import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class AddTagsToResourceResponse extends CommonResponse {
    public AddTagsToResourceResponse(Header[] headers) throws LogException {
        super(headers);
    }

    @Override
    public AddTagsToResourceResponse deSerialize(byte[] data, Class clazz) throws LogException {
        AddTagsToResourceResponse response = (AddTagsToResourceResponse) super.deSerialize(data, clazz);
        return response;
    }
}