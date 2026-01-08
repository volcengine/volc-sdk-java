package com.volcengine.model.tls.response;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DeleteShipperResponse extends CommonResponse {
    public DeleteShipperResponse(Header[] headers) {
        super(headers);
    }
}