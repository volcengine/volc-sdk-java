package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import static com.volcengine.model.tls.Const.PROCESSOR_ID_HUMP;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class CreateProcessorResponse extends CommonResponse {
    @JSONField(name = PROCESSOR_ID_HUMP)
    String processorId;

    public CreateProcessorResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public CreateProcessorResponse deSerialize(byte[] data, Class clazz) throws LogException {
        CreateProcessorResponse response = (CreateProcessorResponse) super.deSerialize(data, clazz);
        this.setProcessorId(response.getProcessorId());
        return this;
    }
}
