package com.volcengine.model.tls.response;

import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class ActiveTlsAccountResponse extends CommonResponse {

    public ActiveTlsAccountResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public ActiveTlsAccountResponse deSerialize(byte[] data, Class clazz) throws LogException {
        return this;
    }
}
