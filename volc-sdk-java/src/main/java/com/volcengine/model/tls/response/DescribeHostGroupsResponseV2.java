package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.HostGroupHostsRulesInfoV2;
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
public class DescribeHostGroupsResponseV2 extends CommonResponse {
    @JSONField(name = TOTAL_KEY)
    private Long total;
    @JSONField(name = HOST_GROUP_HOSTS_RULES_INFOS)
    private List<HostGroupHostsRulesInfoV2> hostGroupHostsRulesInfos;

    public DescribeHostGroupsResponseV2(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeHostGroupsResponseV2 deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeHostGroupsResponseV2 response = (DescribeHostGroupsResponseV2) super.deSerialize(data, clazz);
        this.total = response.total;
        this.hostGroupHostsRulesInfos = response.hostGroupHostsRulesInfos;
        return this;
    }
}
