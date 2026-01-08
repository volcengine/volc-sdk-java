package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.AlarmContentTemplateInfo;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import java.util.List;

import static com.volcengine.model.tls.Const.ALARM_CONTENT_TEMPLATES;
import static com.volcengine.model.tls.Const.TOTAL;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DescribeAlarmContentTemplatesResponse extends CommonResponse {
    @JSONField(name = TOTAL)
    private int total;
    @JSONField(name = ALARM_CONTENT_TEMPLATES)
    private List<AlarmContentTemplateInfo> alarmContentTemplates;

    public DescribeAlarmContentTemplatesResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeAlarmContentTemplatesResponse deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeAlarmContentTemplatesResponse response = (DescribeAlarmContentTemplatesResponse) super.deSerialize(data, clazz);
        this.alarmContentTemplates = response.alarmContentTemplates;
        this.total = response.total;
        return this;
    }
}