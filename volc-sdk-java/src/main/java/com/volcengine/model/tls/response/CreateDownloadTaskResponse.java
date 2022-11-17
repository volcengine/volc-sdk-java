package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import static com.volcengine.model.tls.Const.*;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class CreateDownloadTaskResponse extends CommonResponse {
    @JSONField(name = TASK_ID)
    String taskId;

    public CreateDownloadTaskResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public CreateDownloadTaskResponse deSerialize(byte[] data, Class clazz) throws LogException {
        CreateDownloadTaskResponse response = (CreateDownloadTaskResponse) super.deSerialize(data, clazz);
        this.setTaskId(response.getTaskId());
        return this;
    }

}
