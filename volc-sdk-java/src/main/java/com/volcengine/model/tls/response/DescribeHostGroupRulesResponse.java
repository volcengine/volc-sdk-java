package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.Header;
import com.volcengine.model.tls.RuleInfo;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

import static com.volcengine.model.tls.Const.RULE_INFOS;
import static com.volcengine.model.tls.Const.TOTAL;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DescribeHostGroupRulesResponse extends CommonResponse {
    @JSONField(name = TOTAL)
    int total;
    @JSONField(name = RULE_INFOS)
    List<RuleInfo> ruleInfos;

    public DescribeHostGroupRulesResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeHostGroupRulesResponse deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeHostGroupRulesResponse response = (DescribeHostGroupRulesResponse) super.deSerialize(data, clazz);
        this.setRuleInfos(response.getRuleInfos());
        this.setTotal(response.getTotal());
        return this;
    }
}
