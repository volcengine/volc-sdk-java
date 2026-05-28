package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class LogBackFlowScheduleSqlTaskInfo {
    @JSONField(name = DEST_TOPIC_ID)
    private String destTopicId;
    @JSONField(name = DEST_REGION)
    private String destRegion;
    @JSONField(name = REQUEST_CYCLE)
    private RequestCycle requestCycle;
    @JSONField(name = PROCESS_TIME_WINDOW)
    private String processTimeWindow;
    @JSONField(name = PROCESS_SQL_DELAY)
    private Long processSqlDelay;
    @JSONField(name = MAX_RETRY_TIMES)
    private Integer maxRetryTimes;
    @JSONField(name = MAX_TIMEOUT)
    private Long maxTimeout;
}
