package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.AppInstanceInfo;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import java.util.List;

import static com.volcengine.model.tls.Const.APP_INSTANCE_INFO;
import static com.volcengine.model.tls.Const.TOTAL;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DescribeAppInstancesResponse extends CommonResponse {
    @JSONField(name = APP_INSTANCE_INFO)
    private List<AppInstanceInfo> instanceInfo;
    @JSONField(name = TOTAL)
    private long total;

    public DescribeAppInstancesResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeAppInstancesResponse deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeAppInstancesResponse response = (DescribeAppInstancesResponse) super.deSerialize(data, clazz);
        this.setInstanceInfo(response.getInstanceInfo());
        this.setTotal(response.getTotal());
        return this;
    }
}
