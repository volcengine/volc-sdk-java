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
public class DescribeRulesResponse extends CommonResponse {
    @JSONField(name = TOTAL)
    int total;
    @JSONField(name = RULE_INFOS)
    List<RuleInfo> ruleInfos;

    public DescribeRulesResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeRulesResponse deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeRulesResponse response = (DescribeRulesResponse) super.deSerialize(data, clazz);
        this.setTotal(response.getTotal());
        this.setRuleInfos(response.getRuleInfos());
        return this;
    }
}
