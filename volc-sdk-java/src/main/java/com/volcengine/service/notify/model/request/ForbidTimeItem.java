package com.volcengine.service.notify.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ForbidTimeItem {
    //星期几，不填代表每天都生效,1表示周日，2表示周一，以此类推
    @JSONField(name = "Weekdays")
    private Set<Integer> weekdays;

    //时间段，至少应该有一个时间段,example:["09:00-10:00","15:00-16:00"]
    @JSONField(name = "Times")
    private List<String> times;
}
