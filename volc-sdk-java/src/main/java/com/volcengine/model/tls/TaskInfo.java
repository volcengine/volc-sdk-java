package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class TaskInfo {
    @JSONField(name = TASK_ID)
    private String taskId;

    @JSONField(name = TASK_NAME)
    private String taskName;

    @JSONField(name = TASK_TYPE)
    private Integer taskType;

    @JSONField(name = TOPIC_ID)
    private String topicId;

    @JSONField(name = QUERY)
    private String query;

    @JSONField(name = START_TIME)
    private String startTime;

    @JSONField(name = END_TIME)
    private String endTime;

    @JSONField(name = DATA_FORMAT)
    private String dataFormat;

    @JSONField(name = TASK_STATUS)
    private String taskStatus;

    @JSONField(name = ALLOW_INCOMPLETE)
    private Boolean allowIncomplete;

    @JSONField(name = COMPRESSION)
    private String compression;

    @JSONField(name = CREATE_TIME)
    private String createTime;

    @JSONField(name = LOG_SIZE)
    private BigInteger logSize;

    @JSONField(name = LOG_COUNT)
    private BigInteger logCount;

    @JSONField(name = LOG_CONTEXT_INFOS)
    private LogContextInfos logContextInfos;
}
