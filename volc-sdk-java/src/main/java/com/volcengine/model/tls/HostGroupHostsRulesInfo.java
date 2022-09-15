package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class HostGroupHostsRulesInfo {
    @JSONField(name = HOST_GROUP_INFO)
    HostResponseGroupInfo hostGroupInfo;
    @JSONField(name = HOST_INFOS)
    List<HostInfo> hostInfos;
    @JSONField(name = RULE_INFOS)
    List<RuleInfo> ruleInfos;
}
