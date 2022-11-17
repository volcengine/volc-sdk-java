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
    String taskId;
    @JSONField(name = TASK_NAME)
    String taskName;
    @JSONField(name = TOPIC_ID)
    String topicId;
    @JSONField(name = QUERY)
    String query;
    @JSONField(name = START_TIME)
    String startTime;
    @JSONField(name = END_TIME)
    String endTime;
    @JSONField(name = DATA_FORMAT)
    String dataFormat;
    @JSONField(name = TASK_STATUS)
    String taskStatus;
    @JSONField(name = COMPRESSION)
    String compression;
    @JSONField(name = CREATE_TIME)
    String createTime;
    @JSONField(name = LOG_SIZE)
    BigInteger logSize;
    @JSONField(name = LOG_COUNT)
    BigInteger logCount;
}
