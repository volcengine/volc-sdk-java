package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.Header;
import com.volcengine.model.tls.HostGroupInfo;
import com.volcengine.model.tls.RuleInfo;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

import static com.volcengine.model.tls.Const.*;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DescribeRuleResponse extends CommonResponse {
    @JSONField(name = PROJECT_ID)
    String projectId;
    @JSONField(name = PROJECT_NAME)
    String projectName;
    @JSONField(name = TOPIC_ID)
    String topicId;
    @JSONField(name = TOPIC_NAME)
    String topicName;
    @JSONField(name = RULE_INFO)
    RuleInfo ruleInfo;
    @JSONField(name = HOST_GROUP_INFOS)
    List<HostGroupInfo> hostGroupInfos;

    public DescribeRuleResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeRuleResponse deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeRuleResponse response = (DescribeRuleResponse) super.deSerialize(data, clazz);
        this.setProjectId(response.getProjectId());
        this.setProjectName(response.getProjectName());
        this.setTopicId(response.getTopicId());
        this.setTopicName(response.getTopicName());
        this.setRuleInfo(response.getRuleInfo());
        this.setHostGroupInfos(response.getHostGroupInfos());
        return this;
    }
}
