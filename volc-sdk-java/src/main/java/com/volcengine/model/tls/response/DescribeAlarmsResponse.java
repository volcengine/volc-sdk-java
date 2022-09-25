package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.Header;
import com.volcengine.model.tls.AlarmInfo;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

import static com.volcengine.model.tls.Const.ALARMS;
import static com.volcengine.model.tls.Const.TOTAL_KEY;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DescribeAlarmsResponse extends CommonResponse {
    @JSONField(name = TOTAL_KEY)
    int total;
    @JSONField(name = ALARMS)
    List<AlarmInfo> alarms;

    public DescribeAlarmsResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeAlarmsResponse deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeAlarmsResponse response = (DescribeAlarmsResponse) super.deSerialize(data, clazz);
        this.setAlarms(response.getAlarms());
        this.setTotal(response.getTotal());
        return this;
    }
}
