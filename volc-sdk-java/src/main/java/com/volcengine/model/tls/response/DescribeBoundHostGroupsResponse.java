package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.HostGroupInfo;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import java.util.List;

import static com.volcengine.model.tls.Const.HOST_GROUP_INFOS;
import static com.volcengine.model.tls.Const.TOTAL_KEY;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DescribeBoundHostGroupsResponse extends CommonResponse {
    @JSONField(name = TOTAL_KEY)
    private Long total;
    @JSONField(name = HOST_GROUP_INFOS)
    private List<HostGroupInfo> hostGroupInfos;

    public DescribeBoundHostGroupsResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeBoundHostGroupsResponse deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeBoundHostGroupsResponse response = (DescribeBoundHostGroupsResponse) super.deSerialize(data, clazz);
        this.total = response.total;
        this.hostGroupInfos = response.hostGroupInfos;
        return this;
    }
}
