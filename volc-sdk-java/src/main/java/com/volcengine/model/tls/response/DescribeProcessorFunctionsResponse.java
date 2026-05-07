package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.ProcessorFunctionInfo;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import java.util.List;
import java.util.Map;

import static com.volcengine.model.tls.Const.FUNCTIONS;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DescribeProcessorFunctionsResponse extends CommonResponse {
    @JSONField(name = FUNCTIONS)
    Map<String, List<ProcessorFunctionInfo>> functions;

    public DescribeProcessorFunctionsResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeProcessorFunctionsResponse deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeProcessorFunctionsResponse response = (DescribeProcessorFunctionsResponse) super.deSerialize(data, clazz);
        this.setFunctions(response.getFunctions());
        return this;
    }
}
