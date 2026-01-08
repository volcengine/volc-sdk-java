package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import java.util.List;

import static com.volcengine.model.tls.Const.TOTAL;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class SearchTracesResponse extends CommonResponse {
    @JSONField(name = TOTAL)
    private Integer total;
    
    @JSONField(name = "TraceInfos")
    private List<TraceInfo> traceInfos;

    public SearchTracesResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public SearchTracesResponse deSerialize(byte[] data, Class clazz) throws LogException {
        SearchTracesResponse response = (SearchTracesResponse) super.deSerialize(data, clazz);
        this.setTotal(response.getTotal());
        this.setTraceInfos(response.getTraceInfos());
        return this;
    }
}