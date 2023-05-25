package com.volcengine.service.vms.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * 编辑任务请求
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EditTaskRequest {
    @JSONField(name = "TaskOpenId")
    private String taskOpenId;

    @JSONField(name = "StartTime",format="yyyy-MM-dd HH:mm:ss")
    private Date startTime;

    @JSONField(name = "EndTime",format="yyyy-MM-dd HH:mm:ss")
    private Date endTime;

    @JSONField(name = "RingAgainTimes")
    private Integer ringAgainTimes;

    @JSONField(name = "RingAgainInterval")
    private Integer ringAgainInterval;

    @JSONField(name = "Concurrency")
    private Integer concurrency;

    @JSONField(name = "ForbidTimeList")
    private List<ForbidTimeItem> forbidTimeList;
}
