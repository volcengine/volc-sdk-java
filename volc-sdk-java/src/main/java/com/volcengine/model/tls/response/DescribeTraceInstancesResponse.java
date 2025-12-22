package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import java.util.List;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DescribeTraceInstancesResponse extends CommonResponse {
    @JSONField(name = "Total")
    private Integer total;

    @JSONField(name = "TraceInstances")
    private List<TraceInstanceInfo> traceInstances;

    public DescribeTraceInstancesResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeTraceInstancesResponse deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeTraceInstancesResponse response = (DescribeTraceInstancesResponse) super.deSerialize(data, clazz);
        this.setTotal(response.getTotal());
        this.setTraceInstances(response.getTraceInstances());
        return this;
    }
}