package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import static com.volcengine.model.tls.Const.ALARM_ID;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class CreateAlarmResponse extends CommonResponse {
    @JSONField(name = ALARM_ID)
    String alarmId;

    public CreateAlarmResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public CreateAlarmResponse deSerialize(byte[] data, Class clazz) throws LogException {
        CreateAlarmResponse response = (CreateAlarmResponse) super.deSerialize(data, clazz);
        this.setAlarmId(response.getAlarmId());
        return this;
    }

}
