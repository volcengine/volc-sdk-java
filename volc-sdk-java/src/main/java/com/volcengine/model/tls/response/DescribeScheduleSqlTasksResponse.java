package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.ToString;
import org.apache.http.Header;

import java.util.List;

import static com.volcengine.model.tls.Const.*;

@Data
@ToString(callSuper = true)
public class DescribeScheduleSqlTasksResponse extends CommonResponse {
    @JSONField(name = TOTAL)
    private int total;

    @JSONField(name = TASKS)
    private List<DescribeScheduleSqlTaskInfo> tasks;

    public DescribeScheduleSqlTasksResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeScheduleSqlTasksResponse deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeScheduleSqlTasksResponse response = (DescribeScheduleSqlTasksResponse) super.deSerialize(data, clazz);
        this.setTotal(response.getTotal());
        this.setTasks(response.getTasks());
        return this;
    }
}
