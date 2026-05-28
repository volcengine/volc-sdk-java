package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class LogBackFlowRelaTasksInfo {
    @JSONField(name = SCHEDULE_SQL_TASK_ID_UPPER)
    private String scheduleSqlTaskId;
    @JSONField(name = SCHEDULE_SQL_TASK_NAME)
    private String scheduleSqlTaskName;
    @JSONField(name = DEST_REGION)
    private String destRegion;
    @JSONField(name = SHIPPER_ID)
    private String shipperId;
    @JSONField(name = SHIPPER_NAME)
    private String shipperName;
}
