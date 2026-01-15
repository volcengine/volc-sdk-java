package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.ToString;
import org.apache.http.Header;

@Data
@ToString(callSuper = true)
public class UntagResourcesResponse extends CommonResponse {
    @JSONField(name = "Result")
    private Boolean result;

    public UntagResourcesResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public UntagResourcesResponse deSerialize(byte[] data, Class clazz) throws LogException {
        UntagResourcesResponse response = (UntagResourcesResponse) super.deSerialize(data, clazz);
        if (response != null) {
            this.setResult(response.getResult());
        }
        return this;
    }
}