package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import java.util.List;

import static com.volcengine.model.tls.Const.TASKS;
import static com.volcengine.model.tls.Const.TOTAL;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DescribeETLTasksResponse extends CommonResponse {
    @JSONField(name = TASKS)
    private List<IETLTaskInfo> tasks;
    
    @JSONField(name = TOTAL)
    private Integer total;
    
    public DescribeETLTasksResponse(Header[] headers) {
        super(headers);
    }
    
    @Override
    public DescribeETLTasksResponse deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeETLTasksResponse response = (DescribeETLTasksResponse) super.deSerialize(data, clazz);
        this.setTasks(response.getTasks());
        this.setTotal(response.getTotal());
        return this;
    }
}
