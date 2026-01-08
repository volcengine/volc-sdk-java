package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import java.util.List;

import static com.volcengine.model.tls.Const.SHIPPERS;
import static com.volcengine.model.tls.Const.TOTAL;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DescribeShippersResponse extends CommonResponse {
    @JSONField(name = SHIPPERS)
    private List<ShipperInfo> shippers;

    @JSONField(name = TOTAL)
    private Integer total;

    public DescribeShippersResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeShippersResponse deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeShippersResponse response = (DescribeShippersResponse) super.deSerialize(data, clazz);
        this.setShippers(response.getShippers());
        this.setTotal(response.getTotal());
        return this;
    }
}
