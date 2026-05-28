package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.HOST_GROUP_INFO;

@Data
@NoArgsConstructor
public class HostGroupHostsRulesInfoV2 {
    @JSONField(name = HOST_GROUP_INFO)
    private HostGroupInfo hostGroupInfo;
}
