package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.ImportTaskInfo;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import java.util.List;

import static com.volcengine.model.tls.Const.*;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DescribeImportTasksResponse extends CommonResponse {
    @JSONField(name = TOTAL)
    private Integer total;

    @JSONField(name = TASKS)
    private List<ImportTaskInfo> tasks;

    public DescribeImportTasksResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeImportTasksResponse deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeImportTasksResponse response = (DescribeImportTasksResponse) super.deSerialize(data, clazz);
        this.setTotal(response.getTotal());
        this.setTasks(response.getTasks());
        return this;
    }
}