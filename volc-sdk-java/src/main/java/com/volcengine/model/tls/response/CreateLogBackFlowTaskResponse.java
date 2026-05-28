package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import static com.volcengine.model.tls.Const.TASK_ID;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class CreateLogBackFlowTaskResponse extends CommonResponse {
    @JSONField(name = TASK_ID)
    private String taskId;

    public CreateLogBackFlowTaskResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public CreateLogBackFlowTaskResponse deSerialize(byte[] data, Class clazz) throws LogException {
        CreateLogBackFlowTaskResponse response = (CreateLogBackFlowTaskResponse) super.deSerialize(data, clazz);
        this.taskId = response.taskId;
        return this;
    }
}
