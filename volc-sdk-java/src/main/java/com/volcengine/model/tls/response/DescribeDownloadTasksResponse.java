package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.TaskInfo;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.response.CommonResponse;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import java.util.List;

import static com.volcengine.model.tls.Const.*;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DescribeDownloadTasksResponse extends CommonResponse {

    @JSONField(name = TOTAL)
    Integer total;

    @JSONField(name = TASKS)
    List<TaskInfo> tasks;

    public DescribeDownloadTasksResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeDownloadTasksResponse deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeDownloadTasksResponse response = (DescribeDownloadTasksResponse) super.deSerialize(data, clazz);
        this.setTotal(response.getTotal());
        this.setTasks(response.getTasks());
        return this;
    }
}
