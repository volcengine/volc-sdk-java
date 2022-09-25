package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.HostInfo;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import java.util.List;

import static com.volcengine.model.tls.Const.HOST_INFOS;
import static com.volcengine.model.tls.Const.TOTAL;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DescribeHostsResponse extends CommonResponse {
    @JSONField(name = TOTAL)
    int total;
    @JSONField(name = HOST_INFOS)
    List<HostInfo> hostInfos;

    public DescribeHostsResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeHostsResponse deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeHostsResponse response = (DescribeHostsResponse) super.deSerialize(data, clazz);
        this.setHostInfos(response.getHostInfos());
        this.setTotal(response.getTotal());
        return this;
    }
}
