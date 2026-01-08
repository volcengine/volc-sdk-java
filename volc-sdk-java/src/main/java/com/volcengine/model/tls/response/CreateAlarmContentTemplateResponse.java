package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import static com.volcengine.model.tls.Const.ALARM_CONTENT_TEMPLATE_ID;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class CreateAlarmContentTemplateResponse extends CommonResponse {
    @JSONField(name = ALARM_CONTENT_TEMPLATE_ID)
    String alarmContentTemplateId;

    public CreateAlarmContentTemplateResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public CreateAlarmContentTemplateResponse deSerialize(byte[] data, Class clazz) throws LogException {
        CreateAlarmContentTemplateResponse response = (CreateAlarmContentTemplateResponse) super.deSerialize(data, clazz);
        this.alarmContentTemplateId = response.alarmContentTemplateId;
        return this;
    }
}