package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.HistogramInfoV1;
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
public class DescribeHistogramV1Response extends CommonResponse {

    @JSONField(name = RESULT_STATUS)
    String ResultStatus;

    @JSONField(name = HISTOGRAM)
    List<HistogramInfoV1> histogramInfoV1s;

    @JSONField(name = TOTAL_COUNT)
    long totalCount;

    public DescribeHistogramV1Response(Header[] headers) {
        super(headers);
    }

    public DescribeHistogramV1Response deSerialize (byte[] data, Class clazz) throws LogException {
        DescribeHistogramV1Response response = (DescribeHistogramV1Response) super.deSerialize(data, clazz);
        this.setResultStatus(response.getResultStatus());
        this.setHistogramInfoV1s(response.getHistogramInfoV1s());
        this.setTotalCount(response.getTotalCount());
        return this;
    }
}
