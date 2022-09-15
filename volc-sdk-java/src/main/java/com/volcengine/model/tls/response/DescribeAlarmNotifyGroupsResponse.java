package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.AlarmNotifyGroupInfo;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import java.util.List;

import static com.volcengine.model.tls.Const.ALARM_NOTIFY_GROUPS;
import static com.volcengine.model.tls.Const.TOTAL_KEY;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DescribeAlarmNotifyGroupsResponse extends CommonResponse {
    @JSONField(name = ALARM_NOTIFY_GROUPS)
    List<AlarmNotifyGroupInfo> alarmNotifyGroups;
    @JSONField(name = TOTAL_KEY)
    int total;

    public DescribeAlarmNotifyGroupsResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeAlarmNotifyGroupsResponse deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeAlarmNotifyGroupsResponse response = (DescribeAlarmNotifyGroupsResponse) super.deSerialize(data, clazz);
        this.setAlarmNotifyGroups(response.getAlarmNotifyGroups());
        this.setTotal(response.getTotal());
        return this;
    }
}
