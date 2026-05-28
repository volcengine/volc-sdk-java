package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.HostGroupHostsRulesInfoV2;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import static com.volcengine.model.tls.Const.HOST_GROUP_HOST_RULES_INFO;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DescribeHostGroupResponseV2 extends CommonResponse {
    @JSONField(name = HOST_GROUP_HOST_RULES_INFO)
    private HostGroupHostsRulesInfoV2 hostGroupHostsRulesInfo;

    public DescribeHostGroupResponseV2(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeHostGroupResponseV2 deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeHostGroupResponseV2 response = (DescribeHostGroupResponseV2) super.deSerialize(data, clazz);
        this.hostGroupHostsRulesInfo = response.hostGroupHostsRulesInfo;
        return this;
    }
}
