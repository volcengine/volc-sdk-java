package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.ProcessorInfo;
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
public class DescribeProcessorsResponse extends CommonResponse {
    @JSONField(name = TOTAL)
    Integer total;
    @JSONField(name = ITEMS)
    List<ProcessorInfo> items;

    public DescribeProcessorsResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeProcessorsResponse deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeProcessorsResponse response = (DescribeProcessorsResponse) super.deSerialize(data, clazz);
        this.setTotal(response.getTotal());
        this.setItems(response.getItems());
        return this;
    }
}
