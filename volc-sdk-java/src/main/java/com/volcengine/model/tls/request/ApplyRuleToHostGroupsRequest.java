package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.volcengine.model.tls.Const.HOST_GROUP_IDS;
import static com.volcengine.model.tls.Const.RULE_ID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApplyRuleToHostGroupsRequest {
    @JSONField(name=RULE_ID)
    String ruleId;
    @JSONField(name=HOST_GROUP_IDS)
    List<String> hostGroupIds;
}
