package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.HistogramInfo;
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
public class DescribeHistogramResponse extends CommonResponse {
    @JSONField(name = RESULT_STATUS)
    String resultStatus;

    @JSONField(name = INTERVAL)
    Integer interval;

    @JSONField(name = TOTAL_COUNT)
    Integer totalCount;

    @JSONField(name = HISTOGRAM_INFOS)
    List<HistogramInfo> histogramInfos;

    public DescribeHistogramResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeHistogramResponse deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeHistogramResponse response = (DescribeHistogramResponse) super.deSerialize(data, clazz);
        this.setResultStatus(response.getResultStatus());
        this.setInterval(response.getInterval());
        this.setTotalCount(response.getTotalCount());
        this.setHistogramInfos(response.getHistogramInfos());
        return this;
    }
}
