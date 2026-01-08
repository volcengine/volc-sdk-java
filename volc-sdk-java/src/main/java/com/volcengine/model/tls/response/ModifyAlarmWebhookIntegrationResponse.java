package com.volcengine.model.tls.response;

import com.volcengine.model.response.RawResponse;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.ToString;
import lombok.NoArgsConstructor;
import org.apache.http.Header;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class ModifyAlarmWebhookIntegrationResponse extends CommonResponse {
    
    public ModifyAlarmWebhookIntegrationResponse(Header[] headers) throws LogException {
        super(headers);
    }
    
    @Override
    public ModifyAlarmWebhookIntegrationResponse deSerialize(byte[] data, Class clazz) throws LogException {
        return (ModifyAlarmWebhookIntegrationResponse) super.deSerialize(data, clazz);
    }
}