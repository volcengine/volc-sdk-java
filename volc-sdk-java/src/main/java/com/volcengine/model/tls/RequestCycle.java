package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.TIME;
import static com.volcengine.model.tls.Const.TYPE;

@Data
@NoArgsConstructor
public class RequestCycle {
    @JSONField(name = TYPE)
    String type;
    @JSONField(name = TIME)
    Integer time;

    /**
     * @param type 执行周期类型，Period：周期执行，Fixed：定期执行
     * @param time 告警任务执行的周期，或者定期执行的时间点。单位为分钟，取值范围为 1~1440
     */
    public RequestCycle(String type, Integer time) {
        this.type = type;
        this.time = time;
    }

    /**
     * @return 执行周期类型，Period：周期执行，Fixed：定期执行
     */
    public String getType() {
        return type;
    }

    /**
     * @param type 执行周期类型，Period：周期执行，Fixed：定期执行
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return 告警任务执行的周期，或者定期执行的时间点。单位为分钟，取值范围为 1~1440
     */
    public Integer getTime() {
        return time;
    }

    /**
     * @param time 告警任务执行的周期，或者定期执行的时间点。单位为分钟，取值范围为 1~1440
     */
    public void setTime(Integer time) {
        this.time = time;
    }
}
