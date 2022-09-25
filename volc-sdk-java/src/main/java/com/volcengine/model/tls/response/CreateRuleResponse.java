package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.Header;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import static com.volcengine.model.tls.Const.RULE_ID;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class CreateRuleResponse extends CommonResponse {
    @JSONField(name = RULE_ID)
    String ruleId;

    public CreateRuleResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public CreateRuleResponse deSerialize(byte[] data, Class clazz) throws LogException {
        CreateRuleResponse response = (CreateRuleResponse) super.deSerialize(data, clazz);
        this.setRuleId(response.getRuleId());
        return this;
    }
}
