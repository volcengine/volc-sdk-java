package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class RemoveTagsFromResourceResponse extends CommonResponse {

    public RemoveTagsFromResourceResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public RemoveTagsFromResourceResponse deSerialize(byte[] data, Class clazz) throws LogException {
        RemoveTagsFromResourceResponse response = (RemoveTagsFromResourceResponse) super.deSerialize(data, clazz);
        return this;
    }
}