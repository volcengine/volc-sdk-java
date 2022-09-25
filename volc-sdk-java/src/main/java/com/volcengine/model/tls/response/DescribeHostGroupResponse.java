package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.Header;
import com.volcengine.model.tls.HostGroupHostsRulesInfo;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import static com.volcengine.model.tls.Const.HOST_GROUP_HOST_RULES_INFO;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DescribeHostGroupResponse extends CommonResponse {
    @JSONField(name = HOST_GROUP_HOST_RULES_INFO)
    HostGroupHostsRulesInfo hostGroupHostsRulesInfo;

    public DescribeHostGroupResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeHostGroupResponse deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeHostGroupResponse response = (DescribeHostGroupResponse) super.deSerialize(data, clazz);
        this.setHostGroupHostsRulesInfo(response.getHostGroupHostsRulesInfo());
        return this;
    }
}
