package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.WebhookIntegrationInfo;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import java.util.List;

import static com.volcengine.model.tls.Const.TOTAL;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DescribeAlarmWebhookIntegrationsResponse extends CommonResponse {
    @JSONField(name = TOTAL)
    private int total;
    
    @JSONField(name = "WebhookIntegrations")
    private List<WebhookIntegrationInfo> webhookIntegrations;

    public DescribeAlarmWebhookIntegrationsResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeAlarmWebhookIntegrationsResponse deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeAlarmWebhookIntegrationsResponse response = (DescribeAlarmWebhookIntegrationsResponse) super.deSerialize(data, clazz);
        this.webhookIntegrations = response.webhookIntegrations;
        this.total = response.total;
        return this;
    }
}