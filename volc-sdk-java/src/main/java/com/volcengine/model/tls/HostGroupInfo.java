package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import static com.volcengine.model.tls.Const.*;

@Data
public class HostGroupInfo {
    @JSONField(name=HOST_GROUP_ID)
    String hostGroupId;
    @JSONField(name=HOST_GROUP_NAME)
    String hostGroupName;
    @JSONField(name=HOST_GROUP_TYPE)
    String hostGroupType;
    @JSONField(name=HOST_IDENTIFIER)
    String hostIdentifier;
    @JSONField(name=HOST_COUNT)
    int hostCount;
    @JSONField(name=NORMAL_HEARTBEAT_STATUS_COUNT)
    int normalHeartbeatStatusCount;
    @JSONField(name=ABNORMAL_HEARTBEAT_STATUS_COUNT)
    int abnormalHeartbeatStatusCount;
    @JSONField(name=RULE_COUNT)
    int ruleCount;
    @JSONField(name=CREATE_TIME)
    String createTime;
    @JSONField(name=MODIFY_TIME)
    String modifyTime;
    @JSONField(name = AUTO_UPDATE)
    Boolean autoUpdate;
    @JSONField(name = UPDATE_START_TIME)
    String updateStartTime;
    @JSONField(name = UPDATE_END_TIME)
    String updateEndTime;
    @JSONField(name = AGENT_LATEST_VERSION)
    String agentLatestVersion;
}
