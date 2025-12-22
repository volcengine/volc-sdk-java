package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import java.util.Map;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class ActiveTlsAccountResponse extends CommonResponse {
    @JSONField(name = "Response")
    private Map<String, Object> response;

    public ActiveTlsAccountResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public ActiveTlsAccountResponse deSerialize(byte[] data, Class clazz) throws LogException {
        ActiveTlsAccountResponse response = (ActiveTlsAccountResponse) super.deSerialize(data, clazz);
        this.setResponse(response.getResponse());
        return this;
    }
}
