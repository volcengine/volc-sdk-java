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
public class CreateETLTaskResponse extends CommonResponse {
    @JSONField(name = TASK_ID)
    String taskId;

    public CreateETLTaskResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public CreateETLTaskResponse deSerialize(byte[] data, Class clazz) throws LogException {
        CreateETLTaskResponse response = (CreateETLTaskResponse) super.deSerialize(data, clazz);
        this.taskId = response.getTaskId();
        return this;
    }
}
