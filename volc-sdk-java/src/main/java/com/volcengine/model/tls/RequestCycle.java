package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.TIME;
import static com.volcengine.model.tls.Const.TYPE;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestCycle {
    @JSONField(name = TYPE)
    String type;
    @JSONField(name = TIME)
    Integer time;
}
