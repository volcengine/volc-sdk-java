package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.COUNT;
import static com.volcengine.model.tls.Const.TIME;

@Data
@NoArgsConstructor
public class HistogramInfo {
    @JSONField(name = TIME)
    long time;
    @JSONField(name = COUNT)
    long count;
}
