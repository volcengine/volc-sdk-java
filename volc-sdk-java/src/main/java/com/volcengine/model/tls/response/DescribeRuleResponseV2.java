package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.RuleInfo;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import static com.volcengine.model.tls.Const.*;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DescribeRuleResponseV2 extends CommonResponse {
    @JSONField(name = PROJECT_ID)
    private String projectId;
    @JSONField(name = PROJECT_NAME)
    private String projectName;
    @JSONField(name = TOPIC_ID)
    private String topicId;
    @JSONField(name = TOPIC_NAME)
    private String topicName;
    @JSONField(name = RULE_INFO)
    private RuleInfo ruleInfo;
    @JSONField(name = CS_ACCOUNT_CHANNEL)
    private String csAccountChannel;
    @JSONField(name = ALLOW_EDIT)
    private Boolean allowEdit;
    @JSONField(name = ALLOW_DELETE)
    private Boolean allowDelete;

    public DescribeRuleResponseV2(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeRuleResponseV2 deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeRuleResponseV2 response = (DescribeRuleResponseV2) super.deSerialize(data, clazz);
        this.projectId = response.projectId;
        this.projectName = response.projectName;
        this.topicId = response.topicId;
        this.topicName = response.topicName;
        this.ruleInfo = response.ruleInfo;
        this.csAccountChannel = response.csAccountChannel;
        this.allowEdit = response.allowEdit;
        this.allowDelete = response.allowDelete;
        return this;
    }
}
