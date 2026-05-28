package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.LogBackFlowTaskInfo;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import java.util.List;

import static com.volcengine.model.tls.Const.LOG_BACK_FLOW_TASKS;
import static com.volcengine.model.tls.Const.TOTAL_KEY;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DescribeLogBackFlowTasksResponse extends CommonResponse {
    @JSONField(name = LOG_BACK_FLOW_TASKS)
    private List<LogBackFlowTaskInfo> logBackFlowTasks;
    @JSONField(name = TOTAL_KEY)
    private Long total;

    public DescribeLogBackFlowTasksResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeLogBackFlowTasksResponse deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeLogBackFlowTasksResponse response = (DescribeLogBackFlowTasksResponse) super.deSerialize(data, clazz);
        this.logBackFlowTasks = response.logBackFlowTasks;
        this.total = response.total;
        return this;
    }
}
