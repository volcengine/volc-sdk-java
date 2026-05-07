package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.http.Header;

import static com.volcengine.model.tls.Const.*;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class DescribeProcessorResponse extends CommonResponse {
    @JSONField(name = PROJECT_NAME)
    String projectName;
    @JSONField(name = PROCESSOR_ID_HUMP)
    String processorId;
    @JSONField(name = PROJECT_ID)
    String projectId;
    @JSONField(name = "AccountId")
    String accountId;
    @JSONField(name = PROCESSOR_NAME)
    String processorName;
    @JSONField(name = DESCRIPTION)
    String description;
    @JSONField(name = DSL_CONTENT)
    String dslContent;
    @JSONField(name = PROCESSOR_TYPE)
    String processorType;
    @JSONField(name = PROCESSOR_DSL_TYPE)
    String processorDSLType;
    @JSONField(name = PROCESSOR_STATUS)
    String processorStatus;
    @JSONField(name = FAIL_STRATEGY)
    String failStrategy;
    @JSONField(name = TIMEOUT_MS)
    Integer timeoutMs;
    @JSONField(name = MAX_QPS)
    Integer maxQps;
    @JSONField(name = CREATE_TIME)
    String createTime;
    @JSONField(name = "UpdateTime")
    String updateTime;

    public DescribeProcessorResponse(Header[] headers) {
        super(headers);
    }

    @Override
    public DescribeProcessorResponse deSerialize(byte[] data, Class clazz) throws LogException {
        DescribeProcessorResponse response = (DescribeProcessorResponse) super.deSerialize(data, clazz);
        this.setProjectName(response.getProjectName());
        this.setProcessorId(response.getProcessorId());
        this.setProjectId(response.getProjectId());
        this.setAccountId(response.getAccountId());
        this.setProcessorName(response.getProcessorName());
        this.setDescription(response.getDescription());
        this.setDslContent(response.getDslContent());
        this.setProcessorType(response.getProcessorType());
        this.setProcessorDSLType(response.getProcessorDSLType());
        this.setProcessorStatus(response.getProcessorStatus());
        this.setFailStrategy(response.getFailStrategy());
        this.setTimeoutMs(response.getTimeoutMs());
        this.setMaxQps(response.getMaxQps());
        this.setCreateTime(response.getCreateTime());
        this.setUpdateTime(response.getUpdateTime());
        return this;
    }
}
