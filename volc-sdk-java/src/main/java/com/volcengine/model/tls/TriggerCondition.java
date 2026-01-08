package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.CONDITION;
import static com.volcengine.model.tls.Const.COUNT_CONDITION;
import static com.volcengine.model.tls.Const.NO_DATA;
import static com.volcengine.model.tls.Const.SEVERITY;

/**
 * 告警触发条件配置.
 */
@Data
@NoArgsConstructor
public class TriggerCondition {

    /** 告警级别. */
    @JSONField(name = SEVERITY)
    private String severity;

    /** 告警触发条件表达式. */
    @JSONField(name = CONDITION)
    private String condition;

    /** 告警触发次数条件. */
    @JSONField(name = COUNT_CONDITION)
    private String countCondition;

    /** 是否在无数据时触发告警. */
    @JSONField(name = NO_DATA)
    private Boolean noData;
}
