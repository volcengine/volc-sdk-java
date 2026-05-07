package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.ProcessorTopicInfo;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import java.util.List;

import static com.volcengine.model.tls.Const.ITEMS;
import static com.volcengine.model.tls.Const.TOTAL;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DescribeTopicsByProcessorResponse extends CommonResponse {
    @JSONField(name = TOTAL)
    Integer total;
    @JSONField(name = ITEMS)
    List<ProcessorTopicInfo> items;

    public DescribeTopicsByProcessorResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeTopicsByProcessorResponse deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeTopicsByProcessorResponse response = (DescribeTopicsByProcessorResponse) super.deSerialize(data, clazz);
        this.setTotal(response.getTotal());
        this.setItems(response.getItems());
        return this;
    }
}
