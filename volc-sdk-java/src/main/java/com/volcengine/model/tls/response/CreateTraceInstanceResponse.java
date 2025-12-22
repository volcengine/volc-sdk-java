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
public class CreateTraceInstanceResponse extends CommonResponse {
    @JSONField(name = "TraceInstanceId")
    String traceInstanceId;

    public CreateTraceInstanceResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public CreateTraceInstanceResponse deSerialize(byte[] data, Class clazz) throws LogException {
        CreateTraceInstanceResponse response = (CreateTraceInstanceResponse) super.deSerialize(data, clazz);
        this.setTraceInstanceId(response.getTraceInstanceId());
        return this;
    }
}