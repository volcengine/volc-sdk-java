package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import static com.volcengine.model.tls.Const.ALARM_WEBHOOK_INTEGRATION_ID;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class CreateAlarmWebhookIntegrationResponse extends CommonResponse {

    @JSONField(name = ALARM_WEBHOOK_INTEGRATION_ID)
    private String alarmWebhookIntegrationId;

    public CreateAlarmWebhookIntegrationResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public CreateAlarmWebhookIntegrationResponse deSerialize(byte[] data, Class clazz) throws LogException {
        CreateAlarmWebhookIntegrationResponse response = (CreateAlarmWebhookIntegrationResponse) super.deSerialize(data, clazz);
        this.alarmWebhookIntegrationId = response.alarmWebhookIntegrationId;
        return this;
    }
}