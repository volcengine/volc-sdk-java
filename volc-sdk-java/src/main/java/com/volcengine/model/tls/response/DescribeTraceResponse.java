package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.Trace;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DescribeTraceResponse extends CommonResponse {
    @JSONField(name = "Trace")
    private Trace trace;

    public DescribeTraceResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeTraceResponse deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeTraceResponse response = (DescribeTraceResponse) super.deSerialize(data, clazz);
        this.setTrace(response.getTrace());
        return this;
    }
}