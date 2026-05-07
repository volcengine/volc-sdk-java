package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import java.util.Map;

import static com.volcengine.model.tls.Const.*;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class ExecProcessorResponse extends CommonResponse {
    @JSONField(name = EXEC_STATUS)
    String execStatus;
    @JSONField(name = PROCESSED_LOG)
    Map<String, Object> processedLog;
    @JSONField(name = "Error")
    String error;

    public ExecProcessorResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public ExecProcessorResponse deSerialize(byte[] data, Class clazz) throws LogException {
        ExecProcessorResponse response = (ExecProcessorResponse) super.deSerialize(data, clazz);
        this.setExecStatus(response.getExecStatus());
        this.setProcessedLog(response.getProcessedLog());
        this.setError(response.getError());
        return this;
    }
}
