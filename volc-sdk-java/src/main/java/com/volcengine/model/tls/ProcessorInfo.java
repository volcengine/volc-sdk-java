package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class ProcessorInfo {
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
}

