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
public class CreateShipperResponse extends CommonResponse {
    @JSONField(name = "ShipperId")
    private String shipperId;

    public CreateShipperResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public CreateShipperResponse deSerialize(byte[] data, Class clazz) throws LogException {
        CreateShipperResponse response = (CreateShipperResponse) super.deSerialize(data, clazz);
        this.setShipperId(response.getShipperId());
        return this;
    }
}
