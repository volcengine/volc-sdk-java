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
public class CreateImportTaskResponse extends CommonResponse {
    @JSONField(name = TASK_ID)
    String taskId;
    public CreateImportTaskResponse(Header[] headers) {
        super(headers);
    }
    @Override
    public CreateImportTaskResponse deSerialize(byte[] data, Class clazz) throws LogException {
        CreateImportTaskResponse response = (CreateImportTaskResponse) super.deSerialize(data, clazz);
        this.setTaskId(response.getTaskId());
        return this;
    }
}