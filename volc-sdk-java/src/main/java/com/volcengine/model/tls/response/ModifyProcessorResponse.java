package com.volcengine.model.tls.response;

import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

@ToString(callSuper = true)
@NoArgsConstructor
public class ModifyProcessorResponse extends CommonResponse {
    public ModifyProcessorResponse(Header[] headers) {
        super(headers);
    }
}
