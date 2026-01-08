package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.CRON_TAB;
import static com.volcengine.model.tls.Const.TIME;
import static com.volcengine.model.tls.Const.TYPE;

@Data
@NoArgsConstructor
public class RequestCycle {

    /** 执行周期类型，Period：周期执行，Fixed：定期执行. */
    @JSONField(name = TYPE)
    private String type;

    /** 告警任务执行的周期或定期执行的时间点，单位为分钟. */
    @JSONField(name = TIME)
    private Integer time;

    /** Cron 表达式. */
    @JSONField(name = CRON_TAB)
    private String cronTab;

    /**
     * 构造函数.
     *
     * @param cycleType 执行周期类型
     * @param cycleTime 告警任务执行的周期或定期执行的时间点
     */
    public RequestCycle(final String cycleType, final Integer cycleTime) {
        this.type = cycleType;
        this.time = cycleTime;
    }

    /**
     * 设置执行周期类型.
     *
     * @param cycleType 执行周期类型
     */
    public void setType(final String cycleType) {
        this.type = cycleType;
    }

    /**
     * 设置告警任务执行的周期或定期执行的时间点.
     *
     * @param cycleTime 告警任务执行的周期或定期执行的时间点
     */
    public void setTime(final Integer cycleTime) {
        this.time = cycleTime;
    }
}
