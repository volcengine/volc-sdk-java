package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.HostGroupHostsRulesInfo;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import java.util.List;

import static com.volcengine.model.tls.Const.HOST_GROUP_HOSTS_RULES_INFOS;
import static com.volcengine.model.tls.Const.TOTAL_KEY;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DescribeHostGroupsResponse extends CommonResponse {
    @JSONField(name = TOTAL_KEY)
    int total;
    @JSONField(name = HOST_GROUP_HOSTS_RULES_INFOS)
    List<HostGroupHostsRulesInfo> hostGroupHostsRulesInfos;

    public DescribeHostGroupsResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeHostGroupsResponse deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeHostGroupsResponse response = (DescribeHostGroupsResponse) super.deSerialize(data, clazz);
        this.setHostGroupHostsRulesInfos(response.getHostGroupHostsRulesInfos());
        this.setTotal(response.getTotal());
        return this;
    }

}
