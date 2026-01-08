package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.ToString;
import org.apache.http.Header;

@Data
@ToString(callSuper = true)
public class ModifyShipperResponse extends CommonResponse {
    
    public ModifyShipperResponse(Header[] headers) throws LogException {
        super(headers);
    }
}