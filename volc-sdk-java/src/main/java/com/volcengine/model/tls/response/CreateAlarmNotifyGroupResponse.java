package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.Header;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import static com.volcengine.model.tls.Const.ALARM_NOTIFY_GROUP_ID;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class CreateAlarmNotifyGroupResponse extends CommonResponse {

    @JSONField(name = ALARM_NOTIFY_GROUP_ID)
    private String alarmNotifyGroupId;

    public CreateAlarmNotifyGroupResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public CreateAlarmNotifyGroupResponse deSerialize(byte[] data, Class clazz) throws LogException {
        CreateAlarmNotifyGroupResponse response = (CreateAlarmNotifyGroupResponse) super.deSerialize(data, clazz);
        this.setAlarmNotifyGroupId(response.getAlarmNotifyGroupId());
        return this;
    }
}
