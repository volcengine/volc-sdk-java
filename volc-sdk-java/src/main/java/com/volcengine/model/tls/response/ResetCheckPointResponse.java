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
public class ResetCheckPointResponse extends CommonResponse {
    
    public ResetCheckPointResponse(Header[] headers) throws LogException {
        super(headers);
    }

    @Override
    public ResetCheckPointResponse deSerialize(byte[] data, Class clazz) throws LogException {
        ResetCheckPointResponse response = (ResetCheckPointResponse) super.deSerialize(data, clazz);
        return this;
    }
}