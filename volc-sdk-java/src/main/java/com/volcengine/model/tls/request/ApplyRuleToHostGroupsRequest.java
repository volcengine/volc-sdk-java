package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.volcengine.model.tls.Const.HOST_GROUP_IDS;
import static com.volcengine.model.tls.Const.RULE_ID;

@Data
@NoArgsConstructor
public class ApplyRuleToHostGroupsRequest {
    @JSONField(name = RULE_ID)
    String ruleId;
    @JSONField(name = HOST_GROUP_IDS)
    List<String> hostGroupIds;


    /**
     * @param ruleId       采集配置id
     * @param hostGroupIds 机器组id列表
     */
    public ApplyRuleToHostGroupsRequest(String ruleId, List<String> hostGroupIds) {
        this.ruleId = ruleId;
        this.hostGroupIds = hostGroupIds;
    }

    /**
     * @return 采集配置id
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * @param ruleId 采集配置id
     */
    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * @return 机器组id列表
     */
    public List<String> getHostGroupIds() {
        return hostGroupIds;
    }

    /**
     * @param hostGroupIds 机器组id列表
     */
    public void setHostGroupIds(List<String> hostGroupIds) {
        this.hostGroupIds = hostGroupIds;
    }

    /**
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        if (this.ruleId == null || this.hostGroupIds == null) {
            return false;
        }
        return true;
    }
}
